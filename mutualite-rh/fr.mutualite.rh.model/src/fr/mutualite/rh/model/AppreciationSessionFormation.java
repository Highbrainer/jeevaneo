/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appreciation Session Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.AppreciationSessionFormation#getValeur <em>Valeur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation <em>Session Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AppreciationSessionFormation#getIdFormation <em>Id Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AppreciationSessionFormation#getLibelleFormation <em>Libelle Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AppreciationSessionFormation#getDateFormation <em>Date Formation</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AppreciationSessionFormation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Appreciation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see fr.mutualite.rh.model.Appreciation
	 * @see #setValeur(Appreciation)
	 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation_Valeur()
	 * @model required="true"
	 * @generated
	 */
	Appreciation getValeur();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see fr.mutualite.rh.model.Appreciation
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(Appreciation value);

	/**
	 * Returns the value of the '<em><b>Session Formation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.SessionFormation#getAppreciations <em>Appreciations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Formation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Formation</em>' reference.
	 * @see #setSessionFormation(SessionFormation)
	 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation_SessionFormation()
	 * @see fr.mutualite.rh.model.SessionFormation#getAppreciations
	 * @model opposite="appreciations" required="true"
	 * @generated
	 */
	SessionFormation getSessionFormation();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation <em>Session Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Formation</em>' reference.
	 * @see #getSessionFormation()
	 * @generated
	 */
	void setSessionFormation(SessionFormation value);

	/**
	 * Returns the value of the '<em><b>Id Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Formation</em>' attribute.
	 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation_IdFormation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getIdFormation();

	/**
	 * Returns the value of the '<em><b>Libelle Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Formation</em>' attribute.
	 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation_LibelleFormation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getLibelleFormation();

	/**
	 * Returns the value of the '<em><b>Date Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Formation</em>' attribute.
	 * @see fr.mutualite.rh.model.MutPackage#getAppreciationSessionFormation_DateFormation()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	String getDateFormation();

} // AppreciationSessionFormation
