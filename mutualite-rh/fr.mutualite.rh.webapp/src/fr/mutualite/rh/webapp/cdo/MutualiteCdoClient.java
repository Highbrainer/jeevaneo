package fr.mutualite.rh.webapp.cdo;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

public class MutualiteCdoClient extends AbstractCDO {
	private static String DEFAULT_CDO_SERVER_URI = "tcp://rh-gic:2036"; // "tcp://localhost:2036";//
	private IConnector connector;
	private CDONet4jSessionConfiguration sessionConfig;

	public MutualiteCdoClient() {
		this(DEFAULT_CDO_SERVER_URI);
	}

	public MutualiteCdoClient(String cdoServerURI) {

		connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, cdoServerURI);
		sessionConfig = CDONet4jUtil.createNet4jSessionConfiguration();
		sessionConfig.setConnector(connector);
		sessionConfig.setRepositoryName("mutualite-rh");

	}

	@Override
	public CDOSession openSession() {
		return sessionConfig.openNet4jSession();
	}

	@Override
	public void shutdown() {
		if (null != connector) {
			connector.close();
		}
		// if(null!=sessionConfig) {
		// sessionConfig.getConnector()
		// }
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

}
