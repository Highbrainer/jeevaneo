package mutualite.rh.chequedej.popup.actions;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.prefs.Preferences;
import java.util.stream.IntStream;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.webapp.CdoServlet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.ChoixIndividuel;

public class ExportChoixAction implements IObjectActionDelegate {

	private Shell shell;

	private Choix choix;

	/**
	 * Constructor for Action1.
	 */
	public ExportChoixAction() {
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
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
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

		Job job = new Job("Export des choix du nombre max de Cheques Dej") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				ChangeCommand command = new ChangeCommand(choix) {

					@Override
					public String getLabel() {
						return "Export ds choix";
					}

					@Override
					protected void doExecute() {
						File file = promptDir();

						export(file, monitor);
					}

				};
				EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(choix);
				if (null != domain) {
					domain.getCommandStack().execute(command);
				}
				return Status.OK_STATUS;
			}
		};

		job.schedule();
	}

	protected void export(File file, IProgressMonitor monitor) {

		EList<Employe> effectif = CdoServlet.getMutualite().getEffectif().getEmployes();
		
		monitor.beginTask("Export des choix", effectif.size());
		try (Workbook wb = new XSSFWorkbook();) {
			
			Font bold = wb.createFont();
			bold.setBold(true);

			CellStyle titleStyle = wb.createCellStyle();
			titleStyle.setFillBackgroundColor(IndexedColors.LIGHT_YELLOW.index);
			// XSSFColor lightGray = setColor(wb,(byte) 0x12, (byte)0xE0,(byte) 0x50);
			titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.index);
			titleStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			titleStyle.setAlignment(HorizontalAlignment.LEFT);
			titleStyle.setFont(bold);
			
			Sheet sheet = getOrCreateSheet(wb, "Choix");
			{
				Row row = getOrCreateRow(sheet, 0);
				Cell a1 = getOrCreateCell(row, 0);
				a1.setCellStyle(titleStyle);
				a1.setCellValue("Nom");				
				Cell b1 = getOrCreateCell(row, 1);
				b1.setCellStyle(titleStyle);
				b1.setCellValue("Prenom");
				Cell c1 = getOrCreateCell(row, 2);
				c1.setCellStyle(titleStyle);
				c1.setCellValue("Etablissement");
				Cell d1 = getOrCreateCell(row, 3);
				d1.setCellStyle(titleStyle);
				d1.setCellValue("Choix");
			}
			int[] pIndex = {0};
			effectif.stream().sorted((e1, e2)->e1.getLabel().compareTo(e2.getLabel())).filter(e->e.getDateSortieEntreprise()==null || e.getDateSortieEntreprise().after(new Date())).forEach(employe->{
				Row row = getOrCreateRow(sheet, ++pIndex[0]);
				getOrCreateCell(row, 0).setCellValue(employe.getNom());
				getOrCreateCell(row, 1).setCellValue(employe.getPrenom());
				getOrCreateCell(row, 2).setCellValue(employe.getEtablissement().getNom());
				ChoixIndividuel ci = choix.getChoix(employe.getMatricule());
				String sNb = "non renseigné";
				if(ci!=null) {
					Integer nbMaxCheques = ci.getNbMaxCheques();
					if(nbMaxCheques==null) {
						sNb = "max";
					} else {
						sNb = nbMaxCheques.toString();
					}
				}
				getOrCreateCell(row, 3).setCellValue(sNb);
				
			});
			
			IntStream.range(0, 4).forEach(sheet::autoSizeColumn);
			try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
				wb.write(fileOutputStream);				
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

	


	public Sheet getOrCreateSheet(Workbook wb, String sheetName) {
		Sheet sheet = wb.getSheet(sheetName);
		if(null==sheet) {
			sheet = wb.createSheet(sheetName);
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
			choix = null;
			if (element instanceof Choix) {
				choix = (Choix) element;
			} else if (element instanceof ChequeDej) {
				choix = ((ChequeDej) element).getChoix();
			}
		}
	}

}
