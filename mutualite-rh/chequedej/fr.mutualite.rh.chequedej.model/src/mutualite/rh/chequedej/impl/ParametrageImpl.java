/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Collection;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Parametrage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametrage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ParametrageImpl#getCodesClient <em>Codes Client</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParametrageImpl extends MinimalEObjectImpl.Container implements Parametrage {
	/**
	 * The cached value of the '{@link #getCodesClient() <em>Codes Client</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodesClient()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeClient> codesClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametrageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.PARAMETRAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeClient> getCodesClient() {
		if (codesClient == null) {
			codesClient = new EObjectContainmentEList<CodeClient>(CodeClient.class, this, ChequedejPackage.PARAMETRAGE__CODES_CLIENT);
		}
		return codesClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.PARAMETRAGE__CODES_CLIENT:
				return ((InternalEList<?>)getCodesClient()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.PARAMETRAGE__CODES_CLIENT:
				return getCodesClient();
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
			case ChequedejPackage.PARAMETRAGE__CODES_CLIENT:
				getCodesClient().clear();
				getCodesClient().addAll((Collection<? extends CodeClient>)newValue);
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
			case ChequedejPackage.PARAMETRAGE__CODES_CLIENT:
				getCodesClient().clear();
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
			case ChequedejPackage.PARAMETRAGE__CODES_CLIENT:
				return codesClient != null && !codesClient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParametrageImpl
