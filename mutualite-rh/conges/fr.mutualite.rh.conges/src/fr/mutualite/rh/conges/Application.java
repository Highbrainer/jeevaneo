package fr.mutualite.rh.conges;

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {

		File def = null;
		Preferences prefs = Preferences.userRoot().node(this.getClass().getName());
		String sDef = prefs.get("file-dir", null);
		if(null!=sDef) {
			def = new File(sDef);
		}
		File t = new File("T:/");
		if(null==def && t.exists()) {
			def = t;
		}
		
//		def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\congés v3.csv");
		
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers CSV", "csv");
//		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		chooser.setFileFilter(filter);
		if(null!=def) {
		chooser.setSelectedFile(def);
		}
		int ret = chooser.showOpenDialog(null);

		if(ret!=JFileChooser.APPROVE_OPTION ) {
			return IApplication.EXIT_OK;
		}
		File in = chooser.getSelectedFile();
		System.out.println("Yes " + in.getAbsolutePath());
		
		prefs.put("file-dir", in.getAbsolutePath());
		
		File out = new File(in.getParentFile(), "generated/conges-planning.xlsx");
//		dir = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\generated.xlsx");
		out.getParentFile().mkdirs();
		CongePlanningExporter exporter = new CongePlanningExporter();
		EmployeCongesParser parser= new EmployeCongesParser();
		List<Employe> employes = parser.parse(in);
		exporter.export(employes, new Date(116, 10, 01), new Date(117, 03, 30), out, null);
		System.out.println("Export terminé vers " + in.getAbsolutePath());
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
