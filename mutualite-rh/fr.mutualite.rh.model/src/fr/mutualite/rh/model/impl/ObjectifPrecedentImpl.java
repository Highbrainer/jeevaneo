/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.EvaluationAtteinteObjectif;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Objectif;
import fr.mutualite.rh.model.ObjectifPrecedent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectif Precedent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifPrecedentImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifPrecedentImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifPrecedentImpl#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectifPrecedentImpl extends CDOObjectImpl implements ObjectifPrecedent {
	/**
	 * The default value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationAtteinteObjectif EVALUATION_EDEFAULT = EvaluationAtteinteObjectif.NON;

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
	protected ObjectifPrecedentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.OBJECTIF_PRECEDENT;
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
	public Objectif getObjectif() {
		return (Objectif)eDynamicGet(MutPackage.OBJECTIF_PRECEDENT__OBJECTIF, MutPackage.Literals.OBJECTIF_PRECEDENT__OBJECTIF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Objectif basicGetObjectif() {
		return (Objectif)eDynamicGet(MutPackage.OBJECTIF_PRECEDENT__OBJECTIF, MutPackage.Literals.OBJECTIF_PRECEDENT__OBJECTIF, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectif(Objectif newObjectif, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newObjectif, MutPackage.OBJECTIF_PRECEDENT__OBJECTIF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(Objectif newObjectif) {
		eDynamicSet(MutPackage.OBJECTIF_PRECEDENT__OBJECTIF, MutPackage.Literals.OBJECTIF_PRECEDENT__OBJECTIF, newObjectif);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluationAtteinteObjectif getEvaluation() {
		return (EvaluationAtteinteObjectif)eDynamicGet(MutPackage.OBJECTIF_PRECEDENT__EVALUATION, MutPackage.Literals.OBJECTIF_PRECEDENT__EVALUATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(EvaluationAtteinteObjectif newEvaluation) {
		eDynamicSet(MutPackage.OBJECTIF_PRECEDENT__EVALUATION, MutPackage.Literals.OBJECTIF_PRECEDENT__EVALUATION, newEvaluation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return (String)eDynamicGet(MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE, MutPackage.Literals.OBJECTIF_PRECEDENT__COMMENTAIRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		eDynamicSet(MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE, MutPackage.Literals.OBJECTIF_PRECEDENT__COMMENTAIRE, newCommentaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				Objectif objectif = basicGetObjectif();
				if (objectif != null)
					msgs = ((InternalEObject)objectif).eInverseRemove(this, MutPackage.OBJECTIF__EVALUATION_ATTEINTE, Objectif.class, msgs);
				return basicSetObjectif((Objectif)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				return basicSetObjectif(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				if (resolve) return getObjectif();
				return basicGetObjectif();
			case MutPackage.OBJECTIF_PRECEDENT__EVALUATION:
				return getEvaluation();
			case MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE:
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
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				setObjectif((Objectif)newValue);
				return;
			case MutPackage.OBJECTIF_PRECEDENT__EVALUATION:
				setEvaluation((EvaluationAtteinteObjectif)newValue);
				return;
			case MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE:
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
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				setObjectif((Objectif)null);
				return;
			case MutPackage.OBJECTIF_PRECEDENT__EVALUATION:
				setEvaluation(EVALUATION_EDEFAULT);
				return;
			case MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE:
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
			case MutPackage.OBJECTIF_PRECEDENT__OBJECTIF:
				return basicGetObjectif() != null;
			case MutPackage.OBJECTIF_PRECEDENT__EVALUATION:
				return getEvaluation() != EVALUATION_EDEFAULT;
			case MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? getCommentaire() != null : !COMMENTAIRE_EDEFAULT.equals(getCommentaire());
		}
		return super.eIsSet(featureID);
	}

} //ObjectifPrecedentImpl
