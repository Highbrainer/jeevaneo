package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Optional;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChoixIndividuel;
import mutualite.rh.chequedej.Commande;

public class ImportFormCommandeAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande root;

	/**
	 * Constructor for Action1.
	 */
	public ImportFormCommandeAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	protected Logger log = Logger.getLogger(getClass());

	private Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

	private File[] promptFiles() {
		File[] defs = defaultFiles();

		// def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\congés v3.csv");

		JFileChooser chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(true);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", ".xslx");
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		chooser.setFileFilter(filter);
		if (null != defs) {
			chooser.setSelectedFiles(defs);
		}
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int ret = chooser.showOpenDialog(null);

		if (ret == JFileChooser.APPROVE_OPTION) {
			File[] in = chooser.getSelectedFiles();

			String serialized = Arrays.stream(in).map(File::getAbsolutePath).collect(Collectors.joining("|"));
			prefs.put("file-dir", serialized);
			return in;
		}

		return null;
	}

	private File[] defaultFiles() {
		File[] def = null;
		String sDef = prefs.get("file-dir", null);
		if (null != sDef) {
			def = Arrays.stream(sDef.split("\\|")).map(File::new).toArray(File[]::new);
		}
		File t = new File("T:/");
		if (null == def && t.exists()) {
			def = new File[] { t };
		}
		return def;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		run(shell);
	}

	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMM");
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy à HH'h'mm");

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {

		Job job = new Job("Import de formulaires de saisie") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ChangeCommand command = new ChangeCommand(root) {

					@Override
					public String getLabel() {
						return "Import de formulaires de saisie";
					}

					@Override
					protected void doExecute() {
						File[] files = promptFiles();

						try {
							importForms(files, monitor);
						} catch (Throwable e) {

							StringBuilder message = new StringBuilder(e.getMessage());
							if (e instanceof RuntimeException) {
								RuntimeException re = (RuntimeException) e;
								message.append(" " + re.getMessage());
							}
							shell.getDisplay().asyncExec(() -> {
								MessageDialog.openError(shell, "Erreurs à l'import", "ERREUR : " + message.toString());
								log.error("", e);
							});
						}
					}

				};
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(root);
				if (null != domain) {
					domain.getCommandStack().execute(command);
				}
				return Status.OK_STATUS;
			}
		};

		job.schedule();
	}

	protected void importForms(File[] files, IProgressMonitor monitor) {
		SubMonitor mon = SubMonitor.convert(monitor, 100 * files.length);

		boolean validationError = false;
		for (File file : files) {
			mon.subTask(file.getName());
			try {
				validationError |= validateForm(file, mon.newChild(100));
			} catch (Throwable e) {
				throw new RuntimeException("ERREUR dans " + file.getAbsolutePath(), e);
			}
		}
		if (validationError) {
			return;
		}

		boolean thereAreErrors = false;
		for (File file : files) {
			mon.subTask(file.getName());
			try {
				thereAreErrors |= importForm(file, mon.newChild(100));
			} catch (Throwable e) {
				throw new RuntimeException("ERREUR dans " + file.getAbsolutePath(), e);
			}
		}
		if (thereAreErrors) {
			File dir = new File(files[0].getParentFile(), "import-erreurs");
			shell.getDisplay().asyncExec(() -> {
				MessageDialog.openError(shell, "Erreurs à l'import", "Il y a eu des erreurs : pour les détails, voir les fichiers dans " + dir.getAbsolutePath());
			});
			try {
				Desktop.getDesktop().open(dir);
			} catch (IOException e) {
				log.error("Error while opening " + dir.getAbsolutePath(), e);
			}
		} else {
			shell.getDisplay().asyncExec(() -> {
				Object s = files.length > 1 ? "s" : "";
				MessageDialog.openInformation(shell, "Export OK", String.format("Fichier%s importé%s avec succès!", s, s));
			});
		}
		mon.done();
	}

	protected boolean importForm(File file, IProgressMonitor monitor) throws InvalidFormatException, IOException {
		log.info("Import de " + file.getAbsolutePath());

		try (Workbook wb = new XSSFWorkbook(file);) {
			Sheet sheet = wb.getSheet("Saisie");

			Row line1 = sheet.getRow(1);
			// int etabId = (int) line1.getCell(0).getNumericCellValue();
			// String etabName = line1.getCell(1).getStringCellValue();
			String moisTextuel = line1.getCell(2).getStringCellValue();
			// String typeEtablissement = line1.getCell(3).getStringCellValue();

			{
				// check form is targetted at the right mois

				if (!root.getMois().equals(moisTextuel)) {
					Runnable messager = () -> {
						MessageDialog.openError(shell, "Mauvaise commande", "ERREUR: Le fichier suivant ne correspond pas au mois de la commande choisie : '" + moisTextuel
								+ "' vs '" + root.getMois() + "'\n" + file.getAbsolutePath());
					};
					shell.getDisplay().asyncExec(messager);
					return false;
				}
			}

			boolean thereAreErrors = false;

			for (int n = 4; n < sheet.getLastRowNum() + 1; ++n) {
				Row line = sheet.getRow(n);
				Cell cell7 = line.getCell(7, MissingCellPolicy.RETURN_BLANK_AS_NULL);
				boolean alreadyImported = false;
				try {
					alreadyImported = cell7 != null && cell7.getCellTypeEnum().equals(CellType.BOOLEAN) ? cell7.getBooleanCellValue() : false;
				} catch (IllegalStateException e) {
					log.debug("Pas un boolean dans la colonne d'import", e);
				}
				if (alreadyImported) {
					log.debug("Line " + n + " has already been imported : ignore!");
					continue;
				}

				String comment = "";
				boolean imported = false;
				try {
					if (line.getCell(0) == null || line.getCell(0).getCellType() != Cell.CELL_TYPE_NUMERIC) {
						comment += "Matricule manquant ou invalide!";
						continue;
					}
					int matricule = (int) line.getCell(0).getNumericCellValue();
					String nom = line.getCell(1).getStringCellValue();
					String prenom = line.getCell(2).getStringCellValue();

					Integer nbJoursEntiersMoisPrecedent = null;
					Cell cell4 = line.getCell(4);
					try {
						// if(cell4.getCellType()==Cell.CELL_TYPE_NUMERIC) {
						if (null != cell4) {
							boolean chaineVide = cell4.getCellTypeEnum().equals(CellType.STRING) && cell4.getStringCellValue().trim().isEmpty();
							if (!chaineVide) {
								nbJoursEntiersMoisPrecedent = (int) cell4.getNumericCellValue();
							}
						}
						// } else {
						// String sContent = cell4.getStringCellValue();
						// if (null != sContent && !sContent.trim().isEmpty()) {
					} catch (IllegalStateException e) {
						comment += "Mois précédent : '" + cell4.getStringCellValue() + "' n'est pas un nombre entier! ";
						continue;
					}
					int nbJoursEntiersMoisSuivant;
					Cell cell5 = line.getCell(5);
					if (null == cell5) {
						comment += "La valeur estimée pour le mois prochain n'a pas été saisie! ";
						continue;
					}
					try {
						// String sContent = cell5.getStringCellValue();
						// if (null == sContent || sContent.trim().isEmpty()) {
						// throw new IllegalStateException();
						// }
						nbJoursEntiersMoisSuivant = (int) cell5.getNumericCellValue();
					} catch (IllegalStateException e) {
						comment += "Mois suivant : '" + cell5.getStringCellValue() + "' n'est pas un nombre entier! ";
						continue;
					}

					try {
						root.carnet().root().integrateDeje(root.getMois(), matricule, nbJoursEntiersMoisSuivant, nbJoursEntiersMoisPrecedent);
					} catch (IllegalStateException e) {
						log.debug("", e);
						comment = e.getMessage();
						imported = false;
						thereAreErrors = true;
						continue;
					}

					imported = true;
					comment = "Importé le " + dtf.format(LocalDateTime.now());
				} finally {
					getOrCreateCell(line, 6).setCellValue(imported);
					if (null != comment)
						getOrCreateCell(line, 8).setCellValue(comment);
				}

			}

			{

				// enregistrement des "logs" excel
				sheet.setColumnWidth(7, 1);
				sheet.autoSizeColumn(8);

				File dir = new File(file.getParentFile(), "import-ok");
				if (thereAreErrors) {
					dir = new File(file.getParentFile(), "import-erreurs");
				}
				dir.mkdirs();
				File backup = new File(dir, "backup/" + dtf.format(LocalDateTime.now()) + "/" + file.getName());
				backup.getParentFile().mkdirs();
				try (FileOutputStream fout = new FileOutputStream(new File(dir, file.getName()));) {
					wb.write(fout);
					wb.close();
					fout.flush();
					fout.close();
				}
				Files.move(file.toPath(), backup.toPath());
			}
			return thereAreErrors;
		}
	}

	protected boolean validateForm(File file, IProgressMonitor monitor) throws InvalidFormatException, IOException {

		try (Workbook wb = new XSSFWorkbook(file);) {
			Sheet sheet = wb.getSheet("Saisie");
			DataFormat format = wb.createDataFormat();
			CellStyle col7Style = wb.createCellStyle();
			col7Style.setDataFormat(format.getFormat("BOOLEAN"));

			CellStyle col8Style = wb.createCellStyle();
			Font fontCol8 = wb.createFont();
			fontCol8.setItalic(true);
			fontCol8.setColor(IndexedColors.RED1.index);
			col8Style.setFont(fontCol8);
			col8Style.setFillForegroundColor(IndexedColors.RED1.index);

			Row line1 = sheet.getRow(1);
			// int etabId = (int) line1.getCell(0).getNumericCellValue();
			// String etabName = line1.getCell(1).getStringCellValue();
			String moisTextuel = line1.getCell(2).getStringCellValue();
			// String typeEtablissement = line1.getCell(3).getStringCellValue();

			{
				// check form is targetted at the right mois

				if (!root.getMois().equals(moisTextuel)) {
					Runnable messager = () -> {
						MessageDialog.openError(shell, "Mauvaise commande", "ERREUR: Le fichier suivant ne correspond pas au mois de la commande choisie : '" + moisTextuel
								+ "' vs '" + root.getMois() + "'\n" + file.getAbsolutePath());
					};
					shell.getDisplay().asyncExec(messager);
					return false;
				}
			}

			boolean thereAreErrors = false;

			for (int n = 4; n < sheet.getLastRowNum() + 1; ++n) {
				Row line = sheet.getRow(n);
				Cell cell7 = getOrCreateCell(line, 7);
				boolean alreadyImported = false;
				try {
					alreadyImported = cell7.getCellTypeEnum().equals(CellType.BOOLEAN) ? cell7.getBooleanCellValue() : false;
				} catch (IllegalStateException e) {
					log.debug("Pas un boolean dans la colonne d'import", e);
				}

				String comment = "";
				boolean imported = false;
				try {
					if (line.getCell(0) == null || line.getCell(0).getCellType() != Cell.CELL_TYPE_NUMERIC) {
						comment += "Matricule manquant ou invalide! ";
						thereAreErrors = true;
						continue;
					}
					int matricule = (int) line.getCell(0).getNumericCellValue();
					String nom = line.getCell(1).getStringCellValue();
					String prenom = line.getCell(2).getStringCellValue();

					Cell cell4 = line.getCell(4);
					if (null != cell4 && cell4.getCellTypeEnum().equals(CellType.NUMERIC)) {
						try {
							Integer nbJoursEntiersMoisPrecedent = (int) cell4.getNumericCellValue();
						} catch (IllegalStateException e) {
							comment += "Le réel du mois précédent n'est pas un nombre entier! ";
						}
					}

					Cell cell5 = line.getCell(5);
					if (null != cell5) {
						if (cell5.getCellTypeEnum().equals(CellType.BLANK)) {
							comment += "L'estimation du mois prochain n'a pas été saisie! ";
						} else {
							try {
								int nbJoursEntiersMoisSuivant = (int) cell5.getNumericCellValue();
							} catch (IllegalStateException e) {
								comment += "L'estimation du mois prochain n'est pas un nombre entier! ";
							}
						}
					}

					// check de l'existence d'un item, et de son rattachement à une succursale
					if (!root.getItems().stream().anyMatch(item -> item.getMatricule() == matricule)) {
						ChoixIndividuel choix = root.carnet().root().getChoix().getChoix(matricule);
						if (choix != null && choix.getNbMaxCheques() != 0) {
							comment += "Il n'y a pas d'item dans la commande pour ce matricule! ";
						}
					}

					// check de l'existence d'un salarie avec ce matricule
					Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny();
					if (opt.isPresent()) {
						if (null == nom) {
							nom = "";
						}
						if (null == prenom) {
							prenom = "";
						}
						// Check des noms prénoms
						Employe employe = opt.get();
						if (!employe.getNom().trim().equalsIgnoreCase(nom.trim())) {
							comment += " Le nom renseigné ne correspond pas à celui dans GIC : '" + nom.trim() + "' vs  '" + employe.getNom().trim() + "'! ";
						}
						if (!employe.getPrenom().trim().equalsIgnoreCase(prenom.trim())) {
							comment += " Le prénom renseigné ne correspond pas à celui dans GIC : '" + prenom.trim() + "' vs  '" + employe.getPrenom().trim() + "'! ";
						}
					} else {
						comment += " Aucun salarié de matricule " + matricule + " dans GIC! ";
					}

				} finally {
					cell7.setCellStyle(col7Style);
					cell7.setCellValue(!comment.isEmpty());
					if (null != comment) {
						Cell cell8 = getOrCreateCell(line, 8);
						cell8.setCellValue(comment);
						cell8.setCellStyle(col8Style);
					}
				}

				thereAreErrors |= !comment.isEmpty();
			}

			{

				// save if any error
				if (thereAreErrors) {
					// enregistrement des "logs" excel

					Cell a1 = getOrCreateCell(getOrCreateRow(sheet, 0), 1);
					a1.setCellValue("Compte-Rendu d'erreurs");

					Cell g4 = getOrCreateCell(getOrCreateRow(sheet, 3), 7);
					g4.setCellValue("Erreur?");

					sheet.setColumnWidth(7, 1);
					sheet.autoSizeColumn(8);

					shell.getDisplay().syncExec(() -> {
						MessageDialog.openWarning(shell, "Validation du fichier à importer", "Il y a des erreurs dans le fichier : " + file.getName()
								+ ".\nL'import est annulé.\nUne copie du fichier avec un détail des erreurs va être ouvert.");
					});
					File temp = File.createTempFile("chequedej/" + dtf.format(LocalDateTime.now()) + "/logs-erreurs-" + file.getName().replaceFirst("\\.[^\\.]+$", "-"), ".xlsx");
					try (FileOutputStream fout = new FileOutputStream(temp);) {
						wb.write(fout);
						fout.flush();
					}
					Desktop.getDesktop().open(temp);
				}
			}
			return thereAreErrors;
		}
	}

	public Row getOrCreateRow(Sheet sheet, int i) {
		Row line = sheet.getRow(i);
		if (null == line) {
			line = sheet.createRow(i);
		}
		return line;
	}

	private Cell getOrCreateCell(Row line, int i) {
		Cell cell = line.getCell(i);
		if (null != cell) {
			return cell;
		}
		return line.createCell(i);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			root = null;
			if (element instanceof Commande) {
				root = (Commande) element;
			}

		}
	}

}
