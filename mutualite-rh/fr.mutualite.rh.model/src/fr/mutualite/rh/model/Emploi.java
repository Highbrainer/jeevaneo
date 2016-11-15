/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emploi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Emploi#getIntitule <em>Intitule</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEmploi()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Emploi extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Intitule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intitule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intitule</em>' attribute.
	 * @see #setIntitule(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEmploi_Intitule()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIntitule();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Emploi#getIntitule <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intitule</em>' attribute.
	 * @see #getIntitule()
	 * @generated
	 */
	void setIntitule(String value);

} // Emploi
