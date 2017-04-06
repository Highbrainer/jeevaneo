package fr.mutualite.rh.webapp.cdo;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.db.mysql.MYSQLAdapter;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;
import org.h2.jdbcx.JdbcDataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class StandaloneCDODynamic extends AbstractCDO implements ICDO {

	private IManagedContainer container;

	private IConnector connector;

	private IStore cdoStore;

	private DataSource dataSource;

	private IRepository cdoRepository;

	private IAcceptor acceptor;

	private int port = 2036;
	private String jdbcUrl = "jdbc:h2:/home/highbrainer/eclipse-workspaces/mutualite-rh/.cdo/mutualite-rh";
	private String jdbcLogin = null;
	private String jdbcPassword = null;
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	private String repository = "mutualite-rh";

	public StandaloneCDODynamic() {
		// Enable logging and tracing
		OMPlatform.INSTANCE.setDebugging(true);
		OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
		OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
	}

	public StandaloneCDODynamic(String jdbcDriver, String jdbcUrl, String login, String password, int port,
			String repository) {
		this();
		this.jdbcDriver = jdbcDriver;
		this.jdbcUrl = jdbcUrl;
		this.jdbcLogin = (login == null || login.trim().isEmpty()) ? null : login;
		this.jdbcPassword = (password == null || password.trim().isEmpty()) ? null : password;
		this.port = port;
		this.repository = repository;
	}

	@Override
	public void start() {
		dataSource = startJdbcDataSource(jdbcUrl);

		cdoStore = startStore(dataSource);
		cdoRepository = startRepository(cdoStore);

		container = startContainer();
		CDOServerUtil.addRepository(container, cdoRepository);

		Net4jUtil.prepareContainer(container);
		TCPUtil.prepareContainer(container);
		CDONet4jServerUtil.prepareContainer(container);

		acceptor = JVMUtil.getAcceptor(container, "default");
		IAcceptor acceptor2 = Net4jUtil.getAcceptor(container, "tcp", "0.0.0.0:" + port);
		connector = JVMUtil.getConnector(container, "default");
	}

	@Override
	public void shutdown() {
		connector.close();
		container.deactivate();
	}

	protected DataSource startJdbcDataSource(String url) {
		if (jdbcUrl.startsWith("jdbc:mysql")) {
			return startMysqlDatasource(url);
		} else if (jdbcUrl.startsWith("jdbc:h2")) {
			return startH2Datasource(url);
		} else
			throw new UnsupportedOperationException("Driver JDBC non supporté : " + jdbcDriver);
	}

	private DataSource startMysqlDatasource(String url) {
		try {
			Class.forName(jdbcDriver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		// Setup JdbcDataSource
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setURL(url);
		if (null != jdbcLogin) {
			dataSource.setUser(jdbcLogin);
		}
		if (null != jdbcPassword) {
			dataSource.setPassword(jdbcPassword);
		}
		return dataSource;
	}

	private DataSource startH2Datasource(String url) {
		try {
			Class.forName(jdbcDriver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		// Setup JdbcDataSource
		JdbcDataSource dataSource = new JdbcDataSource();
		dataSource.setURL(url);
		if (null != jdbcLogin) {
			dataSource.setUser(jdbcLogin);
		}
		if (null != jdbcPassword) {
			dataSource.setPassword(jdbcPassword);
		}
		return dataSource;
	}

	protected IStore startStore(DataSource dataSource) {
		// Setup Store
		IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(true);
		// TODO : change Adapter if an other DB is used.
		IDBAdapter dbAdapter = new MYSQLAdapter();
		IDBConnectionProvider dbConnectionProvider = DBUtil.createConnectionProvider(dataSource);
		return CDODBUtil.createStore(mappingStrategy, dbAdapter, dbConnectionProvider);
	}

	protected IRepository startRepository(IStore store) {
		// Setup Repository
		Map<String, String> props = new HashMap<String, String>();
		props.put(IRepository.Props.OVERRIDE_UUID, repository);
		props.put(IRepository.Props.SUPPORTING_AUDITS, "true");
		props.put(IRepository.Props.SUPPORTING_BRANCHES, "false");
		// props.put(IRepository.Props.CURRENT_LRU_CAPACITY, "100000");
		// props.put(IRepository.Props.REVISED_LRU_CAPACITY, "10000");
		return CDOServerUtil.createRepository(repository, store, props);
	}

	protected IManagedContainer startContainer() {
		IManagedContainer container = ContainerUtil.createContainer();
		Net4jUtil.prepareContainer(container);
		JVMUtil.prepareContainer(container);
		CDONet4jUtil.prepareContainer(container);
		CDONet4jServerUtil.prepareContainer(container);
		container.activate();
		return container;
	}

	@Override
	public CDOSession openSession() {
		CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		IConnector prev = connector;
		// { //TEMP
		// prev = Net4jUtil.getConnector(IPluginContainer.INSTANCE,
		// "cdo://localhost:2037");
		// }
		config.setConnector(prev);
		config.setRepositoryName(repository);

		return config.openNet4jSession();
	}
}