/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deje Mensuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.DejeMensuel#getDejesIndividuels <em>Dejes Individuels</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.DejeMensuel#getMois <em>Mois</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeMensuel()
 * @model
 * @generated
 */
public interface DejeMensuel extends EObject {
	/**
	 * Returns the value of the '<em><b>Dejes Individuels</b></em>' containment reference list.
	 * The list contents are of type {@link mutualite.rh.chequedej.DejeIndividuel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dejes Individuels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dejes Individuels</em>' containment reference list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeMensuel_DejesIndividuels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DejeIndividuel> getDejesIndividuels();

	/**
	 * Returns the value of the '<em><b>Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mois</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mois</em>' attribute.
	 * @see #setMois(String)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getDejeMensuel_Mois()
	 * @model
	 * @generated
	 */
	String getMois();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.DejeMensuel#getMois <em>Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mois</em>' attribute.
	 * @see #getMois()
	 * @generated
	 */
	void setMois(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String label();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DejeIndividuel getOrCreateDejeIndividuel(int matricule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Deje deje();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DejeIndividuel getDejeIndividuel(int matricule);

} // DejeMensuel
