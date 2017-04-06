package fr.mutualite.rh.webapp.cdo;

import java.util.function.Function;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.util.InvalidURIException;
import org.eclipse.emf.cdo.view.CDOView;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.webapp.CdoServlet;

public class MutualiteCDO extends StandaloneCDODynamic {

		
	public MutualiteCDO() {
		super(CdoServlet.getConfig().getJdbcDriver(), CdoServlet.getConfig().getJdbcUrl(), CdoServlet.getConfig().getJdbcUser(), CdoServlet.getConfig().getJdbcPassword(), CdoServlet.getConfig().getCdoPort(), CdoServlet.getConfig().getCdoRepository());
	}
}