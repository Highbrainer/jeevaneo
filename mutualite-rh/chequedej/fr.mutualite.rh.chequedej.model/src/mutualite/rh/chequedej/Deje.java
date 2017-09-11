/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deje</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Deje#getDejesMensuels <em>Dejes Mensuels</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getDeje()
 * @model
 * @generated
 */
public interface Deje extends EObject {
	/**
	 * Returns the value of the '<em><b>Dejes Mensuels</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.DejeMensuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dejes Mensuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dejes Mensuels</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDeje_DejesMensuels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DejeMensuel> getDejesMensuels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DejeMensuel getOrCreateDejeMensuel(String mois);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ChequeDej root();

} // Deje
