/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Contrat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contrat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ContratImpl#getTempsTravailMensuel <em>Temps Travail Mensuel</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ContratImpl#isPartiel <em>Partiel</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ContratImpl#getMatricule <em>Matricule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContratImpl extends MinimalEObjectImpl.Container implements Contrat {
	/**
	 * The default value of the '{@link #getTempsTravailMensuel() <em>Temps Travail Mensuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsTravailMensuel()
	 * @generated
	 * @ordered
	 */
	protected static final Float TEMPS_TRAVAIL_MENSUEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempsTravailMensuel() <em>Temps Travail Mensuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempsTravailMensuel()
	 * @generated
	 * @ordered
	 */
	protected Float tempsTravailMensuel = TEMPS_TRAVAIL_MENSUEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isPartiel() <em>Partiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPartiel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARTIEL_EDEFAULT = false;

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
	protected ContratImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CONTRAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getTempsTravailMensuel() {
		return tempsTravailMensuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempsTravailMensuel(Float newTempsTravailMensuel) {
		Float oldTempsTravailMensuel = tempsTravailMensuel;
		tempsTravailMensuel = newTempsTravailMensuel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CONTRAT__TEMPS_TRAVAIL_MENSUEL, oldTempsTravailMensuel, tempsTravailMensuel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isPartiel() {
		Float tempsTravailMensuel2 = getTempsTravailMensuel();
		return tempsTravailMensuel2!=null && tempsTravailMensuel2<151.1f;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CONTRAT__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.CONTRAT__TEMPS_TRAVAIL_MENSUEL:
				return getTempsTravailMensuel();
			case ChequedejPackage.CONTRAT__PARTIEL:
				return isPartiel();
			case ChequedejPackage.CONTRAT__MATRICULE:
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
			case ChequedejPackage.CONTRAT__TEMPS_TRAVAIL_MENSUEL:
				setTempsTravailMensuel((Float)newValue);
				return;
			case ChequedejPackage.CONTRAT__MATRICULE:
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
			case ChequedejPackage.CONTRAT__TEMPS_TRAVAIL_MENSUEL:
				setTempsTravailMensuel(TEMPS_TRAVAIL_MENSUEL_EDEFAULT);
				return;
			case ChequedejPackage.CONTRAT__MATRICULE:
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
			case ChequedejPackage.CONTRAT__TEMPS_TRAVAIL_MENSUEL:
				return TEMPS_TRAVAIL_MENSUEL_EDEFAULT == null ? tempsTravailMensuel != null : !TEMPS_TRAVAIL_MENSUEL_EDEFAULT.equals(tempsTravailMensuel);
			case ChequedejPackage.CONTRAT__PARTIEL:
				return isPartiel() != PARTIEL_EDEFAULT;
			case ChequedejPackage.CONTRAT__MATRICULE:
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
		result.append(" (tempsTravailMensuel: ");
		result.append(tempsTravailMensuel);
		result.append(", matricule: ");
		result.append(matricule);
		result.append(')');
		return result.toString();
	}

} //ContratImpl
