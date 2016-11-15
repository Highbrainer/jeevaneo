/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emplois</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Emplois#getEmplois <em>Emplois</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEmplois()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Emplois extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Emplois</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Emploi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplois</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplois</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEmplois_Emplois()
	 * @model containment="true"
	 * @generated
	 */
	EList<Emploi> getEmplois();

} // Emplois
