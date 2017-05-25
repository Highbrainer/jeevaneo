/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Tenue Poste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.EvaluationTenuePoste#getMission <em>Mission</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EvaluationTenuePoste#getEval <em>Eval</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEvaluationTenuePoste()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EvaluationTenuePoste extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' attribute.
	 * @see #setMission(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationTenuePoste_Mission()
	 * @model required="true"
	 * @generated
	 */
	String getMission();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationTenuePoste#getMission <em>Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' attribute.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(String value);

	/**
	 * Returns the value of the '<em><b>Eval</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Evaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eval</em>' attribute.
	 * @see fr.mutualite.rh.model.Evaluation
	 * @see #setEval(Evaluation)
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationTenuePoste_Eval()
	 * @model required="true"
	 * @generated
	 */
	Evaluation getEval();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationTenuePoste#getEval <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval</em>' attribute.
	 * @see fr.mutualite.rh.model.Evaluation
	 * @see #getEval()
	 * @generated
	 */
	void setEval(Evaluation value);

} // EvaluationTenuePoste
