package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
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
import org.osgi.framework.Bundle;

import fr.mutualite.rh.model.Etablissement;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.SoldeIndividuel;
import mutualite.rh.chequedej.presentation.ChequedejEditorPlugin;

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
		}
		mon.done();
	}

	protected boolean importForm(File file, IProgressMonitor monitor) throws InvalidFormatException, IOException {

		Workbook wb = new XSSFWorkbook(file);
		Sheet sheet = wb.getSheet("Saisie");

		Row line1 = sheet.getRow(1);
		int etabId = (int) line1.getCell(0).getNumericCellValue();
		String etabName = line1.getCell(1).getStringCellValue();
		String moisTextuel = line1.getCell(2).getStringCellValue();
		{
			// check form is targetted at the right mois

			if (!root.getMois().equals(moisTextuel)) {
				Runnable messager = () -> {
					MessageDialog.openError(shell, "Mauvaise commande", "ERREUR: Le fichier suivant ne correspond pas au mois de la commande choisie : '" + moisTextuel + "' vs '"
							+ root.getMois() + "'\n" + file.getAbsolutePath());
				};
				shell.getDisplay().asyncExec(messager);
				return false;
			}
		}

		boolean thereAreErrors = false;

		for (int n = 4; n < sheet.getLastRowNum(); ++n) {
			Row line = sheet.getRow(n);
			Cell cell5 = line.getCell(5, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			boolean alreadyImported = cell5 != null ? cell5.getBooleanCellValue() : false;
			if (alreadyImported) {
				log.debug("Line " + n + " has already been imported : ignore!");
				continue;
			}

			String comment = "";
			boolean imported = false;
			try {
				int matricule = (int) line.getCell(0).getNumericCellValue();
				String nom = line.getCell(1).getStringCellValue();
				String prenom = line.getCell(2).getStringCellValue();
				int nbJoursEntiersMoisPrecedent;
				try {
					nbJoursEntiersMoisPrecedent = (int) line.getCell(3).getNumericCellValue();
				} catch (IllegalStateException e) {
					comment += "Mois précédent : '" + line.getCell(3).getStringCellValue() + "' n'est pas un nombre entier! ";
					continue;
				}
				int nbJoursEntiersMoisSuivant;
				try {
					nbJoursEntiersMoisSuivant = (int) line.getCell(4).getNumericCellValue();
				} catch (IllegalStateException e) {
					comment += "Mois suivant : '" + line.getCell(4).getStringCellValue() + "' n'est pas un nombre entier! ";
					continue;
				}

				try {
					root.carnet().root().integrateDeje(root.getMois(), matricule, nbJoursEntiersMoisPrecedent, nbJoursEntiersMoisSuivant);
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
				getOrCreateCell(line, 5).setCellValue(imported);
				if (null != comment)
					getOrCreateCell(line, 6).setCellValue(comment);
			}

		}

		{

			// enregistrement des "logs" excel
			sheet.setColumnWidth(5, 0);
			sheet.autoSizeColumn(6);

			File dir = new File(file.getParentFile(), "import-ok");
			if (thereAreErrors) {
				dir = new File(file.getParentFile(), "import-erreurs");
			}
			dir.mkdirs();
			File backup = new File(dir, "backup/" + dtf.format(LocalDateTime.now()) + "/" + file.getName());
			backup.getParentFile().mkdirs();
			FileOutputStream fout = new FileOutputStream(new File(dir, file.getName()));
			wb.write(fout);
			fout.flush();
			fout.close();
			wb.close();
			Files.move(file.toPath(), backup.toPath());
		}
		return thereAreErrors;
	}



	// private int computeSolde(Item item) {
	// // Le solde est la différence entre ce qui avait été estimé pour le mois précédent il y a deux mois, et ce qui a été effectivement réalisé le mois précédent... PLUS le
	// // solde précédent!
	// int nbMoisPrecedentReel = item.getNbJoursEntiersMoisPrecedent();
	// Integer nbMoisPrecedentEstimation = null;
	// // on va donc chercher deux commandes en arrière :
	// Commande commande = (Commande) item.eContainer();
	// Commande commandePrecedente = commande.getCommandePrecedente();
	// if (null != commandePrecedente) {
	// Commande commandeMoinsDeux = commandePrecedente.getCommandePrecedente();
	// if (null != commandeMoinsDeux) {
	// Optional<Item> optItem = commandeMoinsDeux.getItems().stream().filter(i -> i.getMatricule() == item.getMatricule()).findAny();
	// if (!optItem.isPresent()) {
	// log.warn("Matricule non trouvé dans la commande N-2 : " + item.getMatricule());
	// } else {
	// Item itemMoins2 = optItem.get();
	// nbMoisPrecedentEstimation = itemMoins2.getNbJoursEntiersMoisSuivant();
	// }
	// } else {
	// log.warn("Pas de commande M-2 pour le matricule " + item.getMatricule());
	// }
	// } else {
	// log.warn("Pas de commande antérieure pour le matricule " + item.getMatricule());
	// }
	// int solde = 0;
	// if (null != nbMoisPrecedentEstimation) {
	// solde = nbMoisPrecedentEstimation - nbMoisPrecedentReel;
	// }
	// // TODO ajouter le solde précédent et le tenir à jour!
	// return solde;
	// }

	private void generateFormFor(EtablissementVirtuel ev, SubMonitor newChild) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

	private static final DateTimeFormatter dfMoisCommande = DateTimeFormatter.ofPattern("yyyyMMdd");
	private static final DateTimeFormatter dfMoisTextuel = DateTimeFormatter.ofPattern("MMMM yyyy");

	private void generateFormFor(File dir, Etablissement etab, SubMonitor newChild) throws InvalidFormatException, IOException, URISyntaxException {

		LocalDate month = LocalDate.parse(root.getMois() + "01", dfMoisCommande);
		LocalDate previousMonth = month.minus(2, ChronoUnit.MONTHS);
		// LocalDate nextMonth = month.plus(1, ChronoUnit.MONTHS);

		Bundle bundle = ChequedejEditorPlugin.getPlugin().getBundle();
		URL url = bundle.getEntry("/template/template-saisie.xlsx");
		// File template = new File(FileLocator.resolve(url).toURI());
		// FileLocator.openStream(bundle, Path.file, substituteArgs)
		Workbook wb = new XSSFWorkbook(url.openStream());
		Sheet sheet = wb.getSheet("Saisie");

		Row line0 = getOrCreateRow(sheet, 0);
		String moisTextuel = dfMoisTextuel.format(month);
		getOrCreateCell(line0, 4).setCellValue(moisTextuel);

		Row line1 = getOrCreateRow(sheet, 1);
		getOrCreateCell(line1, 0).setCellValue(etab.getId());
		getOrCreateCell(line1, 1).setCellValue(etab.getNom());

		Row line2 = getOrCreateRow(sheet, 3);
		Cell cell2_3 = getOrCreateCell(line2, 3);
		cell2_3.setCellValue(cell2_3.getStringCellValue() + dfMoisTextuel.format(previousMonth));
		Cell cell2_4 = getOrCreateCell(line2, 4);
		cell2_4.setCellValue(cell2_4.getStringCellValue() + moisTextuel);

		String nom = etab.getNom().trim();

		int[] pLine = { 4 };
		etab.getEmployes().stream().sorted((e1, e2) -> e1.getLabel().compareTo(e2.getLabel())).forEach(emp -> {
			int i = pLine[0]++;
			Row line = getOrCreateRow(sheet, i);
			getOrCreateCell(line, 0).setCellValue(emp.getMatricule());
			getOrCreateCell(line, 1).setCellValue(emp.getNom());
			getOrCreateCell(line, 2).setCellValue(emp.getPrenom());
			getOrCreateCell(line, 3).setCellValue("");
			getOrCreateCell(line, 4).setCellValue("");

		});
		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "Formulaire ChequeDej " + moisTextuel + " " + nom + ".xlsx"));) {
			wb.write(fileOutputStream);
			wb.close();
		}
		Desktop.getDesktop().open(dir);

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
