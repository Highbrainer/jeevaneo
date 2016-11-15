/**
 */
package fr.mutualite.rh.model.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mutualite.fr/mut/1.0/config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = fr.mutualite.rh.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.mutualite.rh.model.config.impl.ConfigurationImpl
	 * @see fr.mutualite.rh.model.config.impl.ConfigPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Jdbc Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__JDBC_URL = 0;

	/**
	 * The feature id for the '<em><b>Jdbc User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__JDBC_USER = 1;

	/**
	 * The feature id for the '<em><b>Jdbc Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__JDBC_PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Jdbc Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__JDBC_DRIVER = 3;

	/**
	 * The feature id for the '<em><b>Ldap Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_PORT = 4;

	/**
	 * The feature id for the '<em><b>Ldap Servers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_SERVERS = 5;

	/**
	 * The feature id for the '<em><b>Ldap Base Dn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_BASE_DN = 6;

	/**
	 * The feature id for the '<em><b>Ldap Id Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_ID_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Ldap Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_LOGIN = 8;

	/**
	 * The feature id for the '<em><b>Ldap Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_PASSWORD = 9;

	/**
	 * The feature id for the '<em><b>Ldap Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Cdo Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CDO_PORT = 11;

	/**
	 * The feature id for the '<em><b>Cdo Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CDO_REPOSITORY = 12;

	/**
	 * The feature id for the '<em><b>Ldap Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LDAP_BASE = 13;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link fr.mutualite.rh.model.config.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getJdbcUrl <em>Jdbc Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Url</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getJdbcUrl()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_JdbcUrl();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getJdbcUser <em>Jdbc User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc User</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getJdbcUser()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_JdbcUser();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getJdbcPassword <em>Jdbc Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Password</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getJdbcPassword()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_JdbcPassword();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getJdbcDriver <em>Jdbc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jdbc Driver</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getJdbcDriver()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_JdbcDriver();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapPort <em>Ldap Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Port</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapPort()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapServers <em>Ldap Servers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Servers</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapServers()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapServers();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapBaseDn <em>Ldap Base Dn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Base Dn</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapBaseDn()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapBaseDn();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapIdAttribute <em>Ldap Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Id Attribute</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapIdAttribute()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapIdAttribute();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapLogin <em>Ldap Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Login</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapLogin()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapLogin();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapPassword <em>Ldap Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Password</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapPassword()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapPassword();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapFilter <em>Ldap Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Filter</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapFilter()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapFilter();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getCdoPort <em>Cdo Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdo Port</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getCdoPort()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_CdoPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getCdoRepository <em>Cdo Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cdo Repository</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getCdoRepository()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_CdoRepository();

	/**
	 * Returns the meta object for the attribute '{@link fr.mutualite.rh.model.config.Configuration#getLdapBase <em>Ldap Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ldap Base</em>'.
	 * @see fr.mutualite.rh.model.config.Configuration#getLdapBase()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_LdapBase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.mutualite.rh.model.config.impl.ConfigurationImpl
		 * @see fr.mutualite.rh.model.config.impl.ConfigPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Jdbc Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__JDBC_URL = eINSTANCE.getConfiguration_JdbcUrl();

		/**
		 * The meta object literal for the '<em><b>Jdbc User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__JDBC_USER = eINSTANCE.getConfiguration_JdbcUser();

		/**
		 * The meta object literal for the '<em><b>Jdbc Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__JDBC_PASSWORD = eINSTANCE.getConfiguration_JdbcPassword();

		/**
		 * The meta object literal for the '<em><b>Jdbc Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__JDBC_DRIVER = eINSTANCE.getConfiguration_JdbcDriver();

		/**
		 * The meta object literal for the '<em><b>Ldap Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_PORT = eINSTANCE.getConfiguration_LdapPort();

		/**
		 * The meta object literal for the '<em><b>Ldap Servers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_SERVERS = eINSTANCE.getConfiguration_LdapServers();

		/**
		 * The meta object literal for the '<em><b>Ldap Base Dn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_BASE_DN = eINSTANCE.getConfiguration_LdapBaseDn();

		/**
		 * The meta object literal for the '<em><b>Ldap Id Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_ID_ATTRIBUTE = eINSTANCE.getConfiguration_LdapIdAttribute();

		/**
		 * The meta object literal for the '<em><b>Ldap Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_LOGIN = eINSTANCE.getConfiguration_LdapLogin();

		/**
		 * The meta object literal for the '<em><b>Ldap Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_PASSWORD = eINSTANCE.getConfiguration_LdapPassword();

		/**
		 * The meta object literal for the '<em><b>Ldap Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_FILTER = eINSTANCE.getConfiguration_LdapFilter();

		/**
		 * The meta object literal for the '<em><b>Cdo Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CDO_PORT = eINSTANCE.getConfiguration_CdoPort();

		/**
		 * The meta object literal for the '<em><b>Cdo Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__CDO_REPOSITORY = eINSTANCE.getConfiguration_CdoRepository();

		/**
		 * The meta object literal for the '<em><b>Ldap Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__LDAP_BASE = eINSTANCE.getConfiguration_LdapBase();

	}

} //ConfigPackage
