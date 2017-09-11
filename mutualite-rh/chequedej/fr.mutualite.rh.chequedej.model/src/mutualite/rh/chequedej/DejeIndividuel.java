/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deje Individuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.DejeIndividuel#getNbEstimeJoursEntiers <em>Nb Estime Jours Entiers</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.DejeIndividuel#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.DejeIndividuel#getNbReelJoursEntiers <em>Nb Reel Jours Entiers</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeIndividuel()
 * @model
 * @generated
 */
public interface DejeIndividuel extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Estime Jours Entiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Estime Jours Entiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Estime Jours Entiers</em>' attribute.
	 * @see #setNbEstimeJoursEntiers(Integer)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeIndividuel_NbEstimeJoursEntiers()
	 * @model
	 * @generated
	 */
	Integer getNbEstimeJoursEntiers();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.DejeIndividuel#getNbEstimeJoursEntiers <em>Nb Estime Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Estime Jours Entiers</em>' attribute.
	 * @see #getNbEstimeJoursEntiers()
	 * @generated
	 */
	void setNbEstimeJoursEntiers(Integer value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeIndividuel_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.DejeIndividuel#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

	/**
	 * Returns the value of the '<em><b>Nb Reel Jours Entiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Reel Jours Entiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Reel Jours Entiers</em>' attribute.
	 * @see #setNbReelJoursEntiers(Integer)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeIndividuel_NbReelJoursEntiers()
	 * @model
	 * @generated
	 */
	Integer getNbReelJoursEntiers();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.DejeIndividuel#getNbReelJoursEntiers <em>Nb Reel Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Reel Jours Entiers</em>' attribute.
	 * @see #getNbReelJoursEntiers()
	 * @generated
	 */
	void setNbReelJoursEntiers(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DejeMensuel dejeMensuel();

} // DejeIndividuel
