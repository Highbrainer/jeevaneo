/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etablissements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Etablissements#getEtablissements <em>Etablissements</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEtablissements()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Etablissements extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Etablissements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Etablissement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissements</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEtablissements_Etablissements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Etablissement> getEtablissements();

} // Etablissements
