/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Collection;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.EtablissementVirtuel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etablissement Virtuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.EtablissementVirtuelImpl#getMatriculesEmployes <em>Matricules Employes</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.EtablissementVirtuelImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.EtablissementVirtuelImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtablissementVirtuelImpl extends MinimalEObjectImpl.Container implements EtablissementVirtuel {
	/**
	 * The cached value of the '{@link #getMatriculesEmployes() <em>Matricules Employes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatriculesEmployes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> matriculesEmployes;

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
	 * The cached value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected String libelle = LIBELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementVirtuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.ETABLISSEMENT_VIRTUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMatriculesEmployes() {
		if (matriculesEmployes == null) {
			matriculesEmployes = new EDataTypeUniqueEList<Integer>(Integer.class, this, ChequedejPackage.ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES);
		}
		return matriculesEmployes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		String oldLibelle = libelle;
		libelle = newLibelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ETABLISSEMENT_VIRTUEL__LIBELLE, oldLibelle, libelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.ETABLISSEMENT_VIRTUEL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES:
				return getMatriculesEmployes();
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__LIBELLE:
				return getLibelle();
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__ID:
				return getId();
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
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES:
				getMatriculesEmployes().clear();
				getMatriculesEmployes().addAll((Collection<? extends Integer>)newValue);
				return;
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__LIBELLE:
				setLibelle((String)newValue);
				return;
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__ID:
				setId((String)newValue);
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
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES:
				getMatriculesEmployes().clear();
				return;
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__ID:
				setId(ID_EDEFAULT);
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
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES:
				return matriculesEmployes != null && !matriculesEmployes.isEmpty();
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__LIBELLE:
				return LIBELLE_EDEFAULT == null ? libelle != null : !LIBELLE_EDEFAULT.equals(libelle);
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (matriculesEmployes: ");
		result.append(matriculesEmployes);
		result.append(", libelle: ");
		result.append(libelle);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EtablissementVirtuelImpl
