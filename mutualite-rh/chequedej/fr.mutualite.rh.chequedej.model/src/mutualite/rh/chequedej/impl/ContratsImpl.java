/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Optional;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Contrat;
import mutualite.rh.chequedej.Contrats;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ContratsImpl#getContrats <em>Contrats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContratsImpl extends MinimalEObjectImpl.Container implements Contrats {
	/**
	 * The cached value of the '{@link #getContrats() <em>Contrats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrats()
	 * @generated
	 * @ordered
	 */
	protected EList<Contrat> contrats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContratsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CONTRATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contrat> getContrats() {
		if (contrats == null) {
			contrats = new EObjectContainmentEList<Contrat>(Contrat.class, this, ChequedejPackage.CONTRATS__CONTRATS);
		}
		return contrats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Contrat getOrCreateContrat(int matricule) {
		Optional<Contrat> opt = getContrats().stream().filter(c -> c.getMatricule()==matricule).findAny();
		if(opt.isPresent()) {
			return opt.get();
		}
		Contrat contrat = ChequedejFactory.eINSTANCE.createContrat();
		contrat.setMatricule(matricule);
		getContrats().add(contrat);
		return contrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPartiel(int matricule) {
		Optional<Contrat> opt = getContrats().stream().filter(c -> c.getMatricule()==matricule).findAny();
		if(opt.isPresent()) {
			return opt.get().isPartiel();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.CONTRATS__CONTRATS:
				return ((InternalEList<?>)getContrats()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.CONTRATS__CONTRATS:
				return getContrats();
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
			case ChequedejPackage.CONTRATS__CONTRATS:
				getContrats().clear();
				getContrats().addAll((Collection<? extends Contrat>)newValue);
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
			case ChequedejPackage.CONTRATS__CONTRATS:
				getContrats().clear();
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
			case ChequedejPackage.CONTRATS__CONTRATS:
				return contrats != null && !contrats.isEmpty();
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
			case ChequedejPackage.CONTRATS___GET_OR_CREATE_CONTRAT__INT:
				return getOrCreateContrat((Integer)arguments.get(0));
			case ChequedejPackage.CONTRATS___IS_PARTIEL__INT:
				return isPartiel((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContratsImpl
