/**
 */
package fr.mutualite.rh.model.config;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getJdbcUrl <em>Jdbc Url</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getJdbcUser <em>Jdbc User</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getJdbcPassword <em>Jdbc Password</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getJdbcDriver <em>Jdbc Driver</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapPort <em>Ldap Port</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapServers <em>Ldap Servers</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapBaseDn <em>Ldap Base Dn</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapIdAttribute <em>Ldap Id Attribute</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapLogin <em>Ldap Login</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapPassword <em>Ldap Password</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapFilter <em>Ldap Filter</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getCdoPort <em>Cdo Port</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getCdoRepository <em>Cdo Repository</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.config.Configuration#getLdapBase <em>Ldap Base</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Configuration extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Jdbc Url</b></em>' attribute.
	 * The default value is <code>"jdbc:mysql://localhost:3306/_RH_GIC"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Url</em>' attribute.
	 * @see #setJdbcUrl(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_JdbcUrl()
	 * @model default="jdbc:mysql://localhost:3306/_RH_GIC" required="true"
	 * @generated
	 */
	String getJdbcUrl();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getJdbcUrl <em>Jdbc Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Url</em>' attribute.
	 * @see #getJdbcUrl()
	 * @generated
	 */
	void setJdbcUrl(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc User</b></em>' attribute.
	 * The default value is <code>"userDB_RH_GIC"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc User</em>' attribute.
	 * @see #setJdbcUser(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_JdbcUser()
	 * @model default="userDB_RH_GIC" required="true"
	 * @generated
	 */
	String getJdbcUser();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getJdbcUser <em>Jdbc User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc User</em>' attribute.
	 * @see #getJdbcUser()
	 * @generated
	 */
	void setJdbcUser(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Password</b></em>' attribute.
	 * The default value is <code>"C.,HV@%mi31lA1X\',AU6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Password</em>' attribute.
	 * @see #setJdbcPassword(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_JdbcPassword()
	 * @model default="C.,HV@%mi31lA1X\',AU6" required="true"
	 * @generated
	 */
	String getJdbcPassword();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getJdbcPassword <em>Jdbc Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Password</em>' attribute.
	 * @see #getJdbcPassword()
	 * @generated
	 */
	void setJdbcPassword(String value);

	/**
	 * Returns the value of the '<em><b>Jdbc Driver</b></em>' attribute.
	 * The default value is <code>"com.mysql.jdbc.Driver"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jdbc Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #setJdbcDriver(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_JdbcDriver()
	 * @model default="com.mysql.jdbc.Driver" required="true"
	 * @generated
	 */
	String getJdbcDriver();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getJdbcDriver <em>Jdbc Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jdbc Driver</em>' attribute.
	 * @see #getJdbcDriver()
	 * @generated
	 */
	void setJdbcDriver(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Port</b></em>' attribute.
	 * The default value is <code>"389"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Port</em>' attribute.
	 * @see #setLdapPort(int)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapPort()
	 * @model default="389" required="true"
	 * @generated
	 */
	int getLdapPort();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapPort <em>Ldap Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Port</em>' attribute.
	 * @see #getLdapPort()
	 * @generated
	 */
	void setLdapPort(int value);

	/**
	 * Returns the value of the '<em><b>Ldap Servers</b></em>' attribute.
	 * The default value is <code>"SRVCAADM01.MFCA.local; SRVCAADM02.MFCA.local"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Servers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Servers</em>' attribute.
	 * @see #setLdapServers(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapServers()
	 * @model default="SRVCAADM01.MFCA.local; SRVCAADM02.MFCA.local" required="true"
	 * @generated
	 */
	String getLdapServers();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapServers <em>Ldap Servers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Servers</em>' attribute.
	 * @see #getLdapServers()
	 * @generated
	 */
	void setLdapServers(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Base Dn</b></em>' attribute.
	 * The default value is <code>"DC=MFCA,DC=local"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Base Dn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Base Dn</em>' attribute.
	 * @see #setLdapBaseDn(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapBaseDn()
	 * @model default="DC=MFCA,DC=local" required="true"
	 * @generated
	 */
	String getLdapBaseDn();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapBaseDn <em>Ldap Base Dn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Base Dn</em>' attribute.
	 * @see #getLdapBaseDn()
	 * @generated
	 */
	void setLdapBaseDn(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Id Attribute</b></em>' attribute.
	 * The default value is <code>"samaccountname"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Id Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Id Attribute</em>' attribute.
	 * @see #setLdapIdAttribute(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapIdAttribute()
	 * @model default="samaccountname" required="true"
	 * @generated
	 */
	String getLdapIdAttribute();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapIdAttribute <em>Ldap Id Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Id Attribute</em>' attribute.
	 * @see #getLdapIdAttribute()
	 * @generated
	 */
	void setLdapIdAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Login</b></em>' attribute.
	 * The default value is <code>"CN=Administrateur AD ReadOnly,OU=_Services,OU=Services Informatiques,OU=Utilisateurs,OU=MFCA,DC=MFCA,DC=local"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Login</em>' attribute.
	 * @see #setLdapLogin(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapLogin()
	 * @model default="CN=Administrateur AD ReadOnly,OU=_Services,OU=Services Informatiques,OU=Utilisateurs,OU=MFCA,DC=MFCA,DC=local" required="true"
	 * @generated
	 */
	String getLdapLogin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapLogin <em>Ldap Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Login</em>' attribute.
	 * @see #getLdapLogin()
	 * @generated
	 */
	void setLdapLogin(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Password</b></em>' attribute.
	 * The default value is <code>"3phzdupj"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Password</em>' attribute.
	 * @see #setLdapPassword(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapPassword()
	 * @model default="3phzdupj" required="true"
	 * @generated
	 */
	String getLdapPassword();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapPassword <em>Ldap Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Password</em>' attribute.
	 * @see #getLdapPassword()
	 * @generated
	 */
	void setLdapPassword(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Filter</b></em>' attribute.
	 * The default value is <code>"(&(samaccountname=%s)(objectClass=user)(objectCategory=person)(memberOf=CN= MFCA RH Acces EP EAE Informatise,OU=Services Communs,OU=Groupes,OU=MFCA,DC=MFCA,DC=local)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Filter</em>' attribute.
	 * @see #setLdapFilter(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapFilter()
	 * @model default="(&(samaccountname=%s)(objectClass=user)(objectCategory=person)(memberOf=CN= MFCA RH Acces EP EAE Informatise,OU=Services Communs,OU=Groupes,OU=MFCA,DC=MFCA,DC=local)(!(userAccountControl:1.2.840.113556.1.4.803:=2)))" required="true"
	 * @generated
	 */
	String getLdapFilter();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapFilter <em>Ldap Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Filter</em>' attribute.
	 * @see #getLdapFilter()
	 * @generated
	 */
	void setLdapFilter(String value);

	/**
	 * Returns the value of the '<em><b>Cdo Port</b></em>' attribute.
	 * The default value is <code>"2036"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdo Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdo Port</em>' attribute.
	 * @see #setCdoPort(int)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_CdoPort()
	 * @model default="2036" required="true"
	 * @generated
	 */
	int getCdoPort();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getCdoPort <em>Cdo Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdo Port</em>' attribute.
	 * @see #getCdoPort()
	 * @generated
	 */
	void setCdoPort(int value);

	/**
	 * Returns the value of the '<em><b>Cdo Repository</b></em>' attribute.
	 * The default value is <code>"mutualite-rh"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cdo Repository</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cdo Repository</em>' attribute.
	 * @see #setCdoRepository(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_CdoRepository()
	 * @model default="mutualite-rh" required="true"
	 * @generated
	 */
	String getCdoRepository();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getCdoRepository <em>Cdo Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cdo Repository</em>' attribute.
	 * @see #getCdoRepository()
	 * @generated
	 */
	void setCdoRepository(String value);

	/**
	 * Returns the value of the '<em><b>Ldap Base</b></em>' attribute.
	 * The default value is <code>"ou=MFCA"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ldap Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ldap Base</em>' attribute.
	 * @see #setLdapBase(String)
	 * @see fr.mutualite.rh.model.config.ConfigPackage#getConfiguration_LdapBase()
	 * @model default="ou=MFCA" required="true"
	 * @generated
	 */
	String getLdapBase();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.config.Configuration#getLdapBase <em>Ldap Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldap Base</em>' attribute.
	 * @see #getLdapBase()
	 * @generated
	 */
	void setLdapBase(String value);

} // Configuration
