/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Effectif;
import fr.mutualite.rh.model.Emplois;
import fr.mutualite.rh.model.Etablissements;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.Organismes;
import fr.mutualite.rh.model.Utilisateurs;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mutualite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.MutualiteImpl#getEtablissements <em>Etablissements</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.MutualiteImpl#getEmplois <em>Emplois</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.MutualiteImpl#getEffectif <em>Effectif</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.MutualiteImpl#getOrganismes <em>Organismes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.MutualiteImpl#getUtilisateurs <em>Utilisateurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MutualiteImpl extends CDOObjectImpl implements Mutualite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MutualiteImpl() {
		super();
	}
	
	{
		setEffectif(MutFactory.eINSTANCE.createEffectif());
		setEmplois(MutFactory.eINSTANCE.createEmplois());
		setEtablissements(MutFactory.eINSTANCE.createEtablissements());
		setOrganismes(MutFactory.eINSTANCE.createOrganismes());
		setUtilisateurs(MutFactory.eINSTANCE.createUtilisateurs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.MUTUALITE;
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
	public Etablissements getEtablissements() {
		return (Etablissements)eDynamicGet(MutPackage.MUTUALITE__ETABLISSEMENTS, MutPackage.Literals.MUTUALITE__ETABLISSEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtablissements(Etablissements newEtablissements, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEtablissements, MutPackage.MUTUALITE__ETABLISSEMENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissements(Etablissements newEtablissements) {
		eDynamicSet(MutPackage.MUTUALITE__ETABLISSEMENTS, MutPackage.Literals.MUTUALITE__ETABLISSEMENTS, newEtablissements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emplois getEmplois() {
		return (Emplois)eDynamicGet(MutPackage.MUTUALITE__EMPLOIS, MutPackage.Literals.MUTUALITE__EMPLOIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmplois(Emplois newEmplois, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEmplois, MutPackage.MUTUALITE__EMPLOIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmplois(Emplois newEmplois) {
		eDynamicSet(MutPackage.MUTUALITE__EMPLOIS, MutPackage.Literals.MUTUALITE__EMPLOIS, newEmplois);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effectif getEffectif() {
		return (Effectif)eDynamicGet(MutPackage.MUTUALITE__EFFECTIF, MutPackage.Literals.MUTUALITE__EFFECTIF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffectif(Effectif newEffectif, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEffectif, MutPackage.MUTUALITE__EFFECTIF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectif(Effectif newEffectif) {
		eDynamicSet(MutPackage.MUTUALITE__EFFECTIF, MutPackage.Literals.MUTUALITE__EFFECTIF, newEffectif);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organismes getOrganismes() {
		return (Organismes)eDynamicGet(MutPackage.MUTUALITE__ORGANISMES, MutPackage.Literals.MUTUALITE__ORGANISMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganismes(Organismes newOrganismes, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganismes, MutPackage.MUTUALITE__ORGANISMES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganismes(Organismes newOrganismes) {
		eDynamicSet(MutPackage.MUTUALITE__ORGANISMES, MutPackage.Literals.MUTUALITE__ORGANISMES, newOrganismes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Utilisateurs getUtilisateurs() {
		return (Utilisateurs)eDynamicGet(MutPackage.MUTUALITE__UTILISATEURS, MutPackage.Literals.MUTUALITE__UTILISATEURS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilisateurs(Utilisateurs newUtilisateurs, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUtilisateurs, MutPackage.MUTUALITE__UTILISATEURS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilisateurs(Utilisateurs newUtilisateurs) {
		eDynamicSet(MutPackage.MUTUALITE__UTILISATEURS, MutPackage.Literals.MUTUALITE__UTILISATEURS, newUtilisateurs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.MUTUALITE__ETABLISSEMENTS:
				return basicSetEtablissements(null, msgs);
			case MutPackage.MUTUALITE__EMPLOIS:
				return basicSetEmplois(null, msgs);
			case MutPackage.MUTUALITE__EFFECTIF:
				return basicSetEffectif(null, msgs);
			case MutPackage.MUTUALITE__ORGANISMES:
				return basicSetOrganismes(null, msgs);
			case MutPackage.MUTUALITE__UTILISATEURS:
				return basicSetUtilisateurs(null, msgs);
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
			case MutPackage.MUTUALITE__ETABLISSEMENTS:
				return getEtablissements();
			case MutPackage.MUTUALITE__EMPLOIS:
				return getEmplois();
			case MutPackage.MUTUALITE__EFFECTIF:
				return getEffectif();
			case MutPackage.MUTUALITE__ORGANISMES:
				return getOrganismes();
			case MutPackage.MUTUALITE__UTILISATEURS:
				return getUtilisateurs();
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
			case MutPackage.MUTUALITE__ETABLISSEMENTS:
				setEtablissements((Etablissements)newValue);
				return;
			case MutPackage.MUTUALITE__EMPLOIS:
				setEmplois((Emplois)newValue);
				return;
			case MutPackage.MUTUALITE__EFFECTIF:
				setEffectif((Effectif)newValue);
				return;
			case MutPackage.MUTUALITE__ORGANISMES:
				setOrganismes((Organismes)newValue);
				return;
			case MutPackage.MUTUALITE__UTILISATEURS:
				setUtilisateurs((Utilisateurs)newValue);
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
			case MutPackage.MUTUALITE__ETABLISSEMENTS:
				setEtablissements((Etablissements)null);
				return;
			case MutPackage.MUTUALITE__EMPLOIS:
				setEmplois((Emplois)null);
				return;
			case MutPackage.MUTUALITE__EFFECTIF:
				setEffectif((Effectif)null);
				return;
			case MutPackage.MUTUALITE__ORGANISMES:
				setOrganismes((Organismes)null);
				return;
			case MutPackage.MUTUALITE__UTILISATEURS:
				setUtilisateurs((Utilisateurs)null);
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
			case MutPackage.MUTUALITE__ETABLISSEMENTS:
				return getEtablissements() != null;
			case MutPackage.MUTUALITE__EMPLOIS:
				return getEmplois() != null;
			case MutPackage.MUTUALITE__EFFECTIF:
				return getEffectif() != null;
			case MutPackage.MUTUALITE__ORGANISMES:
				return getOrganismes() != null;
			case MutPackage.MUTUALITE__UTILISATEURS:
				return getUtilisateurs() != null;
		}
		return super.eIsSet(featureID);
	}

} //MutualiteImpl
