/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametrage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Parametrage#getCodesClient <em>Codes Client</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getParametrage()
 * @model
 * @generated
 */
public interface Parametrage extends EObject {
	/**
	 * Returns the value of the '<em><b>Codes Client</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.CodeClient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codes Client</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codes Client</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getParametrage_CodesClient()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeClient> getCodesClient();

} // Parametrage
