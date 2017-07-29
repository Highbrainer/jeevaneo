/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Collection;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Succursale;

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
 * An implementation of the model object '<em><b>Code Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.CodeClientImpl#getSuccursales <em>Succursales</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CodeClientImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CodeClientImpl#getLibelle <em>Libelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeClientImpl extends MinimalEObjectImpl.Container implements CodeClient {
	/**
	 * The cached value of the '{@link #getSuccursales() <em>Succursales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccursales()
	 * @generated
	 * @ordered
	 */
	protected EList<Succursale> succursales;

	/**
	 * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumero()
	 * @generated
	 * @ordered
	 */
	protected int numero = NUMERO_EDEFAULT;

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
	 * The cached value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected String libelle = LIBELLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CODE_CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Succursale> getSuccursales() {
		if (succursales == null) {
			succursales = new EObjectContainmentEList<Succursale>(Succursale.class, this, ChequedejPackage.CODE_CLIENT__SUCCURSALES);
		}
		return succursales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumero(int newNumero) {
		int oldNumero = numero;
		numero = newNumero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CODE_CLIENT__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		String oldLibelle = libelle;
		libelle = newLibelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CODE_CLIENT__LIBELLE, oldLibelle, libelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.CODE_CLIENT__SUCCURSALES:
				return ((InternalEList<?>)getSuccursales()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.CODE_CLIENT__SUCCURSALES:
				return getSuccursales();
			case ChequedejPackage.CODE_CLIENT__NUMERO:
				return getNumero();
			case ChequedejPackage.CODE_CLIENT__LIBELLE:
				return getLibelle();
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
			case ChequedejPackage.CODE_CLIENT__SUCCURSALES:
				getSuccursales().clear();
				getSuccursales().addAll((Collection<? extends Succursale>)newValue);
				return;
			case ChequedejPackage.CODE_CLIENT__NUMERO:
				setNumero((Integer)newValue);
				return;
			case ChequedejPackage.CODE_CLIENT__LIBELLE:
				setLibelle((String)newValue);
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
			case ChequedejPackage.CODE_CLIENT__SUCCURSALES:
				getSuccursales().clear();
				return;
			case ChequedejPackage.CODE_CLIENT__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case ChequedejPackage.CODE_CLIENT__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
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
			case ChequedejPackage.CODE_CLIENT__SUCCURSALES:
				return succursales != null && !succursales.isEmpty();
			case ChequedejPackage.CODE_CLIENT__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case ChequedejPackage.CODE_CLIENT__LIBELLE:
				return LIBELLE_EDEFAULT == null ? libelle != null : !LIBELLE_EDEFAULT.equals(libelle);
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
		result.append(" (numero: ");
		result.append(numero);
		result.append(", libelle: ");
		result.append(libelle);
		result.append(')');
		return result.toString();
	}

} //CodeClientImpl
