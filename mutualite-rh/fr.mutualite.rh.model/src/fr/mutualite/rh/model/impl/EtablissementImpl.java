/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.MutPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Etablissement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EtablissementImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EtablissementImpl#getEmployes <em>Employes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EtablissementImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EtablissementImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EtablissementImpl#getEntreteneurs <em>Entreteneurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EtablissementImpl extends CDOObjectImpl implements Etablissement {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.ETABLISSEMENT;
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
		return (String)eDynamicGet(MutPackage.ETABLISSEMENT__NOM, MutPackage.Literals.ETABLISSEMENT__NOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eDynamicSet(MutPackage.ETABLISSEMENT__NOM, MutPackage.Literals.ETABLISSEMENT__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getEmployes() {
		return (EList<Employe>)eDynamicGet(MutPackage.ETABLISSEMENT__EMPLOYES, MutPackage.Literals.ETABLISSEMENT__EMPLOYES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return (Integer)eDynamicGet(MutPackage.ETABLISSEMENT__ID, MutPackage.Literals.ETABLISSEMENT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		eDynamicSet(MutPackage.ETABLISSEMENT__ID, MutPackage.Literals.ETABLISSEMENT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe getResponsable() {
		return (Employe)eDynamicGet(MutPackage.ETABLISSEMENT__RESPONSABLE, MutPackage.Literals.ETABLISSEMENT__RESPONSABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe basicGetResponsable() {
		return (Employe)eDynamicGet(MutPackage.ETABLISSEMENT__RESPONSABLE, MutPackage.Literals.ETABLISSEMENT__RESPONSABLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsable(Employe newResponsable, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResponsable, MutPackage.ETABLISSEMENT__RESPONSABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Employe newResponsable) {
		eDynamicSet(MutPackage.ETABLISSEMENT__RESPONSABLE, MutPackage.Literals.ETABLISSEMENT__RESPONSABLE, newResponsable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getEntreteneurs() {
		return (EList<Employe>)eDynamicGet(MutPackage.ETABLISSEMENT__ENTRETENEURS, MutPackage.Literals.ETABLISSEMENT__ENTRETENEURS, true, true);
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
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployes()).basicAdd(otherEnd, msgs);
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				Employe responsable = basicGetResponsable();
				if (responsable != null)
					msgs = ((InternalEObject)responsable).eInverseRemove(this, MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE, Employe.class, msgs);
				return basicSetResponsable((Employe)otherEnd, msgs);
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntreteneurs()).basicAdd(otherEnd, msgs);
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
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				return ((InternalEList<?>)getEmployes()).basicRemove(otherEnd, msgs);
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				return basicSetResponsable(null, msgs);
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				return ((InternalEList<?>)getEntreteneurs()).basicRemove(otherEnd, msgs);
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
			case MutPackage.ETABLISSEMENT__NOM:
				return getNom();
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				return getEmployes();
			case MutPackage.ETABLISSEMENT__ID:
				return getId();
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				return getEntreteneurs();
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
			case MutPackage.ETABLISSEMENT__NOM:
				setNom((String)newValue);
				return;
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				getEmployes().clear();
				getEmployes().addAll((Collection<? extends Employe>)newValue);
				return;
			case MutPackage.ETABLISSEMENT__ID:
				setId((Integer)newValue);
				return;
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				setResponsable((Employe)newValue);
				return;
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				getEntreteneurs().clear();
				getEntreteneurs().addAll((Collection<? extends Employe>)newValue);
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
			case MutPackage.ETABLISSEMENT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				getEmployes().clear();
				return;
			case MutPackage.ETABLISSEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				setResponsable((Employe)null);
				return;
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				getEntreteneurs().clear();
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
			case MutPackage.ETABLISSEMENT__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case MutPackage.ETABLISSEMENT__EMPLOYES:
				return !getEmployes().isEmpty();
			case MutPackage.ETABLISSEMENT__ID:
				return getId() != ID_EDEFAULT;
			case MutPackage.ETABLISSEMENT__RESPONSABLE:
				return basicGetResponsable() != null;
			case MutPackage.ETABLISSEMENT__ENTRETENEURS:
				return !getEntreteneurs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EtablissementImpl
