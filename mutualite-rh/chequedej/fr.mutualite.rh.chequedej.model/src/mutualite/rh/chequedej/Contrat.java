/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contrat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Contrat#getTempsTravailMensuel <em>Temps Travail Mensuel</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Contrat#isPartiel <em>Partiel</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Contrat#getMatricule <em>Matricule</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getContrat()
 * @model
 * @generated
 */
public interface Contrat extends EObject {
	/**
	 * Returns the value of the '<em><b>Temps Travail Mensuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Travail Mensuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Travail Mensuel</em>' attribute.
	 * @see #setTempsTravailMensuel(Float)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getContrat_TempsTravailMensuel()
	 * @model
	 * @generated
	 */
	Float getTempsTravailMensuel();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Contrat#getTempsTravailMensuel <em>Temps Travail Mensuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Travail Mensuel</em>' attribute.
	 * @see #getTempsTravailMensuel()
	 * @generated
	 */
	void setTempsTravailMensuel(Float value);

	/**
	 * Returns the value of the '<em><b>Partiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partiel</em>' attribute.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getContrat_Partiel()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isPartiel();

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getContrat_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Contrat#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

} // Contrat
