package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.mutualite.rh.model.Appreciation;
import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Avis;
import fr.mutualite.rh.model.CategorieCompetence;
import fr.mutualite.rh.model.Competence;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.Evaluation;
import fr.mutualite.rh.model.EvaluationAtteinteObjectif;
import fr.mutualite.rh.model.EvaluationCompetence;
import fr.mutualite.rh.model.EvaluationSavoirEtre;
import fr.mutualite.rh.model.EvaluationTenuePoste;
import fr.mutualite.rh.model.Evolution;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Objectif;
import fr.mutualite.rh.model.ObjectifPrecedent;
import fr.mutualite.rh.model.PhotoEmploye;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.SavoirEtre;
import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.Formulaire;
import fr.mutualite.rh.model.util.Activator;
import fr.mutualite.rh.webapp.cdo.ICDO;
import fr.mutualite.rh.webapp.security.AuthenticationFilter;
import fr.mutualite.rh.webapp.security.Secured;
import fr.opensagres.xdocreport.converter.ConverterTypeTo;
import fr.opensagres.xdocreport.converter.ConverterTypeVia;
import fr.opensagres.xdocreport.converter.Options;
import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.document.registry.XDocReportRegistry;
import fr.opensagres.xdocreport.template.IContext;
import fr.opensagres.xdocreport.template.TemplateEngineKind;

@Path("")
public class EntretienAnnuelResource extends BaseResource {

	private ICDO cdo;

	// @Inject @AuthenticatedUser Employe authenticatedUser;

	public EntretienAnnuelResource() {
		cdo = CdoServlet.getCdo();
	}

	// @Secured
	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/employes/{matricule}/entretien-annuel/current")
	// public String prepareEntretienAnnuel(@PathParam("matricule") int matricule) {
	// // System.err.println("Je suis " + authenticatedUser.getNom());
	// String[] pRet = { null };
	// cdo.doInMutualiteTransaction(mut -> {
	// Employe employe = getEmploye(matricule, mut);
	// EntretienAnnuel entretien = getOrCreateEntretienAnnuel(employe);
	// Formulaire form = makeFormulaire(entretien);
	// pRet[0] = Activator.getDefault().getJsonGenerator().generateJson(form);
	// return true;
	// });
	// System.err.println("Je retourne " + pRet[0]);
	// return pRet[0];
	// }

	@Secured
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/employes/{matricule}/entretien-annuel/current")
	public long addEntretienAnnuel(@PathParam("matricule") int matricule) {
		long[] pRet = new long[1];
		cdo.doInMutualiteTransaction(mut -> {
			CDOTransaction transaction = (CDOTransaction) mut.cdoView();
			Employe employe = getEmploye(matricule, mut);
			Optional<Entretien> preexisting = employe.getEntretiens().stream().filter(Entretien::isEnCours).findAny();
			if (preexisting.isPresent()) {
				throw new WebApplicationException(
						"Impossible de créer un nouvel entretien : l'entretien du " + df.format(preexisting.get().getDate()) + " n'est pas encore validé.", 400);
			}
			EntretienAnnuel entretien = newEntretienAnnuel(employe);
			Utilisateur utilisateur = AuthenticationFilter.getConnectedUtilisateur();
			if (null != utilisateur) {
				entretien.setMeneur(transaction.getObject(utilisateur.getEmploye()));
			}
			try {
				transaction.commit();
			} catch (CommitException e) {
				throw new RuntimeException(e);
			}
			pRet[0] = CDOIDUtil.getLong(entretien.cdoID());
			return true;
		});
		return pRet[0];
	}

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/entretiens-annuels/{cdoId}")
	public String get(@PathParam("cdoId") long id) {
		EntretienAnnuel entretien = (EntretienAnnuel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(id));
		Formulaire form = makeFormulaire(entretien);
		return Activator.getDefault().getJsonGenerator().generateJson(form);
	}

