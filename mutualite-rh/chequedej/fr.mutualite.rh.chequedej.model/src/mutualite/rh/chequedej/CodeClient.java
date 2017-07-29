/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.CodeClient#getSuccursales <em>Succursales</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.CodeClient#getNumero <em>Numero</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.CodeClient#getLibelle <em>Libelle</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getCodeClient()
 * @model
 * @generated
 */
public interface CodeClient extends EObject {
	/**
	 * Returns the value of the '<em><b>Succursales</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.Succursale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succursales</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succursales</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCodeClient_Succursales()
	 * @model containment="true"
	 * @generated
	 */
	EList<Succursale> getSuccursales();

	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCodeClient_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.CodeClient#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCodeClient_Libelle()
	 * @model required="true"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.CodeClient#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

} // CodeClient
