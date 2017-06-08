/**
 */
package fr.mutualite.rh.model.dto.impl;

import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.UISessionFormation;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Session Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl#getQuand <em>Quand</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl#getOrganisme <em>Organisme</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.UISessionFormationImpl#isDpc <em>Dpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UISessionFormationImpl extends CDOObjectImpl implements UISessionFormation {
	/**
	 * The default value of the '{@link #getQuand() <em>Quand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuand()
	 * @generated
	 * @ordered
	 */
	protected static final String QUAND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuree() <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected static final String DUREE_EDEFAULT = null;

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
	 * The default value of the '{@link #getOrganisme() <em>Organisme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisme()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDpc() <em>Dpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDpc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DPC_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISessionFormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtoPackage.Literals.UI_SESSION_FORMATION;
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
	public String getQuand() {
		return (String)eDynamicGet(DtoPackage.UI_SESSION_FORMATION__QUAND, DtoPackage.Literals.UI_SESSION_FORMATION__QUAND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuand(String newQuand) {
		eDynamicSet(DtoPackage.UI_SESSION_FORMATION__QUAND, DtoPackage.Literals.UI_SESSION_FORMATION__QUAND, newQuand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuree() {
		return (String)eDynamicGet(DtoPackage.UI_SESSION_FORMATION__DUREE, DtoPackage.Literals.UI_SESSION_FORMATION__DUREE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(String newDuree) {
		eDynamicSet(DtoPackage.UI_SESSION_FORMATION__DUREE, DtoPackage.Literals.UI_SESSION_FORMATION__DUREE, newDuree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return (String)eDynamicGet(DtoPackage.UI_SESSION_FORMATION__LIBELLE, DtoPackage.Literals.UI_SESSION_FORMATION__LIBELLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		eDynamicSet(DtoPackage.UI_SESSION_FORMATION__LIBELLE, DtoPackage.Literals.UI_SESSION_FORMATION__LIBELLE, newLibelle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganisme() {
		return (String)eDynamicGet(DtoPackage.UI_SESSION_FORMATION__ORGANISME, DtoPackage.Literals.UI_SESSION_FORMATION__ORGANISME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisme(String newOrganisme) {
		eDynamicSet(DtoPackage.UI_SESSION_FORMATION__ORGANISME, DtoPackage.Literals.UI_SESSION_FORMATION__ORGANISME, newOrganisme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDpc() {
		return (Boolean)eDynamicGet(DtoPackage.UI_SESSION_FORMATION__DPC, DtoPackage.Literals.UI_SESSION_FORMATION__DPC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDpc(boolean newDpc) {
		eDynamicSet(DtoPackage.UI_SESSION_FORMATION__DPC, DtoPackage.Literals.UI_SESSION_FORMATION__DPC, newDpc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtoPackage.UI_SESSION_FORMATION__QUAND:
				return getQuand();
			case DtoPackage.UI_SESSION_FORMATION__DUREE:
				return getDuree();
			case DtoPackage.UI_SESSION_FORMATION__LIBELLE:
				return getLibelle();
			case DtoPackage.UI_SESSION_FORMATION__ORGANISME:
				return getOrganisme();
			case DtoPackage.UI_SESSION_FORMATION__DPC:
				return isDpc();
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
			case DtoPackage.UI_SESSION_FORMATION__QUAND:
				setQuand((String)newValue);
				return;
			case DtoPackage.UI_SESSION_FORMATION__DUREE:
				setDuree((String)newValue);
				return;
			case DtoPackage.UI_SESSION_FORMATION__LIBELLE:
				setLibelle((String)newValue);
				return;
			case DtoPackage.UI_SESSION_FORMATION__ORGANISME:
				setOrganisme((String)newValue);
				return;
			case DtoPackage.UI_SESSION_FORMATION__DPC:
				setDpc((Boolean)newValue);
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
			case DtoPackage.UI_SESSION_FORMATION__QUAND:
				setQuand(QUAND_EDEFAULT);
				return;
			case DtoPackage.UI_SESSION_FORMATION__DUREE:
				setDuree(DUREE_EDEFAULT);
				return;
			case DtoPackage.UI_SESSION_FORMATION__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case DtoPackage.UI_SESSION_FORMATION__ORGANISME:
				setOrganisme(ORGANISME_EDEFAULT);
				return;
			case DtoPackage.UI_SESSION_FORMATION__DPC:
				setDpc(DPC_EDEFAULT);
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
			case DtoPackage.UI_SESSION_FORMATION__QUAND:
				return QUAND_EDEFAULT == null ? getQuand() != null : !QUAND_EDEFAULT.equals(getQuand());
			case DtoPackage.UI_SESSION_FORMATION__DUREE:
				return DUREE_EDEFAULT == null ? getDuree() != null : !DUREE_EDEFAULT.equals(getDuree());
			case DtoPackage.UI_SESSION_FORMATION__LIBELLE:
				return LIBELLE_EDEFAULT == null ? getLibelle() != null : !LIBELLE_EDEFAULT.equals(getLibelle());
			case DtoPackage.UI_SESSION_FORMATION__ORGANISME:
				return ORGANISME_EDEFAULT == null ? getOrganisme() != null : !ORGANISME_EDEFAULT.equals(getOrganisme());
			case DtoPackage.UI_SESSION_FORMATION__DPC:
				return isDpc() != DPC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //UISessionFormationImpl
