/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SessionFormation;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.SessionFormationImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SessionFormationImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SessionFormationImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SessionFormationImpl#getEmployes <em>Employes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SessionFormationImpl#getAppreciations <em>Appreciations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SessionFormationImpl extends CDOObjectImpl implements SessionFormation {
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
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final Float DUREE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionFormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.SESSION_FORMATION;
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
	public Date getDateFin() {
		return (Date)eDynamicGet(MutPackage.SESSION_FORMATION__DATE_FIN, MutPackage.Literals.SESSION_FORMATION__DATE_FIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(Date newDateFin) {
		eDynamicSet(MutPackage.SESSION_FORMATION__DATE_FIN, MutPackage.Literals.SESSION_FORMATION__DATE_FIN, newDateFin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDebut() {
		return (Date)eDynamicGet(MutPackage.SESSION_FORMATION__DATE_DEBUT, MutPackage.Literals.SESSION_FORMATION__DATE_DEBUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(Date newDateDebut) {
		eDynamicSet(MutPackage.SESSION_FORMATION__DATE_DEBUT, MutPackage.Literals.SESSION_FORMATION__DATE_DEBUT, newDateDebut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getDuree() {
		return (Float)eDynamicGet(MutPackage.SESSION_FORMATION__DUREE, MutPackage.Literals.SESSION_FORMATION__DUREE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(Float newDuree) {
		eDynamicSet(MutPackage.SESSION_FORMATION__DUREE, MutPackage.Literals.SESSION_FORMATION__DUREE, newDuree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getEmployes() {
		return (EList<Employe>)eDynamicGet(MutPackage.SESSION_FORMATION__EMPLOYES, MutPackage.Literals.SESSION_FORMATION__EMPLOYES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AppreciationSessionFormation> getAppreciations() {
		return (EList<AppreciationSessionFormation>)eDynamicGet(MutPackage.SESSION_FORMATION__APPRECIATIONS, MutPackage.Literals.SESSION_FORMATION__APPRECIATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployes()).basicAdd(otherEnd, msgs);
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAppreciations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				return ((InternalEList<?>)getEmployes()).basicRemove(otherEnd, msgs);
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				return ((InternalEList<?>)getAppreciations()).basicRemove(otherEnd, msgs);
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
			case MutPackage.SESSION_FORMATION__DATE_DEBUT:
				return getDateDebut();
			case MutPackage.SESSION_FORMATION__DATE_FIN:
				return getDateFin();
			case MutPackage.SESSION_FORMATION__DUREE:
				return getDuree();
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				return getEmployes();
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				return getAppreciations();
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
			case MutPackage.SESSION_FORMATION__DATE_DEBUT:
				setDateDebut((Date)newValue);
				return;
			case MutPackage.SESSION_FORMATION__DATE_FIN:
				setDateFin((Date)newValue);
				return;
			case MutPackage.SESSION_FORMATION__DUREE:
				setDuree((Float)newValue);
				return;
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				getEmployes().clear();
				getEmployes().addAll((Collection<? extends Employe>)newValue);
				return;
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				getAppreciations().clear();
				getAppreciations().addAll((Collection<? extends AppreciationSessionFormation>)newValue);
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
			case MutPackage.SESSION_FORMATION__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case MutPackage.SESSION_FORMATION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case MutPackage.SESSION_FORMATION__DUREE:
				setDuree(DUREE_EDEFAULT);
				return;
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				getEmployes().clear();
				return;
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				getAppreciations().clear();
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
			case MutPackage.SESSION_FORMATION__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? getDateDebut() != null : !DATE_DEBUT_EDEFAULT.equals(getDateDebut());
			case MutPackage.SESSION_FORMATION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? getDateFin() != null : !DATE_FIN_EDEFAULT.equals(getDateFin());
			case MutPackage.SESSION_FORMATION__DUREE:
				return DUREE_EDEFAULT == null ? getDuree() != null : !DUREE_EDEFAULT.equals(getDuree());
			case MutPackage.SESSION_FORMATION__EMPLOYES:
				return !getEmployes().isEmpty();
			case MutPackage.SESSION_FORMATION__APPRECIATIONS:
				return !getAppreciations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SessionFormationImpl
