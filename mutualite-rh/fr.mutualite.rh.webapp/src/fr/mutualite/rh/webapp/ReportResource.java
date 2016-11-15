package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.SessionFormation;

@Path("/reports")
public class ReportResource {

	@GET
	@Path("formations/{annee}/souhaits.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlssouhaitsFormationParAnnee(@PathParam("annee") Integer annee) {

		Mutualite mut = CdoServlet.getMutualite();
		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("souhaits " + annee);
					int[] row = { 0 };

					{
						int[] i = { 0 };
						HSSFRow line = sheet.createRow(++row[0]);
						// titre
						line.createCell(++i[0]).setCellValue("Matricule");
						line.createCell(++i[0]).setCellValue("Nom");
						line.createCell(++i[0]).setCellValue("Prénom");
						line.createCell(++i[0]).setCellValue("Etablissement");
						line.createCell(++i[0]).setCellValue("Souhait");
						line.createCell(++i[0]).setCellValue("Emetteur");
						line.createCell(++i[0]).setCellValue("Avis Evaluateur");
					}
					// fin titres

					final Calendar cal = Calendar.getInstance();
					mut.getEffectif().getEmployes().forEach(e -> {
						e.getEntretiens().stream().filter(ent -> {
							cal.setTime(ent.getDate());
							return annee == cal.get(Calendar.YEAR);
						}).filter(ent -> ent instanceof EntretienProfessionnel).map(ent -> (EntretienProfessionnel) ent)
								.flatMap(ent -> ent.getSouhaitsFormationEvaluateur().stream()).forEach(souhaitEvaluateur -> {
									HSSFRow line = sheet.createRow(++row[0]);
									int i = 0;

									line.createCell(++i).setCellValue(e.getMatricule());
									line.createCell(++i).setCellValue(e.getNom());
									line.createCell(++i).setCellValue(e.getPrenom());
									line.createCell(++i).setCellValue(e.getEtablissement().getId());
									line.createCell(++i).setCellValue(souhaitEvaluateur.getTexte());
									line.createCell(++i).setCellValue("Evaluateur");
									line.createCell(++i).setCellValue("-");
								});
						e.getEntretiens().stream().filter(ent -> {
							cal.setTime(ent.getDate());
							return annee == cal.get(Calendar.YEAR);
						}).filter(ent -> ent instanceof EntretienProfessionnel).map(ent -> (EntretienProfessionnel) ent).flatMap(ent -> ent.getSouhaitsFormationSalarie().stream())
								.forEach(souhaitSalarie -> {
									HSSFRow line = sheet.createRow(++row[0]);
									int i = 0;

									line.createCell(++i).setCellValue(e.getMatricule());
									line.createCell(++i).setCellValue(e.getNom());
									line.createCell(++i).setCellValue(e.getPrenom());
									line.createCell(++i).setCellValue(e.getEtablissement().getId());
									line.createCell(++i).setCellValue(souhaitSalarie.getTexte());
									line.createCell(++i).setCellValue("Salarié");
									line.createCell(++i).setCellValue(souhaitSalarie.getAvisEvaluateur().getLiteral());
								});

					});

					// fin data

					wb.write(out);
					out.flush();
				}
			}
		});
		response.header("Content-Disposition", "attachment; filename=souhaits-formations-" + annee + ".xls");
		return response.build();

	}

	@GET
	@Path("{etablissementId}/{annee}/matrice-employes-formations.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsMatriceEmployeeFormation(@PathParam("etablissementId") Integer etablissementId, @PathParam("annee") Integer annee) {

		Mutualite mut = CdoServlet.getMutualite();
		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					generateSheet(etablissementId, mut, annee, wb);

					wb.write(out);
					out.flush();
				}
			}
		});
		String ext = ".xls";
		if(null!=annee) {
			ext = "-" + annee + ext; 
		}
		if (null != etablissementId) {
			Etablissement etablissement = mut.getEtablissements().getEtablissements().stream().filter(et -> et.getId() == etablissementId).findAny().orElse(null);
			if (null != etablissement) {
				ext = "-" + etablissement.getNom() + ext;
			}

		}
		response.header("Content-Disposition", "attachment; filename=matrice-employes-formations" + ext);
		return response.build();

	}

	@GET
	@Path("matrices-employes-formations.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsMatriceEmployeeFormation() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsMatriceEmployeeFormation(mut, null);
	}

	@GET
	@Path("{annee}/matrices-employes-formations.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsMatriceEmployeeFormation(@PathParam("annee") int annee) {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsMatriceEmployeeFormation(mut, annee);
	}

	public Response xlsMatriceEmployeeFormation(Mutualite mut, Integer annee) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {

					mut.getEtablissements().getEtablissements().forEach(et -> {
						generateSheet(et.getId(), mut, annee, wb);
					});
					generateSheet(null, mut, annee, wb);

					wb.write(out);
					out.flush();
				}
			}
		});
		String ext = ".xls";
		if(null!=annee) {
			ext = "-" + annee + ext;
		}
		response.header("Content-Disposition", "attachment; filename=matrices-employes-formations" + ext);
		return response.build();

	}

	private void generateSheet(Integer etablissementId, Mutualite mut, Integer annee, HSSFWorkbook wb) {

		Etablissement etablissement = null == etablissementId ? null
				: mut.getEtablissements().getEtablissements().stream().filter(et -> et.getId() == etablissementId).findAny().orElse(null);

		String sheetName = null == etablissement ? "Tous" : "" + etablissementId + " " + etablissement.getNom();
		HSSFSheet sheet = wb.createSheet(sheetName);
		int[] row = { 0 };

		List<Formation> formations = mut.getOrganismes().getOrganismeFormations().stream().flatMap(org -> org.getFormations().stream())
				.filter(f -> (etablissementId == null || f.getSessionformation().stream()
						.anyMatch(sf -> isSameYear(sf, annee) && sf.getEmployes().stream().anyMatch(e -> e.getEtablissement().getId() == etablissementId))))
				.sorted((f1, f2) -> f1.getLibelle().compareTo(f2.getLibelle())).collect(Collectors.toList());
		{
			int[] i = { 0 };
			HSSFRow line = sheet.createRow(++row[0]);
			// titre
			line.createCell(++i[0]).setCellValue("Nom");
			line.createCell(++i[0]).setCellValue("Prénom");
			line.createCell(++i[0]).setCellValue("Etablissement");

			formations.forEach(form -> {
				line.createCell(++i[0]).setCellValue(form.getLibelle());
			});
		}
		// fin titres

		mut.getEffectif().getEmployes().stream()
				.filter(emp -> !hasLeftTheCompany(emp) && emp.getNom() != null && (null == etablissementId || emp.getEtablissement().getId() == etablissementId))
				.sorted((e1, e2) -> (e1.getNom() + " " + e1.getPrenom()).compareTo((e2.getNom() + " " + e2.getPrenom()))).forEachOrdered(emp -> {
					HSSFRow line = sheet.createRow(++row[0]);
					int[] i = { 0 };
					line.createCell(++i[0]).setCellValue(emp.getNom());
					line.createCell(++i[0]).setCellValue(emp.getPrenom());
					// System.out.println(emp.getNom() + " " + emp.getPrenom());
					// System.out.println(emp.getEtablissement());
					line.createCell(++i[0]).setCellValue(emp.getEtablissement().getNom());

					formations.forEach(form -> {
						boolean hasFormation = emp.getSessionsFormation().stream().map(session -> (Formation) session.eContainer()).anyMatch(form1 -> form1.equals(form));
						line.createCell(++i[0]).setCellValue(hasFormation ? "X" : "");
					});

				});
		;

		// fin data
	}

	private boolean hasLeftTheCompany(Employe emp) {
		Date dateSortieEntreprise = emp.getDateSortieEntreprise();
		return dateSortieEntreprise!=null && dateSortieEntreprise.before(new Date());
	}

	private static final Calendar cal = Calendar.getInstance();

	private boolean isSameYear(SessionFormation sf, Integer annee) {
		Date debut = sf.getDateDebut();
		Integer yearDebut = null;
		if (debut != null) {
			cal.setTime(debut);
			yearDebut = cal.get(Calendar.YEAR);
			if (yearDebut == annee) {
				return true;
			}
		}
		Date fin = sf.getDateFin();
		Integer yearFin = null;
		if (null != fin) {
			cal.setTime(fin);
			yearFin = cal.get(Calendar.YEAR);

			if (yearFin == annee) {
				return true;
			}
		}
		if (null != yearDebut && null != yearFin) {
			return yearDebut <= annee && yearFin >= annee;
		}
		return false;
	}

}
