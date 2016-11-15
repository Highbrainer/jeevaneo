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

	public void doInMutualiteTransaction(Function<Mutualite, Boolean> worker) {
		doInTransaction(transaction -> {
			Mutualite mut = findMutualite(transaction);
			return worker.apply(mut);
		});
	}

	public Mutualite findMutualite(CDOView view) {
		CDOResource resource;
		try {
			resource = view.getResource("/mutualite-rh");
		} catch (InvalidURIException e) {
			// La resource n'existe pas!
			resource = null;
		}
		if (null == resource || resource.getContents().isEmpty()) {
			createMutualite();
			resource = view.getResource("/mutualite-rh");
		}

		Mutualite mut = (Mutualite) resource.getContents().get(0);
		return mut;
	}

	public void createMutualite() {
		doInTransaction(transaction -> {
			CDOResource resource = transaction.getOrCreateResource("/mutualite-rh");
			if (resource.getContents().isEmpty()) {
				resource.getContents().add(MutFactory.eINSTANCE.createMutualite());
			}
			return true;
		});
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// OK
		}
	}

}