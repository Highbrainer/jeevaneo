/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Contrats#getContrats <em>Contrats</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getContrats()
 * @model
 * @generated
 */
public interface Contrats extends EObject {
	/**
	 * Returns the value of the '<em><b>Contrats</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.Contrat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrats</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getContrats_Contrats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contrat> getContrats();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Contrat getOrCreateContrat(int matricule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isPartiel(int matricule);

} // Contrats
