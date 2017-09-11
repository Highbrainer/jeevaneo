/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Choix#getChoixIndividuels <em>Choix Individuels</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getChoix()
 * @model
 * @generated
 */
public interface Choix extends EObject {
	/**
	 * Returns the value of the '<em><b>Choix Individuels</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.ChoixIndividuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choix Individuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choix Individuels</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChoix_ChoixIndividuels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChoixIndividuel> getChoixIndividuels();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ChoixIndividuel getChoix(int matricule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ChoixIndividuel getOrCreateChoix(int matricule);

} // Choix
