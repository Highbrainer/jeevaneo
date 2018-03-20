package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.prefs.Preferences;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
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
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.webapp.Activator;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;
import mutualite.rh.chequedej.Succursale;
import mutualite.rh.chequedej.presentation.ChequedejEditorPlugin;

public class ExportFormEmargementAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande commande;

	/**
	 * Constructor for Action1.
	 */
	public ExportFormEmargementAction() {
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

	private Date[] askDateInterval() {
		final Date[] dates = new Date[2];

		DateIntervalDialog dialog = new DateIntervalDialog(shell);
		if (dialog.open() == Window.OK) {
			dates[0] = dialog.getFrom();
			dates[1] = dialog.getTo();
			return dates;
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

		shell.getDisplay().asyncExec(() -> {
			File dir = promptDir();
			Date[] dates = askDateInterval();
			if (null == dates) {
				return;
			}
			Job job = new Job("Génération du formulaire d'émargement") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					ChangeCommand command = new ChangeCommand(commande) {

						@Override
						public String getLabel() {
							return "Export du formulaire d'émargement";
						}

						@Override
						protected void doExecute() {

							generateFormulaireEmargement(dir, dates[0], dates[1], monitor);
						}

					};
					EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(commande);
					if (null != domain) {
						domain.getCommandStack().execute(command);
					}
					return Status.OK_STATUS;
				}
			};

			job.schedule();
		});
	}

	protected void generateFormulaireEmargement(File dir, Date from, Date to, IProgressMonitor monitor) {

		EList<Item> items = commande.getItems();
		SubMonitor mon = SubMonitor.convert(monitor, 100 * items.size());

		try {
			Bundle bundle = ChequedejEditorPlugin.getPlugin().getBundle();
			URL url = bundle.getEntry("/template/template-form-emargement.xlsx");
			Workbook wb = new XSSFWorkbook(url.openStream());

			items.forEach(item -> {
				mon.subTask(item.getNom() + " " + item.getPrenom() + "(" + item.getMatricule() + ")");
				try {

					Integer idEtablissement = item.getSuccursale().getIdEtablissement();
					Etablissement etablissement = findEtablissement(idEtablissement);
					EtablissementVirtuel ev = findEtablissementVirtuel(item.getMatricule());
					
					String sheetName = "" + (ev==null?idEtablissement:ev.getId());
					String etabName = ev==null?etablissement.getNom().trim():ev.getLibelle().trim();
					
					Sheet sheet = getOrCreateSheet(wb, sheetName);
					getOrCreateCell(getOrCreateRow(sheet, 1), 0).setCellValue(etabName + " - " + "Commande de Chèques Déjeuner pour "
							+ new SimpleDateFormat("MMMM yyyy").format(new SimpleDateFormat("yyyyMM").parse(commande.getMois())));
					// apend new line
					Row row = getOrCreateRow(sheet, sheet.getLastRowNum() + 1);
					getOrCreateCell(row, 0).setCellValue(item.getNom() + " " + item.getPrenom());
					Integer nbCheques = item.getNbCheques();
					if (null != nbCheques) {
						getOrCreateCell(row, 1).setCellValue(nbCheques);
					} else {
						ChequedejEditorPlugin.getPlugin().getLog().log(new Status(IStatus.WARNING, "chequedej", "Pas de commande pour " + item.getMatricule() + " (" + item.getNom() + " " + item.getPrenom() + ") !"));
					}

					Solde solde = commande.carnet().root().getSolde();
					SoldeIndividuel si = solde.getSoldeIndividual(item.getMatricule());
					if (null == si) {
						log.warn("Pas d'historique de solde pour " + item.getMatricule() + " (" + item.getNom() + " " + item.getPrenom() + ")!");
						String val = "N/A";
						Cell cell = getOrCreateCell(row, 3);
						cell.setCellValue(val);
					} else {
						si.getHistorique().stream().filter(h -> {
							return h.getDate().after(from) && h.getDate().before(to);
						}).forEach(histo -> {
							Cell cell = getOrCreateCell(row, 3);
							String val = cell.getStringCellValue();
							if (val == null || val.isEmpty()) {
								val = "";
							} else {
								val = val + "\r\n";
							}
							cell.setCellValue(val + histo.getComment());

						});
					}
					row.setHeightInPoints(50);

				} catch (Throwable e) {
					shell.getDisplay().asyncExec(() -> {
						MessageDialog.openError(shell, "Export Commande KO", "ERREUR: " + e.getMessage());
					});
					e.printStackTrace();
				}
			});

			wb.removeSheetAt(0);
			for (int i = 0; i < wb.getNumberOfSheets(); i++) {
				Sheet sheet = wb.getSheetAt(i);

				sheet.autoSizeColumn(0);
				sheet.autoSizeColumn(1);
				//sheet.autoSizeColumn(3);
			}

			File file = new File(dir, "Formulaire d'émargement pour la commande " + commande.getMois() + ".xlsx");
			try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
				wb.write(fileOutputStream);
				wb.close();
			}
			monitor.done();
			Desktop.getDesktop().open(file);
		} catch (Throwable e) {
			shell.getDisplay().asyncExec(() -> {
				MessageDialog.openError(shell, "Export Commande KO", "ERREUR: " + e.getMessage());
			});
			e.printStackTrace();
		}
	}

	private EtablissementVirtuel findEtablissementVirtuel(int matricule) {
		return commande.carnet().root().getEtablissementsVirtuels().getEtablissementsVirtuels().stream().filter(ev -> ev.getMatriculesEmployes().contains(matricule)).findAny().orElse(null);
	}

	public Sheet getOrCreateSheet(Workbook wb, String sheetName) {

		String name = sheetName.trim();

		Sheet sheet = wb.getSheet(name);
		if (null == sheet) {
			sheet = /* wb.createSheet(sheetName) */wb.cloneSheet(0);
			int index = wb.getSheetIndex(sheet);
			wb.setSheetName(index, name);
		}
		return sheet;
	}

	private Employe findEmploye(int matricule) {
		Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new IllegalArgumentException("Aucun salarié de matricule " + matricule + ".");
	}

	private Etablissement findEtablissement(int id) {
		Optional<Etablissement> opt = CdoServlet.getMutualite().getEtablissements().getEtablissements().stream().filter(e -> e.getId() == id).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new IllegalArgumentException("Aucun établissement d'id " + id + ".");
	}

	// private void generateFormFor(EtablissementVirtuel ev, SubMonitor newChild) {
	// try {
	// Thread.sleep(1000);
	// } catch (InterruptedException e) {
	// throw new RuntimeException(e);
	// }
	//
	// }
	//
	// private static final DateTimeFormatter dfMoisCommande = DateTimeFormatter.ofPattern("yyyyMMdd");
	// private static final DateTimeFormatter dfMoisTextuel = DateTimeFormatter.ofPattern("MMMM yyyy");
	//
	// private void generateFormFor(File dir, Etablissement etab, SubMonitor newChild) throws InvalidFormatException, IOException, URISyntaxException {
	//
	// LocalDate month = LocalDate.parse(commande.getMois() + "01", dfMoisCommande);
	// LocalDate previousMonth = month.minus(2, ChronoUnit.MONTHS);
	// // LocalDate nextMonth = month.plus(1, ChronoUnit.MONTHS);
	//
	// Bundle bundle = ChequedejEditorPlugin.getPlugin().getBundle();
	// URL url = bundle.getEntry("/template/template-saisie.xlsx");
	// // File template = new File(FileLocator.resolve(url).toURI());
	// // FileLocator.openStream(bundle, Path.file, substituteArgs)
	// Workbook wb = new XSSFWorkbook(url.openStream());
	// Sheet sheet = wb.getSheet("Saisie");
	//
	// Row line0 = getOrCreateRow(sheet, 0);
	// String moisTextuel = dfMoisTextuel.format(month);
	// getOrCreateCell(line0, 4).setCellValue(moisTextuel);
	//
	// Row line1 = getOrCreateRow(sheet, 1);
	// getOrCreateCell(line1, 0).setCellValue(etab.getId());
	// getOrCreateCell(line1, 1).setCellValue(etab.getNom());
	// getOrCreateCell(line1, 2).setCellValue(commande.getMois());
	//
	// Row line2 = getOrCreateRow(sheet, 3);
	// Cell cell2_3 = getOrCreateCell(line2, 3);
	// cell2_3.setCellValue(cell2_3.getStringCellValue() + dfMoisTextuel.format(previousMonth));
	// Cell cell2_4 = getOrCreateCell(line2, 4);
	// cell2_4.setCellValue(cell2_4.getStringCellValue() + moisTextuel);
	//
	// String nom = etab.getNom().trim();
	//
	// int[] pLine = { 4 };
	// System.out.println(etab.getId());
	// // on ne garde que les employés qui seront là au moins un jour du mois de la commande.
	// etab.getEmployes().stream().filter(e -> e.getDateSortieEntreprise() == null || e.getDateSortieEntreprise().after(toDate(month)))
	// .sorted((e1, e2) -> e1.getLabel().compareTo(e2.getLabel())).forEach(emp -> {
	// int i = pLine[0]++;
	//
	// System.out.println(emp.getLabel());
	// Row line = getOrCreateRow(sheet, i);
	// getOrCreateCell(line, 0).setCellValue(emp.getMatricule());
	// getOrCreateCell(line, 1).setCellValue(emp.getNom());
	// getOrCreateCell(line, 2).setCellValue(emp.getPrenom());
	// getOrCreateCell(line, 3).setCellValue("");
	// getOrCreateCell(line, 4).setCellValue("");
	//
	// });
	// try (FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "Formulaire ChequeDej " + moisTextuel + " " + nom + ".xlsx"));) {
	// wb.write(fileOutputStream);
	// wb.close();
	// }
	// Desktop.getDesktop().open(dir);
	//
	// }
	//
	// private Date toDate(LocalDate month) {
	// return Date.from(month.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	// }

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
			commande = null;
			if (element instanceof Commande) {
				commande = (Commande) element;
			}

		}
	}

}

