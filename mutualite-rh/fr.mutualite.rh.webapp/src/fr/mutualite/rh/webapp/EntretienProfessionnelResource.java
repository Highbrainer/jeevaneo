package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.multipart.FormDataParam;

import fr.mutualite.rh.model.Appreciation;
import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Avis;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.PhotoEmploye;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.Formulaire;
import fr.mutualite.rh.model.util.Activator;
import fr.mutualite.rh.webapp.cdo.ICDO;
import fr.mutualite.rh.webapp.cdo.MutualiteCDO;
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
public class EntretienProfessionnelResource extends BaseResource {

	private ICDO cdo;

	// @Inject @AuthenticatedUser Employe authenticatedUser;

	public EntretienProfessionnelResource() {
		cdo = CdoServlet.getCdo();
	}

	// @GET
	// @Produces(MediaType.APPLICATION_JSON)
	// @Path("/employes/{matricule}/entretien-pro/all.json")
	// public Response list(@PathParam("matricule") int matricule) {
	// final Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
	// ResponseBuilder response = Response.ok(new StreamingOutput() {
	// @Override
	// public void write(OutputStream out) throws IOException, WebApplicationException {
	// JsonFactory jf = new JsonFactory();
	// final JsonGenerator jg = jf.createGenerator(out);
	// jg.writeStartArray();
	// employe.getEntretiens().forEach(ent -> {
	// Employe meneur = ent.getMeneur();
	// try {
	// jg.writeStartObject();
	// jg.writeStringField("id", ent.cdoID().toURIFragment());
	// jg.writeNumberField("matricule", matricule);
	// jg.writeStringField("date", df.format(ent.getDate()));
	// jg.writeBooleanField("enCours", ent.isEnCours());
	// jg.writeBooleanField("fake", ent.isFake());
	//
	// jg.writeStringField("meneur",
	// meneur == null ? "" : (meneur.getPrenom() + " " + meneur.getNom()));
	// jg.writeStringField("employe", employe.getPrenom() + " " + employe.getNom());
	// jg.writeEndObject();
	// } catch (IOException e) {
	// throw new RuntimeException(e);
	// }
	// });
	// jg.writeEndArray();
	// jg.close();
	// }
	// });
	// return response.build();
	// }

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien-pro/current")
	public String prepareEntretienProfessionnel(@PathParam("matricule") int matricule) {
		// System.err.println("Je suis " + authenticatedUser.getNom());
		String[] pRet = { null };
		cdo.doInMutualiteTransaction(mut -> {
			Employe employe = getEmploye(matricule, mut);
			EntretienProfessionnel entretien = getOrCreateEntretienProfessionnel(employe);
			Formulaire form = makeFormulaire(entretien);
			pRet[0] = Activator.getDefault().getJsonGenerator().generateJson(form);
			return true;
		});
		System.err.println("Je retourne " + pRet[0]);
		return pRet[0];
	}

