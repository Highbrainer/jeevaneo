/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.PhotoEmploye;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getEmploi <em>Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getDateEmbauche <em>Date Embauche</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getDatePrecedentEntretienPro <em>Date Precedent Entretien Pro</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.PhotoEmployeImpl#getDatePrecedentEntretienAnnuel <em>Date Precedent Entretien Annuel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhotoEmployeImpl extends CDOObjectImpl implements PhotoEmploye {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getEtablissement() <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissement()
	 * @generated
	 * @ordered
	 */
	protected static final String ETABLISSEMENT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEmploi() <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOI_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getResponsable() <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSABLE_EDEFAULT = null;

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
	 * The default value of the '{@link #getDateEmbauche() <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEmbauche()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EMBAUCHE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatePrecedentEntretien() <em>Date Precedent Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecedentEntretien()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PRECEDENT_ENTRETIEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatePrecedentEntretienPro() <em>Date Precedent Entretien Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecedentEntretienPro()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PRECEDENT_ENTRETIEN_PRO_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDatePrecedentEntretienAnnuel() <em>Date Precedent Entretien Annuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrecedentEntretienAnnuel()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_PRECEDENT_ENTRETIEN_ANNUEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoEmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.PHOTO_EMPLOYE;
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
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__PRENOM, MutPackage.Literals.PHOTO_EMPLOYE__PRENOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__PRENOM, MutPackage.Literals.PHOTO_EMPLOYE__PRENOM, newPrenom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return (Integer)eDynamicGet(MutPackage.PHOTO_EMPLOYE__AGE, MutPackage.Literals.PHOTO_EMPLOYE__AGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__AGE, MutPackage.Literals.PHOTO_EMPLOYE__AGE, newAge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtablissement() {
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT, MutPackage.Literals.PHOTO_EMPLOYE__ETABLISSEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissement(String newEtablissement) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT, MutPackage.Literals.PHOTO_EMPLOYE__ETABLISSEMENT, newEtablissement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmploi() {
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__EMPLOI, MutPackage.Literals.PHOTO_EMPLOYE__EMPLOI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmploi(String newEmploi) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__EMPLOI, MutPackage.Literals.PHOTO_EMPLOYE__EMPLOI, newEmploi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassification() {
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__CLASSIFICATION, MutPackage.Literals.PHOTO_EMPLOYE__CLASSIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(String newClassification) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__CLASSIFICATION, MutPackage.Literals.PHOTO_EMPLOYE__CLASSIFICATION, newClassification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsable() {
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__RESPONSABLE, MutPackage.Literals.PHOTO_EMPLOYE__RESPONSABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(String newResponsable) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__RESPONSABLE, MutPackage.Literals.PHOTO_EMPLOYE__RESPONSABLE, newResponsable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return (String)eDynamicGet(MutPackage.PHOTO_EMPLOYE__NOM, MutPackage.Literals.PHOTO_EMPLOYE__NOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__NOM, MutPackage.Literals.PHOTO_EMPLOYE__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEmbauche() {
		return (Date)eDynamicGet(MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE, MutPackage.Literals.PHOTO_EMPLOYE__DATE_EMBAUCHE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEmbauche(Date newDateEmbauche) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE, MutPackage.Literals.PHOTO_EMPLOYE__DATE_EMBAUCHE, newDateEmbauche);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDiplomes() {
		return (EList<String>)eDynamicGet(MutPackage.PHOTO_EMPLOYE__DIPLOMES, MutPackage.Literals.PHOTO_EMPLOYE__DIPLOMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePrecedentEntretien() {
		return (Date)eDynamicGet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrecedentEntretien(Date newDatePrecedentEntretien) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN, newDatePrecedentEntretien);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePrecedentEntretienPro() {
		return (Date)eDynamicGet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrecedentEntretienPro(Date newDatePrecedentEntretienPro) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO, newDatePrecedentEntretienPro);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatePrecedentEntretienAnnuel() {
		return (Date)eDynamicGet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatePrecedentEntretienAnnuel(Date newDatePrecedentEntretienAnnuel) {
		eDynamicSet(MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL, MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL, newDatePrecedentEntretienAnnuel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.PHOTO_EMPLOYE__PRENOM:
				return getPrenom();
			case MutPackage.PHOTO_EMPLOYE__AGE:
				return getAge();
			case MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT:
				return getEtablissement();
			case MutPackage.PHOTO_EMPLOYE__EMPLOI:
				return getEmploi();
			case MutPackage.PHOTO_EMPLOYE__CLASSIFICATION:
				return getClassification();
			case MutPackage.PHOTO_EMPLOYE__RESPONSABLE:
				return getResponsable();
			case MutPackage.PHOTO_EMPLOYE__NOM:
				return getNom();
			case MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE:
				return getDateEmbauche();
			case MutPackage.PHOTO_EMPLOYE__DIPLOMES:
				return getDiplomes();
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN:
				return getDatePrecedentEntretien();
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO:
				return getDatePrecedentEntretienPro();
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL:
				return getDatePrecedentEntretienAnnuel();
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
			case MutPackage.PHOTO_EMPLOYE__PRENOM:
				setPrenom((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__AGE:
				setAge((Integer)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT:
				setEtablissement((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__EMPLOI:
				setEmploi((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__RESPONSABLE:
				setResponsable((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__NOM:
				setNom((String)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche((Date)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__DIPLOMES:
				getDiplomes().clear();
				getDiplomes().addAll((Collection<? extends String>)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN:
				setDatePrecedentEntretien((Date)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO:
				setDatePrecedentEntretienPro((Date)newValue);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL:
				setDatePrecedentEntretienAnnuel((Date)newValue);
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
			case MutPackage.PHOTO_EMPLOYE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT:
				setEtablissement(ETABLISSEMENT_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__EMPLOI:
				setEmploi(EMPLOI_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__RESPONSABLE:
				setResponsable(RESPONSABLE_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche(DATE_EMBAUCHE_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__DIPLOMES:
				getDiplomes().clear();
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN:
				setDatePrecedentEntretien(DATE_PRECEDENT_ENTRETIEN_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO:
				setDatePrecedentEntretienPro(DATE_PRECEDENT_ENTRETIEN_PRO_EDEFAULT);
				return;
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL:
				setDatePrecedentEntretienAnnuel(DATE_PRECEDENT_ENTRETIEN_ANNUEL_EDEFAULT);
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
			case MutPackage.PHOTO_EMPLOYE__PRENOM:
				return PRENOM_EDEFAULT == null ? getPrenom() != null : !PRENOM_EDEFAULT.equals(getPrenom());
			case MutPackage.PHOTO_EMPLOYE__AGE:
				return getAge() != AGE_EDEFAULT;
			case MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT:
				return ETABLISSEMENT_EDEFAULT == null ? getEtablissement() != null : !ETABLISSEMENT_EDEFAULT.equals(getEtablissement());
			case MutPackage.PHOTO_EMPLOYE__EMPLOI:
				return EMPLOI_EDEFAULT == null ? getEmploi() != null : !EMPLOI_EDEFAULT.equals(getEmploi());
			case MutPackage.PHOTO_EMPLOYE__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? getClassification() != null : !CLASSIFICATION_EDEFAULT.equals(getClassification());
			case MutPackage.PHOTO_EMPLOYE__RESPONSABLE:
				return RESPONSABLE_EDEFAULT == null ? getResponsable() != null : !RESPONSABLE_EDEFAULT.equals(getResponsable());
			case MutPackage.PHOTO_EMPLOYE__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE:
				return DATE_EMBAUCHE_EDEFAULT == null ? getDateEmbauche() != null : !DATE_EMBAUCHE_EDEFAULT.equals(getDateEmbauche());
			case MutPackage.PHOTO_EMPLOYE__DIPLOMES:
				return !getDiplomes().isEmpty();
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN:
				return DATE_PRECEDENT_ENTRETIEN_EDEFAULT == null ? getDatePrecedentEntretien() != null : !DATE_PRECEDENT_ENTRETIEN_EDEFAULT.equals(getDatePrecedentEntretien());
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO:
				return DATE_PRECEDENT_ENTRETIEN_PRO_EDEFAULT == null ? getDatePrecedentEntretienPro() != null : !DATE_PRECEDENT_ENTRETIEN_PRO_EDEFAULT.equals(getDatePrecedentEntretienPro());
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL:
				return DATE_PRECEDENT_ENTRETIEN_ANNUEL_EDEFAULT == null ? getDatePrecedentEntretienAnnuel() != null : !DATE_PRECEDENT_ENTRETIEN_ANNUEL_EDEFAULT.equals(getDatePrecedentEntretienAnnuel());
		}
		return super.eIsSet(featureID);
	}

} //PhotoEmployeImpl
