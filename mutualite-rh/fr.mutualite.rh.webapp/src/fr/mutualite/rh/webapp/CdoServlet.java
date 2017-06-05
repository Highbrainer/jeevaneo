package fr.mutualite.rh.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
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
	
	protected Logger log = Logger.getLogger(getClass());

	private static Configuration config;

	private static ICDO cdo;

	private static Mutualite mut;
	
	private static CdoServlet INSTANCE = new CdoServlet(); 

	public static ICDO getCdo() {
		if(null==cdo) {
			try {
				INSTANCE.init(false);
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
		log.info("GIC started!");
	}

	private void init(boolean embedded) throws ServletException {
		initConfig();
		
		if(embedded) {
			cdo = new MutualiteCDO();
		} else {
			cdo = new MutualiteCdoClient();
		}
		cdo.start();
		initMut();
	}

	private static void initMut() {
		CDOSession session = getCdo().openSession();
		CDOView view = session.openView();
		mut = cdo.findMutualite(view);
	}

	private void initConfig() throws ServletException {
		try {
			config = ConfigFactory.readDefaultConfiguration();
		} catch (IOException e) {
			throw new ServletException(e);
		}
	}

	

	private boolean isWindows() {
		return System.getProperty("os.name", "unknown").toLowerCase().contains("windows");
	}

	@Override
	public void destroy() {
		if(null!=cdo) {
			cdo.shutdown();
		}
		mut = null;
		config = null;
		cdo=null;
	}

	public static Mutualite getMutualite() {
		if(null==mut) {
			initMut();
		}
		return mut;
	}

	public static Configuration getConfig() {
		if(null==config) {
			try {
				INSTANCE.initConfig();
			} catch (ServletException e) {
				throw new RuntimeException(e);
			}
		}
		return config;
	}

	public static void resetMutualite() {
		mut = null;
		initMut();
	}

}
