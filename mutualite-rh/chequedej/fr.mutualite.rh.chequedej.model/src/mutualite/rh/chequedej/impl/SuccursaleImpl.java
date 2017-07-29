/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Succursale;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Succursale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.SuccursaleImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.SuccursaleImpl#getIdEtablissement <em>Id Etablissement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuccursaleImpl extends MinimalEObjectImpl.Container implements Succursale {
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
	 * The default value of the '{@link #getIdEtablissement() <em>Id Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEtablissement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_ETABLISSEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdEtablissement() <em>Id Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdEtablissement()
	 * @generated
	 * @ordered
	 */
	protected Integer idEtablissement = ID_ETABLISSEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccursaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.SUCCURSALE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.SUCCURSALE__NUMERO, oldNumero, numero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdEtablissement() {
		return idEtablissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdEtablissement(Integer newIdEtablissement) {
		Integer oldIdEtablissement = idEtablissement;
		idEtablissement = newIdEtablissement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.SUCCURSALE__ID_ETABLISSEMENT, oldIdEtablissement, idEtablissement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.SUCCURSALE__NUMERO:
				return getNumero();
			case ChequedejPackage.SUCCURSALE__ID_ETABLISSEMENT:
				return getIdEtablissement();
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
			case ChequedejPackage.SUCCURSALE__NUMERO:
				setNumero((Integer)newValue);
				return;
			case ChequedejPackage.SUCCURSALE__ID_ETABLISSEMENT:
				setIdEtablissement((Integer)newValue);
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
			case ChequedejPackage.SUCCURSALE__NUMERO:
				setNumero(NUMERO_EDEFAULT);
				return;
			case ChequedejPackage.SUCCURSALE__ID_ETABLISSEMENT:
				setIdEtablissement(ID_ETABLISSEMENT_EDEFAULT);
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
			case ChequedejPackage.SUCCURSALE__NUMERO:
				return numero != NUMERO_EDEFAULT;
			case ChequedejPackage.SUCCURSALE__ID_ETABLISSEMENT:
				return ID_ETABLISSEMENT_EDEFAULT == null ? idEtablissement != null : !ID_ETABLISSEMENT_EDEFAULT.equals(idEtablissement);
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
		result.append(", idEtablissement: ");
		result.append(idEtablissement);
		result.append(')');
		return result.toString();
	}

} //SuccursaleImpl
