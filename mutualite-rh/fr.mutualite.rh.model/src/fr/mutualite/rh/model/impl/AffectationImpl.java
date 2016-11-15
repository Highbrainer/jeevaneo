/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.MutPackage;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.AffectationImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AffectationImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AffectationImpl#getEmploi <em>Emploi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AffectationImpl extends CDOObjectImpl implements Affectation {
	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DEBUT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AffectationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.AFFECTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDebut() {
		return (Date)eDynamicGet(MutPackage.AFFECTATION__DATE_DEBUT, MutPackage.Literals.AFFECTATION__DATE_DEBUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(Date newDateDebut) {
		eDynamicSet(MutPackage.AFFECTATION__DATE_DEBUT, MutPackage.Literals.AFFECTATION__DATE_DEBUT, newDateDebut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateFin() {
		return (Date)eDynamicGet(MutPackage.AFFECTATION__DATE_FIN, MutPackage.Literals.AFFECTATION__DATE_FIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(Date newDateFin) {
		eDynamicSet(MutPackage.AFFECTATION__DATE_FIN, MutPackage.Literals.AFFECTATION__DATE_FIN, newDateFin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emploi getEmploi() {
		return (Emploi)eDynamicGet(MutPackage.AFFECTATION__EMPLOI, MutPackage.Literals.AFFECTATION__EMPLOI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emploi basicGetEmploi() {
		return (Emploi)eDynamicGet(MutPackage.AFFECTATION__EMPLOI, MutPackage.Literals.AFFECTATION__EMPLOI, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploi(Emploi newEmploi) {
		eDynamicSet(MutPackage.AFFECTATION__EMPLOI, MutPackage.Literals.AFFECTATION__EMPLOI, newEmploi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.AFFECTATION__DATE_DEBUT:
				return getDateDebut();
			case MutPackage.AFFECTATION__DATE_FIN:
				return getDateFin();
			case MutPackage.AFFECTATION__EMPLOI:
				if (resolve) return getEmploi();
				return basicGetEmploi();
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
			case MutPackage.AFFECTATION__DATE_DEBUT:
				setDateDebut((Date)newValue);
				return;
			case MutPackage.AFFECTATION__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case MutPackage.AFFECTATION__EMPLOI:
				setEmploi((Emploi)newValue);
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
			case MutPackage.AFFECTATION__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case MutPackage.AFFECTATION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case MutPackage.AFFECTATION__EMPLOI:
				setEmploi((Emploi)null);
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
			case MutPackage.AFFECTATION__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? getDateDebut() != null : !DATE_DEBUT_EDEFAULT.equals(getDateDebut());
			case MutPackage.AFFECTATION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? getDateFin() != null : !DATE_FIN_EDEFAULT.equals(getDateFin());
			case MutPackage.AFFECTATION__EMPLOI:
				return basicGetEmploi() != null;
		}
		return super.eIsSet(featureID);
	}

} //AffectationImpl
