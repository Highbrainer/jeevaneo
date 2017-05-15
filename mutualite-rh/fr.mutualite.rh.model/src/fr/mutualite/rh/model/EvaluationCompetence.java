/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Competence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.EvaluationCompetence#getCompetence <em>Competence</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EvaluationCompetence#getEval <em>Eval</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EvaluationCompetence#getEvol <em>Evol</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEvaluationCompetence()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EvaluationCompetence extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Competence</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Competence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Competence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competence</em>' attribute.
	 * @see fr.mutualite.rh.model.Competence
	 * @see #setCompetence(Competence)
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationCompetence_Competence()
	 * @model required="true"
	 * @generated
	 */
	Competence getCompetence();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationCompetence#getCompetence <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competence</em>' attribute.
	 * @see fr.mutualite.rh.model.Competence
	 * @see #getCompetence()
	 * @generated
	 */
	void setCompetence(Competence value);

	/**
	 * Returns the value of the '<em><b>Eval</b></em>' attribute.
	 * The default value is <code>"-/+"</code>.
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
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationCompetence_Eval()
	 * @model default="-/+" required="true"
	 * @generated
	 */
	Evaluation getEval();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationCompetence#getEval <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eval</em>' attribute.
	 * @see fr.mutualite.rh.model.Evaluation
	 * @see #getEval()
	 * @generated
	 */
	void setEval(Evaluation value);

	/**
	 * Returns the value of the '<em><b>Evol</b></em>' attribute.
	 * The default value is <code>"STABLE"</code>.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.Evolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evol</em>' attribute.
	 * @see fr.mutualite.rh.model.Evolution
	 * @see #setEvol(Evolution)
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationCompetence_Evol()
	 * @model default="STABLE" required="true"
	 * @generated
	 */
	Evolution getEvol();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationCompetence#getEvol <em>Evol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evol</em>' attribute.
	 * @see fr.mutualite.rh.model.Evolution
	 * @see #getEvol()
	 * @generated
	 */
	void setEvol(Evolution value);

} // EvaluationCompetence
