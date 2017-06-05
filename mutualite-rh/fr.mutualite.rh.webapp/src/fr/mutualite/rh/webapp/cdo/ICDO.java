package fr.mutualite.rh.webapp.cdo;

import java.io.InputStream;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.util.InvalidURIException;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.TCPUtil;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Mutualite;

public interface ICDO {

	void doInTransaction(Function<CDOTransaction, Boolean> worker);

	void doInView(Consumer<CDOView> worker);

	void doInSession(Consumer<CDOSession> worker);

	CDOSession openSession();

	void shutdown();

	void start();

	void createMutualite();

	Mutualite findMutualite(CDOView view);

	void doInMutualiteTransaction(Function<Mutualite, Boolean> worker);

	void restore(InputStream in);

}
