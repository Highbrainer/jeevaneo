/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Objectif#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Objectif#getEcheance <em>Echeance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Objectif#getIndicateurs <em>Indicateurs</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Objectif#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Objectif#getEvaluationAtteinte <em>Evaluation Atteinte</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getObjectif()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Objectif extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectif_Libelle()
	 * @model required="true"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Objectif#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Echeance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echeance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echeance</em>' attribute.
	 * @see #setEcheance(String)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectif_Echeance()
	 * @model required="true"
	 * @generated
	 */
	String getEcheance();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Objectif#getEcheance <em>Echeance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echeance</em>' attribute.
	 * @see #getEcheance()
	 * @generated
	 */
	void setEcheance(String value);

	/**
	 * Returns the value of the '<em><b>Indicateurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateurs</em>' attribute.
	 * @see #setIndicateurs(String)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectif_Indicateurs()
	 * @model required="true"
	 * @generated
	 */
	String getIndicateurs();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Objectif#getIndicateurs <em>Indicateurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicateurs</em>' attribute.
	 * @see #getIndicateurs()
	 * @generated
	 */
	void setIndicateurs(String value);

	/**
	 * Returns the value of the '<em><b>Moyens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens</em>' attribute.
	 * @see #setMoyens(String)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectif_Moyens()
	 * @model required="true"
	 * @generated
	 */
	String getMoyens();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Objectif#getMoyens <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens</em>' attribute.
	 * @see #getMoyens()
	 * @generated
	 */
	void setMoyens(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Atteinte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.ObjectifPrecedent#getObjectif <em>Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Atteinte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Atteinte</em>' reference.
	 * @see #setEvaluationAtteinte(ObjectifPrecedent)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectif_EvaluationAtteinte()
	 * @see fr.mutualite.rh.model.ObjectifPrecedent#getObjectif
	 * @model opposite="objectif"
	 * @generated
	 */
	ObjectifPrecedent getEvaluationAtteinte();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Objectif#getEvaluationAtteinte <em>Evaluation Atteinte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Atteinte</em>' reference.
	 * @see #getEvaluationAtteinte()
	 * @generated
	 */
	void setEvaluationAtteinte(ObjectifPrecedent value);

} // Objectif