	@Secured
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/employes/{matricule}/entretien-pro/current")
	public long addEntretienProfessionnel(@PathParam("matricule") int matricule) {
		long[] pRet = new long[1];
		cdo.doInMutualiteTransaction(mut -> {
			CDOTransaction transaction = (CDOTransaction) mut.cdoView();
			Employe employe = getEmploye(matricule, mut);
			EntretienProfessionnel entretien = getOrCreateEntretienProfessionnel(employe);
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
	@Path("/entretiens-pro/{cdoId}")
	public String get(@PathParam("cdoId") long id) {
		EntretienProfessionnel entretien = (EntretienProfessionnel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(id));
		Formulaire form = makeFormulaire(entretien);
		return Activator.getDefault().getJsonGenerator().generateJson(form);
	}

	private Formulaire makeFormulaire(EntretienProfessionnel entretien) {
		Formulaire form = DtoFactory.eINSTANCE.createFormulaire();
		form.setEntretien(entretien);
		return form;
	}

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien-pro/current/entretien")
	public String getCurrentEntretienProfessionnel(@PathParam("matricule") int matricule) {
		Employe employe = getEmploye(matricule, CdoServlet.getMutualite());
		EntretienProfessionnel entretien = getCurrentEntretienProfessionnel(employe);
		return Activator.getDefault().getJsonGenerator().generateJson(entretien);
	}

	@Secured
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/entretiens-pro/{cdoId}/entretien")
	public String getEntretienProfessionnel(@PathParam("cdoId") long id) {
		EntretienProfessionnel entretien = (EntretienProfessionnel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(id));
		return Activator.getDefault().getJsonGenerator().generateJson(entretien);
	}

	@Secured
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien-pro/current/entretien/entreteneur")
	public void setEntreteneur(@PathParam("matricule") int matricule, @QueryParam("matriculeEntreteneur") int matriculeEntreteneur) {
		cdo.doInMutualiteTransaction(mut -> {
			Employe employe = getEmploye(matricule, mut);
			EntretienProfessionnel entretien = getOrCreateEntretienProfessionnel(employe);
			Employe entreteneur = getEmploye(matriculeEntreteneur, mut);
			entretien.setMeneur(entreteneur);

			return true;
		});
	}

	@Secured
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/entretiens-pro/{cdoId}/entretien")
	public void enregistrer(@PathParam("cdoId") long id, InputStream in) throws JsonParseException, JsonMappingException, IOException {
		cdo.doInMutualiteTransaction(mut -> {
			EntretienProfessionnel e = (EntretienProfessionnel) mut.cdoView().getObject(CDOIDUtil.createLong(id));
			populate(e, in);
			return true;
		});
	}

	@Secured
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/employes/{matricule}/entretien-pro/current/entretien")
	public void enregistrer(@PathParam("matricule") int matricule, InputStream in) throws JsonParseException, JsonMappingException, IOException {
		cdo.doInMutualiteTransaction(mut -> {
			EntretienProfessionnel e = getOrCreateEntretienProfessionnel(getEmploye(matricule, mut));
			populate(e, in);
			return true;
		});

	}

	private void populate(EntretienProfessionnel e, InputStream in) {

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
		// AppreciationsSessionFormation
		tree.get("appreciationsSessionFormation").forEach(node -> {
			long id = node.get("cdoId").asLong();
			AppreciationSessionFormation app = (AppreciationSessionFormation) e.cdoView().getObject(CDOIDUtil.createLong(id));
			// e.getAppreciationsSessionFormation().stream().filter(app ->
			// app.cdoID().toURIFragment().equals(""+id)).findAny().get().setValeur(Appreciation.get(node.get("valeur").asText())));
			app.setValeur(Appreciation.get(node.get("valeur").asText()));
		});

		// Suppression des souhaits Evaluateur removed
		tree.get("souhaitEvaluateurRemovals").forEach(node -> {
			long id = node.get("id").asLong();
			e.getSouhaitsFormationEvaluateur().removeAll(e.getSouhaitsFormationEvaluateur().stream().filter(s -> {
				return id == Long.parseLong(s.cdoID().toURIFragment());
			}).collect(Collectors.toList()));
		});
	}

	private void addOrUpdateSouhaitsEvaluateur(EntretienProfessionnel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String texte = node.get("texte").asText();
			long id = node.get("id").asLong();
			if (added) {
				// create
				SouhaitFormationEvaluateur souhait = MutFactory.eINSTANCE.createSouhaitFormationEvaluateur();
				souhait.setTexte(texte);
				e.getSouhaitsFormationEvaluateur().add(souhait);
			} else {
				e.getSouhaitsFormationEvaluateur().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(souhait -> {
					souhait.setTexte(texte);
				});
			}
		});
	}

	private void addOrUpdateSouhaits(EntretienProfessionnel e, JsonNode nodes) {
		nodes.forEach(node -> {
			boolean added = node.has("added") ? node.get("added").asBoolean(false) : false;
			String texte = node.get("texte").asText();
			String avisEvaluateur = node.get("avisEvaluateur").asText();
			long id = node.get("id").asLong();
			if (added) {
				// create
				SouhaitFormationSalarie souhait = MutFactory.eINSTANCE.createSouhaitFormationSalarie();
				souhait.setAvisEvaluateur(Avis.get(avisEvaluateur));
				souhait.setTexte(texte);
				e.getSouhaitsFormationSalarie().add(souhait);
			} else {
				e.getSouhaitsFormationSalarie().stream().filter(s -> {
					return id == Long.parseLong(s.cdoID().toURIFragment());
				}).forEach(souhait -> {
					souhait.setAvisEvaluateur(Avis.get(avisEvaluateur));
					souhait.setTexte(texte);
				});
			}
		});
	}

	private EntretienProfessionnel getOrCreateEntretienProfessionnel(Employe employe) {
		EntretienProfessionnel entretien = (EntretienProfessionnel) employe.getEntretiens().stream().filter(entretien2 -> entretien2 instanceof EntretienProfessionnel)
				.filter(Entretien::isEnCours).findAny().orElseGet(() -> newEntretienPro(employe));
		return entretien;
	}

	private Entretien newEntretienPro(Employe employe) {
		EntretienProfessionnel ret = MutFactory.eINSTANCE.createEntretienProfessionnel();
		ret.setDate(new Date());

		PhotoEmploye photo = employe.photo(ret.getDate());

		ret.setPhotoEmploye(photo);

		Date datePrecedentEntretienPro = employe.getEntretiens().stream().filter(entretien2 -> entretien2 instanceof EntretienProfessionnel).map(Entretien::getDate)
				.max(Date::compareTo).orElse(new Date(0));

		Date datePrecedentEntretien = employe.getEntretiens().stream().map(Entretien::getDate).max(Date::compareTo).orElse(new Date(0));

		// les evals de formations déjà faites dans des entretiens précédents depuis le dernier entretien pro.
		// (probablement dans l'entretien annuel précédent...)
		Stream<Entretien> entretiensIntermediaires = employe.getEntretiens().stream()
				.filter(e -> e.getDate().after(datePrecedentEntretienPro) && (e.getDate().before(datePrecedentEntretien) || e.getDate().equals(datePrecedentEntretien)));
		entretiensIntermediaires.map(Entretien::getAppreciationsSessionFormation).forEach(ret.getAppreciationsSessionFormationEntretiensPrecedents()::addAll);

		// les evals de formations "propres"
		employe.getSessionsFormation().stream().filter(sf -> sf.getDateDebut().after(datePrecedentEntretien)).map(session -> {
			AppreciationSessionFormation apprec = MutFactory.eINSTANCE.createAppreciationSessionFormation();
			apprec.setSessionFormation(session);
			apprec.setValeur(null);
			return apprec;
		}).forEach(ret.getAppreciationsSessionFormation()::add);

		employe.getEntretiens().add(ret);
		return ret;
	}

	private EntretienProfessionnel getCurrentEntretienProfessionnel(Employe employe) {
		EntretienProfessionnel entretien = (EntretienProfessionnel) employe.getEntretiens().stream().filter(entretien2 -> entretien2 instanceof EntretienProfessionnel)
				.filter(Entretien::isEnCours).findAny().get();
		return entretien;
	}

	@Secured
	@POST
	@Path("/entretiens-pro/{cdoId}/validate")
	public void validate(@PathParam("cdoId") long cdoId) {

		boolean hasRole = AuthenticationFilter.getConnectedUtilisateur().getRoles().stream()
				.anyMatch(role -> role.name().equals(Role.DRH.name()) || role.name().equals(Role.RESPONSABLE_ENTRETIEN.name()));
		if (!hasRole) {
			throw new WebApplicationException("Vous n'avez pas l'autorisation de valider cet entretien", 403);
		}

		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			EntretienProfessionnel entretien = (EntretienProfessionnel) mut.cdoView().getObject(CDOIDUtil.createLong(cdoId));

			entretien.setDate(new Date());

			// TODO reprendre la photo de l'employé au cas où??
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
	@Path("/entretiens-pro/{cdoId}.pdf")
	public Response toPdf(@PathParam("cdoId") long cdoId) {

		EntretienProfessionnel entretien = (EntretienProfessionnel) CdoServlet.getMutualite().cdoView().getObject(CDOIDUtil.createLong(cdoId));
		ResponseBuilder response = Response.ok(new StreamingOutput() {
			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				generatePdf(entretien, out);
			}
		});
		Employe employe = entretien.employe();
		response.header("Content-Disposition", "inline; filename=entretien-professionel-" + employe.getNom() + "-" + employe.getPrenom() + "-"
				+ DateFormat.getDateInstance(DateFormat.SHORT).format(entretien.getDate()) + ".pdf");
		return response.build();
	}

	private static final DateFormat df = DateFormat.getDateInstance();
	private static final DateFormat dtf = DateFormat.getDateTimeInstance();

	private void generatePdf(EntretienProfessionnel entretien, OutputStream out) throws IOException {
		// InputStream in =
		// getClass().getClassLoader().getResourceAsStream("fr/mutualite/rh/webapp/odt/template-entretien-pro.odt");
		// InputStream in = new FileInputStream(
		// "E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.webapp\\resources\\fr\\mutualite\\rh\\webapp\\odt\\template-entretien-pro4.odt");
		InputStream in = fr.mutualite.rh.webapp.Activator.getContext().getBundle().getResource("/fr/mutualite/rh/webapp/odt/template-entretien-pro7.1.odt").openStream();
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
			// ctx.put("entretien", entretien);
			// ctx.put("employe", employe);
			// ctx.put("formulaire", formulaire);
			

			ctx.put("_diplomes", photoEmploye.getDiplomes().stream().collect(Collectors.joining(", ")));

			entretien.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = entretien.eGet(att);
				Object sVal = string(rawVal);
				ctx.put(att.getName(), sVal);
			});
			entretien.eClass().getEAllReferences().forEach(ref -> {
				ctx.put(ref.getName(), entretien.eGet(ref));
			});
			employe.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = employe.eGet(att);
				Object sVal = string(rawVal);
				ctx.put("employe_" + att.getName(), sVal);
			});
			// employe.eClass().getEAllReferences().forEach(ref -> {
			// ctx.put("employe." + ref.getName(), employe.eGet(ref));
			// });
			formulaire.eClass().getEAllAttributes().forEach(att -> {
				Object rawVal = formulaire.eGet(att);
				Object sVal = string(rawVal);
				ctx.put("formulaire_" + att.getName(), sVal);
			});
			if (photoEmploye != null) {
				photoEmploye.eClass().getEAllAttributes().forEach(att -> {
					Object rawVal = photoEmploye.eGet(att);
					Object sVal = string(rawVal);
					ctx.put("photo_" + att.getName(), sVal);
				});
			}
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
}
