/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Utilisateur#getEmploye <em>Employe</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Utilisateur#getLogin <em>Login</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Utilisateur#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getUtilisateur()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Utilisateur extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Employe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employe</em>' reference.
	 * @see #setEmploye(Employe)
	 * @see fr.mutualite.rh.model.MutPackage#getUtilisateur_Employe()
	 * @model required="true"
	 * @generated
	 */
	Employe getEmploye();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Utilisateur#getEmploye <em>Employe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employe</em>' reference.
	 * @see #getEmploye()
	 * @generated
	 */
	void setEmploye(Employe value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see fr.mutualite.rh.model.MutPackage#getUtilisateur_Login()
	 * @model required="true"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Utilisateur#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Role}.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see fr.mutualite.rh.model.Role
	 * @see fr.mutualite.rh.model.MutPackage#getUtilisateur_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Utilisateur
