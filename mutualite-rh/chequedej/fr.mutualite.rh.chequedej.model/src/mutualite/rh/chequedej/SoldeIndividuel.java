/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solde Individuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.SoldeIndividuel#getNbCheques <em>Nb Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.SoldeIndividuel#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.SoldeIndividuel#getHistorique <em>Historique</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.SoldeIndividuel#getAnnee <em>Annee</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getSoldeIndividuel()
 * @model
 * @generated
 */
public interface SoldeIndividuel extends EObject {
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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSoldeIndividuel_NbCheques()
	 * @model required="true"
	 * @generated
	 */
	int getNbCheques();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.SoldeIndividuel#getNbCheques <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cheques</em>' attribute.
	 * @see #getNbCheques()
	 * @generated
	 */
	void setNbCheques(int value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSoldeIndividuel_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.SoldeIndividuel#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

	/**
	 * Returns the value of the '<em><b>Historique</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historique</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSoldeIndividuel_Historique()
	 * @model containment="true"
	 * @generated
	 */
	EList<HistoriqueSoldeIndividuel> getHistorique();

	/**
	 * Returns the value of the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee</em>' attribute.
	 * @see #setAnnee(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getSoldeIndividuel_Annee()
	 * @model required="true"
	 * @generated
	 */
	int getAnnee();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.SoldeIndividuel#getAnnee <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee</em>' attribute.
	 * @see #getAnnee()
	 * @generated
	 */
	void setAnnee(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void incremente(int delta, String comment);

} // SoldeIndividuel
