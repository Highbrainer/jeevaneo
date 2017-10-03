package fr.mutualite.rh.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.OrganismeFormation;
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
		if (null != annee) {
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
				InputStream template = getClass().getResourceAsStream("/matrices-employes-formations-template.xlsx");
				try (Workbook wb = new XSSFWorkbook(template);) {

					mut.getEtablissements().getEtablissements().stream().sorted((e1,e2)->e1.getId()-e2.getId()).forEach(et -> {
						generateSheet(et.getId(), mut, annee, wb);
					});
					generateSheet(null, mut, annee, wb);

					wb.write(out);
					out.flush();
				}
			}
		});
		String ext = ".xls";
		if (null != annee) {
			ext = "-" + annee + ext;
		}
		response.header("Content-Disposition", "attachment; filename=matrices-employes-formations" + ext);
		return response.build();

	}

	@GET
	@Path("derniere-formation-dpc.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsDerniereFormationDpc() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsDerniersFormationDpc(mut);
	}

	public Formation formation(SessionFormation sf) {
		return (Formation) sf.eContainer();
	}

	public Response xlsDerniersFormationDpc(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					HSSFSheet sheet = wb.createSheet("Formations DPC");
					mut.getEffectif().getEmployes().forEach(employe -> {

						{
							HSSFRow titleRow = sheet.createRow(0);
							int i = -1;
							HSSFCell cell;

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Salarié");

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Etablissement");

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Emploi");

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Dernière DPC");

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Formation DPC");

							cell = titleRow.createCell(++i);
							cell.setCellStyle(titleStyle);
							cell.setCellValue("Organisme");

						}
						HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
						int i = -1;
						row.createCell(++i).setCellValue(employe.getLabel());
						row.createCell(++i).setCellValue(employe.getEtablissement().getNom());
						row.createCell(++i).setCellValue(employe.getAffectationEmploiCourante().getEmploi().getIntitule());
						Optional<SessionFormation> first = employe.getSessionsFormation().stream().filter(sf -> formation(sf).isDpc())
								.sorted((sf1, sf2) -> sf1.getDateDebut().compareTo(sf2.getDateDebut())).findFirst();
						if (first.isPresent()) {
							SessionFormation sessionFormation = first.get();

							HSSFCell dateCell = row.createCell(++i);
							dateCell.setCellStyle(dateStyle);
							dateCell.setCellValue(sessionFormation.getDateDebut());
							Formation formation = formation(sessionFormation);
							row.createCell(++i).setCellValue(formation.getLibelle());
							row.createCell(++i).setCellValue(organisme(formation).getNom());
						}

					});

					IntStream.range(0, 6).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}

			public OrganismeFormation organisme(Formation formation) {
				return (OrganismeFormation) formation.eContainer();
			}
		});
		response.header("Content-Disposition", "attachment; filename=dernieres-formations-dpc.xls");
		return response.build();

	}

	@GET
	@Path("/demandes-rencontre-rh.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsDemandeRhLorsDernierEntretien() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsDemandeRhLorsDernierEntretien(mut);
	}

	@GET
	@Path("/souhaits-formation.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsSouhaitsFormationDernierEntretien() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsSouhaitsFormationDernierEntretien(mut);
	}

	@GET
	@Path("/objectifs.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsObjectifsDernierEntretien() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsObjectifsDernierEntretien(mut);
	}

	@GET
	@Path("/responsables.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsResponsables() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsResponsables(mut);
	}

	public Response xlsSouhaitsFormationDernierEntretien(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Souhaits de Formation");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					int nbCols = -1;
					{
						// TITRES

						Row row = sheet.createRow(0);
						Cell cell;
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Date d'entretien");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Type d'entretien");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Souhait");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Demandeur");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Avis de l'évaluateur");
					}

					mut.getEffectif().getEmployes().forEach(emp -> {
						emp.getEntretiens().stream()

								.filter(ent -> ent.getDate() != null)

								// .filter(EntretienProfessionnel.class::isInstance)
								//
								// .map(EntretienProfessionnel.class::cast)

								.forEach(entretien -> {

									Stream<String[]> souhaitsEvaluateur = entretien.getSouhaitsFormationEvaluateur().stream()
											.map(souhait -> new String[] { souhait.getTexte(), "Evaluateur", "" });
									Stream<String[]> souhaitsSalarie = entretien.getSouhaitsFormationSalarie().stream()
											.map(souhait -> new String[] { souhait.getTexte(), "Salarié", souhait.getAvisEvaluateur().getLiteral() });

									Stream.concat(souhaitsEvaluateur, souhaitsSalarie).forEach(vals -> {

										// le salarié a demandé à rencontrer les RH lors de son dernier entretien.
										HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
										int i = -1;
										row.createCell(++i).setCellValue(emp.getEtablissement().getNom());
										row.createCell(++i).setCellValue(emp.getNom());
										row.createCell(++i).setCellValue(emp.getPrenom());
										Cell cell = row.createCell(++i);
										cell.setCellStyle(dateStyle);
										cell.setCellValue(entretien.getDate());
										row.createCell(++i).setCellValue(
												entretien instanceof EntretienProfessionnel ? "EP" : (entretien instanceof EntretienAnnuel ? "EAE" : entretien.eClass().getName()));
										row.createCell(++i).setCellValue(vals[0]);
										row.createCell(++i).setCellValue(vals[1]);
										row.createCell(++i).setCellValue(vals[2]);
									});
								});
					});

					int i = -1;
					IntStream.range(0, nbCols + 1).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=demandes-rencontre-rh.xls");
		return response.build();

	}

	public Response xlsObjectifsDernierEntretien(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Objectifs");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					int nbCols = -1;
					{
						// TITRES

						Row row = sheet.createRow(0);
						Cell cell;
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Date d'entretien");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Objectif");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Echéance");
					}

					mut.getEffectif().getEmployes().forEach(emp -> {
						emp.getEntretiens().stream()

								.filter(ent -> ent.getDate() != null)

								.filter(EntretienAnnuel.class::isInstance)

								.map(EntretienAnnuel.class::cast)

								.max((e1, e2) -> e1.getDate().compareTo(e2.getDate()))

								.ifPresent(entretien -> {

									entretien.getObjectifs().stream().filter(o -> o.getLibelle() != null && !o.getLibelle().trim().isEmpty()).forEach(objectif -> {

										HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
										int i = -1;
										row.createCell(++i).setCellValue(emp.getEtablissement().getNom());
										row.createCell(++i).setCellValue(emp.getNom());
										row.createCell(++i).setCellValue(emp.getPrenom());
										Cell cell = row.createCell(++i);
										cell.setCellStyle(dateStyle);
										cell.setCellValue(entretien.getDate());
										row.createCell(++i).setCellValue(objectif.getLibelle());
										row.createCell(++i).setCellValue(objectif.getEcheance());
									});
								});
					});

					int i = -1;
					IntStream.range(0, nbCols + 1).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=objectifs.xls");
		return response.build();

	}

	public Response xlsResponsables(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Responsables");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					int nbCols = -1;
					{
						// TITRES

						Row row = sheet.createRow(0);
						Cell cell;
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Responsable");
						cell = row.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Entreteneurs");
					}

					mut.getEffectif().getEmployes().stream().filter(ReportResource.this::isEmployePresent).forEach(emp -> {
						Row row = sheet.createRow(sheet.getLastRowNum() + 1);
						int i = -1;
						Cell cell;
						cell = row.createCell(++i);
						Etablissement etablissement = emp.getEtablissement();
						cell.setCellValue(etablissement == null ? "SANS ETABLISSEMENT" : etablissement.getNom());
						cell = row.createCell(++i);
						cell.setCellValue(emp.getNom());
						cell = row.createCell(++i);
						cell.setCellValue(emp.getPrenom());
						cell = row.createCell(++i);
						Employe responsable = emp.getResponsable();
						cell.setCellValue(responsable == null ? "" : responsable.getLabel());
						cell = row.createCell(++i);
						cell.setCellValue(emp.getEntreteneurs().stream().map(Employe::getLabel).collect(Collectors.joining(", ")));
					});

					IntStream.range(0, nbCols + 1).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=responsables.xls");
		return response.build();

	}

	private boolean isEmployePresent(Employe emp) {
		Date sortie = emp.getDateSortieEntreprise();
		return sortie == null || sortie.after(new Date());
	}

	public Response xlsDemandeRhLorsDernierEntretien(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Demandes rencontre RH");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					{
						// TITRES

						Row row = sheet.createRow(0);
						int i = -1;
						Cell cell;
						cell = row.createCell(++i);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = row.createCell(++i);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = row.createCell(++i);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = row.createCell(++i);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Date d'entretien");
						cell = row.createCell(++i);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Commentaire");
					}

					mut.getEffectif().getEmployes().forEach(emp -> {
						emp.getEntretiens().stream()

								.filter(ent -> ent.getDate() != null)

								.filter(EntretienProfessionnel.class::isInstance)

								.map(EntretienProfessionnel.class::cast)

								.max((ep1, ep2) -> {
									return ep1.getDate().compareTo(ep2.getDate());
								})

								.filter(EntretienProfessionnel::isRencontreRh)

								.ifPresent(entretien -> {
									// le salarié a demandé à rencontrer les RH lors de son dernier entretien.
									HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
									int i = -1;
									row.createCell(++i).setCellValue(emp.getEtablissement().getNom());
									row.createCell(++i).setCellValue(emp.getNom());
									row.createCell(++i).setCellValue(emp.getPrenom());
									Cell cell = row.createCell(++i);
									cell.setCellStyle(dateStyle);
									cell.setCellValue(entretien.getDate());
									row.createCell(++i).setCellValue(entretien.getRencontreRhCommentaire());
								});
					});

					int i = -1;
					IntStream.range(0, 7).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=demandes-rencontre-rh.xls");
		return response.build();

	}

	private void generateSheet(Integer etablissementId, Mutualite mut, Integer annee, Workbook wb) {

		Etablissement etablissement = null == etablissementId ? null
				: mut.getEtablissements().getEtablissements().stream().filter(et -> et.getId() == etablissementId).findAny().orElse(null);

		String sheetName = null == etablissement ? "Tous" : "" + etablissementId + " " + etablissement.getNom();
		Sheet sheet = wb.cloneSheet(wb.getSheetIndex("template"));
		wb.setSheetName(wb.getSheetIndex(sheet), sheetName);
		int[] row = { 0 };

		List<Formation> formations = mut.getOrganismes().getOrganismeFormations().stream().flatMap(org -> org.getFormations().stream())
				.filter(f -> ( f.getSessionformation().stream()
						.anyMatch(sf -> isSameYear(sf, annee) && (etablissementId == null ||sf.getEmployes().stream().anyMatch(e -> e.getEtablissement().getId() == etablissementId)))))
				.sorted((f1, f2) -> f1.getLibelle().compareTo(f2.getLibelle())).collect(Collectors.toList());
			int[] i = { 0 };
			Row firstline = getOrCreateRow(sheet, ++row[0]);
			// titre
			getOrCreateCell(firstline, ++i[0]).setCellValue("Nom");
			getOrCreateCell(firstline, ++i[0]).setCellValue("Prénom");
			getOrCreateCell(firstline, ++i[0]).setCellValue("Emploi");
			getOrCreateCell(firstline, ++i[0]).setCellValue("Etablissement");

			Cell a2 = firstline.getCell(1);
			CellStyle normalStyle = a2.getCellStyle();
			Cell f2 = firstline.getCell(5);
			CellStyle titleStyle = f2.getCellStyle();
			Cell g2 = firstline.getCell(6);
			CellStyle dpcStyle = g2.getCellStyle();
			Cell h2 = firstline.getCell(7);
			CellStyle totalStyle = h2.getCellStyle();

			formations.forEach(form -> {
				Cell titleCell = getOrCreateCell(firstline, ++i[0]);
				titleCell.setCellStyle(form.isDpc() ? dpcStyle : titleStyle);
				titleCell.setCellValue(form.getLibelle());
			});
			{
				Cell titleCell = getOrCreateCell(firstline, ++i[0]);
				titleCell.setCellStyle(totalStyle);
				titleCell.setCellValue("Total");
			}
			for(int n=0;n<2;++n) {
				Cell titleCell = getOrCreateCell(firstline, ++i[0]);
				titleCell.setCellStyle(normalStyle);
				titleCell.setCellValue("");
			}
			firstline.setHeightInPoints(150);
		// fin titres

		mut.getEffectif().getEmployes().stream()
				.filter(emp -> !hasLeftTheCompany(emp) && emp.getNom() != null && (null == etablissementId || emp.getEtablissement().getId() == etablissementId))
				.sorted((e1, e2) -> (e1.getNom() + " " + e1.getPrenom()).compareTo((e2.getNom() + " " + e2.getPrenom()))).forEachOrdered(emp -> {
					Row line = sheet.createRow(++row[0]);
					i[0] = 0;
					getOrCreateCell(line, ++i[0]).setCellValue(emp.getNom());
					getOrCreateCell(line, ++i[0]).setCellValue(emp.getPrenom());
					getOrCreateCell(line, ++i[0]).setCellValue(emp.getAffectationEmploiCourante().getEmploi().getIntitule());
					getOrCreateCell(line, ++i[0]).setCellValue(emp.getEtablissement().getNom());

					float[] pTotal = { 0f };
					formations.forEach(form -> {
						Optional<SessionFormation> opt = emp.getSessionsFormation().stream().filter(sf1 -> sf1.eContainer().equals(form) && isSameYear(sf1, annee)).findAny();
						if (opt.isPresent()) {
							Float duree = opt.get().getDuree();
							getOrCreateCell(line, ++i[0]).setCellValue(duree);
							pTotal[0] += duree;
						} else {
							getOrCreateCell(line, ++i[0])/* .setCellValue("") */;
						}
					});
					Cell totalCell = getOrCreateCell(line, ++i[0]);
					totalCell.setCellStyle(totalStyle);
					totalCell.setCellValue(pTotal[0]);

				});
		;

		// fin data
	}

	public Row getOrCreateRow(Sheet sheet, int nrow) {
		Row row = sheet.getRow(nrow);
		if (null == row) {
			return sheet.createRow(nrow);
		}
		return row;
	}

	public Cell getOrCreateCell(Row line, int i) {
		Cell cell = line.getCell(i);
		if (cell == null) {
			return line.createCell(i);
		}
		return cell;
	}

	private boolean hasLeftTheCompany(Employe emp) {
		Date dateSortieEntreprise = emp.getDateSortieEntreprise();
		return dateSortieEntreprise != null && dateSortieEntreprise.before(new Date());
	}

	private static final Calendar cal = Calendar.getInstance();

	private boolean isSameYear(SessionFormation sf, Integer annee) {
		if (null == annee) {
			return true;
		}
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

	@GET
	@Path("/dates-entretiens-pros.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsDatesEntretiensPros() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsDatesEntretiensPros(mut);
	}

	@GET
	@Path("/dates-entretiens-annuels.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsDatesEntretiensAnnuels() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsDatesEntretiensAnnuels(mut);
	}

	public Response xlsDatesEntretiensPros(Mutualite mut) {
		return xlsDatesEntretiens(mut, EntretienProfessionnel.class::isInstance);
	}

	public Response xlsDatesEntretiensAnnuels(Mutualite mut) {
		return xlsDatesEntretiens(mut, EntretienAnnuel.class::isInstance);
	}

	public Response xlsDatesEntretiens(Mutualite mut, Predicate<? super Entretien> filter) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Dates d'entretiens");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					int nbCols = -1;
					Row firstRow = sheet.createRow(0);
					{
						// TITRES

						Cell cell;
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Dates d'entretien");
					}

					int[] pNbCols = { nbCols };

					mut.getEffectif().getEmployes().forEach(emp -> {
						HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
						int[] pI = { -1 };
						Etablissement etablissement = emp.getEtablissement();
						if (null == etablissement) {
							System.err.println("BOOM " + emp.getMatricule() + " " + emp.getNom());
						}
						row.createCell(++pI[0]).setCellValue(etablissement == null ? "" : etablissement.getNom());
						row.createCell(++pI[0]).setCellValue(emp.getNom());
						row.createCell(++pI[0]).setCellValue(emp.getPrenom());
						emp.getEntretiens().stream()

								.filter(ent -> ent.getDate() != null)

								.filter(filter)

								.sorted((ep1, ep2) -> {
									return ep2.getDate().compareTo(ep1.getDate());
								})

								.forEachOrdered(entretien -> {
									// le salarié a demandé à rencontrer les RH lors de son dernier entretien.
									Cell cell = row.createCell(++pI[0]);
									cell.setCellStyle(dateStyle);
									cell.setCellValue(entretien.getDate());
									pNbCols[0] = Math.max(pNbCols[0], pI[0]);
								});
					});

					int i = -1;
					IntStream.range(0, pNbCols[0] + 1).forEach(sheet::autoSizeColumn);

					// Titres manquants
					IntStream.range(4, pNbCols[0] + 1).forEach(idx -> {
						Cell cell = firstRow.createCell(idx);
						cell.setCellStyle(titleStyle);
						cell.setCellValue(" ");
					});

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=dates-entretiens.xls");
		return response.build();

	}

	@GET
	@Path("/sessions-formation.xls")
	@Produces("application/vnd.ms-excel")
	public Response xlsSessionsFormation() {
		Mutualite mut = CdoServlet.getMutualite();
		return xlsSessionsFormation(mut);
	}

	public Response xlsSessionsFormation(Mutualite mut) {

		ResponseBuilder response = Response.ok(new StreamingOutput() {

			@Override
			public void write(OutputStream out) throws IOException, WebApplicationException {
				try (HSSFWorkbook wb = new HSSFWorkbook();) {
					HSSFSheet sheet = wb.createSheet("Formations");

					CellStyle dateStyle = wb.createCellStyle();
					CreationHelper createHelper = wb.getCreationHelper();
					dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d mmm yyyy"));

					// CellStyle boolStyle = wb.createCellStyle();
					// boolStyle.setDataFormat(createHelper.createDataFormat().getFormat("BOOLEAN"));

					Font bold = wb.createFont();
					bold.setBold(true);

					// HSSFFont boldWhite = wb.createFont();
					// boldWhite.setBold(true);
					// boldWhite.setColor(IndexedColors.WHITE.index);

					CellStyle titleStyle = wb.createCellStyle();
					titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
					// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
					titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
					titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
					titleStyle.setAlignment(HorizontalAlignment.LEFT);
					titleStyle.setFont(bold);

					int nbCols = -1;
					Row firstRow = sheet.createRow(0);
					{
						// TITRES

						Cell cell;
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Etablissement");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Nom");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Prénom");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Formation");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Date début");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Date fin");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("Durée");
						cell = firstRow.createCell(++nbCols);
						cell.setCellStyle(titleStyle);
						cell.setCellValue("DPC?");
					}

					mut.getEffectif().getEmployes().forEach(emp -> {

						emp.getSessionsFormation().forEach(session -> {
							HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
							Etablissement etablissement = emp.getEtablissement();
							if (null == etablissement) {
								System.err.println("BOOM " + emp.getMatricule() + " " + emp.getNom());
							}
							int i = -1;
							row.createCell(++i).setCellValue(etablissement == null ? "" : etablissement.getNom());
							row.createCell(++i).setCellValue(emp.getNom());
							row.createCell(++i).setCellValue(emp.getPrenom());
							Formation formation = formation(session);
							row.createCell(++i).setCellValue(formation.getLibelle());
							{
								Date dateDebut = session.getDateDebut();
								HSSFCell cell = row.createCell(++i);
								cell.setCellStyle(dateStyle);
								if (null != dateDebut) {
									cell.setCellValue(dateDebut);
								} else {
									System.err.println("Session sans date de début! " + emp.getLabel() + " formation:" + formation.getLibelle() + " duree:" + session.getDuree());
								}
							}
							{
								Date dateFin = session.getDateFin();
								HSSFCell cell = row.createCell(++i);
								cell.setCellStyle(dateStyle);
								if (null != dateFin) {
									cell.setCellValue(dateFin);
								} else {
									System.err.println(
											"Session sans date de fin! Formation:" + formation.getLibelle() + " Salarié: " + emp.getLabel() + " Duree:" + session.getDuree());
								}
							}
							row.createCell(++i).setCellValue(session.getDuree());
							HSSFCell dpcCell = row.createCell(++i);
							dpcCell.setCellValue(formation.isDpc() ? "Oui" : "Non");

						});

					});

					int i = -1;
					IntStream.range(0, 8 + 1).forEach(sheet::autoSizeColumn);

					wb.write(out);
					out.flush();
				}
			}
		});

		response.header("Content-Disposition", "attachment; filename=sessions-formation-" + ymdDf.format(new Date()) + ".xls");
		return response.build();

	}

	private DateFormat ymdDf = new SimpleDateFormat("yyyy-MM-dd");

}
