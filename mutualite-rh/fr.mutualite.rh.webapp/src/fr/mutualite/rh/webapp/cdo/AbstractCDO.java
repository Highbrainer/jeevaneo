package fr.mutualite.rh.webapp.cdo;

import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.InvalidURIException;
import org.eclipse.emf.cdo.view.CDOView;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;

public abstract class AbstractCDO implements ICDO {

	public AbstractCDO() {
		super();
	}

	@Override
	public void doInSession(Consumer<CDOSession> worker) {
		CDOSession session = openSession();
		try {
			worker.accept(session);
		} finally {
			if (null != session) {
				session.close();
			}
		}
	}

	@Override
	public void doInView(Consumer<CDOView> worker) {
		doInSession(session -> {
			CDOView view = session.openView();
			try {
				worker.accept(view);
			} finally {
				if (null != view) {
					view.close();
				}
			}
		});
	}

	@Override
	public void doInTransaction(Function<CDOTransaction, Boolean> worker) {
		doInSession(session -> {
			CDOTransaction transaction = session.openTransaction();
			try {
				if (worker.apply(transaction)) {
					try {
						transaction.commit();
					} catch (CommitException e) {
						throw new RuntimeException(e);
					}
				} else {
					transaction.rollback();
				}
			} finally {
				if (null != transaction) {
					transaction.close();
				}
			}
		});
	}
	


	@Override
	public void doInMutualiteTransaction(Function<Mutualite, Boolean> worker) {
		doInTransaction(transaction -> {
			Mutualite mut = findMutualite(transaction);
			return worker.apply(mut);
		});
	}

	@Override
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

	@Override
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