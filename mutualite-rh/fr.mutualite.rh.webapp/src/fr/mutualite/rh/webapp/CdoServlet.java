package fr.mutualite.rh.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;

import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.config.ConfigFactory;
import fr.mutualite.rh.model.config.Configuration;
import fr.mutualite.rh.webapp.cdo.MutualiteCDO;

@SuppressWarnings("serial")
public class CdoServlet extends HttpServlet {

	private static Configuration config;

	private static MutualiteCDO cdo;

	private static Mutualite mut;

	public static MutualiteCDO getCdo() {
		return cdo;
	}

	public CdoServlet() {
	}

	@Override
	public void init() throws ServletException {
		try {
			config = ConfigFactory.readDefaultConfiguration();
		} catch (IOException e) {
			throw new ServletException(e);
		}
		
		cdo = new MutualiteCDO();
		cdo.start();
		CDOSession session = cdo.openSession();
		CDOView view = session.openView();
		mut = cdo.findMutualite(view);

	}

	

	@Override
	public void destroy() {
		cdo.shutdown();
		mut = null;
		config = null;
	}

	public static Mutualite getMutualite() {
		return mut;
	}

	public static Configuration getConfig() {
		return config;
	}

}
