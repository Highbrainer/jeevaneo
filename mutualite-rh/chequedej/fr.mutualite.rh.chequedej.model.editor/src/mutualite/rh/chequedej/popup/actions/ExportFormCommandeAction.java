package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.prefs.Preferences;
import java.util.stream.IntStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
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

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChoixIndividuel;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.presentation.ChequedejEditorPlugin;

public class ExportFormCommandeAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande root;

	/**
	 * Constructor for Action1.
	 */
	public ExportFormCommandeAction() {
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

	private File promptDir() {
		File def = defaultFile();

		// def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\congés v3.csv");

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", "xslx");
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		chooser.setFileFilter(filter);
		if (null != def) {
			chooser.setSelectedFile(def);
		}
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int ret = chooser.showOpenDialog(null);

		if (ret == JFileChooser.APPROVE_OPTION) {
			File in = chooser.getSelectedFile();
			log.debug("Chose " + in.getAbsolutePath());

			prefs.put("file-dir", in.getAbsolutePath());
			return in;
		}

		return null;
	}

	private File defaultFile() {
		File def = null;
		String sDef = prefs.get("file-dir", null);
		if (null != sDef) {
			def = new File(sDef);
		}
		File t = new File("T:/");
		if (null == def && t.exists()) {
			def = t;
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

	/**
	 * stateless variant.
	 * 
	 * @param aShell
	 */
	public void run(Shell aShell) {

		Job job = new Job("Génération des formulaires des saisie") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ChangeCommand command = new ChangeCommand(root) {

					@Override
					public String getLabel() {
						return "Génération des formulaires de saisie";
					}

					@Override
					protected void doExecute() {
						File file = promptDir();

						generateForms(file, monitor);
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

	protected void generateForms(File file, IProgressMonitor monitor) {
		// On génère un formulaire par établissement
		// en veillant à NE PAS inclure les employés des établissements virtuels
		// puis on générera pour les EV
		EList<Etablissement> etablissements = CdoServlet.getMutualite().getEtablissements().getEtablissements();
		ChequeDej chequedej = root.carnet().root();
		EList<EtablissementVirtuel> etablissementsVirtuels = chequedej.getEtablissementsVirtuels().getEtablissementsVirtuels();

		// monitor.beginTask("Génération des formulaires de saisie...", 100*(etablissements.size()+etablissementsVirtuels.size()));
		// monitor.worked(100);
		// System.out.println("Alors?");
		SubMonitor mon = SubMonitor.convert(monitor, 100 * (etablissements.size() + etablissementsVirtuels.size()));

		etablissements.stream().forEach(etab -> {
			mon.subTask(etab.getNom());
			try {
				generateFormFor(file, etab, mon.newChild(100));
			} catch (InvalidFormatException | IOException | URISyntaxException e) {
				shell.getDisplay().asyncExec(() -> {
					MessageDialog.openError(shell, "Export Planning KO", "ERREUR: " + e.getMessage());
				});
				e.printStackTrace();
			}
		});
		etablissementsVirtuels.stream().forEach(ev -> {
			mon.subTask(ev.getLibelle());
			try {
				generateFormFor(file, ev, mon.newChild(100));
			} catch (IOException e) {
				shell.getDisplay().asyncExec(() -> {
					MessageDialog.openError(shell, "Export Planning KO", "ERREUR: " + e.getMessage());
				});
				e.printStackTrace();
			}
		});
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			shell.getDisplay().asyncExec(() -> {
				MessageDialog.openError(shell, "Export Planning KO", "ERREUR: " + e.getMessage());
			});
			e.printStackTrace();
		}
	}

	private Employe findEmploye(Integer matricule) {
		Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new RuntimeException("Aucun employé de matricule " + matricule);
	}

	private void generateFormFor(File dir, EtablissementVirtuel etab, SubMonitor newChild) throws IOException {

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
		getOrCreateCell(line0, 5).setCellValue(moisTextuel);

		Row line1 = getOrCreateRow(sheet, 1);
		getOrCreateCell(line1, 0).setCellValue(etab.getId());
		getOrCreateCell(line1, 1).setCellValue(etab.getLibelle());
		getOrCreateCell(line1, 2).setCellValue(root.getMois());
		getOrCreateCell(line1, 3).setCellValue("Etablissement virtuel"); // On ajoute ça pour distinguer des établissements classiques...

		Row line2 = getOrCreateRow(sheet, 3);
		Cell cell2_4 = getOrCreateCell(line2, 4);
		cell2_4.setCellValue(cell2_4.getStringCellValue() + " " + dfMoisTextuel.format(previousMonth));
		Cell cell2_5 = getOrCreateCell(line2, 5);
		cell2_5.setCellValue(cell2_5.getStringCellValue() + " " + moisTextuel);

		String nom = etab.getLibelle().trim();

		int[] pLine = { 4 };
		System.out.println(etab.getId());
		// on ne garde que les employés qui seront là au moins un jour du mois de la commande.
		etab.getMatriculesEmployes().stream().map(this::findEmploye).filter(ExportFormCommandeAction.estConcerneParCommande(root))
				.sorted((e1, e2) -> e1.getLabel().compareTo(e2.getLabel())).forEach(emp -> {
					int i = pLine[0]++;

					System.out.println(emp.getLabel());
					Row line = getOrCreateRow(sheet, i);
					getOrCreateCell(line, 0).setCellValue(emp.getMatricule());
					getOrCreateCell(line, 1).setCellValue(emp.getNom());
					getOrCreateCell(line, 2).setCellValue(emp.getPrenom());
					getOrCreateCell(line, 3).setCellValue(root.carnet().root().getContrats().isPartiel(emp.getMatricule()) ? "Temps partiel" : "Temps complet");
					getOrCreateCell(line, 4).setCellValue("");
					getOrCreateCell(line, 5).setCellValue("");

				});

		IntStream.range(0, 3).forEach(sheet::autoSizeColumn);

		// apply font 8px on col D
		Font font = wb.createFont();
		font.setFontName("Arial");
		font.setFontHeightInPoints((short) 8);
		CellStyle temps = wb.createCellStyle();
		temps.setFont(font);
		IntStream.range(Math.max(5, sheet.getFirstRowNum()), sheet.getLastRowNum() + 1).forEach(n -> {
			Row line = sheet.getRow(n);
			if (line == null) {
				return;
			}
			getOrCreateCell(line, 3).setCellStyle(temps);
		});

		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "Formulaire ChequeDej " + moisTextuel + " " + nom + ".xlsx"));) {
			wb.write(fileOutputStream);
			wb.close();
		}

	}

	private static final DateTimeFormatter dfMoisCommande = DateTimeFormatter.ofPattern("yyyyMMdd");
	private static final DateTimeFormatter dfMoisTextuel = DateTimeFormatter.ofPattern("MMMM yyyy");

	private boolean isNotInEtablissementVirtuel(Employe e) {
		return !root.carnet().root().getEtablissementsVirtuels().getEtablissementsVirtuels().stream().map(EtablissementVirtuel::getMatriculesEmployes).flatMap(List::stream)
				.anyMatch(matricule -> matricule == e.getMatricule());
	}

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
		getOrCreateCell(line0, 5).setCellValue(moisTextuel);

		Row line1 = getOrCreateRow(sheet, 1);
		getOrCreateCell(line1, 0).setCellValue(etab.getId());
		getOrCreateCell(line1, 1).setCellValue(etab.getNom());
		getOrCreateCell(line1, 2).setCellValue(root.getMois());
		getOrCreateCell(line1, 3).setCellValue("Etablissement");

		Row line2 = getOrCreateRow(sheet, 3);
		Cell cell2_4 = getOrCreateCell(line2, 4);
		cell2_4.setCellValue(cell2_4.getStringCellValue() + " " + dfMoisTextuel.format(previousMonth));
		Cell cell2_5 = getOrCreateCell(line2, 5);
		cell2_5.setCellValue(cell2_5.getStringCellValue() + " " + moisTextuel);

		String nom = etab.getNom().trim();

		int[] pLine = { 4 };
		System.out.println(etab.getId());
		// on ne garde que les employés qui seront là au moins un jour du mois de la commande.
		etab.getEmployes().stream().filter(estConcerneParCommande(root)).filter(this::isNotInEtablissementVirtuel).sorted((e1, e2) -> e1.getLabel().compareTo(e2.getLabel()))
				.forEach(emp -> {
					int i = pLine[0]++;

					System.out.println(emp.getLabel());
					Row line = getOrCreateRow(sheet, i);
					getOrCreateCell(line, 0).setCellValue(emp.getMatricule());
					getOrCreateCell(line, 1).setCellValue(emp.getNom());
					getOrCreateCell(line, 2).setCellValue(emp.getPrenom());
					getOrCreateCell(line, 3).setCellValue(root.carnet().root().getContrats().isPartiel(emp.getMatricule()) ? "Temps partiel" : "Temps complet");
					getOrCreateCell(line, 4).setCellValue("");
					getOrCreateCell(line, 5).setCellValue("");

				});

		IntStream.range(0, 3).forEach(sheet::autoSizeColumn);

		// apply font 8px on col D
		Font font = wb.createFont();
		font.setFontName("Arial");
		font.setFontHeightInPoints((short) 8);
		CellStyle temps = wb.createCellStyle();
		temps.setFont(font);
		IntStream.range(Math.max(5, sheet.getFirstRowNum()), sheet.getLastRowNum() + 1).forEach(n -> {
			Row line = sheet.getRow(n);
			if (line == null) {
				return;
			}
			getOrCreateCell(line, 3).setCellStyle(temps);
		});

		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "Formulaire ChequeDej " + moisTextuel + " " + nom + ".xlsx"));) {
			wb.write(fileOutputStream);
			wb.close();
		}

	}

	public static Predicate<? super Employe> estConcerneParCommande(Commande commande) {
		LocalDate month = LocalDate.parse(commande.getMois() + "01", dfMoisCommande);

		return e -> {
			boolean isInEntreprise = e.getDateSortieEntreprise() == null || e.getDateSortieEntreprise().after(toDate(month));
			if (!isInEntreprise) {
				return false;
			}
			ChoixIndividuel choix = commande.carnet().root().getChoix().getChoix(e.getMatricule());
			if (null == choix) {
				return true;
			}
			Integer nbMaxCheques = choix.getNbMaxCheques();
			if(null==nbMaxCheques) {
				return true;
			}
			return nbMaxCheques != 0;
		};

	}

	private static Date toDate(LocalDate month) {
		return Date.from(month.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
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
