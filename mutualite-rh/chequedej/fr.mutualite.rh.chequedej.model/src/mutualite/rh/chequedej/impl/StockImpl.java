/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Collection;
import java.util.Date;

import mutualite.rh.chequedej.Cheque;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Stock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.StockImpl#getCheque <em>Cheque</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.StockImpl#getDerniereMaj <em>Derniere Maj</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StockImpl extends MinimalEObjectImpl.Container implements Stock {
	/**
	 * The cached value of the '{@link #getCheque() <em>Cheque</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheque()
	 * @generated
	 * @ordered
	 */
	protected EList<Cheque> cheque;

	/**
	 * The default value of the '{@link #getDerniereMaj() <em>Derniere Maj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerniereMaj()
	 * @generated
	 * @ordered
	 */
	protected static final Date DERNIERE_MAJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDerniereMaj() <em>Derniere Maj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerniereMaj()
	 * @generated
	 * @ordered
	 */
	protected Date derniereMaj = DERNIERE_MAJ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.STOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cheque> getCheque() {
		if (cheque == null) {
			cheque = new EObjectContainmentEList<Cheque>(Cheque.class, this, ChequedejPackage.STOCK__CHEQUE);
		}
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDerniereMaj() {
		return derniereMaj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerniereMaj(Date newDerniereMaj) {
		Date oldDerniereMaj = derniereMaj;
		derniereMaj = newDerniereMaj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.STOCK__DERNIERE_MAJ, oldDerniereMaj, derniereMaj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.STOCK__CHEQUE:
				return ((InternalEList<?>)getCheque()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.STOCK__CHEQUE:
				return getCheque();
			case ChequedejPackage.STOCK__DERNIERE_MAJ:
				return getDerniereMaj();
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
			case ChequedejPackage.STOCK__CHEQUE:
				getCheque().clear();
				getCheque().addAll((Collection<? extends Cheque>)newValue);
				return;
			case ChequedejPackage.STOCK__DERNIERE_MAJ:
				setDerniereMaj((Date)newValue);
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
			case ChequedejPackage.STOCK__CHEQUE:
				getCheque().clear();
				return;
			case ChequedejPackage.STOCK__DERNIERE_MAJ:
				setDerniereMaj(DERNIERE_MAJ_EDEFAULT);
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
			case ChequedejPackage.STOCK__CHEQUE:
				return cheque != null && !cheque.isEmpty();
			case ChequedejPackage.STOCK__DERNIERE_MAJ:
				return DERNIERE_MAJ_EDEFAULT == null ? derniereMaj != null : !DERNIERE_MAJ_EDEFAULT.equals(derniereMaj);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (derniereMaj: ");
		result.append(derniereMaj);
		result.append(')');
		return result.toString();
	}

} //StockImpl
