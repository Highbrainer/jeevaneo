/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etablissements Virtuels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.EtablissementsVirtuels#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementsVirtuels()
 * @model
 * @generated
 */
public interface EtablissementsVirtuels extends EObject {
	/**
	 * Returns the value of the '<em><b>Etablissements Virtuels</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.EtablissementVirtuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissements Virtuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissements Virtuels</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementsVirtuels_EtablissementsVirtuels()
	 * @model containment="true"
	 * @generated
	 */
	EList<EtablissementVirtuel> getEtablissementsVirtuels();

} // EtablissementsVirtuels
