/**
 */
package fr.mutualite.rh.model.dto.impl;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.Formulaire;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Formulaire</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getService <em>Service</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getPoste <em>Poste</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getMenePar <em>Mene Par</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getEntretien <em>Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getAnciennete <em>Anciennete</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.impl.FormulaireImpl#getDateEntreeEntreprise <em>Date Entree Entreprise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaireImpl extends CDOObjectImpl implements Formulaire {
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
	 * The default value of the '{@link #getDiplomes() <em>Diplomes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiplomes()
	 * @generated
	 * @ordered
	 */
	protected static final String DIPLOMES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getService() <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPoste() <em>Poste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoste()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTE_EDEFAULT = null;
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
	 * The default value of the '{@link #getMenePar() <em>Mene Par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenePar()
	 * @generated
	 * @ordered
	 */
	protected static final String MENE_PAR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
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
	 * The default value of the '{@link #getAnciennete() <em>Anciennete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnciennete()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCIENNETE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDateEntreeEntreprise() <em>Date Entree Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEntreeEntreprise()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ENTREE_ENTREPRISE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtoPackage.Literals.FORMULAIRE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getPrenom() {
		return getEntretien().employe().getPrenom();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getMatricule() {
		return getEntretien().employe().getMatricule();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getNom() {
		return getEntretien().employe().getNom();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getDiplomes() {

		return getEntretien().employe().getDiplomes().stream().collect(Collectors.joining(", "));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getService() {

		return getEntretien().employe().getEtablissement().getNom();
	}

	private static final DateFormat df = DateFormat.getDateInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getPoste() {

		Employe employe = getEntretien().employe();
		Affectation affectation = employe.getAffectationEmploiCourante();
		if(null==affectation) {
			System.err.println("Pas d'affectation pour " + employe.getMatricule() + " " + employe.getNom() + " " + employe.getPrenom());
			return "!!!Emploi courant non renseigné!!!";
		} 
		String ret = affectation.getEmploi().getIntitule();
		AffectationClassification affectationClassificationCourante = employe.getAffectationClassificationCourante();
		String classif = affectationClassificationCourante.getClassification().getLiteral();
		ret += " " + classif;
		Date debut = affectation.getDateDebut();
		if (debut != null) {
			ret += " depuis le " + df.format(debut);
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getResponsable() {

		Employe responsable = getEntretien().employe().responsable();
		if (null == responsable) {
			return "Pas de responsable renseigné!";
		}
		return responsable.getPrenom() + " " + responsable.getNom();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getMenePar() {

		Employe meneur = getEntretien().getMeneur();
		if (null == meneur) {
			return "Non renseigné!";
		}
		return meneur.getPrenom() + " " + meneur.getNom();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Entretien getEntretien() {
		return (Entretien)eDynamicGet(DtoPackage.FORMULAIRE__ENTRETIEN, DtoPackage.Literals.FORMULAIRE__ENTRETIEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entretien basicGetEntretien() {
		return (Entretien)eDynamicGet(DtoPackage.FORMULAIRE__ENTRETIEN, DtoPackage.Literals.FORMULAIRE__ENTRETIEN, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntretien(Entretien newEntretien) {
		eDynamicSet(DtoPackage.FORMULAIRE__ENTRETIEN, DtoPackage.Literals.FORMULAIRE__ENTRETIEN, newEntretien);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getDate() {
		return getEntretien().getDate();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Date getDatePrecedentEntretien() {
		Optional<Entretien> max = getEntretien().employe().getEntretiens().stream().filter(e -> e.getDate()!=null && e.getDate().before(getEntretien().getDate())).max((e1, e2) -> e1.getDate().compareTo(e2.getDate()));
		if(max.isPresent()) {
			return max.get().getDate();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAnciennete() {

		Employe employe = getEntretien().employe();
		Affectation affectation = employe.getAffectationEmploiCourante();

		if(null==affectation) {
			System.err.println("Pas d'affectation pour " + employe.getMatricule() + " " + employe.getNom() + " " + employe.getPrenom());
			return "!!!Emploi courant non renseigné!!!";
		} 
		Date debut = affectation.getDateDebut();
		if (debut == null) {
			return "Non renseignée!";
		}
		
		Period period = Period.between(debut.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
		return format(period);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date getDateEntreeEntreprise() {
		return getEntretien().employe().getDateEmbauche();
	}

	private static String format(Period p) {
		StringBuilder ret = new StringBuilder();
		int years = p.getYears();
		int months = p.getMonths();
		int days = p.getDays();
		if(years>0) {
			ret.append(years);
			ret.append(" ans ");
		}
		if(months>0) {
			ret.append(months);
			ret.append(" mois ");
		}
		if(days>0) {
			ret.append(days);
			ret.append(" jours");
		}
		return ret.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtoPackage.FORMULAIRE__PRENOM:
				return getPrenom();
			case DtoPackage.FORMULAIRE__MATRICULE:
				return getMatricule();
			case DtoPackage.FORMULAIRE__NOM:
				return getNom();
			case DtoPackage.FORMULAIRE__DIPLOMES:
				return getDiplomes();
			case DtoPackage.FORMULAIRE__SERVICE:
				return getService();
			case DtoPackage.FORMULAIRE__POSTE:
				return getPoste();
			case DtoPackage.FORMULAIRE__RESPONSABLE:
				return getResponsable();
			case DtoPackage.FORMULAIRE__MENE_PAR:
				return getMenePar();
			case DtoPackage.FORMULAIRE__ENTRETIEN:
				if (resolve) return getEntretien();
				return basicGetEntretien();
			case DtoPackage.FORMULAIRE__DATE:
				return getDate();
			case DtoPackage.FORMULAIRE__DATE_PRECEDENT_ENTRETIEN:
				return getDatePrecedentEntretien();
			case DtoPackage.FORMULAIRE__ANCIENNETE:
				return getAnciennete();
			case DtoPackage.FORMULAIRE__DATE_ENTREE_ENTREPRISE:
				return getDateEntreeEntreprise();
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
			case DtoPackage.FORMULAIRE__ENTRETIEN:
				setEntretien((Entretien)newValue);
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
			case DtoPackage.FORMULAIRE__ENTRETIEN:
				setEntretien((Entretien)null);
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
			case DtoPackage.FORMULAIRE__PRENOM:
				return PRENOM_EDEFAULT == null ? getPrenom() != null : !PRENOM_EDEFAULT.equals(getPrenom());
			case DtoPackage.FORMULAIRE__MATRICULE:
				return getMatricule() != MATRICULE_EDEFAULT;
			case DtoPackage.FORMULAIRE__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case DtoPackage.FORMULAIRE__DIPLOMES:
				return DIPLOMES_EDEFAULT == null ? getDiplomes() != null : !DIPLOMES_EDEFAULT.equals(getDiplomes());
			case DtoPackage.FORMULAIRE__SERVICE:
				return SERVICE_EDEFAULT == null ? getService() != null : !SERVICE_EDEFAULT.equals(getService());
			case DtoPackage.FORMULAIRE__POSTE:
				return POSTE_EDEFAULT == null ? getPoste() != null : !POSTE_EDEFAULT.equals(getPoste());
			case DtoPackage.FORMULAIRE__RESPONSABLE:
				return RESPONSABLE_EDEFAULT == null ? getResponsable() != null : !RESPONSABLE_EDEFAULT.equals(getResponsable());
			case DtoPackage.FORMULAIRE__MENE_PAR:
				return MENE_PAR_EDEFAULT == null ? getMenePar() != null : !MENE_PAR_EDEFAULT.equals(getMenePar());
			case DtoPackage.FORMULAIRE__ENTRETIEN:
				return basicGetEntretien() != null;
			case DtoPackage.FORMULAIRE__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case DtoPackage.FORMULAIRE__DATE_PRECEDENT_ENTRETIEN:
				return DATE_PRECEDENT_ENTRETIEN_EDEFAULT == null ? getDatePrecedentEntretien() != null : !DATE_PRECEDENT_ENTRETIEN_EDEFAULT.equals(getDatePrecedentEntretien());
			case DtoPackage.FORMULAIRE__ANCIENNETE:
				return ANCIENNETE_EDEFAULT == null ? getAnciennete() != null : !ANCIENNETE_EDEFAULT.equals(getAnciennete());
			case DtoPackage.FORMULAIRE__DATE_ENTREE_ENTREPRISE:
				return DATE_ENTREE_ENTREPRISE_EDEFAULT == null ? getDateEntreeEntreprise() != null : !DATE_ENTREE_ENTREPRISE_EDEFAULT.equals(getDateEntreeEntreprise());
		}
		return super.eIsSet(featureID);
	}

} // FormulaireImpl
