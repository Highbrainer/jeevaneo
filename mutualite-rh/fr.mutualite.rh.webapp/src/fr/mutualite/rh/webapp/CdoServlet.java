package fr.mutualite.rh.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;

import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.config.ConfigFactory;
import fr.mutualite.rh.model.config.Configuration;
import fr.mutualite.rh.webapp.cdo.ICDO;
import fr.mutualite.rh.webapp.cdo.MutualiteCDO;
import fr.mutualite.rh.webapp.cdo.MutualiteCdoClient;

@SuppressWarnings("serial")
public class CdoServlet extends HttpServlet {

	private static Configuration config;

	private static ICDO cdo;

	private static Mutualite mut;

	public static ICDO getCdo() {
		if(null==cdo) {
			try {
				new CdoServlet().init(false);
			} catch (ServletException e) {
				throw new RuntimeException(e);
			}
		}
		return cdo;
	}

	public CdoServlet() {
	}

	@Override
	public void init() throws ServletException {
		init(true);

	}

	private void init(boolean embedded) throws ServletException {
		try {
			config = ConfigFactory.readDefaultConfiguration();
		} catch (IOException e) {
			throw new ServletException(e);
		}
		
		if(embedded) {
			cdo = new MutualiteCDO();
		} else {
			cdo = new MutualiteCdoClient();
		}
		cdo.start();
		CDOSession session = cdo.openSession();
		CDOView view = session.openView();
		mut = cdo.findMutualite(view);
	}

	

	private boolean isWindows() {
		return System.getProperty("os.name", "unknown").toLowerCase().contains("windows");
	}

	@Override
	public void destroy() {
		cdo.shutdown();
		mut = null;
		config = null;
	}

	public static Mutualite getMutualite() {
		getCdo();
		return mut;
	}

	public static Configuration getConfig() {
		if(null==config) {
			getCdo();
		}
		return config;
	}

}