	private Formulaire makeFormulaire(EntretienAnnuel entretien) {
		Formulaire form = DtoFactory.eINSTANCE.createFormulaire();
		form.setEntretien(entretien);
		return form;
	}

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien-annuel/current/entretien")
	public String getCurrentEntretienAnnuel(@PathParam("matricule") int matricule) {
		Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
		EntretienAnnuel entretien = getCurrentEntretienAnnuel(employe);
		return Activator.getDefault().getJsonGenerator().generateJson(entretien);
	}

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/entretiens-annuels/{cdoId}/entretien")
	public String getEntretienAnnuel(@PathParam("cdoId") long id) {
		EntretienAnnuel entretien = (EntretienAnnuel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(id));
		return Activator.getDefault().getJsonGenerator().generateJson(entretien);
	}
	//
	// @Secured
	// @POST
	// @Consumes(MediaType.APPLICATION_JSON)
	// @Path("/employes/{matricule}/entretien-annuel/current/entretien/entreteneur")
	// public void setEntreteneur(@PathParam("matricule") int matricule, @QueryParam("matriculeEntreteneur") int matriculeEntreteneur) {
	// cdo.doInMutualiteTransaction(mut -> {
	// Employe employe = getEmploye(matricule, mut);
	// EntretienAnnuel entretien = getOrCreateEntretienAnnuel(employe);
	// Employe entreteneur = getEmploye(matriculeEntreteneur, mut);
	// entretien.setMeneur(entreteneur);
	//
	// return true;
	// });
	// }

	@Secured
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/entretiens-annuels/{cdoId}/entretien")
	public void enregistrer(@PathParam("cdoId") long id, InputStream in) throws JsonParseException, JsonMappingException, IOException {
		cdo.doInMutualiteTransaction(mut -> {
			EntretienAnnuel e = (EntretienAnnuel) mut.cdoView().getObject(CDOIDUtil.createLong(id));
			populate(e, in);
			return true;
		});
	}

	// @Secured
	// @POST
	// @Consumes(MediaType.APPLICATION_JSON)
	// @Path("/employes/{matricule}/entretien-annuel/current/entretien")
	// public void enregistrer(@PathParam("matricule") int matricule, InputStream in) throws JsonParseException, JsonMappingException, IOException {
	// cdo.doInMutualiteTransaction(mut -> {
	// EntretienAnnuel e = getOrCreateEntretienAnnuel(getEmploye(matricule, mut));
	// populate(e, in);
	// return true;
	// });
	// }

