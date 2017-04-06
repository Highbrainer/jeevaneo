/**
 */
package fr.mutualite.rh.model.config.impl;

import fr.mutualite.rh.model.config.ConfigPackage;
import fr.mutualite.rh.model.config.Configuration;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getJdbcDriver <em>Jdbc Driver</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapPort <em>Ldap Port</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapServers <em>Ldap Servers</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapBaseDn <em>Ldap Base Dn</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapIdAttribute <em>Ldap Id Attribute</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapLogin <em>Ldap Login</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapPassword <em>Ldap Password</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapFilter <em>Ldap Filter</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getCdoPort <em>Cdo Port</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getCdoRepository <em>Cdo Repository</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.impl.ConfigurationImpl#getLdapBase <em>Ldap Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends CDOObjectImpl implements Configuration {
	/**
	 * The default value of the '{@link #getJdbcUrl() <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_URL_EDEFAULT = "jdbc:mysql://localhost:3306/_RH_GIC";

	/**
	 * The default value of the '{@link #getJdbcUser() <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcUser()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_USER_EDEFAULT = "userDB_RH_GIC";

	/**
	 * The default value of the '{@link #getJdbcPassword() <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_PASSWORD_EDEFAULT = "C.,HV@%mi31lA1X\',AU6";

	/**
	 * The default value of the '{@link #getJdbcDriver() <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJdbcDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String JDBC_DRIVER_EDEFAULT = "com.mysql.jdbc.Driver";

	/**
	 * The default value of the '{@link #getLdapPort() <em>Ldap Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapPort()
	 * @generated
	 * @ordered
	 */
	protected static final int LDAP_PORT_EDEFAULT = 389;

	/**
	 * The default value of the '{@link #getLdapServers() <em>Ldap Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapServers()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_SERVERS_EDEFAULT = "SRVCAADM01.MFCA.local; SRVCAADM02.MFCA.local";

	/**
	 * The default value of the '{@link #getLdapBaseDn() <em>Ldap Base Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapBaseDn()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_BASE_DN_EDEFAULT = "DC=MFCA,DC=local";

	/**
	 * The default value of the '{@link #getLdapIdAttribute() <em>Ldap Id Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapIdAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_ID_ATTRIBUTE_EDEFAULT = "samaccountname";

	/**
	 * The default value of the '{@link #getLdapLogin() <em>Ldap Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_LOGIN_EDEFAULT = "CN=Administrateur AD ReadOnly,OU=_Services,OU=Services Informatiques,OU=Utilisateurs,OU=MFCA,DC=MFCA,DC=local";

	/**
	 * The default value of the '{@link #getLdapPassword() <em>Ldap Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_PASSWORD_EDEFAULT = "3phzdupj";

	/**
	 * The default value of the '{@link #getLdapFilter() <em>Ldap Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_FILTER_EDEFAULT = "(&(samaccountname=%s)(objectClass=user)(objectCategory=person)(memberOf=CN= MFCA RH Acces EP EAE Informatise,OU=Services Communs,OU=Groupes,OU=MFCA,DC=MFCA,DC=local)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))";

	/**
	 * The default value of the '{@link #getCdoPort() <em>Cdo Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdoPort()
	 * @generated
	 * @ordered
	 */
	protected static final int CDO_PORT_EDEFAULT = 2036;

	/**
	 * The default value of the '{@link #getCdoRepository() <em>Cdo Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdoRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String CDO_REPOSITORY_EDEFAULT = "mutualite-rh";

	/**
	 * The default value of the '{@link #getLdapBase() <em>Ldap Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLdapBase()
	 * @generated
	 * @ordered
	 */
	protected static final String LDAP_BASE_EDEFAULT = "ou=MFCA";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUrl() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__JDBC_URL, ConfigPackage.Literals.CONFIGURATION__JDBC_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUrl(String newJdbcUrl) {
		eDynamicSet(ConfigPackage.CONFIGURATION__JDBC_URL, ConfigPackage.Literals.CONFIGURATION__JDBC_URL, newJdbcUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcUser() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__JDBC_USER, ConfigPackage.Literals.CONFIGURATION__JDBC_USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcUser(String newJdbcUser) {
		eDynamicSet(ConfigPackage.CONFIGURATION__JDBC_USER, ConfigPackage.Literals.CONFIGURATION__JDBC_USER, newJdbcUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcPassword() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__JDBC_PASSWORD, ConfigPackage.Literals.CONFIGURATION__JDBC_PASSWORD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcPassword(String newJdbcPassword) {
		eDynamicSet(ConfigPackage.CONFIGURATION__JDBC_PASSWORD, ConfigPackage.Literals.CONFIGURATION__JDBC_PASSWORD, newJdbcPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJdbcDriver() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__JDBC_DRIVER, ConfigPackage.Literals.CONFIGURATION__JDBC_DRIVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJdbcDriver(String newJdbcDriver) {
		eDynamicSet(ConfigPackage.CONFIGURATION__JDBC_DRIVER, ConfigPackage.Literals.CONFIGURATION__JDBC_DRIVER, newJdbcDriver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLdapPort() {
		return (Integer)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_PORT, ConfigPackage.Literals.CONFIGURATION__LDAP_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapPort(int newLdapPort) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_PORT, ConfigPackage.Literals.CONFIGURATION__LDAP_PORT, newLdapPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapServers() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_SERVERS, ConfigPackage.Literals.CONFIGURATION__LDAP_SERVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapServers(String newLdapServers) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_SERVERS, ConfigPackage.Literals.CONFIGURATION__LDAP_SERVERS, newLdapServers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapBaseDn() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_BASE_DN, ConfigPackage.Literals.CONFIGURATION__LDAP_BASE_DN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapBaseDn(String newLdapBaseDn) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_BASE_DN, ConfigPackage.Literals.CONFIGURATION__LDAP_BASE_DN, newLdapBaseDn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapIdAttribute() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE, ConfigPackage.Literals.CONFIGURATION__LDAP_ID_ATTRIBUTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapIdAttribute(String newLdapIdAttribute) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE, ConfigPackage.Literals.CONFIGURATION__LDAP_ID_ATTRIBUTE, newLdapIdAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapLogin() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_LOGIN, ConfigPackage.Literals.CONFIGURATION__LDAP_LOGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapLogin(String newLdapLogin) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_LOGIN, ConfigPackage.Literals.CONFIGURATION__LDAP_LOGIN, newLdapLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapPassword() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_PASSWORD, ConfigPackage.Literals.CONFIGURATION__LDAP_PASSWORD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapPassword(String newLdapPassword) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_PASSWORD, ConfigPackage.Literals.CONFIGURATION__LDAP_PASSWORD, newLdapPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapFilter() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_FILTER, ConfigPackage.Literals.CONFIGURATION__LDAP_FILTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapFilter(String newLdapFilter) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_FILTER, ConfigPackage.Literals.CONFIGURATION__LDAP_FILTER, newLdapFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCdoPort() {
		return (Integer)eDynamicGet(ConfigPackage.CONFIGURATION__CDO_PORT, ConfigPackage.Literals.CONFIGURATION__CDO_PORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdoPort(int newCdoPort) {
		eDynamicSet(ConfigPackage.CONFIGURATION__CDO_PORT, ConfigPackage.Literals.CONFIGURATION__CDO_PORT, newCdoPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCdoRepository() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__CDO_REPOSITORY, ConfigPackage.Literals.CONFIGURATION__CDO_REPOSITORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdoRepository(String newCdoRepository) {
		eDynamicSet(ConfigPackage.CONFIGURATION__CDO_REPOSITORY, ConfigPackage.Literals.CONFIGURATION__CDO_REPOSITORY, newCdoRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLdapBase() {
		return (String)eDynamicGet(ConfigPackage.CONFIGURATION__LDAP_BASE, ConfigPackage.Literals.CONFIGURATION__LDAP_BASE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLdapBase(String newLdapBase) {
		eDynamicSet(ConfigPackage.CONFIGURATION__LDAP_BASE, ConfigPackage.Literals.CONFIGURATION__LDAP_BASE, newLdapBase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.CONFIGURATION__JDBC_URL:
				return getJdbcUrl();
			case ConfigPackage.CONFIGURATION__JDBC_USER:
				return getJdbcUser();
			case ConfigPackage.CONFIGURATION__JDBC_PASSWORD:
				return getJdbcPassword();
			case ConfigPackage.CONFIGURATION__JDBC_DRIVER:
				return getJdbcDriver();
			case ConfigPackage.CONFIGURATION__LDAP_PORT:
				return getLdapPort();
			case ConfigPackage.CONFIGURATION__LDAP_SERVERS:
				return getLdapServers();
			case ConfigPackage.CONFIGURATION__LDAP_BASE_DN:
				return getLdapBaseDn();
			case ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE:
				return getLdapIdAttribute();
			case ConfigPackage.CONFIGURATION__LDAP_LOGIN:
				return getLdapLogin();
			case ConfigPackage.CONFIGURATION__LDAP_PASSWORD:
				return getLdapPassword();
			case ConfigPackage.CONFIGURATION__LDAP_FILTER:
				return getLdapFilter();
			case ConfigPackage.CONFIGURATION__CDO_PORT:
				return getCdoPort();
			case ConfigPackage.CONFIGURATION__CDO_REPOSITORY:
				return getCdoRepository();
			case ConfigPackage.CONFIGURATION__LDAP_BASE:
				return getLdapBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.CONFIGURATION__JDBC_URL:
				setJdbcUrl((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_USER:
				setJdbcUser((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_PASSWORD:
				setJdbcPassword((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_DRIVER:
				setJdbcDriver((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_PORT:
				setLdapPort((Integer)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_SERVERS:
				setLdapServers((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_BASE_DN:
				setLdapBaseDn((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE:
				setLdapIdAttribute((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_LOGIN:
				setLdapLogin((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_PASSWORD:
				setLdapPassword((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_FILTER:
				setLdapFilter((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__CDO_PORT:
				setCdoPort((Integer)newValue);
				return;
			case ConfigPackage.CONFIGURATION__CDO_REPOSITORY:
				setCdoRepository((String)newValue);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_BASE:
				setLdapBase((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.CONFIGURATION__JDBC_URL:
				setJdbcUrl(JDBC_URL_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_USER:
				setJdbcUser(JDBC_USER_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_PASSWORD:
				setJdbcPassword(JDBC_PASSWORD_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__JDBC_DRIVER:
				setJdbcDriver(JDBC_DRIVER_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_PORT:
				setLdapPort(LDAP_PORT_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_SERVERS:
				setLdapServers(LDAP_SERVERS_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_BASE_DN:
				setLdapBaseDn(LDAP_BASE_DN_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE:
				setLdapIdAttribute(LDAP_ID_ATTRIBUTE_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_LOGIN:
				setLdapLogin(LDAP_LOGIN_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_PASSWORD:
				setLdapPassword(LDAP_PASSWORD_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_FILTER:
				setLdapFilter(LDAP_FILTER_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__CDO_PORT:
				setCdoPort(CDO_PORT_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__CDO_REPOSITORY:
				setCdoRepository(CDO_REPOSITORY_EDEFAULT);
				return;
			case ConfigPackage.CONFIGURATION__LDAP_BASE:
				setLdapBase(LDAP_BASE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.CONFIGURATION__JDBC_URL:
				return JDBC_URL_EDEFAULT == null ? getJdbcUrl() != null : !JDBC_URL_EDEFAULT.equals(getJdbcUrl());
			case ConfigPackage.CONFIGURATION__JDBC_USER:
				return JDBC_USER_EDEFAULT == null ? getJdbcUser() != null : !JDBC_USER_EDEFAULT.equals(getJdbcUser());
			case ConfigPackage.CONFIGURATION__JDBC_PASSWORD:
				return JDBC_PASSWORD_EDEFAULT == null ? getJdbcPassword() != null : !JDBC_PASSWORD_EDEFAULT.equals(getJdbcPassword());
			case ConfigPackage.CONFIGURATION__JDBC_DRIVER:
				return JDBC_DRIVER_EDEFAULT == null ? getJdbcDriver() != null : !JDBC_DRIVER_EDEFAULT.equals(getJdbcDriver());
			case ConfigPackage.CONFIGURATION__LDAP_PORT:
				return getLdapPort() != LDAP_PORT_EDEFAULT;
			case ConfigPackage.CONFIGURATION__LDAP_SERVERS:
				return LDAP_SERVERS_EDEFAULT == null ? getLdapServers() != null : !LDAP_SERVERS_EDEFAULT.equals(getLdapServers());
			case ConfigPackage.CONFIGURATION__LDAP_BASE_DN:
				return LDAP_BASE_DN_EDEFAULT == null ? getLdapBaseDn() != null : !LDAP_BASE_DN_EDEFAULT.equals(getLdapBaseDn());
			case ConfigPackage.CONFIGURATION__LDAP_ID_ATTRIBUTE:
				return LDAP_ID_ATTRIBUTE_EDEFAULT == null ? getLdapIdAttribute() != null : !LDAP_ID_ATTRIBUTE_EDEFAULT.equals(getLdapIdAttribute());
			case ConfigPackage.CONFIGURATION__LDAP_LOGIN:
				return LDAP_LOGIN_EDEFAULT == null ? getLdapLogin() != null : !LDAP_LOGIN_EDEFAULT.equals(getLdapLogin());
			case ConfigPackage.CONFIGURATION__LDAP_PASSWORD:
				return LDAP_PASSWORD_EDEFAULT == null ? getLdapPassword() != null : !LDAP_PASSWORD_EDEFAULT.equals(getLdapPassword());
			case ConfigPackage.CONFIGURATION__LDAP_FILTER:
				return LDAP_FILTER_EDEFAULT == null ? getLdapFilter() != null : !LDAP_FILTER_EDEFAULT.equals(getLdapFilter());
			case ConfigPackage.CONFIGURATION__CDO_PORT:
				return getCdoPort() != CDO_PORT_EDEFAULT;
			case ConfigPackage.CONFIGURATION__CDO_REPOSITORY:
				return CDO_REPOSITORY_EDEFAULT == null ? getCdoRepository() != null : !CDO_REPOSITORY_EDEFAULT.equals(getCdoRepository());
			case ConfigPackage.CONFIGURATION__LDAP_BASE:
				return LDAP_BASE_EDEFAULT == null ? getLdapBase() != null : !LDAP_BASE_EDEFAULT.equals(getLdapBase());
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
