/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisateurs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Utilisateurs#getUtilisateurs <em>Utilisateurs</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getUtilisateurs()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Utilisateurs extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Utilisateurs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Utilisateur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisateurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateurs</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getUtilisateurs_Utilisateurs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Utilisateur> getUtilisateurs();

} // Utilisateurs
