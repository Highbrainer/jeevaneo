/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Optional;

import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Deje;
import mutualite.rh.chequedej.DejeMensuel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deje</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeImpl#getDejesMensuels <em>Dejes Mensuels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DejeImpl extends MinimalEObjectImpl.Container implements Deje {
	/**
	 * The cached value of the '{@link #getDejesMensuels() <em>Dejes Mensuels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDejesMensuels()
	 * @generated
	 * @ordered
	 */
	protected EList<DejeMensuel> dejesMensuels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DejeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.DEJE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DejeMensuel> getDejesMensuels() {
		if (dejesMensuels == null) {
			dejesMensuels = new EObjectContainmentEList<DejeMensuel>(DejeMensuel.class, this, ChequedejPackage.DEJE__DEJES_MENSUELS);
		}
		return dejesMensuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DejeMensuel getOrCreateDejeMensuel(String mois) {
		Optional<DejeMensuel> opt = getDejesMensuels().stream().filter(dm -> dm.getMois().equals(mois)).findAny();
		if(opt.isPresent()) {
			return opt.get();
		}
		DejeMensuel dm = ChequedejFactory.eINSTANCE.createDejeMensuel();
		dm.setMois(mois);
		getDejesMensuels().add(dm);
		return dm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChequeDej root() {
		ChequeDej root = (ChequeDej) eContainer();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.DEJE__DEJES_MENSUELS:
				return ((InternalEList<?>)getDejesMensuels()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.DEJE__DEJES_MENSUELS:
				return getDejesMensuels();
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
			case ChequedejPackage.DEJE__DEJES_MENSUELS:
				getDejesMensuels().clear();
				getDejesMensuels().addAll((Collection<? extends DejeMensuel>)newValue);
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
			case ChequedejPackage.DEJE__DEJES_MENSUELS:
				getDejesMensuels().clear();
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
			case ChequedejPackage.DEJE__DEJES_MENSUELS:
				return dejesMensuels != null && !dejesMensuels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ChequedejPackage.DEJE___GET_OR_CREATE_DEJE_MENSUEL__STRING:
				return getOrCreateDejeMensuel((String)arguments.get(0));
			case ChequedejPackage.DEJE___ROOT:
				return root();
		}
		return super.eInvoke(operationID, arguments);
	}

} //DejeImpl
