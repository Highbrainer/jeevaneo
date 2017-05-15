/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Competence;
import fr.mutualite.rh.model.Evaluation;
import fr.mutualite.rh.model.EvaluationCompetence;
import fr.mutualite.rh.model.Evolution;
import fr.mutualite.rh.model.MutPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Competence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationCompetenceImpl#getCompetence <em>Competence</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationCompetenceImpl#getEval <em>Eval</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationCompetenceImpl#getEvol <em>Evol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationCompetenceImpl extends CDOObjectImpl implements EvaluationCompetence {
	/**
	 * The default value of the '{@link #getCompetence() <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetence()
	 * @generated
	 * @ordered
	 */
	protected static final Competence COMPETENCE_EDEFAULT = Competence.RESPECT_PROCEDURES_NORMES;

	/**
	 * The default value of the '{@link #getEval() <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEval()
	 * @generated
	 * @ordered
	 */
	protected static final Evaluation EVAL_EDEFAULT = Evaluation.NEUTRE;

	/**
	 * The default value of the '{@link #getEvol() <em>Evol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvol()
	 * @generated
	 * @ordered
	 */
	protected static final Evolution EVOL_EDEFAULT = Evolution.STABLE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationCompetenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.EVALUATION_COMPETENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Competence getCompetence() {
		return (Competence)eDynamicGet(MutPackage.EVALUATION_COMPETENCE__COMPETENCE, MutPackage.Literals.EVALUATION_COMPETENCE__COMPETENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompetence(Competence newCompetence) {
		eDynamicSet(MutPackage.EVALUATION_COMPETENCE__COMPETENCE, MutPackage.Literals.EVALUATION_COMPETENCE__COMPETENCE, newCompetence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEval() {
		return (Evaluation)eDynamicGet(MutPackage.EVALUATION_COMPETENCE__EVAL, MutPackage.Literals.EVALUATION_COMPETENCE__EVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEval(Evaluation newEval) {
		eDynamicSet(MutPackage.EVALUATION_COMPETENCE__EVAL, MutPackage.Literals.EVALUATION_COMPETENCE__EVAL, newEval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evolution getEvol() {
		return (Evolution)eDynamicGet(MutPackage.EVALUATION_COMPETENCE__EVOL, MutPackage.Literals.EVALUATION_COMPETENCE__EVOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvol(Evolution newEvol) {
		eDynamicSet(MutPackage.EVALUATION_COMPETENCE__EVOL, MutPackage.Literals.EVALUATION_COMPETENCE__EVOL, newEvol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.EVALUATION_COMPETENCE__COMPETENCE:
				return getCompetence();
			case MutPackage.EVALUATION_COMPETENCE__EVAL:
				return getEval();
			case MutPackage.EVALUATION_COMPETENCE__EVOL:
				return getEvol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MutPackage.EVALUATION_COMPETENCE__COMPETENCE:
				setCompetence((Competence)newValue);
				return;
			case MutPackage.EVALUATION_COMPETENCE__EVAL:
				setEval((Evaluation)newValue);
				return;
			case MutPackage.EVALUATION_COMPETENCE__EVOL:
				setEvol((Evolution)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MutPackage.EVALUATION_COMPETENCE__COMPETENCE:
				setCompetence(COMPETENCE_EDEFAULT);
				return;
			case MutPackage.EVALUATION_COMPETENCE__EVAL:
				setEval(EVAL_EDEFAULT);
				return;
			case MutPackage.EVALUATION_COMPETENCE__EVOL:
				setEvol(EVOL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MutPackage.EVALUATION_COMPETENCE__COMPETENCE:
				return getCompetence() != COMPETENCE_EDEFAULT;
			case MutPackage.EVALUATION_COMPETENCE__EVAL:
				return getEval() != EVAL_EDEFAULT;
			case MutPackage.EVALUATION_COMPETENCE__EVOL:
				return getEvol() != EVOL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EvaluationCompetenceImpl
