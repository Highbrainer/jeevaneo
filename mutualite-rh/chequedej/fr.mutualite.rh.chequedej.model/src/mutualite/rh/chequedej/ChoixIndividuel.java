/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choix Individuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.ChoixIndividuel#getNbMaxCheques <em>Nb Max Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.ChoixIndividuel#getMatricule <em>Matricule</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getChoixIndividuel()
 * @model
 * @generated
 */
public interface ChoixIndividuel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Max Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Max Cheques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Max Cheques</em>' attribute.
	 * @see #setNbMaxCheques(Integer)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChoixIndividuel_NbMaxCheques()
	 * @model
	 * @generated
	 */
	Integer getNbMaxCheques();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChoixIndividuel#getNbMaxCheques <em>Nb Max Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Max Cheques</em>' attribute.
	 * @see #getNbMaxCheques()
	 * @generated
	 */
	void setNbMaxCheques(Integer value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getChoixIndividuel_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.ChoixIndividuel#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

} // ChoixIndividuel