	private void populate(EntretienAnnuel e, InputStream in) {

		// check sécu
		if (!e.isEnCours()) {
			throw new WebApplicationException("Cet entretien a été validé, il n'est plus modifiable! Adressez-vous au Service RH!", 401);
		}

		ObjectMapper om = new ObjectMapper();
		JsonNode tree;
		try {
			tree = om.readTree(in);
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}

		e.eClass().getEAllAttributes().forEach(a -> {
			JsonNode jsonNode = tree.get(a.getName());
			if (null == jsonNode) {
				e.eSet(a, null);
			} else if (a.getEType().getName().equals("EString")) {
				String val = jsonNode.asText();
				e.eSet(a, val);
			} else if (a.getEType().getName().startsWith("EBoolean")) {
				boolean val = jsonNode.asBoolean();
				e.eSet(a, val);
			}
		});
		addOrUpdateObjectifs(e, tree.get("objectifs"));
		// ajout des nouveaux souhaits
		addOrUpdateSouhaits(e, tree.get("souhaits"));
		addOrUpdateSouhaits(e, tree.get("souhaitsFormationSalarie"));
		// ajout des nouveaux souhaits Evaluateur
		addOrUpdateSouhaitsEvaluateur(e, tree.get("souhaitsFormationEvaluateur"));
		addOrUpdateSouhaitsEvaluateur(e, tree.get("souhaitsEvaluateur"));
		// Suppression des souhaits removed
		tree.get("souhaitRemovals").forEach(node -> {
			long id = node.get("id").asLong();
			e.getSouhaitsFormationSalarie().removeAll(e.getSouhaitsFormationSalarie().stream().filter(s -> {
				return id == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});
		// Suppression des objectifs removed
		tree.get("objectifRemovals").forEach(node -> {
			long cdoId = node.get("cdoId").asLong();
			long id = node.get("id").asLong();
			e.getObjectifs().removeAll(e.getObjectifs().stream().filter(s -> {
				return cdoId == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});
		// AppreciationsSessionFormation
		tree.get("appreciationsSessionFormation").forEach(node -> {
			long id = node.get("cdoId").asLong();
			AppreciationSessionFormation app = (AppreciationSessionFormation) e.cdoView().getObject(CDOIDUtil.createLong(id));
			// e.getAppreciationsSessionFormation().stream().filter(app ->
			// app.cdoID().toURIFragment().equals(""+id)).findAny().get().setValeur(Appreciation.get(val(node, "valeur"))));
			app.setValeur(Appreciation.get(val(node, "valeur")));
		});

		// Suppression des souhaits Evaluateur removed
		tree.get("souhaitEvaluateurRemovals").forEach(node -> {
			long id = node.get("id").asLong();
			e.getSouhaitsFormationEvaluateur().removeAll(e.getSouhaitsFormationEvaluateur().stream().filter(s -> {
				return id == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});

		addOrUpdateMissionsPrincipales(e, tree.get("evaluationsTenuePosteMissionsPrincipales"));
		// Suppression des missions principales removed
		tree.get("missionPrincipaleRemovals").forEach(node -> {
			long id = node.get("cdoId").asLong();
			e.getEvaluationsTenuePosteMissionsPrincipales().removeAll(e.getEvaluationsTenuePosteMissionsPrincipales().stream().filter(s -> {
				return id == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});

		addOrUpdateMissionsSpecifiques(e, tree.get("evaluationsTenuePosteMissionsSpecifiques"));
		// Suppression des missions specifiques removed
		tree.get("missionSpecifiqueRemovals").forEach(node -> {
			long id = node.get("cdoId").asLong();
			e.getEvaluationsTenuePosteMissionsSpecifiques().removeAll(e.getEvaluationsTenuePosteMissionsSpecifiques().stream().filter(s -> {
				return id == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});

		addOrUpdateEvaluationsCompetences(e, tree.get("evaluationsCompetences"));
		addOrUpdateEvaluationsSavoirEtre(e, tree.get("evaluationsSavoirEtre"));
		addOrUpdateObjectifsPrecedents(e, tree.get("objectifsPrecedents"));
	}

	private void addOrUpdateSouhaitsEvaluateur(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String texte = val(node, "texte");
			if (added) {
				// create
				SouhaitFormationEvaluateur souhait = MutFactory.eINSTANCE.createSouhaitFormationEvaluateur();
				souhait.setTexte(texte);
				e.getSouhaitsFormationEvaluateur().add(souhait);
			} else {
				long id = node.get("cdoId").asLong();
				e.getSouhaitsFormationEvaluateur().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(souhait -> {
					souhait.setTexte(texte);
				});
			}
		});
	}

	private void addOrUpdateObjectifs(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String libelle = val(node, "libelle");
			String echeance = val(node, "echeance");
			String indicateurs = val(node, "indicateurs");
			String moyens = val(node, "moyens");
			if (added) {
				// create
				Objectif objectif = MutFactory.eINSTANCE.createObjectif();
				objectif.setLibelle(libelle);
				objectif.setEcheance(echeance);
				objectif.setIndicateurs(indicateurs);
				objectif.setMoyens(moyens);
				e.getObjectifs().add(objectif);
			} else {
				JsonNode cdoIdNode = node.get("cdoId");
				if (null == cdoIdNode) {
					System.err.println("CDOID manquant! " + node);
					return; // on ignore, mais il faudrait en fait rediriger vers un reload de page en réponse à un enregistrement...
				}
				long id = cdoIdNode.asLong();
				e.getObjectifs().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(objectif -> {
					objectif.setLibelle(libelle);
					objectif.setEcheance(echeance);
					objectif.setIndicateurs(indicateurs);
					objectif.setMoyens(moyens);
				});
			}
		});
	}

	private void addOrUpdateMissionsPrincipales(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String mission = val(node, "mission");
			String sEval = val(node, "eval");
			Evaluation eval = Evaluation.get(sEval);
			if (added) {
				// create
				EvaluationTenuePoste o = MutFactory.eINSTANCE.createEvaluationTenuePoste();
				o.setMission(mission);
				o.setEval(eval);
				e.getEvaluationsTenuePosteMissionsPrincipales().add(o);
			} else {
				long id = node.get("cdoId").asLong();
				e.getEvaluationsTenuePosteMissionsPrincipales().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(o -> {
					o.setMission(mission);
					o.setEval(eval);
				});
			}
		});
	}

	private void addOrUpdateMissionsSpecifiques(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String mission = val(node, "mission");
			String sEval = val(node, "eval");
			Evaluation eval = Evaluation.get(sEval);
			if (added) {
				// create
				EvaluationTenuePoste o = MutFactory.eINSTANCE.createEvaluationTenuePoste();
				o.setMission(mission);
				o.setEval(eval);
				e.getEvaluationsTenuePosteMissionsSpecifiques().add(o);
			} else {
				long id = node.get("cdoId").asLong();
				e.getEvaluationsTenuePosteMissionsSpecifiques().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(o -> {
					o.setMission(mission);
					o.setEval(eval);
				});
			}
		});
	}

	private void addOrUpdateEvaluationsCompetences(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String sCompetence = val(node, "competence");
			Competence competence = Competence.get(sCompetence);
			String sEval = val(node, "eval");
			Evaluation eval = Evaluation.get(sEval);
			String sEvol = val(node, "evol");
			Evolution evol = Evolution.get(sEvol);
			if (added) {
				// create
				EvaluationCompetence o = MutFactory.eINSTANCE.createEvaluationCompetence();
				o.setCompetence(competence);
				o.setEval(eval);
				o.setEvol(evol);
				e.getEvaluationsCompetences().add(o);
			} else {
				long id = node.get("cdoId").asLong();
				e.getEvaluationsCompetences().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(o -> {
					o.setCompetence(competence);
					o.setEval(eval);
					o.setEvol(evol);
				});
			}
		});
	}

	private void addOrUpdateEvaluationsSavoirEtre(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String sSavoirEtre = val(node, "savoirEtre");
			SavoirEtre savoirEtre = SavoirEtre.get(sSavoirEtre);
			String sEval = val(node, "eval");
			Evaluation eval = Evaluation.get(sEval);
			String sEvol = val(node, "evol");
			Evolution evol = Evolution.get(sEvol);
			if (added) {
				// create
				EvaluationSavoirEtre o = MutFactory.eINSTANCE.createEvaluationSavoirEtre();
				o.setSavoirEtre(savoirEtre);
				o.setEval(eval);
				o.setEvol(evol);
				e.getEvaluationsSavoirEtre().add(o);
			} else {
				long id = node.get("cdoId").asLong();
				e.getEvaluationsSavoirEtre().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(o -> {
					o.setSavoirEtre(savoirEtre);
					o.setEval(eval);
					o.setEvol(evol);
				});
			}
		});
	}

	private void addOrUpdateObjectifsPrecedents(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String commentaire = val(node, "commentaire");
			String sEval = val(node, "evaluation");
			EvaluationAtteinteObjectif eval = EvaluationAtteinteObjectif.get(sEval);
			if (added) {
				// create
				ObjectifPrecedent o = MutFactory.eINSTANCE.createObjectifPrecedent();
				o.setEvaluation(eval);
				o.setCommentaire(commentaire);
				e.getObjectifsPrecedents().add(o);
			} else {
				long id = node.get("cdoId").asLong();
				e.getObjectifsPrecedents().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(o -> {
					o.setEvaluation(eval);
					o.setCommentaire(commentaire);
				});
			}
		});
	}

	public String val(JsonNode node, String name) {
		JsonNode v = node.get(name);
		if (v == null) {
			return null;
		}
		return v.asText();
	}

	private void addOrUpdateSouhaits(EntretienAnnuel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String texte = val(node, "texte");
			String avisEvaluateur = val(node, "avisEvaluateur");
			if (added) {
				// create
				SouhaitFormationSalarie souhait = MutFactory.eINSTANCE.createSouhaitFormationSalarie();
				souhait.setAvisEvaluateur(Avis.get(avisEvaluateur));
				souhait.setTexte(texte);
				e.getSouhaitsFormationSalarie().add(souhait);
			} else {
				long id = node.get("cdoId").asLong();
				e.getSouhaitsFormationSalarie().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(souhait -> {
					souhait.setAvisEvaluateur(Avis.get(avisEvaluateur));
					souhait.setTexte(texte);
				});
			}
		});
	}

	private EntretienAnnuel newEntretienAnnuel(Employe employe) {
		EntretienAnnuel ret = MutFactory.eINSTANCE.createEntretienAnnuel();
		ret.setDate(new Date());

		PhotoEmploye photo = employe.photo(ret.getDate());

		ret.setPhotoEmploye(photo);

		Optional<EntretienAnnuel> precedentEntretienAnnuelOpt = employe.getEntretiens().stream().filter(entretien2 -> entretien2 instanceof EntretienAnnuel)
				.map(EntretienAnnuel.class::cast).max((e1, e2) -> e1.getDate().compareTo(e2.getDate()));

		Date datePrecedentEntretienAnnuel = precedentEntretienAnnuelOpt.isPresent() ? precedentEntretienAnnuelOpt.get().getDate() : new Date(0);

		Date datePrecedentEntretien = employe.getEntretiens().stream().map(Entretien::getDate).max(Date::compareTo).orElse(new Date(0));

		// les évalusations pré-existantes (probablement dans l'entretien pro précédent...)
		Stream<Entretien> entretiensIntermediaires = employe.getEntretiens().stream()
				.filter(e -> e.getDate().after(datePrecedentEntretienAnnuel) && (e.getDate().before(datePrecedentEntretien) || e.getDate().equals(datePrecedentEntretien)));
		entretiensIntermediaires.map(Entretien::getAppreciationsSessionFormation).forEach(ret.getAppreciationsSessionFormationEntretiensPrecedents()::addAll);

		// Les évaluations "propres"

		employe.getSessionsFormation().stream().filter(sf -> {
			Date dateDebut = sf.getDateDebut();
			if (null == dateDebut) {
				log.error("Session de formation sans date de début! ==> ignorée " + ((Formation) sf.eContainer()).getLibelle());
			}
			return dateDebut != null && dateDebut.after(datePrecedentEntretien) && dateDebut.before(ret.getDate());
		}).map(session -> {
			AppreciationSessionFormation apprec = MutFactory.eINSTANCE.createAppreciationSessionFormation();
			apprec.setSessionFormation(session);
			apprec.setValeur(null);
			return apprec;
		}).forEach(ret.getAppreciationsSessionFormation()::add);

		Arrays.stream(Competence.values()).map(c -> {
			EvaluationCompetence evaluationCompetence = MutFactory.eINSTANCE.createEvaluationCompetence();
			evaluationCompetence.setCompetence(c);
			return evaluationCompetence;
		}).forEach(ret.getEvaluationsCompetences()::add);

		Arrays.stream(SavoirEtre.values()).map(c -> {
			EvaluationSavoirEtre eval = MutFactory.eINSTANCE.createEvaluationSavoirEtre();
			eval.setSavoirEtre(c);
			return eval;
		}).forEach(ret.getEvaluationsSavoirEtre()::add);

		if (precedentEntretienAnnuelOpt.isPresent()) {
			EntretienAnnuel precedent = (EntretienAnnuel) precedentEntretienAnnuelOpt.get();
			precedent.getObjectifs().stream().map(o -> {
				ObjectifPrecedent objPrec = MutFactory.eINSTANCE.createObjectifPrecedent();
				objPrec.setObjectif(o);
				return objPrec;
			}).forEach(ret.getObjectifsPrecedents()::add);
			;
		}

		employe.getEntretiens().add(ret);
		return ret;
	}

	private EntretienAnnuel getCurrentEntretienAnnuel(Employe employe) {
		EntretienAnnuel entretien = (EntretienAnnuel) employe.getEntretiens().stream().filter(entretien2 -> entretien2 instanceof EntretienAnnuel).filter(Entretien::isEnCours)
				.findAny().get();
		return entretien;
	}

	@Secured
	@POST
	@Path("/entretiens-annuels/{cdoId}/validate")
	public void validate(@PathParam("cdoId") long cdoId) {

		boolean hasRole = AuthenticationFilter.getConnectedUtilisateur().getRoles().stream()
				.anyMatch(role -> role.name().equals(Role.DRH.name()) || role.name().equals(Role.RESPONSABLE_ENTRETIEN.name()));
		if (!hasRole) {
			throw new WebApplicationException("Vous n'avez pas l'autorisation de valider cet entretien", 403);
		}

		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			EntretienAnnuel entretien = (EntretienAnnuel) mut.cdoView().getObject(CDOIDUtil.createLong(cdoId));

			entretien.setDate(new Date());

			entretien.setPhotoEmploye(entretien.employe().photo(entretien.getDate()));

			if (entretien.isEnCours()) {
				entretien.setEnCours(false);
			}
			return true;
		});

	}

	@Secured
	@GET
	@Produces("application/pdf")
	@Path("/entretiens-annuels/{cdoId}.pdf")
	public Response toPdf(@PathParam("cdoId") long cdoId) {

		EntretienAnnuel entretien = (EntretienAnnuel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(cdoId));
		ResponseBuilder response = Response.ok(new StreamingOutput() {
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				generatePdf(entretien, out);
			}
		});
		Employe employe = entretien.employe();
		response.header("Content-Disposition", "inline; filename=entretien-annuel-" + employe.getNom() + "-" + employe.getPrenom() + "-"
				+ DateFormat.getDateInstance(DateFormat.SHORT).format(entretien.getDate()) + ".pdf");
		return response.build();
	}

	private static final DateFormat df = DateFormat.getDateInstance();
	private static final DateFormat dtf = DateFormat.getDateTimeInstance();

	private void generatePdf(EntretienAnnuel entretien, OutputStream out) throws IOException {
		// InputStream in =
		// getClass().getClassLoader().getResourceAsStream("fr/mutualite/rh/webapp/odt/template-entretien-annuel.odt");
		// InputStream in = new FileInputStream(
		// "E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.webapp\\resources\\fr\\mutualite\\rh\\webapp\\odt\\template-entretien-annuel4.odt");
		InputStream in = fr.mutualite.rh.webapp.Activator.getContext().getBundle().getResource("/fr/mutualite/rh/webapp/odt/template-entretien-annuel2.odt").openStream();
		try {
			// Prepare the IXDocReport instance based on the template, using
			// Freemarker template engine
			// XDocReportRegistry.getRegistry().setClearTimeout(1);

			IXDocReport report = XDocReportRegistry.getRegistry().loadReport(in, TemplateEngineKind.Freemarker);
			Options options = Options.getTo(ConverterTypeTo.PDF).via(ConverterTypeVia.ODFDOM);
			// Add properties to the context
			Employe employe = entretien.employe();
			Formulaire formulaire = makeFormulaire(entretien);
			PhotoEmploye photoEmploye = entretien.getPhotoEmploye();
			IContext ctx = report.createContext();
			ctx.put("entretien", entretien);
			ctx.put("employe", employe);
			ctx.put("formulaire", formulaire);
			ctx.put("photo", photoEmploye);

			String diplomes = photoEmploye.getDiplomes().stream().collect(Collectors.joining(", "));
			log.debug(diplomes);
			ctx.put("_diplomes", diplomes);

			entretien.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = entretien.eGet(att);
				Object sVal = string(rawVal);
				ctx.put(att.getName(), sVal);
			});
			entretien.eClass().getEAllReferences().forEach(ref -> {
				ctx.put(ref.getName(), entretien.eGet(ref));
			});
			// employe.eClass().getEAllAttributes().forEach(att -> {
			// Object rawVal = employe.eGet(att);
			// Object sVal = string(rawVal);
			// ctx.put("employe_" + att.getName(), sVal);
			// });
			// employe.eClass().getEAllReferences().forEach(ref -> {
			// ctx.put("employe." + ref.getName(), employe.eGet(ref));
			// });
			formulaire.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = formulaire.eGet(att);
				Object sVal = string(rawVal);
				ctx.put("formulaire_" + att.getName(), sVal);
			});
			photoEmploye.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = photoEmploye.eGet(att);
				Object sVal = string(rawVal);
				ctx.put("photo_" + att.getName(), sVal);
			});
			// formulaire.eClass().getEAllReferences().forEach(ref -> {
			// ctx.put("formulaire." + ref.getName(), formulaire.eGet(ref));
			// });
			ctx.put("generation-date", dtf.format(new Date()));
			// Write the PDF file to output stream
			report.convert(ctx, options, out);
			// out.close();
		} catch (XDocReportException e) {
			e.printStackTrace();
			throw new WebApplicationException("Error technique : " + e.getMessage(), 500);
		}
	}

	@GET
	@Path("/entretien-annuel/categories-competences.json")
	@Produces(MediaType.APPLICATION_JSON)
	public Response competencesParCategories() {
		ResponseBuilder response = Response.ok(new StreamingOutput() {
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				JsonFactory jf = new JsonFactory();
				final JsonGenerator jg = jf.createGenerator(out);
				jg.writeStartArray();
				CategorieCompetence.VALUES.forEach(cat -> {

					try {
						jg.writeStartObject();
						jg.writeStringField("categorie", cat.getName());
						jg.writeStringField("libelle", cat.getLiteral());
						jg.writeArrayFieldStart("competences");
						cat.competences().forEach(comp -> {
							try {
								jg.writeStartObject();
								jg.writeStringField("competence", comp.getName());
								jg.writeStringField("libelle", comp.getLiteral());
								jg.writeEndObject();
							} catch (IOException e) {
								throw new RuntimeException(e);
							}
						});
						jg.writeEndArray();
						jg.writeEndObject();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				});
				jg.writeEndArray();
				jg.close();
			}
		});
		return response.build();
	}

	@GET
	@Path("/objectif-precedent/{cdoId}/libelle")
	@Produces(MediaType.APPLICATION_JSON)
	public String objectifPrecedentLibelle(@PathParam("cdoId") long cdoId) {
		ObjectifPrecedent op = (ObjectifPrecedent) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(cdoId));
		return op.getObjectif().getLibelle();
	}

	public Object string(Object rawVal) {
		if (rawVal instanceof Date) {
			Date date = (Date) rawVal;
			return df.format(date);
		}
		if (rawVal instanceof Collection<?>) {
			Collection col = (Collection) rawVal;
			return col.stream().map(this::string).toArray();
		}
		String sVal = rawVal == null ? "Non renseigné" : rawVal.toString();
		sVal = sVal.replaceAll("true", "oui").replaceAll("false", "non");
		String ret = sVal/* .replaceAll("\r?\n", "") */;
		return ret;
	}

	@POST
	@Path("/imports/fake-eaes")
	@Consumes("application/octet-stream")
	public void importFakeEAEs(InputStream in) throws IOException {
		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			try (XSSFWorkbook wb = new XSSFWorkbook(in)) {
				Iterator<Sheet> sheetIterator = wb.sheetIterator();
				while (sheetIterator.hasNext()) {
					Sheet sheet = sheetIterator.next();
					for (int i = 1; i < sheet.getLastRowNum(); ++i) {
						Row row = sheet.getRow(i);
						Double matricule = row.getCell(0).getNumericCellValue();
						String nom = row.getCell(1).getStringCellValue();
						String prenom = row.getCell(2).getStringCellValue();
						Cell dateCell = row.getCell(3);
						if(null==dateCell) {
							log.info("Pas d'entretien - donc pas d'objectif - pour " + prenom + " " + nom);
							continue;
						}
						Date date = dateCell.getDateCellValue();
						List<String> objectifs = new ArrayList<>();
						for (short n = 4; n <= row.getLastCellNum(); ++n) {
							Cell cell = row.getCell(n);
							if (null == cell) {
								continue;
							}
							String obj = cell.getStringCellValue();
							if (null != obj && !obj.trim().isEmpty()) {
								objectifs.add(obj);
							}
						}

						// C'est prêt! :)
						Employe employe = super.getEmploye(matricule.intValue(), mut);
						boolean eaeAlready = employe.getEntretiens().stream().filter(EntretienAnnuel.class::isInstance).map(EntretienAnnuel.class::cast).anyMatch(e->sameDay(e.getDate(),date));
						if(eaeAlready) {
							throw new RuntimeException("Il existe déjà un EAE pour " + prenom + " " + nom + " en date du " + df.format(date));
						}
						EntretienAnnuel eae = MutFactory.eINSTANCE.createEntretienAnnuel();
						eae.setFake(true);
						eae.setEnCours(false);
						eae.setDate(date);
						employe.getEntretiens().add(eae);
						objectifs.stream().map(s -> {
							Objectif o = MutFactory.eINSTANCE.createObjectif();
							o.setLibelle(s);
							return o;
						}).forEach(eae.getObjectifs()::add);
						log.info("Import des objectifs OK pour " + prenom + " " + nom + "(" + objectifs.size() + ")");
					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			return true;
		});
	}

	private boolean sameDay(Date date, Date date2) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.setTime(date);
		cal2.setTime(date2);
		return cal.get(Calendar.DAY_OF_YEAR)==cal.get(Calendar.DAY_OF_YEAR) && cal.get(Calendar.YEAR)==cal.get(Calendar.YEAR);
	}
	
}
