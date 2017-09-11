/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.Cheque;
import mutualite.rh.chequedej.ChequedejPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeImpl#getNbCheques <em>Nb Cheques</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequeImpl extends MinimalEObjectImpl.Container implements Cheque {
	/**
	 * The default value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected int matricule = MATRICULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NB_CHEQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected Integer nbCheques = NB_CHEQUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CHEQUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		int oldMatricule = matricule;
		matricule = newMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNbCheques() {
		return nbCheques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCheques(Integer newNbCheques) {
		Integer oldNbCheques = nbCheques;
		nbCheques = newNbCheques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE__NB_CHEQUES, oldNbCheques, nbCheques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.CHEQUE__MATRICULE:
				return getMatricule();
			case ChequedejPackage.CHEQUE__NB_CHEQUES:
				return getNbCheques();
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
			case ChequedejPackage.CHEQUE__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case ChequedejPackage.CHEQUE__NB_CHEQUES:
				setNbCheques((Integer)newValue);
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
			case ChequedejPackage.CHEQUE__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case ChequedejPackage.CHEQUE__NB_CHEQUES:
				setNbCheques(NB_CHEQUES_EDEFAULT);
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
			case ChequedejPackage.CHEQUE__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
			case ChequedejPackage.CHEQUE__NB_CHEQUES:
				return NB_CHEQUES_EDEFAULT == null ? nbCheques != null : !NB_CHEQUES_EDEFAULT.equals(nbCheques);
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
		result.append(" (matricule: ");
		result.append(matricule);
		result.append(", nbCheques: ");
		result.append(nbCheques);
		result.append(')');
		return result.toString();
	}

} //ChequeImpl
