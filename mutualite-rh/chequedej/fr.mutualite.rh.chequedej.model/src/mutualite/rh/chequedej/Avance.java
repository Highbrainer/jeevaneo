/**
 */
package mutualite.rh.chequedej;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Avance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Avance#getNbCheques <em>Nb Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Avance#getDate <em>Date</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Avance#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getAvance()
 * @model
 * @generated
 */
public interface Avance extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cheques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cheques</em>' attribute.
	 * @see #setNbCheques(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getAvance_NbCheques()
	 * @model required="true"
	 * @generated
	 */
	int getNbCheques();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Avance#getNbCheques <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cheques</em>' attribute.
	 * @see #getNbCheques()
	 * @generated
	 */
	void setNbCheques(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getAvance_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Avance#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getAvance_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Avance#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DejeIndividuel dejeIndividuel();

} // Avance
