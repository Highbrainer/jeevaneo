package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.prefs.Preferences;
import java.util.stream.IntStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.HistoriqueSoldeIndividuel;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;

public class ExportHistoriqueSoldeAction implements IObjectActionDelegate {

	private Shell shell;

	private ChequeDej o;

	/**
	 * Constructor for Action1.
	 */
	public ExportHistoriqueSoldeAction() {
		super();
	}

	protected Logger log = Logger.getLogger(getClass());

	private Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

	private File promptDir() {
		File def = defaultFile();

		// def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\congés v3.csv");

		JFileChooser chooser = new JFileChooser();
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", "xslx");
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		// chooser.setFileFilter(filter);
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
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	private Employe findEmploye(int mat) {
		Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == mat).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		File dir = promptDir();
		if (null == dir) {
			return;
		}

		InputDialog id = new InputDialog(shell, "Année", "Veuillez saisir l'année concernée", "" + Calendar.getInstance().get(Calendar.YEAR), new IInputValidator() {

			@Override
			public String isValid(String newText) {
				if (null == newText) {
					return null;
				}
				try {
					int annee = Integer.parseInt(newText.trim());
					if (annee < 2015) {
						return "Veuillez saisir une année postérieure à 2015!";
					}
				} catch (NumberFormatException e) {
					return "Veuillez saisir une année!";
				}

				return null;
			}
		});
		if (id.open() != Dialog.OK) {
			return;
		}
		int annee = Integer.parseInt(id.getValue());

		Job job = new Job("Export des Historiques de soldes") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				generateHistos(dir, annee, monitor);
				return Status.OK_STATUS;
			}
		};

		job.schedule();

	}

	protected void generateHistos(File file, int annee, IProgressMonitor monitor) {
		// On génère un formulaire par établissement
		// en veillant à NE PAS inclure les employés des établissements virtuels
		// puis on générera pour les EV
		EList<Etablissement> etablissements = CdoServlet.getMutualite().getEtablissements().getEtablissements();
		EList<EtablissementVirtuel> etablissementsVirtuels = o.getEtablissementsVirtuels().getEtablissementsVirtuels();

		// monitor.beginTask("Génération des formulaires de saisie...", 100*(etablissements.size()+etablissementsVirtuels.size()));
		// monitor.worked(100);
		// System.out.println("Alors?");
		SubMonitor mon = SubMonitor.convert(monitor, 100 * (etablissements.size() + etablissementsVirtuels.size()));

		etablissements.stream().forEach(etab -> {
			mon.subTask(etab.getNom());
			try {
				generateHistoFor(file, etab, mon.newChild(100), annee);
			} catch (InvalidFormatException | IOException | URISyntaxException e) {
				shell.getDisplay().asyncExec(() -> {
					MessageDialog.openError(shell, "Export des Historiques de soldes KO", "ERREUR: " + e.getMessage());
				});
				e.printStackTrace();
			}
		});
		etablissementsVirtuels.stream().forEach(ev -> {
			mon.subTask(ev.getLibelle());
			try {
				generateHistoFor(file, ev, mon.newChild(100), annee);
			} catch (IOException e) {
				shell.getDisplay().asyncExec(() -> {
					MessageDialog.openError(shell, "Export des Historiques de soldes KO", "ERREUR: " + e.getMessage());
				});
				e.printStackTrace();
			}
		});
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			shell.getDisplay().asyncExec(() -> {
				MessageDialog.openError(shell, "Export des Historiques de soldes KO", "ERREUR: " + e.getMessage());
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

	private void generateHistoFor(File dir, EtablissementVirtuel etab, SubMonitor newChild, int annee) throws IOException {

		File folder = new File(dir, etab.getLibelle().trim());
		folder.mkdirs();

		etab.getMatriculesEmployes().stream().map(this::findEmploye).forEach(emp -> {
			try {
				generateHisto(folder, emp, annee);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

	}

	private boolean isNotInEtablissementVirtuel(Employe e) {
		return !o.getCarnet().root().getEtablissementsVirtuels().getEtablissementsVirtuels().stream().map(EtablissementVirtuel::getMatriculesEmployes).flatMap(List::stream)
				.anyMatch(matricule -> matricule == e.getMatricule());
	}

	private void generateHistoFor(File dir, Etablissement etab, SubMonitor newChild, int annee) throws InvalidFormatException, IOException, URISyntaxException {

		File folder = new File(dir, etab.getNom().trim());
		folder.mkdirs();

		etab.getEmployes().stream().filter(this::isNotInEtablissementVirtuel).forEach(emp -> {
			try {
				generateHisto(folder, emp, annee);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}

	private void generateHisto(File folder, Employe emp, int annee) throws IOException {
		try (Workbook wb = new XSSFWorkbook()) {

			Sheet sheet = wb.createSheet("Historique");
			int line = -1;

			Font bold = wb.createFont();
			bold.setBold(true);

			Font big = wb.createFont();
			big.setBold(true);
			big.setFontHeightInPoints((short) 24);

			CellStyle headerStyle = wb.createCellStyle();
//			titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
//			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
//			titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
//			titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			headerStyle.setAlignment(HorizontalAlignment.LEFT);
			headerStyle.setFont(big);

			CellStyle titleStyle = wb.createCellStyle();
			titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
			titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			titleStyle.setAlignment(HorizontalAlignment.LEFT);
			titleStyle.setFont(bold);

			CreationHelper createHelper = wb.getCreationHelper();
			CellStyle dateStyle = wb.createCellStyle();
			dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd/mm/yyyy"));
			
			{
				Row header = sheet.createRow(++line);
				header.setHeightInPoints((short)40);
				Cell cell = header.createCell(0);
				cell.setCellStyle(headerStyle);
				cell.setCellValue(emp.getLabel());
				
				sheet.addMergedRegion(new CellRangeAddress(header.getRowNum(), header.getRowNum(), 0, 4));
			}
			
			
			{
				int col = -1;
				Row titles = sheet.createRow(++line);
				// {
				// Cell cell = titles.createCell(++col);
				// cell.setCellStyle(titleStyle);
				// cell.setCellValue("Matricule");
				// }
				// {
				// Cell cell = titles.createCell(++col);
				// cell.setCellStyle(titleStyle);
				// cell.setCellValue("Salarié");
				// }
				{
					Cell cell = titles.createCell(++col);
					cell.setCellStyle(titleStyle);
					cell.setCellValue("Date");
				}
				{
					Cell cell = titles.createCell(++col);
					cell.setCellStyle(titleStyle);
					cell.setCellValue("Solde avant");
				}
				{
					Cell cell = titles.createCell(++col);
					cell.setCellStyle(titleStyle);
					cell.setCellValue("Solde après");
				}
				{
					Cell cell = titles.createCell(++col);
					cell.setCellStyle(titleStyle);
					cell.setCellValue("Détails");
				}
			}

			SoldeIndividuel si = o.getSolde().getSoldeIndividual(emp.getMatricule(), annee);
			if (null != si) {
				for (HistoriqueSoldeIndividuel his : si.getHistorique()) {
					Row row = sheet.createRow(++line);
					int col = -1;
					// {
					// Cell cell = row.createCell(++col);
					// cell.setCellValue(emp.getMatricule());
					// }
					// {
					// Cell cell = row.createCell(++col);
					// cell.setCellValue(emp.getLibelle());
					// }
					{
						Cell cell = row.createCell(++col);
						cell.setCellStyle(dateStyle);
						cell.setCellValue(his.getDate());
					}
					{
						Cell cell = row.createCell(++col);
						cell.setCellValue(his.getSoldeAvant());
					}
					{
						Cell cell = row.createCell(++col);
						cell.setCellValue(his.getSoldeApres());
					}
					{
						Cell cell = row.createCell(++col);
						cell.setCellValue(his.getComment());
					}
				}
			}

			IntStream.range(0, 4).forEach(sheet::autoSizeColumn);

			try (FileOutputStream fileOutputStream = new FileOutputStream(new File(folder, "Historique solde - " + emp.getLabel() + ".xlsx"));) {
				wb.write(fileOutputStream);
				wb.close();
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object element = ssel.getFirstElement();
			o = null;
			if (element instanceof ChequeDej) {
				o = (ChequeDej) element;
			} else if (element instanceof Solde) {
				o = (ChequeDej) ((Solde) element).eContainer();
			}
		}
	}

}
