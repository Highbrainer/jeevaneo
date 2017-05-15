/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Savoir Etre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getSavoirEtre <em>Savoir Etre</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getEval <em>Eval</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getEvol <em>Evol</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEvaluationSavoirEtre()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EvaluationSavoirEtre extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Savoir Etre</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.SavoirEtre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Savoir Etre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Savoir Etre</em>' attribute.
	 * @see fr.mutualite.rh.model.SavoirEtre
	 * @see #setSavoirEtre(SavoirEtre)
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationSavoirEtre_SavoirEtre()
	 * @model required="true"
	 * @generated
	 */
	SavoirEtre getSavoirEtre();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getSavoirEtre <em>Savoir Etre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Savoir Etre</em>' attribute.
	 * @see fr.mutualite.rh.model.SavoirEtre
	 * @see #getSavoirEtre()
	 * @generated
	 */
	void setSavoirEtre(SavoirEtre value);

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
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationSavoirEtre_Eval()
	 * @model default="-/+" required="true"
	 * @generated
	 */
	Evaluation getEval();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getEval <em>Eval</em>}' attribute.
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
	 * @see fr.mutualite.rh.model.MutPackage#getEvaluationSavoirEtre_Evol()
	 * @model default="STABLE" required="true"
	 * @generated
	 */
	Evolution getEvol();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EvaluationSavoirEtre#getEvol <em>Evol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evol</em>' attribute.
	 * @see fr.mutualite.rh.model.Evolution
	 * @see #getEvol()
	 * @generated
	 */
	void setEvol(Evolution value);

} // EvaluationSavoirEtre
