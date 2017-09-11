/**
 */
package mutualite.rh.chequedej;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Stock#getCheque <em>Cheque</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Stock#getDerniereMaj <em>Derniere Maj</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getStock()
 * @model
 * @generated
 */
public interface Stock extends EObject {
	/**
	 * Returns the value of the '<em><b>Cheque</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.Cheque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cheque</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cheque</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getStock_Cheque()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cheque> getCheque();

	/**
	 * Returns the value of the '<em><b>Derniere Maj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derniere Maj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derniere Maj</em>' attribute.
	 * @see #setDerniereMaj(Date)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getStock_DerniereMaj()
	 * @model
	 * @generated
	 */
	Date getDerniereMaj();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Stock#getDerniereMaj <em>Derniere Maj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derniere Maj</em>' attribute.
	 * @see #getDerniereMaj()
	 * @generated
	 */
	void setDerniereMaj(Date value);

} // Stock
