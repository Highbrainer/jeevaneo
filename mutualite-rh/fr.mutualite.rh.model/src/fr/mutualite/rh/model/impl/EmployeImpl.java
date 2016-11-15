package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SessionFormation;

import fr.mutualite.rh.model.util.MutValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getNomJeuneFille <em>Nom Jeune Fille</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getDateNaissance <em>Date Naissance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getDateEmbauche <em>Date Embauche</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getAffectationsEmploi <em>Affectations Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getAffectationEmploiCourante <em>Affectation Emploi Courante</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getAffectationsClassification <em>Affectations Classification</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getAffectationClassificationCourante <em>Affectation Classification Courante</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getSessionsFormation <em>Sessions Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEntretiens <em>Entretiens</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEntretiensMenes <em>Entretiens Menes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getDateSortieEntreprise <em>Date Sortie Entreprise</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getSubalternes <em>Subalternes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEtablissementsEnResponsabilite <em>Etablissements En Responsabilite</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEntreteneurs <em>Entreteneurs</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getEmployesEntretenus <em>Employes Entretenus</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EmployeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends CDOObjectImpl implements Employe {
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
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;
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
	 * The default value of the '{@link #getNomJeuneFille() <em>Nom Jeune Fille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomJeuneFille()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_JEUNE_FILLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDateNaissance() <em>Date Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_NAISSANCE_EDEFAULT = null;
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
	 * The default value of the '{@link #getDateSortieEntreprise() <em>Date Sortie Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateSortieEntreprise()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_SORTIE_ENTREPRISE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.EMPLOYE;
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
	public int getMatricule() {
		return (Integer)eDynamicGet(MutPackage.EMPLOYE__MATRICULE, MutPackage.Literals.EMPLOYE__MATRICULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		eDynamicSet(MutPackage.EMPLOYE__MATRICULE, MutPackage.Literals.EMPLOYE__MATRICULE, newMatricule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return (String)eDynamicGet(MutPackage.EMPLOYE__PRENOM, MutPackage.Literals.EMPLOYE__PRENOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		eDynamicSet(MutPackage.EMPLOYE__PRENOM, MutPackage.Literals.EMPLOYE__PRENOM, newPrenom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return (String)eDynamicGet(MutPackage.EMPLOYE__NOM, MutPackage.Literals.EMPLOYE__NOM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		eDynamicSet(MutPackage.EMPLOYE__NOM, MutPackage.Literals.EMPLOYE__NOM, newNom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomJeuneFille() {
		return (String)eDynamicGet(MutPackage.EMPLOYE__NOM_JEUNE_FILLE, MutPackage.Literals.EMPLOYE__NOM_JEUNE_FILLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomJeuneFille(String newNomJeuneFille) {
		eDynamicSet(MutPackage.EMPLOYE__NOM_JEUNE_FILLE, MutPackage.Literals.EMPLOYE__NOM_JEUNE_FILLE, newNomJeuneFille);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateNaissance/*Gen*/() {
		return (Date)eDynamicGet(MutPackage.EMPLOYE__DATE_NAISSANCE, MutPackage.Literals.EMPLOYE__DATE_NAISSANCE, true, true);
	}
	
//	public Date getDateNaissance() {
//		if(null==getDateNaissanceGen()) {
//			return null;
//		}
//		return new Date(getDateNaissanceGen().getTime()-(long)30*365*24*3600*1000);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateNaissance/*Gen*/(Date newDateNaissance) {
		eDynamicSet(MutPackage.EMPLOYE__DATE_NAISSANCE, MutPackage.Literals.EMPLOYE__DATE_NAISSANCE, newDateNaissance);
	}
//	public void setDateNaissance(Date newDateNaissance) {
//		if(null==newDateNaissance) {
//			setDateNaissanceGen(null);
//		}
//		setDateNaissanceGen(new Date(newDateNaissance.getTime()+(long)30*365*24*3600*1000));
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateEmbauche() {
		return (Date)eDynamicGet(MutPackage.EMPLOYE__DATE_EMBAUCHE, MutPackage.Literals.EMPLOYE__DATE_EMBAUCHE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEmbauche(Date newDateEmbauche) {
		eDynamicSet(MutPackage.EMPLOYE__DATE_EMBAUCHE, MutPackage.Literals.EMPLOYE__DATE_EMBAUCHE, newDateEmbauche);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getDiplomes() {
		return (EList<String>)eDynamicGet(MutPackage.EMPLOYE__DIPLOMES, MutPackage.Literals.EMPLOYE__DIPLOMES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etablissement getEtablissement() {
		return (Etablissement)eDynamicGet(MutPackage.EMPLOYE__ETABLISSEMENT, MutPackage.Literals.EMPLOYE__ETABLISSEMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etablissement basicGetEtablissement() {
		return (Etablissement)eDynamicGet(MutPackage.EMPLOYE__ETABLISSEMENT, MutPackage.Literals.EMPLOYE__ETABLISSEMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtablissement(Etablissement newEtablissement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEtablissement, MutPackage.EMPLOYE__ETABLISSEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissement(Etablissement newEtablissement) {
		eDynamicSet(MutPackage.EMPLOYE__ETABLISSEMENT, MutPackage.Literals.EMPLOYE__ETABLISSEMENT, newEtablissement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Affectation> getAffectationsEmploi() {
		return (EList<Affectation>)eDynamicGet(MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI, MutPackage.Literals.EMPLOYE__AFFECTATIONS_EMPLOI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation getAffectationEmploiCourante() {
		return (Affectation)eDynamicGet(MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation basicGetAffectationEmploiCourante() {
		return (Affectation)eDynamicGet(MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectationEmploiCourante(Affectation newAffectationEmploiCourante) {
		eDynamicSet(MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_EMPLOI_COURANTE, newAffectationEmploiCourante);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AffectationClassification> getAffectationsClassification() {
		return (EList<AffectationClassification>)eDynamicGet(MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION, MutPackage.Literals.EMPLOYE__AFFECTATIONS_CLASSIFICATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationClassification getAffectationClassificationCourante() {
		return (AffectationClassification)eDynamicGet(MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationClassification basicGetAffectationClassificationCourante() {
		return (AffectationClassification)eDynamicGet(MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffectationClassificationCourante(AffectationClassification newAffectationClassificationCourante) {
		eDynamicSet(MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, MutPackage.Literals.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE, newAffectationClassificationCourante);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SessionFormation> getSessionsFormation() {
		return (EList<SessionFormation>)eDynamicGet(MutPackage.EMPLOYE__SESSIONS_FORMATION, MutPackage.Literals.EMPLOYE__SESSIONS_FORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entretien> getEntretiens() {
		return (EList<Entretien>)eDynamicGet(MutPackage.EMPLOYE__ENTRETIENS, MutPackage.Literals.EMPLOYE__ENTRETIENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Entretien> getEntretiensMenes() {
		return (EList<Entretien>)eDynamicGet(MutPackage.EMPLOYE__ENTRETIENS_MENES, MutPackage.Literals.EMPLOYE__ENTRETIENS_MENES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateSortieEntreprise() {
		return (Date)eDynamicGet(MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE, MutPackage.Literals.EMPLOYE__DATE_SORTIE_ENTREPRISE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateSortieEntreprise(Date newDateSortieEntreprise) {
		eDynamicSet(MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE, MutPackage.Literals.EMPLOYE__DATE_SORTIE_ENTREPRISE, newDateSortieEntreprise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe getResponsable() {
		return (Employe)eDynamicGet(MutPackage.EMPLOYE__RESPONSABLE, MutPackage.Literals.EMPLOYE__RESPONSABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe basicGetResponsable() {
		return (Employe)eDynamicGet(MutPackage.EMPLOYE__RESPONSABLE, MutPackage.Literals.EMPLOYE__RESPONSABLE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsable(Employe newResponsable, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newResponsable, MutPackage.EMPLOYE__RESPONSABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Employe newResponsable) {
		eDynamicSet(MutPackage.EMPLOYE__RESPONSABLE, MutPackage.Literals.EMPLOYE__RESPONSABLE, newResponsable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getSubalternes() {
		return (EList<Employe>)eDynamicGet(MutPackage.EMPLOYE__SUBALTERNES, MutPackage.Literals.EMPLOYE__SUBALTERNES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Etablissement> getEtablissementsEnResponsabilite() {
		return (EList<Etablissement>)eDynamicGet(MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE, MutPackage.Literals.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getEntreteneurs() {
		return (EList<Employe>)eDynamicGet(MutPackage.EMPLOYE__ENTRETENEURS, MutPackage.Literals.EMPLOYE__ENTRETENEURS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Employe> getEmployesEntretenus() {
		return (EList<Employe>)eDynamicGet(MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS, MutPackage.Literals.EMPLOYE__EMPLOYES_ENTRETENUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLabel() {
		return "" + getNom() + " " + getPrenom() + ((getNomJeuneFille()!=null && !getNomJeuneFille().trim().isEmpty() && !getNomJeuneFille().equalsIgnoreCase(getNom()))?(", née " + getNomJeuneFille()):"") + " (" + getMatricule() + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasValidAffectationEmploiCourante(DiagnosticChain chain, Map<Object, Object> context) {
		
		if (getAffectationEmploiCourante()!=null && !getAffectationsEmploi().contains(getAffectationEmploiCourante())) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MutValidator.DIAGNOSTIC_SOURCE,
						 MutValidator.EMPLOYE__HAS_VALID_AFFECTATION_EMPLOI_COURANTE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasValidAffectationEmploiCourante", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasOneAndOnlyOneAffectationEmploiCourante(DiagnosticChain chain, Map<Object, Object> context) {
		int counter=0;
		EList<Affectation> affectationsEmploi2 = getAffectationsEmploi();
		for (Affectation ae : affectationsEmploi2) {
			if(ae.getDateFin()==null) {
				++counter;
			}
		}
		if (counter==0 || counter>1) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MutValidator.DIAGNOSTIC_SOURCE,
						 MutValidator.EMPLOYE__HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasOneAndOnlyOneAffectationEmploiCourante", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasOneAndOnlyOneAffectationClassificationCourante(DiagnosticChain chain, Map<Object, Object> context) {
		int counter=0;
		EList<AffectationClassification> affectations = getAffectationsClassification();
		for (AffectationClassification a : affectations) {
			if(a.getDateFin()==null) {
				++counter;
			}
		}
		if (counter==0 || counter>1) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MutValidator.DIAGNOSTIC_SOURCE,
						 MutValidator.EMPLOYE__HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasOneAndOnlyOneAffectationClassificationCourante", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasValidAffectationClassificationCourante(DiagnosticChain chain, Map<Object, Object> context) {
		if (getAffectationClassificationCourante()!=null && !getAffectationsClassification().contains(getAffectationClassificationCourante())) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MutValidator.DIAGNOSTIC_SOURCE,
						 MutValidator.EMPLOYE__HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "hasValidAffectationClassificationCourante", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Employe responsable() {
		Employe responsable = getResponsable();
		if(null!=responsable) {
			return responsable;
		}
		Etablissement etablissement = getEtablissement();
		if(null==etablissement) {
			return null;
		}
		return etablissement.getResponsable();
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
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				Etablissement etablissement = basicGetEtablissement();
				if (etablissement != null)
					msgs = ((InternalEObject)etablissement).eInverseRemove(this, MutPackage.ETABLISSEMENT__EMPLOYES, Etablissement.class, msgs);
				return basicSetEtablissement((Etablissement)otherEnd, msgs);
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSessionsFormation()).basicAdd(otherEnd, msgs);
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntretiensMenes()).basicAdd(otherEnd, msgs);
			case MutPackage.EMPLOYE__RESPONSABLE:
				Employe responsable = basicGetResponsable();
				if (responsable != null)
					msgs = ((InternalEObject)responsable).eInverseRemove(this, MutPackage.EMPLOYE__SUBALTERNES, Employe.class, msgs);
				return basicSetResponsable((Employe)otherEnd, msgs);
			case MutPackage.EMPLOYE__SUBALTERNES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubalternes()).basicAdd(otherEnd, msgs);
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEtablissementsEnResponsabilite()).basicAdd(otherEnd, msgs);
			case MutPackage.EMPLOYE__ENTRETENEURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntreteneurs()).basicAdd(otherEnd, msgs);
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEmployesEntretenus()).basicAdd(otherEnd, msgs);
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
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				return basicSetEtablissement(null, msgs);
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
				return ((InternalEList<?>)getAffectationsEmploi()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
				return ((InternalEList<?>)getAffectationsClassification()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				return ((InternalEList<?>)getSessionsFormation()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__ENTRETIENS:
				return ((InternalEList<?>)getEntretiens()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				return ((InternalEList<?>)getEntretiensMenes()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__RESPONSABLE:
				return basicSetResponsable(null, msgs);
			case MutPackage.EMPLOYE__SUBALTERNES:
				return ((InternalEList<?>)getSubalternes()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				return ((InternalEList<?>)getEtablissementsEnResponsabilite()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__ENTRETENEURS:
				return ((InternalEList<?>)getEntreteneurs()).basicRemove(otherEnd, msgs);
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				return ((InternalEList<?>)getEmployesEntretenus()).basicRemove(otherEnd, msgs);
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
			case MutPackage.EMPLOYE__MATRICULE:
				return getMatricule();
			case MutPackage.EMPLOYE__PRENOM:
				return getPrenom();
			case MutPackage.EMPLOYE__NOM:
				return getNom();
			case MutPackage.EMPLOYE__NOM_JEUNE_FILLE:
				return getNomJeuneFille();
			case MutPackage.EMPLOYE__DATE_NAISSANCE:
				return getDateNaissance();
			case MutPackage.EMPLOYE__DATE_EMBAUCHE:
				return getDateEmbauche();
			case MutPackage.EMPLOYE__DIPLOMES:
				return getDiplomes();
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				if (resolve) return getEtablissement();
				return basicGetEtablissement();
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
				return getAffectationsEmploi();
			case MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE:
				if (resolve) return getAffectationEmploiCourante();
				return basicGetAffectationEmploiCourante();
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
				return getAffectationsClassification();
			case MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE:
				if (resolve) return getAffectationClassificationCourante();
				return basicGetAffectationClassificationCourante();
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				return getSessionsFormation();
			case MutPackage.EMPLOYE__ENTRETIENS:
				return getEntretiens();
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				return getEntretiensMenes();
			case MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE:
				return getDateSortieEntreprise();
			case MutPackage.EMPLOYE__RESPONSABLE:
				if (resolve) return getResponsable();
				return basicGetResponsable();
			case MutPackage.EMPLOYE__SUBALTERNES:
				return getSubalternes();
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				return getEtablissementsEnResponsabilite();
			case MutPackage.EMPLOYE__ENTRETENEURS:
				return getEntreteneurs();
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				return getEmployesEntretenus();
			case MutPackage.EMPLOYE__LABEL:
				return getLabel();
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
			case MutPackage.EMPLOYE__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case MutPackage.EMPLOYE__PRENOM:
				setPrenom((String)newValue);
				return;
			case MutPackage.EMPLOYE__NOM:
				setNom((String)newValue);
				return;
			case MutPackage.EMPLOYE__NOM_JEUNE_FILLE:
				setNomJeuneFille((String)newValue);
				return;
			case MutPackage.EMPLOYE__DATE_NAISSANCE:
				setDateNaissance((Date)newValue);
				return;
			case MutPackage.EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche((Date)newValue);
				return;
			case MutPackage.EMPLOYE__DIPLOMES:
				getDiplomes().clear();
				getDiplomes().addAll((Collection<? extends String>)newValue);
				return;
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				setEtablissement((Etablissement)newValue);
				return;
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
				getAffectationsEmploi().clear();
				getAffectationsEmploi().addAll((Collection<? extends Affectation>)newValue);
				return;
			case MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE:
				setAffectationEmploiCourante((Affectation)newValue);
				return;
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
				getAffectationsClassification().clear();
				getAffectationsClassification().addAll((Collection<? extends AffectationClassification>)newValue);
				return;
			case MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE:
				setAffectationClassificationCourante((AffectationClassification)newValue);
				return;
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				getSessionsFormation().clear();
				getSessionsFormation().addAll((Collection<? extends SessionFormation>)newValue);
				return;
			case MutPackage.EMPLOYE__ENTRETIENS:
				getEntretiens().clear();
				getEntretiens().addAll((Collection<? extends Entretien>)newValue);
				return;
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				getEntretiensMenes().clear();
				getEntretiensMenes().addAll((Collection<? extends Entretien>)newValue);
				return;
			case MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE:
				setDateSortieEntreprise((Date)newValue);
				return;
			case MutPackage.EMPLOYE__RESPONSABLE:
				setResponsable((Employe)newValue);
				return;
			case MutPackage.EMPLOYE__SUBALTERNES:
				getSubalternes().clear();
				getSubalternes().addAll((Collection<? extends Employe>)newValue);
				return;
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				getEtablissementsEnResponsabilite().clear();
				getEtablissementsEnResponsabilite().addAll((Collection<? extends Etablissement>)newValue);
				return;
			case MutPackage.EMPLOYE__ENTRETENEURS:
				getEntreteneurs().clear();
				getEntreteneurs().addAll((Collection<? extends Employe>)newValue);
				return;
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				getEmployesEntretenus().clear();
				getEmployesEntretenus().addAll((Collection<? extends Employe>)newValue);
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
			case MutPackage.EMPLOYE__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__PRENOM:
				setPrenom(PRENOM_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__NOM_JEUNE_FILLE:
				setNomJeuneFille(NOM_JEUNE_FILLE_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__DATE_NAISSANCE:
				setDateNaissance(DATE_NAISSANCE_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__DATE_EMBAUCHE:
				setDateEmbauche(DATE_EMBAUCHE_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__DIPLOMES:
				getDiplomes().clear();
				return;
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				setEtablissement((Etablissement)null);
				return;
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
				getAffectationsEmploi().clear();
				return;
			case MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE:
				setAffectationEmploiCourante((Affectation)null);
				return;
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
				getAffectationsClassification().clear();
				return;
			case MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE:
				setAffectationClassificationCourante((AffectationClassification)null);
				return;
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				getSessionsFormation().clear();
				return;
			case MutPackage.EMPLOYE__ENTRETIENS:
				getEntretiens().clear();
				return;
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				getEntretiensMenes().clear();
				return;
			case MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE:
				setDateSortieEntreprise(DATE_SORTIE_ENTREPRISE_EDEFAULT);
				return;
			case MutPackage.EMPLOYE__RESPONSABLE:
				setResponsable((Employe)null);
				return;
			case MutPackage.EMPLOYE__SUBALTERNES:
				getSubalternes().clear();
				return;
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				getEtablissementsEnResponsabilite().clear();
				return;
			case MutPackage.EMPLOYE__ENTRETENEURS:
				getEntreteneurs().clear();
				return;
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				getEmployesEntretenus().clear();
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
			case MutPackage.EMPLOYE__MATRICULE:
				return getMatricule() != MATRICULE_EDEFAULT;
			case MutPackage.EMPLOYE__PRENOM:
				return PRENOM_EDEFAULT == null ? getPrenom() != null : !PRENOM_EDEFAULT.equals(getPrenom());
			case MutPackage.EMPLOYE__NOM:
				return NOM_EDEFAULT == null ? getNom() != null : !NOM_EDEFAULT.equals(getNom());
			case MutPackage.EMPLOYE__NOM_JEUNE_FILLE:
				return NOM_JEUNE_FILLE_EDEFAULT == null ? getNomJeuneFille() != null : !NOM_JEUNE_FILLE_EDEFAULT.equals(getNomJeuneFille());
			case MutPackage.EMPLOYE__DATE_NAISSANCE:
				return DATE_NAISSANCE_EDEFAULT == null ? getDateNaissance() != null : !DATE_NAISSANCE_EDEFAULT.equals(getDateNaissance());
			case MutPackage.EMPLOYE__DATE_EMBAUCHE:
				return DATE_EMBAUCHE_EDEFAULT == null ? getDateEmbauche() != null : !DATE_EMBAUCHE_EDEFAULT.equals(getDateEmbauche());
			case MutPackage.EMPLOYE__DIPLOMES:
				return !getDiplomes().isEmpty();
			case MutPackage.EMPLOYE__ETABLISSEMENT:
				return basicGetEtablissement() != null;
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
				return !getAffectationsEmploi().isEmpty();
			case MutPackage.EMPLOYE__AFFECTATION_EMPLOI_COURANTE:
				return basicGetAffectationEmploiCourante() != null;
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
				return !getAffectationsClassification().isEmpty();
			case MutPackage.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE:
				return basicGetAffectationClassificationCourante() != null;
			case MutPackage.EMPLOYE__SESSIONS_FORMATION:
				return !getSessionsFormation().isEmpty();
			case MutPackage.EMPLOYE__ENTRETIENS:
				return !getEntretiens().isEmpty();
			case MutPackage.EMPLOYE__ENTRETIENS_MENES:
				return !getEntretiensMenes().isEmpty();
			case MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE:
				return DATE_SORTIE_ENTREPRISE_EDEFAULT == null ? getDateSortieEntreprise() != null : !DATE_SORTIE_ENTREPRISE_EDEFAULT.equals(getDateSortieEntreprise());
			case MutPackage.EMPLOYE__RESPONSABLE:
				return basicGetResponsable() != null;
			case MutPackage.EMPLOYE__SUBALTERNES:
				return !getSubalternes().isEmpty();
			case MutPackage.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE:
				return !getEtablissementsEnResponsabilite().isEmpty();
			case MutPackage.EMPLOYE__ENTRETENEURS:
				return !getEntreteneurs().isEmpty();
			case MutPackage.EMPLOYE__EMPLOYES_ENTRETENUS:
				return !getEmployesEntretenus().isEmpty();
			case MutPackage.EMPLOYE__LABEL:
				return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MutPackage.EMPLOYE___HAS_VALID_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP:
				return hasValidAffectationEmploiCourante((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MutPackage.EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP:
				return hasOneAndOnlyOneAffectationEmploiCourante((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MutPackage.EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP:
				return hasOneAndOnlyOneAffectationClassificationCourante((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MutPackage.EMPLOYE___HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP:
				return hasValidAffectationClassificationCourante((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case MutPackage.EMPLOYE___RESPONSABLE:
				return responsable();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EmployeImpl
