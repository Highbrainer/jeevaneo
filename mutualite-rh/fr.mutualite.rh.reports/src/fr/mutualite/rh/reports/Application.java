package fr.mutualite.rh.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Mutualite;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private static final String DIR = "dir";

	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Object start(IApplicationContext context) throws Exception {

		Preferences prefs = Preferences.userRoot().node(getClass().getName());
		String dir = prefs.get(DIR, null);
		
		JFileChooser chooser = null!=dir?new JFileChooser(dir):new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", "xls", "xlsx");
		chooser.setFileFilter(filter);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setSelectedFile(new File("dernier-entretien-par-salarie-"+ df.format(new Date()) +".xls"));
		int ret = chooser.showOpenDialog(null);		
		
		if (ret != JFileChooser.APPROVE_OPTION) {
			return IApplication.EXIT_OK;
		}
		File file = chooser.getSelectedFile();
		System.out.println("Yes " + file.getAbsolutePath());
		prefs.put(DIR, file.getParent());

		String cdoServerURI = "tcp://rh-gic:2036";
		IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, cdoServerURI);
		CDONet4jSessionConfiguration sessionConfig = CDONet4jUtil.createNet4jSessionConfiguration();
		sessionConfig.setConnector(connector);
		sessionConfig.setRepositoryName("mutualite-rh");
		CDONet4jSession session = sessionConfig.openNet4jSession();
		try (HSSFWorkbook wb = new HSSFWorkbook();) {
			CDOView view = session.openView();
			CDOResource resource = view.getResource("/mutualite-rh");
			Mutualite mut = (Mutualite) resource.getContents().get(0);

			CellStyle titleStyle = wb.createCellStyle();
			titleStyle.setFillBackgroundColor(HSSFColor.AQUA.index);
			// titleStyle.setFillForegroundColor();
//			titleStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			titleStyle.setFillPattern(HSSFCellStyle.ALIGN_FILL);
			HSSFFont font = wb.createFont();
			font.setBold(true);
			font.setColor(HSSFColor.WHITE.index);
			titleStyle.setFont(font);

			CellStyle dateStyle = wb.createCellStyle();
			CreationHelper createHelper = wb.getCreationHelper();
			dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("d/m/yyyy"));

			HSSFSheet sheet = wb.createSheet();
			{
				HSSFRow row = sheet.createRow(sheet.getLastRowNum());
				int i = -1;
				HSSFCell matriculeCell = row.createCell(++i);
				matriculeCell.setCellStyle(titleStyle);
				matriculeCell.setCellValue("Matricule");
				HSSFCell employeCell = row.createCell(++i);
				employeCell.setCellStyle(titleStyle);
				employeCell.setCellValue("Salarié");
				HSSFCell etablissementCell = row.createCell(++i);
				etablissementCell.setCellStyle(titleStyle);
				etablissementCell.setCellValue("Etablissement");
				HSSFCell dateCell = row.createCell(++i);
				dateCell.setCellStyle(titleStyle);
				dateCell.setCellValue("Dernier entretien");
				HSSFCell dateSortieCell = row.createCell(++i);
				dateSortieCell.setCellStyle(titleStyle);
				dateSortieCell.setCellValue("Départ de l'entreprise");
			}

			mut.getEffectif().getEmployes().forEach(employe -> {

				Entretien latest = employe.getEntretiens().stream().max((e1, e2) -> e1.getDate().compareTo(e2.getDate())).orElse(null);
				Etablissement etablissement = employe.getEtablissement();
				String label = "SANS ETABLISSEMENT";
				if (null != etablissement) {
					String nomEtablissement = etablissement.getNom();
					if (null != nomEtablissement) {
						label = nomEtablissement;
					}
				}
				Date date = latest == null ? null : latest.getDate();
				Date dateSortie = employe.getDateSortieEntreprise();
				int matricule = employe.getMatricule();
				String nom = employe.getLabel();

				HSSFRow row = sheet.createRow(sheet.getLastRowNum() + 1);
				int i = -1;
				row.createCell(++i).setCellValue(matricule);
				row.createCell(++i).setCellValue(nom);
				row.createCell(++i).setCellValue(label);
				
				HSSFCell dateCell = row.createCell(++i);
				dateCell.setCellStyle(dateStyle);
				if (null != date) {
					dateCell.setCellValue(date);
				}
				HSSFCell dateSortieCell = row.createCell(++i);
				dateSortieCell.setCellStyle(dateStyle);
				if (null != dateSortie) {
					dateSortieCell.setCellValue(dateSortie);
				}
				System.out.printf("%d\t%s\t%s\t%s\t%s\n", matricule, nom, label, date, dateSortie);

			});

			for (int i = 0; i < 5; ++i) {
				sheet.autoSizeColumn(i);
			}

			try {
				wb.write(file);
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(new JFrame(), "Erreur : " + e.getMessage() + "\n => Le fichier serait-il déjà ouvert dans Excel?", "Erreur",
				        JOptionPane.ERROR_MESSAGE);
			}

			Desktop.getDesktop().open(file);

		} finally {
			session.close();
		}

		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
