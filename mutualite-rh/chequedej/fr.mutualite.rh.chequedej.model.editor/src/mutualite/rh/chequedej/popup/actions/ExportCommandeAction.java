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
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.presentation.ChequedejEditorPlugin;

public class ExportCommandeAction implements IObjectActionDelegate {

	private Shell shell;

	private Commande commande;

	/**
	 * Constructor for Action1.
	 */
	public ExportCommandeAction() {
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

		Job job = new Job("Export des fichiers de commande à fournir à Cheques Dej") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ChangeCommand command = new ChangeCommand(commande) {

					@Override
					public String getLabel() {
						return "Export de la commande";
					}

					@Override
					protected void doExecute() {
						File file = promptDir();

						exportCommandes(file, monitor);
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
	}

	protected void exportCommandes(File file, IProgressMonitor monitor) {
		
		EList<CodeClient> codesClient = commande.carnet().root().getParametrage().getCodesClient();
		SubMonitor mon = SubMonitor.convert(monitor, 100 * codesClient.size());

		codesClient.forEach(codeClient -> {
			mon.subTask(codeClient.getLibelle() + "(" + codeClient.getNumero() + ")");
			try {
				exportCommande(codeClient, file, mon.newChild(100));
			} catch (Throwable e) {
				shell.getDisplay().asyncExec(() -> {
					MessageDialog.openError(shell, "Export Commande KO", "ERREUR: " + e.getMessage());
				});
				e.printStackTrace();
			}
		});
		monitor.done();
		try {
			Desktop.getDesktop().open(file);
		} catch (Throwable e) {
			shell.getDisplay().asyncExec(() -> {
				MessageDialog.openError(shell, "Export Commande KO", "ERREUR: " + e.getMessage());
			});
			e.printStackTrace();
		}
	}

	private String getEtablissementId(Employe e) {
		return commande.carnet().root().getEtablissementsVirtuels().getEtablissementsVirtuels().stream().filter(ev -> ev.getMatriculesEmployes().contains(e.getMatricule()))
				.findAny().map(EtablissementVirtuel::getId).orElse("" + e.getEtablissement().getId());
	}

	private static final DateFormat dfDate = new SimpleDateFormat("dd/MM/yyyy");
	
	private void exportCommande(CodeClient codeClient, File dir, SubMonitor newChild) throws IOException {
		Bundle bundle = ChequedejEditorPlugin.getPlugin().getBundle();
		URL url = bundle.getEntry("/template/template-commande.xls");
		// File template = new File(FileLocator.resolve(url).toURI());
		// FileLocator.openStream(bundle, Path.file, substituteArgs)
		Workbook wb = new HSSFWorkbook(url.openStream());
		Sheet sheet = wb.getSheet("Commande");

		// numero code client en e8
		Cell e8 = getOrCreateCell(getOrCreateRow(sheet, 7), 4);
		e8.setCellValue(codeClient.getNumero());

		// date en B9
		Cell b9 = getOrCreateCell(getOrCreateRow(sheet, 8), 1);
		b9.setCellValue(commande.getDate());
		
		// on liste tous les salariés des succursales de ce codeClient,
		// et on les groupe par etablissement/établissement virtuel de rattachement
		// puis ont les trie par nom

		List<Pair<Item, Employe>> pairs = commande.getItems().stream().filter(item -> item.getSuccursale().codeClient().equals(codeClient))
				.map(item -> new Pair<>(item, findEmploye(item.getMatricule())))

				.sorted((p1, p2) -> {
					// on trie d'abord par etablissement (virtuel ou non) puis par nom au sein d'un etab.
					String mashed1 = getEtablissementId(p1.get2()) + "_" + p1.get2().getLabel();
					String mashed2 = getEtablissementId(p2.get2()) + "_" + p2.get2().getLabel();
					return mashed1.compareTo(mashed2);
				}).collect(Collectors.toList());

		for (int i = 0; i < pairs.size(); ++i) {
			// On commence à la ligne 15
			Row line = getOrCreateRow(sheet, 14 + i);
			Item item = pairs.get(i).get1();
			Employe employe = pairs.get(i).get2();
			getOrCreateCell(line, 0).setCellValue(item.getSuccursale().getNumero());
			getOrCreateCell(line, 1).setCellValue(employe.getMatricule());
			getOrCreateCell(line, 2).setCellValue(employe.getNom() + " " + employe.getPrenom());
			Integer nbCheques = item.getNbCheques();
			if(null==nbCheques) {
				throw new IllegalStateException("Nombre de chèques à commander non renseigné pour " + employe.getLabel());
			}
			getOrCreateCell(line, 3).setCellValue(nbCheques);
			getOrCreateCell(line, 4).setCellValue(commande.getValeurNominale());
			getOrCreateCell(line, 5).setCellValue(commande.getParticipationPatronale());

		}
		
		CellStyle styleMatricule = wb.createCellStyle();
		styleMatricule.setAlignment(HorizontalAlignment.CENTER);
		IntStream.range(Math.max(14, sheet.getFirstRowNum()), sheet.getLastRowNum() + 1).forEach(n -> {
			Row line = sheet.getRow(n);
			if (line == null) {
				return;
			}
			getOrCreateCell(line, 1).getCellStyle().setAlignment(HorizontalAlignment.CENTER);
		});

		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(dir, "Commande ChequeDej " + DateFormat.getDateInstance().format(commande.getDate()) + " - " + codeClient.getLibelle() + " " + codeClient.getNumero() + ".xlsx"));) {
			wb.write(fileOutputStream);
			wb.close();
		}
	}

	private static final class Pair<T, U> {
		private T t;
		private U u;

		public Pair(T t, U u) {
			super();
			this.t = t;
			this.u = u;
		}

		public T get1() {
			return t;
		}

		public U get2() {
			return u;
		}

	}

	private Employe findEmploye(int matricule) {
		Optional<Employe> opt = CdoServlet.getMutualite().getEffectif().getEmployes().stream().filter(e -> e.getMatricule() == matricule).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new IllegalArgumentException("Aucun salarié de matricule " + matricule + ".");
	}

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

		LocalDate month = LocalDate.parse(commande.getMois() + "01", dfMoisCommande);
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
		getOrCreateCell(line1, 2).setCellValue(commande.getMois());

		Row line2 = getOrCreateRow(sheet, 3);
		Cell cell2_3 = getOrCreateCell(line2, 3);
		cell2_3.setCellValue(cell2_3.getStringCellValue() + dfMoisTextuel.format(previousMonth));
		Cell cell2_4 = getOrCreateCell(line2, 4);
		cell2_4.setCellValue(cell2_4.getStringCellValue() + moisTextuel);

		String nom = etab.getNom().trim();

		int[] pLine = { 4 };
		System.out.println(etab.getId());
		// on ne garde que les employés qui seront là au moins un jour du mois de la commande.
		etab.getEmployes().stream().filter(e -> e.getDateSortieEntreprise() == null || e.getDateSortieEntreprise().after(toDate(month)))
				.sorted((e1, e2) -> e1.getLabel().compareTo(e2.getLabel())).forEach(emp -> {
					int i = pLine[0]++;

					System.out.println(emp.getLabel());
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

	private Date toDate(LocalDate month) {
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
			commande = null;
			if (element instanceof Commande) {
				commande = (Commande) element;
			}

		}
	}

}
