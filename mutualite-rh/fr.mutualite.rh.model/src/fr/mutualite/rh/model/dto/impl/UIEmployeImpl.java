/**
 */
package fr.mutualite.rh.model.dto.impl;

import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.UIEmploye;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UIEmployeImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UIEmployeImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UIEmployeImpl#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIEmployeImpl extends CDOObjectImpl implements UIEmploye {
	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

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
	protected UIEmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtoPackage.Literals.UI_EMPLOYE;
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
	public String getPrenom() {
		return (String)eDynamicGet(DtoPackage.UI_EMPLOYE__PRENOM, DtoPackage.Literals.UI_EMPLOYE__PRENOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		eDynamicSet(DtoPackage.UI_EMPLOYE__PRENOM, DtoPackage.Literals.UI_EMPLOYE__PRENOM, newPrenom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricule() {
		return (Integer)eDynamicGet(DtoPackage.UI_EMPLOYE__MATRICULE, DtoPackage.Literals.UI_EMPLOYE__MATRICULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		eDynamicSet(DtoPackage.UI_EMPLOYE__MATRICULE, DtoPackage.Literals.UI_EMPLOYE__MATRICULE, newMatricule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return (String)eDynamicGet(DtoPackage.UI_EMPLOYE__NOM, DtoPackage.Literals.UI_EMPLOYE__NOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eDynamicSet(DtoPackage.UI_EMPLOYE__NOM, DtoPackage.Literals.UI_EMPLOYE__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtoPackage.UI_EMPLOYE__PRENOM:
				return getPrenom();
			case DtoPackage.UI_EMPLOYE__MATRICULE:
				return getMatricule();
			case DtoPackage.UI_EMPLOYE__NOM:
				return getNom();
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
			case DtoPackage.UI_EMPLOYE__PRENOM:
				setPrenom((String)newValue);
				return;
			case DtoPackage.UI_EMPLOYE__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case DtoPackage.UI_EMPLOYE__NOM:
				setNom((String)newValue);
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
			case DtoPackage.UI_EMPLOYE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case DtoPackage.UI_EMPLOYE__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case DtoPackage.UI_EMPLOYE__NOM:
				setNom(NOM_EDEFAULT);
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
			case DtoPackage.UI_EMPLOYE__PRENOM:
				return PRENOM_EDEFAULT == null ? getPrenom() != null : !PRENOM_EDEFAULT.equals(getPrenom());
			case DtoPackage.UI_EMPLOYE__MATRICULE:
				return getMatricule() != MATRICULE_EDEFAULT;
			case DtoPackage.UI_EMPLOYE__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
		}
		return super.eIsSet(featureID);
	}

} //UIEmployeImpl
