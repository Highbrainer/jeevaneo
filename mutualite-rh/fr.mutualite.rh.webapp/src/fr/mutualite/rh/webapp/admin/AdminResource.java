package fr.mutualite.rh.webapp.admin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.mutualite.rh.ldap.LdapClient;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.OrganismeFormation;
import fr.mutualite.rh.model.config.Configuration;
import fr.mutualite.rh.webapp.CdoServlet;
import fr.mutualite.rh.webapp.cdo.ICDO;

@Path("/admin")
// @Secured
public class AdminResource {


	private Mutualite getMutualite() {
		return CdoServlet.getMutualite();
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/backup.xml")
	public Response backup() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				Mutualite mutualite = getMutualite();
				mutualite.cdoDirectResource().save(os, Collections.EMPTY_MAP);
			}

		};

		return Response.ok(stream).build();
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/checkup")
	public Response checkup() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				PrintStream out = new PrintStream(os, true, "UTF-8");
				out.println(
						"<html><head><meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" /><style>pre {margin-left:1cm;padding-left:2mm;white-space: pre-wrap;background: hsl(30,80%,90%);}</style></head><body><h1>Check-up de la configuration</h1>");
				out.println("<div>Configuration:<table style='margin-left:1cm;padding-left:2mm;background:#cacaca;'><tbody>");
				Configuration config = CdoServlet.getConfig();
				config.eClass().getEAllAttributes().forEach(attr -> {
					out.println(String.format("<tr><th>%s</th><td><code>%s</code></td></tr>", attr.getName(), config.eGet(attr)));
				});
				out.flush();
				os.flush();
				sleep(200);
				out.println("</tbody></table>OK!</div>");
				out.println("<div>Test d'accès à l'annuaire...");
				testLdap(out);
				out.flush();
				os.flush();
				out.println("<div>Test d'accès à la base de données...");
				out.flush();
				os.flush();
				testDb(out);
				out.println("</div>");
				out.println("<div>Test d'accès à CDO...");
				out.flush();
				os.flush();
				testCdo(out);
				out.println("</div>");
			}

			private void testCdo(PrintStream out) {
				out.println("<div  style='margin-left:1cm;padding-left:2mm;background:#caffca;'>");
				out.println("<div>Ouverture d'une connexion...");
				Mutualite mutualite = getMutualite();
				String NOM = "SUPPRIMEZ-MOI!";
				ICDO cdo = CdoServlet.getCdo();
				out.println("OK!</div>");

				try {
					cleanEmployeFictif(NOM, cdo);
				} catch (Exception e) {
				}

				out.println("<div>Création d'un employé fictif...");
				cdo.doInMutualiteTransaction(mut -> {
					Employe bidon = MutFactory.eINSTANCE.createEmploye();
					bidon.setNom(NOM);
					bidon.setPrenom("VITE!");
					mut.getEffectif().getEmployes().add(bidon);
					return true;
				});
				out.println("OK!</div>");
				out.println("<div>Vérification...");
				sleep(500);
				boolean anyMatch = mutualite.getEffectif().getEmployes().stream().anyMatch(emp -> emp.getNom().equals(NOM));
				if (!anyMatch) {
					throw new IllegalStateException("Création d'employé fictif a échoué!");
				}
				out.println("OK!</div>");
				out.println("<div>Suppression de l'employé fictif...");
				cdo.doInMutualiteTransaction(mut -> {
					mut.getEffectif().getEmployes().stream().filter(emp -> emp.getNom().equals(NOM)).collect(Collectors.toSet())
							.forEach(emp -> mut.getEffectif().getEmployes().remove(emp));
					return true;
				});
				out.println("OK!</div></div>OK!");
			}

			private void cleanEmployeFictif(String NOM, ICDO cdo) {
				cdo.doInMutualiteTransaction(mut -> {
					mut.getEffectif().getEmployes().stream().filter(emp -> emp.getNom().equals(NOM)).collect(Collectors.toSet())
							.forEach(emp -> mut.getEffectif().getEmployes().remove(emp));
					return true;
				});
			}

			private void testDb(PrintStream out) {
				Configuration config = CdoServlet.getConfig();
				out.println("<div  style='margin-left:1cm;padding-left:2mm;background:#cacaff;'>");
				try {
					out.println("<div>Chargement du driver JDBC...");
					Class.forName(config.getJdbcDriver());
					out.println("OK!</div>");
					out.println("<div>Ouverture d'une connexion...");
					try (Connection con = DriverManager.getConnection(config.getJdbcUrl(), config.getJdbcUser(), config.getJdbcPassword());
							Statement statement = con.createStatement();) {

						out.println("OK!</div>");
						try {
							statement.execute("drop table bidon");
						} catch (Exception e) {
						}
						out.println("<div>Création d'une table bidon...");
						String create = "create table bidon(dummy varchar(10))";
						statement.executeUpdate(create);
						out.println("OK!</div>");
						out.println("<div>Insertion de données...");
						for (int i = 0; i < 3; ++i) {
							statement.execute("insert into bidon(dummy) values('valeur" + i + "')");
						}
						out.println("OK!</div>");
						out.println("<div>Vérification de la présence des valeurs...");
						try (ResultSet rs = statement.executeQuery("select count(*) from bidon");) {
							if (!rs.next()) {
								throw new IllegalStateException("Pas de resultat au count!?");
							}
							int count = rs.getInt(1);
							if (count != 3) {
								throw new IllegalStateException("Mauvais compte de lignes : " + count + " au lieu de 3.");
							}
						}
						out.println("OK!</div>");
						out.println("<div>Suppression de la table bidon...");
						statement.execute("drop table bidon");
						out.println("OK!</div>");
					}
					out.println("</div>OK!");
				} catch (Throwable t) {
					out.println("<pre><code>");
					t.printStackTrace(out);
					out.println("</code></pre>");
				}
			}

			private void testLdap(PrintStream out) {
				LdapClient ldap = new LdapClient(CdoServlet.getConfig());
				try {
					LdapContext context = ldap.bindAsAdmin();
					List<String> dns = ldap.findDns(context, "(objectClass=organizationalUnit)");
					if (null == dns || dns.isEmpty()) {
						throw new IllegalStateException("Aucune OU trouvée dans l'annuaire!");
					}
					out.println("<div style='margin-left:1cm;padding-left:2mm;background:#caca99;'>Liste des OUs:<ul>");
					dns.stream().sorted().forEach(s -> {
						out.println("<li>" + s + "</li>");
					});
					out.println("</ul></div><br/>");
					dns = ldap.findDns(context, String.format(ldap.getFilter(), "*"));
					out.println("<div style='margin-left:1cm;padding-left:2mm;background:#99caca;'>Liste des utilisateurs:<ul>");
					dns.stream().sorted().forEach(s -> {
						out.println("<li>" + s + "</li>");
					});
					out.println("</ul></div><br/>");
					String dn = ldap.findUniqueUser(context, "mtheou");
					out.println("<div style='margin-left:1cm;padding-left:2mm;background:#ca99ca;'>Recherche du compte de Magali:<ul>");
					if (null == dn || dn.trim().isEmpty()) {
						throw new IllegalStateException("Le compte de Magali n'a pas été trouvé dans l'annuaire!");
					}
					out.println("<li>Trouvé! : <code>" + dn + "</code></li>");
					out.println("</ul></div><br/>");
					context.close();
					out.println("OK!");
				} catch (Throwable t) {
					out.println("<pre><code>");
					t.printStackTrace(out);
					out.println("</code></pre>");
				}
			}

			private void sleep(long t) {
				try {
					Thread.sleep(t);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		return Response.ok(stream).build();
	}

	@GET
	@Path("/restore")
	public void restore() throws IOException {

		File f = new File("/E:/temp/2017/04/05/backup-20170404.xml");
		if(!f.exists()) {
			throw new WebApplicationException("Fichier introuvable : " + f.getAbsolutePath(), 404);
		}
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI(f.getAbsolutePath()));
		resource.load(Collections.EMPTY_MAP);

		CdoServlet.getCdo().doInMutualiteTransaction(mut -> {
			CDOResource cdoResource = mut.cdoResource();
			if (!resource.getContents().isEmpty()) {
//				EcoreUtil.delete(resource.getContents().get(0));
				cdoResource.getContents().clear();
			}
			return true;
		});

		Mutualite mutualite = (Mutualite) resource.getContents().get(0);

		CdoServlet.getCdo().doInTransaction(trans -> {
			CDOResource cdoResource = trans.getOrCreateResource("mutualite-rh");
			try {
				cdoResource.load(new FileInputStream(f), Collections.EMPTY_MAP);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			cdoResource.getContents().add(mutualite);
			return true;
		});
	}

	@GET
	@Path("/bidon")
	@Produces(MediaType.TEXT_PLAIN)
	public String bidon() throws IOException {

		File f = new File("/E:/temp/2017/04/05/backup-20170404.xml");
		if(!f.exists()) {
			throw new WebApplicationException("Fichier introuvable : " + f.getAbsolutePath(), 404);
		}
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI(f.getAbsolutePath()));
		resource.load(Collections.EMPTY_MAP);

		String ret = "";
		
		Mutualite mutualite = (Mutualite) resource.getContents().get(0);
		EList<Employe> employes = mutualite.getEffectif().getEmployes();
		for (Employe employe : employes) {
			ret += employe.getLabel() + "\n";
			if(null==employe.getEtablissement()) {
				ret += "\tSANS ETABLISSEMENT\n";
			}
			if(employe.getAffectationEmploiCourante()!=null) {
				if(employe.getAffectationEmploiCourante().getEmploi()==null) {
				 ret += "\tEMPLOI COURANT SANS EMPLOI\n";
				}
			} else {
				 ret += "\tSANS EMPLOI COURANT\n";
			}
			ret += "\n";
		}
		return ret;
	}

	@GET
	@Produces("text/csv")
	@Path("/exports/employes.csv")
	public Response exportEmployes() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				PrintWriter out = new PrintWriter(os);
				out.println(
						"matricule;Nom;Nom JF;Prénom;etablissement;date naissance;date entrée;date sortie;statut;emploi;date entrée fonction;date précédent entretien;Responsable;matricule responsable;Entreteneur;matricule entreteneur");
				Mutualite mutualite = CdoServlet.getMutualite();
				mutualite.getEffectif().getEmployes().stream().sorted((e1, e2) -> e1.getMatricule() - e2.getMatricule()).forEach(employe -> {
					try {
						Entretien lastEntretien = employe.getEntretiens().stream().min((e1, e2) -> e1.getDate().compareTo(e2.getDate())).orElse(null);
						AffectationClassification affectationClassificationCourante = employe.getAffectationClassificationCourante();
						Employe responsable = employe.getResponsable();
						out.printf("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\r\n", employe.getMatricule(), field(employe.getNom()), field(employe.getNomJeuneFille()),
								field(employe.getPrenom()), employe.getEtablissement().getId(), field(employe.getDateNaissance()), field(employe.getDateEmbauche()),
								field(employe.getDateSortieEntreprise()),
								affectationClassificationCourante == null ? "" : affectationClassificationCourante.getClassification().getValue(),
								field(employe.getAffectationEmploiCourante().getEmploi().getIntitule()), field(employe.getAffectationEmploiCourante().getDateDebut()),
								null == lastEntretien ? "" : field(lastEntretien.getDate()), responsable == null ? "" : field(responsable.getNom()),
								responsable == null ? "" : responsable.getMatricule(),
								field(employe.getEntreteneurs().stream().map(Employe::getNom).collect(Collectors.joining(", "))),
								field(employe.getEntreteneurs().stream().map(Employe::getMatricule).map(Object::toString).collect(Collectors.joining(", "))));
					} catch (Throwable t) {
						t.printStackTrace();
					}
				});

				out.flush();
			}
		};

		return Response.ok(stream).build();
	}

	@GET
	@Produces("text/csv")
	@Path("/exports/etablissements.csv")
	public Response exportEtablissements() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				PrintWriter out = new PrintWriter(os);
				out.println("matricule;Nom");
				Mutualite mutualite = CdoServlet.getMutualite();
				mutualite.getEtablissements().getEtablissements().stream().sorted((e1, e2) -> e1.getId() - e2.getId()).forEach(etablissement -> {
					try {
						out.printf("%s;%s\r\n", etablissement.getId(), field(etablissement.getNom()));
					} catch (Throwable t) {
						t.printStackTrace();
					}
				});

				out.flush();
			}
		};

		return Response.ok(stream).build();
	}

	@GET
	@Produces("text/csv")
	@Path("/exports/formations.csv")
	public Response exportFormationss() {
		StreamingOutput stream = new StreamingOutput() {
			@Override
			public void write(OutputStream os) throws IOException, WebApplicationException {
				PrintWriter out = new PrintWriter(os);
				out.println();
				out.println();
				out.println("nom;prénom;formation;organisme formation;date début;date fin;durée");
				Mutualite mutualite = CdoServlet.getMutualite();
				mutualite.getEffectif().getEmployes().stream().sorted((e1, e2) -> e1.getMatricule() - e2.getMatricule()).forEach(employe -> {
					employe.getSessionsFormation().forEach(session -> {
						Formation formation = (Formation) session.eContainer();
						OrganismeFormation organisme = (OrganismeFormation) formation.eContainer();
						try {
							out.printf("%s;%s;%s;%s;%s;%s;%s;%s\r\n", employe.getMatricule(), field(employe.getNom()), field(employe.getPrenom()), field(formation.getLibelle()),
									field(organisme.getNom()), field(session.getDateDebut()), field(session.getDateFin()), session.getDuree());
						} catch (Throwable t) {
							t.printStackTrace();
						}
					});
				});

				out.flush();
			}
		};

		return Response.ok(stream).build();
	}

	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	private String field(Date d) {
		if (null == d) {
			return "";
		}
		return field(df.format(d));
	}

	private String field(String s) {
		if (null == s) {
			return "";
		}
		return s;
	}

}
