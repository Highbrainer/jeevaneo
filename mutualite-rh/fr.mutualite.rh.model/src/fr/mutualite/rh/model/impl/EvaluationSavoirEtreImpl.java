/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Evaluation;
import fr.mutualite.rh.model.EvaluationSavoirEtre;
import fr.mutualite.rh.model.Evolution;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SavoirEtre;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Savoir Etre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationSavoirEtreImpl#getSavoirEtre <em>Savoir Etre</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationSavoirEtreImpl#getEval <em>Eval</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationSavoirEtreImpl#getEvol <em>Evol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationSavoirEtreImpl extends CDOObjectImpl implements EvaluationSavoirEtre {
	/**
	 * The default value of the '{@link #getSavoirEtre() <em>Savoir Etre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavoirEtre()
	 * @generated
	 * @ordered
	 */
	protected static final SavoirEtre SAVOIR_ETRE_EDEFAULT = SavoirEtre.ASSIDUITE;

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
	protected EvaluationSavoirEtreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.EVALUATION_SAVOIR_ETRE;
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
	public SavoirEtre getSavoirEtre() {
		return (SavoirEtre)eDynamicGet(MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSavoirEtre(SavoirEtre newSavoirEtre) {
		eDynamicSet(MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE, newSavoirEtre);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEval() {
		return (Evaluation)eDynamicGet(MutPackage.EVALUATION_SAVOIR_ETRE__EVAL, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__EVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEval(Evaluation newEval) {
		eDynamicSet(MutPackage.EVALUATION_SAVOIR_ETRE__EVAL, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__EVAL, newEval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evolution getEvol() {
		return (Evolution)eDynamicGet(MutPackage.EVALUATION_SAVOIR_ETRE__EVOL, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__EVOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvol(Evolution newEvol) {
		eDynamicSet(MutPackage.EVALUATION_SAVOIR_ETRE__EVOL, MutPackage.Literals.EVALUATION_SAVOIR_ETRE__EVOL, newEvol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE:
				return getSavoirEtre();
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVAL:
				return getEval();
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVOL:
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
			case MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE:
				setSavoirEtre((SavoirEtre)newValue);
				return;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVAL:
				setEval((Evaluation)newValue);
				return;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVOL:
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
			case MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE:
				setSavoirEtre(SAVOIR_ETRE_EDEFAULT);
				return;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVAL:
				setEval(EVAL_EDEFAULT);
				return;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVOL:
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
			case MutPackage.EVALUATION_SAVOIR_ETRE__SAVOIR_ETRE:
				return getSavoirEtre() != SAVOIR_ETRE_EDEFAULT;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVAL:
				return getEval() != EVAL_EDEFAULT;
			case MutPackage.EVALUATION_SAVOIR_ETRE__EVOL:
				return getEvol() != EVOL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EvaluationSavoirEtreImpl
