/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Evaluation;
import fr.mutualite.rh.model.EvaluationTenuePoste;
import fr.mutualite.rh.model.MutPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Tenue Poste</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationTenuePosteImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationTenuePosteImpl#getEval <em>Eval</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EvaluationTenuePosteImpl#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationTenuePosteImpl extends CDOObjectImpl implements EvaluationTenuePoste {
	/**
	 * The default value of the '{@link #getMission() <em>Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEval() <em>Eval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEval()
	 * @generated
	 * @ordered
	 */
	protected static final Evaluation EVAL_EDEFAULT = Evaluation.MOINS;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationTenuePosteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.EVALUATION_TENUE_POSTE;
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
	public String getMission() {
		return (String)eDynamicGet(MutPackage.EVALUATION_TENUE_POSTE__MISSION, MutPackage.Literals.EVALUATION_TENUE_POSTE__MISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMission(String newMission) {
		eDynamicSet(MutPackage.EVALUATION_TENUE_POSTE__MISSION, MutPackage.Literals.EVALUATION_TENUE_POSTE__MISSION, newMission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluation getEval() {
		return (Evaluation)eDynamicGet(MutPackage.EVALUATION_TENUE_POSTE__EVAL, MutPackage.Literals.EVALUATION_TENUE_POSTE__EVAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEval(Evaluation newEval) {
		eDynamicSet(MutPackage.EVALUATION_TENUE_POSTE__EVAL, MutPackage.Literals.EVALUATION_TENUE_POSTE__EVAL, newEval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return (String)eDynamicGet(MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE, MutPackage.Literals.EVALUATION_TENUE_POSTE__COMMENTAIRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		eDynamicSet(MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE, MutPackage.Literals.EVALUATION_TENUE_POSTE__COMMENTAIRE, newCommentaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.EVALUATION_TENUE_POSTE__MISSION:
				return getMission();
			case MutPackage.EVALUATION_TENUE_POSTE__EVAL:
				return getEval();
			case MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE:
				return getCommentaire();
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
			case MutPackage.EVALUATION_TENUE_POSTE__MISSION:
				setMission((String)newValue);
				return;
			case MutPackage.EVALUATION_TENUE_POSTE__EVAL:
				setEval((Evaluation)newValue);
				return;
			case MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE:
				setCommentaire((String)newValue);
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
			case MutPackage.EVALUATION_TENUE_POSTE__MISSION:
				setMission(MISSION_EDEFAULT);
				return;
			case MutPackage.EVALUATION_TENUE_POSTE__EVAL:
				setEval(EVAL_EDEFAULT);
				return;
			case MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
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
			case MutPackage.EVALUATION_TENUE_POSTE__MISSION:
				return MISSION_EDEFAULT == null ? getMission() != null : !MISSION_EDEFAULT.equals(getMission());
			case MutPackage.EVALUATION_TENUE_POSTE__EVAL:
				return getEval() != EVAL_EDEFAULT;
			case MutPackage.EVALUATION_TENUE_POSTE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? getCommentaire() != null : !COMMENTAIRE_EDEFAULT.equals(getCommentaire());
		}
		return super.eIsSet(featureID);
	}

} //EvaluationTenuePosteImpl