class DateIntervalDialog extends Dialog {

	private DateTime calendarFrom;
	private DateTime calendarTo;
	private Date from;

	public Date getFrom() {
		return from;
	}

	public Date getTo() {
		return to;
	}

	private Date to;

	protected DateIntervalDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite dialog) {

		getParentShell().setText("Sélection de l'intervale de dates");

		calendarFrom = new DateTime(dialog, SWT.CALENDAR | SWT.BORDER);
		calendarTo = new DateTime(dialog, SWT.CALENDAR | SWT.BORDER);

		LocalDate now = LocalDate.now();
		calendarTo.setDate(now.getYear(), now.getMonthValue(), now.getDayOfMonth());
		LocalDate lastMonth = now.minusMonths(1);
		calendarFrom.setDate(lastMonth.getYear(), lastMonth.getMonthValue(), lastMonth.getDayOfMonth());

		System.out.println(now);
		System.out.println(lastMonth);

		new Label(dialog, SWT.NONE);
		new Label(dialog, SWT.NONE);

		return dialog;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		from = from();
		to = to();
		super.buttonPressed(buttonId);
	}

	protected Date from() {
		Calendar from = Calendar.getInstance();
		from.set(Calendar.YEAR, calendarFrom.getYear());
		from.set(Calendar.MONTH, calendarFrom.getMonth());
		from.set(Calendar.DAY_OF_MONTH, calendarFrom.getDay());
		return from.getTime();
	}

	protected Date to() {
		Calendar to = Calendar.getInstance();
		to.set(Calendar.YEAR, calendarTo.getYear());
		to.set(Calendar.MONTH, calendarTo.getMonth());
		to.set(Calendar.DAY_OF_MONTH, calendarTo.getDay());
		return to.getTime();
	}
}
