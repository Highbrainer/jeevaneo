/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Cheque#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Cheque#getNbCheques <em>Nb Cheques</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getCheque()
 * @model
 * @generated
 */
public interface Cheque extends EObject {
	/**
	 * Returns the value of the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricule</em>' attribute.
	 * @see #setMatricule(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCheque_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Cheque#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

	/**
	 * Returns the value of the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cheques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cheques</em>' attribute.
	 * @see #setNbCheques(Integer)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getCheque_NbCheques()
	 * @model required="true"
	 * @generated
	 */
	Integer getNbCheques();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Cheque#getNbCheques <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cheques</em>' attribute.
	 * @see #getNbCheques()
	 * @generated
	 */
	void setNbCheques(Integer value);

} // Cheque
