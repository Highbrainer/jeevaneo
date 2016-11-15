/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.Utilisateur;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.UtilisateurImpl#getEmploye <em>Employe</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.UtilisateurImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.UtilisateurImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisateurImpl extends CDOObjectImpl implements Utilisateur {
	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisateurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.UTILISATEUR;
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
	public Employe getEmploye() {
		return (Employe)eDynamicGet(MutPackage.UTILISATEUR__EMPLOYE, MutPackage.Literals.UTILISATEUR__EMPLOYE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe basicGetEmploye() {
		return (Employe)eDynamicGet(MutPackage.UTILISATEUR__EMPLOYE, MutPackage.Literals.UTILISATEUR__EMPLOYE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploye(Employe newEmploye) {
		eDynamicSet(MutPackage.UTILISATEUR__EMPLOYE, MutPackage.Literals.UTILISATEUR__EMPLOYE, newEmploye);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return (String)eDynamicGet(MutPackage.UTILISATEUR__LOGIN, MutPackage.Literals.UTILISATEUR__LOGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		eDynamicSet(MutPackage.UTILISATEUR__LOGIN, MutPackage.Literals.UTILISATEUR__LOGIN, newLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(MutPackage.UTILISATEUR__ROLES, MutPackage.Literals.UTILISATEUR__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.UTILISATEUR__EMPLOYE:
				if (resolve) return getEmploye();
				return basicGetEmploye();
			case MutPackage.UTILISATEUR__LOGIN:
				return getLogin();
			case MutPackage.UTILISATEUR__ROLES:
				return getRoles();
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
			case MutPackage.UTILISATEUR__EMPLOYE:
				setEmploye((Employe)newValue);
				return;
			case MutPackage.UTILISATEUR__LOGIN:
				setLogin((String)newValue);
				return;
			case MutPackage.UTILISATEUR__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case MutPackage.UTILISATEUR__EMPLOYE:
				setEmploye((Employe)null);
				return;
			case MutPackage.UTILISATEUR__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case MutPackage.UTILISATEUR__ROLES:
				getRoles().clear();
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
			case MutPackage.UTILISATEUR__EMPLOYE:
				return basicGetEmploye() != null;
			case MutPackage.UTILISATEUR__LOGIN:
				return LOGIN_EDEFAULT == null ? getLogin() != null : !LOGIN_EDEFAULT.equals(getLogin());
			case MutPackage.UTILISATEUR__ROLES:
				return !getRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UtilisateurImpl
