/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Formation#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Formation#getSessionformation <em>Sessionformation</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Formation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see fr.mutualite.rh.model.MutPackage#getFormation_Libelle()
	 * @model required="true"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Formation#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Sessionformation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.SessionFormation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessionformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessionformation</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getFormation_Sessionformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SessionFormation> getSessionformation();

} // Formation
