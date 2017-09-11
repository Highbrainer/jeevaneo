/**
 */
package mutualite.rh.chequedej;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historique Solde Individuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getDate <em>Date</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getComment <em>Comment</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeAvant <em>Solde Avant</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeApres <em>Solde Apres</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getHistoriqueSoldeIndividuel()
 * @model
 * @generated
 */
public interface HistoriqueSoldeIndividuel extends EObject {
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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getHistoriqueSoldeIndividuel_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getDate <em>Date</em>}' attribute.
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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getHistoriqueSoldeIndividuel_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Solde Avant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solde Avant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solde Avant</em>' attribute.
	 * @see #setSoldeAvant(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getHistoriqueSoldeIndividuel_SoldeAvant()
	 * @model required="true"
	 * @generated
	 */
	int getSoldeAvant();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeAvant <em>Solde Avant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solde Avant</em>' attribute.
	 * @see #getSoldeAvant()
	 * @generated
	 */
	void setSoldeAvant(int value);

	/**
	 * Returns the value of the '<em><b>Solde Apres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solde Apres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solde Apres</em>' attribute.
	 * @see #setSoldeApres(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getHistoriqueSoldeIndividuel_SoldeApres()
	 * @model required="true"
	 * @generated
	 */
	int getSoldeApres();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeApres <em>Solde Apres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solde Apres</em>' attribute.
	 * @see #getSoldeApres()
	 * @generated
	 */
	void setSoldeApres(int value);

} // HistoriqueSoldeIndividuel
