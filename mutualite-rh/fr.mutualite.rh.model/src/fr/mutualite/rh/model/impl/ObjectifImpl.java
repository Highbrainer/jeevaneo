/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Objectif;
import fr.mutualite.rh.model.ObjectifPrecedent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifImpl#getEcheance <em>Echeance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifImpl#getIndicateurs <em>Indicateurs</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifImpl#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.ObjectifImpl#getEvaluationAtteinte <em>Evaluation Atteinte</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectifImpl extends CDOObjectImpl implements Objectif {
	/**
	 * The default value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEcheance() <em>Echeance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcheance()
	 * @generated
	 * @ordered
	 */
	protected static final String ECHEANCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIndicateurs() <em>Indicateurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicateurs()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATEURS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.OBJECTIF;
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
	public String getLibelle() {
		return (String)eDynamicGet(MutPackage.OBJECTIF__LIBELLE, MutPackage.Literals.OBJECTIF__LIBELLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		eDynamicSet(MutPackage.OBJECTIF__LIBELLE, MutPackage.Literals.OBJECTIF__LIBELLE, newLibelle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcheance() {
		return (String)eDynamicGet(MutPackage.OBJECTIF__ECHEANCE, MutPackage.Literals.OBJECTIF__ECHEANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcheance(String newEcheance) {
		eDynamicSet(MutPackage.OBJECTIF__ECHEANCE, MutPackage.Literals.OBJECTIF__ECHEANCE, newEcheance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicateurs() {
		return (String)eDynamicGet(MutPackage.OBJECTIF__INDICATEURS, MutPackage.Literals.OBJECTIF__INDICATEURS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicateurs(String newIndicateurs) {
		eDynamicSet(MutPackage.OBJECTIF__INDICATEURS, MutPackage.Literals.OBJECTIF__INDICATEURS, newIndicateurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyens() {
		return (String)eDynamicGet(MutPackage.OBJECTIF__MOYENS, MutPackage.Literals.OBJECTIF__MOYENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyens(String newMoyens) {
		eDynamicSet(MutPackage.OBJECTIF__MOYENS, MutPackage.Literals.OBJECTIF__MOYENS, newMoyens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifPrecedent getEvaluationAtteinte() {
		return (ObjectifPrecedent)eDynamicGet(MutPackage.OBJECTIF__EVALUATION_ATTEINTE, MutPackage.Literals.OBJECTIF__EVALUATION_ATTEINTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifPrecedent basicGetEvaluationAtteinte() {
		return (ObjectifPrecedent)eDynamicGet(MutPackage.OBJECTIF__EVALUATION_ATTEINTE, MutPackage.Literals.OBJECTIF__EVALUATION_ATTEINTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvaluationAtteinte(ObjectifPrecedent newEvaluationAtteinte, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEvaluationAtteinte, MutPackage.OBJECTIF__EVALUATION_ATTEINTE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationAtteinte(ObjectifPrecedent newEvaluationAtteinte) {
		eDynamicSet(MutPackage.OBJECTIF__EVALUATION_ATTEINTE, MutPackage.Literals.OBJECTIF__EVALUATION_ATTEINTE, newEvaluationAtteinte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				ObjectifPrecedent evaluationAtteinte = basicGetEvaluationAtteinte();
				if (evaluationAtteinte != null)
					msgs = ((InternalEObject)evaluationAtteinte).eInverseRemove(this, MutPackage.OBJECTIF_PRECEDENT__OBJECTIF, ObjectifPrecedent.class, msgs);
				return basicSetEvaluationAtteinte((ObjectifPrecedent)otherEnd, msgs);
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
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				return basicSetEvaluationAtteinte(null, msgs);
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
			case MutPackage.OBJECTIF__LIBELLE:
				return getLibelle();
			case MutPackage.OBJECTIF__ECHEANCE:
				return getEcheance();
			case MutPackage.OBJECTIF__INDICATEURS:
				return getIndicateurs();
			case MutPackage.OBJECTIF__MOYENS:
				return getMoyens();
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				if (resolve) return getEvaluationAtteinte();
				return basicGetEvaluationAtteinte();
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
			case MutPackage.OBJECTIF__LIBELLE:
				setLibelle((String)newValue);
				return;
			case MutPackage.OBJECTIF__ECHEANCE:
				setEcheance((String)newValue);
				return;
			case MutPackage.OBJECTIF__INDICATEURS:
				setIndicateurs((String)newValue);
				return;
			case MutPackage.OBJECTIF__MOYENS:
				setMoyens((String)newValue);
				return;
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				setEvaluationAtteinte((ObjectifPrecedent)newValue);
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
			case MutPackage.OBJECTIF__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case MutPackage.OBJECTIF__ECHEANCE:
				setEcheance(ECHEANCE_EDEFAULT);
				return;
			case MutPackage.OBJECTIF__INDICATEURS:
				setIndicateurs(INDICATEURS_EDEFAULT);
				return;
			case MutPackage.OBJECTIF__MOYENS:
				setMoyens(MOYENS_EDEFAULT);
				return;
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				setEvaluationAtteinte((ObjectifPrecedent)null);
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
			case MutPackage.OBJECTIF__LIBELLE:
				return LIBELLE_EDEFAULT == null ? getLibelle() != null : !LIBELLE_EDEFAULT.equals(getLibelle());
			case MutPackage.OBJECTIF__ECHEANCE:
				return ECHEANCE_EDEFAULT == null ? getEcheance() != null : !ECHEANCE_EDEFAULT.equals(getEcheance());
			case MutPackage.OBJECTIF__INDICATEURS:
				return INDICATEURS_EDEFAULT == null ? getIndicateurs() != null : !INDICATEURS_EDEFAULT.equals(getIndicateurs());
			case MutPackage.OBJECTIF__MOYENS:
				return MOYENS_EDEFAULT == null ? getMoyens() != null : !MOYENS_EDEFAULT.equals(getMoyens());
			case MutPackage.OBJECTIF__EVALUATION_ATTEINTE:
				return basicGetEvaluationAtteinte() != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectifImpl
