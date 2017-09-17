/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Succursale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Succursale#getNumero <em>Numero</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Succursale#getIdEtablissement <em>Id Etablissement</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getSuccursale()
 * @model
 * @generated
 */
public interface Succursale extends EObject {
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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSuccursale_Numero()
	 * @model required="true"
	 * @generated
	 */
	int getNumero();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Succursale#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(int value);

	/**
	 * Returns the value of the '<em><b>Id Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Etablissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Etablissement</em>' attribute.
	 * @see #setIdEtablissement(Integer)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSuccursale_IdEtablissement()
	 * @model required="true"
	 * @generated
	 */
	Integer getIdEtablissement();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Succursale#getIdEtablissement <em>Id Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Etablissement</em>' attribute.
	 * @see #getIdEtablissement()
	 * @generated
	 */
	void setIdEtablissement(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CodeClient codeClient();

} // Succursale
