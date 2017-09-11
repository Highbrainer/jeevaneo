/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.ChoixIndividuel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choix Individuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ChoixIndividuelImpl#getNbMaxCheques <em>Nb Max Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChoixIndividuelImpl#getMatricule <em>Matricule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoixIndividuelImpl extends MinimalEObjectImpl.Container implements ChoixIndividuel {
	/**
	 * The default value of the '{@link #getNbMaxCheques() <em>Nb Max Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMaxCheques()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NB_MAX_CHEQUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNbMaxCheques() <em>Nb Max Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbMaxCheques()
	 * @generated
	 * @ordered
	 */
	protected Integer nbMaxCheques = NB_MAX_CHEQUES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoixIndividuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CHOIX_INDIVIDUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNbMaxCheques() {
		return nbMaxCheques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbMaxCheques(Integer newNbMaxCheques) {
		Integer oldNbMaxCheques = nbMaxCheques;
		nbMaxCheques = newNbMaxCheques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHOIX_INDIVIDUEL__NB_MAX_CHEQUES, oldNbMaxCheques, nbMaxCheques));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHOIX_INDIVIDUEL__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.CHOIX_INDIVIDUEL__NB_MAX_CHEQUES:
				return getNbMaxCheques();
			case ChequedejPackage.CHOIX_INDIVIDUEL__MATRICULE:
				return getMatricule();
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
			case ChequedejPackage.CHOIX_INDIVIDUEL__NB_MAX_CHEQUES:
				setNbMaxCheques((Integer)newValue);
				return;
			case ChequedejPackage.CHOIX_INDIVIDUEL__MATRICULE:
				setMatricule((Integer)newValue);
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
			case ChequedejPackage.CHOIX_INDIVIDUEL__NB_MAX_CHEQUES:
				setNbMaxCheques(NB_MAX_CHEQUES_EDEFAULT);
				return;
			case ChequedejPackage.CHOIX_INDIVIDUEL__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
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
			case ChequedejPackage.CHOIX_INDIVIDUEL__NB_MAX_CHEQUES:
				return NB_MAX_CHEQUES_EDEFAULT == null ? nbMaxCheques != null : !NB_MAX_CHEQUES_EDEFAULT.equals(nbMaxCheques);
			case ChequedejPackage.CHOIX_INDIVIDUEL__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
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
		result.append(" (nbMaxCheques: ");
		result.append(nbMaxCheques);
		result.append(", matricule: ");
		result.append(matricule);
		result.append(')');
		return result.toString();
	}

} //ChoixIndividuelImpl
