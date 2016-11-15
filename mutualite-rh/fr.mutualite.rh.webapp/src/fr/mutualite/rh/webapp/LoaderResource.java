package fr.mutualite.rh.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.mutualite.rh.webapp.cdo.MutualiteCDO;

@Path("/load")
public class LoaderResource {

	private MutualiteCDO cdo;

	public LoaderResource() {
		cdo = CdoServlet.getCdo();
	}

	@GET
	public String load() {
		cdo.doInMutualiteTransaction(mut -> {
			ResourceSet rs = new ResourceSetImpl();
			rs.createResource(URI.createFileURI(""));
			return true;
		});
		return "done!";
	}

}
