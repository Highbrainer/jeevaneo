/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Collection;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.EtablissementsVirtuels;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etablissements Virtuels</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.EtablissementsVirtuelsImpl#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtablissementsVirtuelsImpl extends MinimalEObjectImpl.Container implements EtablissementsVirtuels {
	/**
	 * The cached value of the '{@link #getEtablissementsVirtuels() <em>Etablissements Virtuels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissementsVirtuels()
	 * @generated
	 * @ordered
	 */
	protected EList<EtablissementVirtuel> etablissementsVirtuels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementsVirtuelsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.ETABLISSEMENTS_VIRTUELS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EtablissementVirtuel> getEtablissementsVirtuels() {
		if (etablissementsVirtuels == null) {
			etablissementsVirtuels = new EObjectContainmentEList<EtablissementVirtuel>(EtablissementVirtuel.class, this, ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS);
		}
		return etablissementsVirtuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS:
				return ((InternalEList<?>)getEtablissementsVirtuels()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS:
				return getEtablissementsVirtuels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS:
				getEtablissementsVirtuels().clear();
				getEtablissementsVirtuels().addAll((Collection<? extends EtablissementVirtuel>)newValue);
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
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS:
				getEtablissementsVirtuels().clear();
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
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS:
				return etablissementsVirtuels != null && !etablissementsVirtuels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EtablissementsVirtuelsImpl
