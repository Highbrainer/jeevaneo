package fr.mutualite.rh.conges;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.prefs.Preferences;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.log4j.Logger;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	protected Logger log = Logger.getLogger(getClass());
	
	@Override
	public Object start(IApplicationContext context) throws Exception {

		importExport(new Date(117, 04, 01), new Date(117, 9, 31));
		return IApplication.EXIT_OK;
	}

	public void importExport(Date start, Date end) throws IOException {
		File in = promptFile();
		if (null == in) {
			return;
		}

		process(in, start, end);
		log.info("Export termin� vers " + in.getAbsolutePath());
	}

	private Preferences prefs = Preferences.userRoot().node(this.getClass().getName());

	private File promptFile() {
		File def = defaultFile();

		// def = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\cong�s v3.csv");

		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers CSV", "csv");
		// FileNameExtensionFilter filter = new FileNameExtensionFilter("Fichiers Texte", "txt");
		chooser.setFileFilter(filter);
		if (null != def) {
			chooser.setSelectedFile(def);
		}
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

	private void process(File in, Date start, Date end) throws IOException {
		File out = new File(in.getParentFile(), "generated/conges-planning.xlsx");
		// dir = new File("E:\\workspaces\\mutualite-rh\\fr.mutualite.rh.conges\\data\\generated.xlsx");
		out.getParentFile().mkdirs();
		CongePlanningExporter exporter = new CongePlanningExporter();
		EmployeCongesParser parser = new EmployeCongesParser();
		List<Employe> employes = parser.parse(in);
		exporter.export(employes, start, end, out, null);
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
