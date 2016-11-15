/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Effectif#getEmployes <em>Employes</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEffectif()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Effectif extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Employes</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEffectif_Employes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employe> getEmployes();

} // Effectif
