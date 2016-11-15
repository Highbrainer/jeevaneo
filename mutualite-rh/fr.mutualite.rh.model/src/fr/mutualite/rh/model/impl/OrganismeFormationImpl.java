/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.OrganismeFormation;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisme Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.OrganismeFormationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.OrganismeFormationImpl#getFormations <em>Formations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganismeFormationImpl extends CDOObjectImpl implements OrganismeFormation {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganismeFormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.ORGANISME_FORMATION;
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
	public String getNom() {
		return (String)eDynamicGet(MutPackage.ORGANISME_FORMATION__NOM, MutPackage.Literals.ORGANISME_FORMATION__NOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eDynamicSet(MutPackage.ORGANISME_FORMATION__NOM, MutPackage.Literals.ORGANISME_FORMATION__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Formation> getFormations() {
		return (EList<Formation>)eDynamicGet(MutPackage.ORGANISME_FORMATION__FORMATIONS, MutPackage.Literals.ORGANISME_FORMATION__FORMATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.ORGANISME_FORMATION__FORMATIONS:
				return ((InternalEList<?>)getFormations()).basicRemove(otherEnd, msgs);
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
			case MutPackage.ORGANISME_FORMATION__NOM:
				return getNom();
			case MutPackage.ORGANISME_FORMATION__FORMATIONS:
				return getFormations();
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
			case MutPackage.ORGANISME_FORMATION__NOM:
				setNom((String)newValue);
				return;
			case MutPackage.ORGANISME_FORMATION__FORMATIONS:
				getFormations().clear();
				getFormations().addAll((Collection<? extends Formation>)newValue);
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
			case MutPackage.ORGANISME_FORMATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MutPackage.ORGANISME_FORMATION__FORMATIONS:
				getFormations().clear();
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
			case MutPackage.ORGANISME_FORMATION__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case MutPackage.ORGANISME_FORMATION__FORMATIONS:
				return !getFormations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganismeFormationImpl
