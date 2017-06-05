package fr.mutualite.rh.reports;

import java.awt.Desktop;
import java.io.File;
import java.util.Date;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.SessionFormation;

/**
 * This class controls all aspects of the application's execution
 */
public class ApplicationLastSessionPerEmploye implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Excel", "xls", "xlsx");
		chooser.setFileFilter(filter);
		int ret = chooser.showOpenDialog(null);

		if(ret!=JFileChooser.APPROVE_OPTION ) {
			return IApplication.EXIT_OK;
		}
		File file = chooser.getSelectedFile();
		
		String cdoServerURI = "tcp://rh-gic:2036";
		IConnector connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, cdoServerURI);
		CDONet4jSessionConfiguration sessionConfig = CDONet4jUtil.createNet4jSessionConfiguration();
		sessionConfig.setConnector(connector);
		sessionConfig.setRepositoryName("mutualite-rh");
		CDONet4jSession session = sessionConfig.openNet4jSession();
		try {
			CDOView view = session.openView();
			CDOResource resource = view.getResource("/mutualite-rh");
			Mutualite mut = (Mutualite) resource.getContents().get(0);
			
			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet sheet = wb.createSheet();
			{
				HSSFRow row = sheet.createRow(sheet.getLastRowNum());
				int i=-1;
				row.createCell(++i).setCellValue("Matricule");
				row.createCell(++i).setCellValue("Salarié");
				row.createCell(++i).setCellValue("Date dernière formation");
				row.createCell(++i).setCellValue("Dernière formation");
			}
			
			CellStyle cellStyle = wb.createCellStyle();
			CreationHelper createHelper = wb.getCreationHelper();
			cellStyle.setDataFormat(
			    createHelper.createDataFormat().getFormat("d/m/yyyy"));
			
			
			mut.getEffectif().getEmployes().forEach(employe -> {
				
				SessionFormation latestSession = employe.getSessionsFormation().stream().max((s1,s2)->s1.getDateDebut().compareTo(s2.getDateDebut())).orElse(null);
				String label = latestSession==null?"AUCUNE FORMATION":((Formation)latestSession.eContainer()).getLibelle();
				Date date =  latestSession==null?null:latestSession.getDateDebut();
				int matricule = employe.getMatricule();
				String nom = employe.getLabel();
			
				HSSFRow row = sheet.createRow(sheet.getLastRowNum()+1);
				int i=-1;
				row.createCell(++i).setCellValue(matricule);
				row.createCell(++i).setCellValue(nom);
				HSSFCell dateCell = row.createCell(++i);
				dateCell.setCellStyle(cellStyle);
				if(null!=date) dateCell.setCellValue(date);
				row.createCell(++i).setCellValue(label);
				System.out.printf("%d\t%s\t%s\t%s\n", matricule, nom, date, label);
				
			});
			
			wb.write(file);
			
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
