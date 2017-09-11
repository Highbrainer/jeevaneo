/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Optional;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.ChoixIndividuel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ChoixImpl#getChoixIndividuels <em>Choix Individuels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoixImpl extends MinimalEObjectImpl.Container implements Choix {
	/**
	 * The cached value of the '{@link #getChoixIndividuels() <em>Choix Individuels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoixIndividuels()
	 * @generated
	 * @ordered
	 */
	protected EList<ChoixIndividuel> choixIndividuels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CHOIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChoixIndividuel> getChoixIndividuels() {
		if (choixIndividuels == null) {
			choixIndividuels = new EObjectContainmentEList<ChoixIndividuel>(ChoixIndividuel.class, this, ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS);
		}
		return choixIndividuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChoixIndividuel getChoix(int matricule) {
		Optional<ChoixIndividuel> opt = getChoixIndividuels().stream().filter(c -> c.getMatricule()==matricule).findAny();
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ChoixIndividuel getOrCreateChoix(int matricule) {
		ChoixIndividuel choix = getChoix(matricule);
		if(null!=choix) {
			return choix;
		}
		choix = ChequedejFactory.eINSTANCE.createChoixIndividuel();
		choix.setMatricule(matricule);
		getChoixIndividuels().add(choix);
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS:
				return ((InternalEList<?>)getChoixIndividuels()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS:
				return getChoixIndividuels();
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
			case ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS:
				getChoixIndividuels().clear();
				getChoixIndividuels().addAll((Collection<? extends ChoixIndividuel>)newValue);
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
			case ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS:
				getChoixIndividuels().clear();
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
			case ChequedejPackage.CHOIX__CHOIX_INDIVIDUELS:
				return choixIndividuels != null && !choixIndividuels.isEmpty();
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
			case ChequedejPackage.CHOIX___GET_CHOIX__INT:
				return getChoix((Integer)arguments.get(0));
			case ChequedejPackage.CHOIX___GET_OR_CREATE_CHOIX__INT:
				return getOrCreateChoix((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ChoixImpl
