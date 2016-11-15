/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Affectation;
import fr.mutualite.rh.model.AffectationClassification;
import fr.mutualite.rh.model.Appreciation;
import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Avis;
import fr.mutualite.rh.model.ClassificationStatut;
import fr.mutualite.rh.model.Effectif;
import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.Emplois;
import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.Etablissement;
import fr.mutualite.rh.model.Etablissements;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Mutualite;
import fr.mutualite.rh.model.OrganismeFormation;
import fr.mutualite.rh.model.Organismes;
import fr.mutualite.rh.model.Role;
import fr.mutualite.rh.model.SessionFormation;

import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import fr.mutualite.rh.model.Utilisateur;
import fr.mutualite.rh.model.Utilisateurs;
import fr.mutualite.rh.model.config.ConfigPackage;
import fr.mutualite.rh.model.config.impl.ConfigPackageImpl;
import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.impl.DtoPackageImpl;
import fr.mutualite.rh.model.util.MutValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutPackageImpl extends EPackageImpl implements MutPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etablissementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilisateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilisateursEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emploiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectationClassificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organismeFormationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionFormationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entretienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entretienProfessionnelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appreciationSessionFormationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass souhaitFormationEvaluateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass souhaitFormationSalarieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mutualiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etablissementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emploisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organismesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationStatutEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appreciationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum avisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.mutualite.rh.model.MutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MutPackageImpl() {
		super(eNS_URI, MutFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MutPackage init() {
		if (isInited) return (MutPackage)EPackage.Registry.INSTANCE.getEPackage(MutPackage.eNS_URI);

		// Obtain or create and register package
		MutPackageImpl theMutPackage = (MutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MutPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DtoPackageImpl theDtoPackage = (DtoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DtoPackage.eNS_URI) instanceof DtoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DtoPackage.eNS_URI) : DtoPackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);

		// Create package meta-data objects
		theMutPackage.createPackageContents();
		theDtoPackage.createPackageContents();
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theMutPackage.initializePackageContents();
		theDtoPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMutPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MutValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MutPackage.eNS_URI, theMutPackage);
		return theMutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtablissement() {
		return etablissementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtablissement_Nom() {
		return (EAttribute)etablissementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtablissement_Employes() {
		return (EReference)etablissementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtablissement_Id() {
		return (EAttribute)etablissementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtablissement_Responsable() {
		return (EReference)etablissementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilisateur() {
		return utilisateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilisateur_Employe() {
		return (EReference)utilisateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilisateur_Login() {
		return (EAttribute)utilisateurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUtilisateur_Roles() {
		return (EAttribute)utilisateurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilisateurs() {
		return utilisateursEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilisateurs_Utilisateurs() {
		return (EReference)utilisateursEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmploye() {
		return employeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Matricule() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Prenom() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Nom() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_NomJeuneFille() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_DateNaissance() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_DateEmbauche() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Diplomes() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Etablissement() {
		return (EReference)employeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_AffectationsEmploi() {
		return (EReference)employeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_AffectationEmploiCourante() {
		return (EReference)employeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_AffectationsClassification() {
		return (EReference)employeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_AffectationClassificationCourante() {
		return (EReference)employeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_SessionsFormation() {
		return (EReference)employeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Entretiens() {
		return (EReference)employeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_EntretiensMenes() {
		return (EReference)employeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_DateSortieEntreprise() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Responsable() {
		return (EReference)employeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Subalternes() {
		return (EReference)employeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_EtablissementsEnResponsabilite() {
		return (EReference)employeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_Entreteneurs() {
		return (EReference)employeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmploye_EmployesEntretenus() {
		return (EReference)employeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploye_Label() {
		return (EAttribute)employeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmploye__HasValidAffectationEmploiCourante__DiagnosticChain_Map() {
		return employeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmploye__HasOneAndOnlyOneAffectationEmploiCourante__DiagnosticChain_Map() {
		return employeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmploye__HasOneAndOnlyOneAffectationClassificationCourante__DiagnosticChain_Map() {
		return employeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmploye__HasValidAffectationClassificationCourante__DiagnosticChain_Map() {
		return employeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmploye__Responsable() {
		return employeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectation() {
		return affectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectation_DateDebut() {
		return (EAttribute)affectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectation_DateFin() {
		return (EAttribute)affectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectation_Emploi() {
		return (EReference)affectationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmploi() {
		return emploiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmploi_Intitule() {
		return (EAttribute)emploiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectationClassification() {
		return affectationClassificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectationClassification_DateDebut() {
		return (EAttribute)affectationClassificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectationClassification_DateFin() {
		return (EAttribute)affectationClassificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAffectationClassification_Classification() {
		return (EAttribute)affectationClassificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormation() {
		return formationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormation_Libelle() {
		return (EAttribute)formationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormation_Sessionformation() {
		return (EReference)formationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganismeFormation() {
		return organismeFormationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganismeFormation_Nom() {
		return (EAttribute)organismeFormationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganismeFormation_Formations() {
		return (EReference)organismeFormationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionFormation() {
		return sessionFormationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionFormation_DateFin() {
		return (EAttribute)sessionFormationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionFormation_DateDebut() {
		return (EAttribute)sessionFormationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSessionFormation_Duree() {
		return (EAttribute)sessionFormationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionFormation_Employes() {
		return (EReference)sessionFormationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionFormation_Appreciations() {
		return (EReference)sessionFormationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntretien() {
		return entretienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretien_Date() {
		return (EAttribute)entretienEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntretien_Meneur() {
		return (EReference)entretienEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretien_EnCours() {
		return (EAttribute)entretienEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretien_Fake() {
		return (EAttribute)entretienEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretien_Scan() {
		return (EAttribute)entretienEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntretien__Employe() {
		return entretienEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntretien__HasValidMeneur__DiagnosticChain_Map() {
		return entretienEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntretienProfessionnel() {
		return entretienProfessionnelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionDepuisDernierEntretien() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_CommentaireBilanFormation() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionSouhaiteeDansEmploiActuel() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionSouhaiteeDansNouvelEmploi() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_Echeance() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionSouhaiteeCompetencesAcquises() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionSouhaiteeCompetencesRequises() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_EvolutionSouhaiteeMoyensRealisation() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_AutresActionsDeveloppementCompetences() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_PerspectivesEvolutionProfessionnelle() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_PerspectivesEvolutionProfessionnelleCompetencesAssociees() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_AdequationProjetProBesoinsEntreprise() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_AdequationProjetProBesoinsEntrepriseCommentaire() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_RencontreRh() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_RencontreRhCommentaire() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntretienProfessionnel_Synthese() {
		return (EAttribute)entretienProfessionnelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntretienProfessionnel_AppreciationsSessionFormation() {
		return (EReference)entretienProfessionnelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntretienProfessionnel_SouhaitsFormationSalarie() {
		return (EReference)entretienProfessionnelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntretienProfessionnel_SouhaitsFormationEvaluateur() {
		return (EReference)entretienProfessionnelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntretienProfessionnel__HasValidSynthese__DiagnosticChain_Map() {
		return entretienProfessionnelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppreciationSessionFormation() {
		return appreciationSessionFormationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppreciationSessionFormation_Valeur() {
		return (EAttribute)appreciationSessionFormationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppreciationSessionFormation_SessionFormation() {
		return (EReference)appreciationSessionFormationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppreciationSessionFormation_IdFormation() {
		return (EAttribute)appreciationSessionFormationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppreciationSessionFormation_LibelleFormation() {
		return (EAttribute)appreciationSessionFormationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppreciationSessionFormation_DateFormation() {
		return (EAttribute)appreciationSessionFormationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSouhaitFormationEvaluateur() {
		return souhaitFormationEvaluateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSouhaitFormationEvaluateur_Texte() {
		return (EAttribute)souhaitFormationEvaluateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSouhaitFormationEvaluateur_Id() {
		return (EAttribute)souhaitFormationEvaluateurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSouhaitFormationSalarie() {
		return souhaitFormationSalarieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSouhaitFormationSalarie_Texte() {
		return (EAttribute)souhaitFormationSalarieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSouhaitFormationSalarie_AvisEvaluateur() {
		return (EAttribute)souhaitFormationSalarieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSouhaitFormationSalarie_Id() {
		return (EAttribute)souhaitFormationSalarieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMutualite() {
		return mutualiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualite_Etablissements() {
		return (EReference)mutualiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualite_Emplois() {
		return (EReference)mutualiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualite_Effectif() {
		return (EReference)mutualiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualite_Organismes() {
		return (EReference)mutualiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMutualite_Utilisateurs() {
		return (EReference)mutualiteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtablissements() {
		return etablissementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtablissements_Etablissements() {
		return (EReference)etablissementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmplois() {
		return emploisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmplois_Emplois() {
		return (EReference)emploisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectif() {
		return effectifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffectif_Employes() {
		return (EReference)effectifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganismes() {
		return organismesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganismes_OrganismeFormations() {
		return (EReference)organismesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClassificationStatut() {
		return classificationStatutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppreciation() {
		return appreciationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvis() {
		return avisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutFactory getMutFactory() {
		return (MutFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		employeEClass = createEClass(EMPLOYE);
		createEAttribute(employeEClass, EMPLOYE__MATRICULE);
		createEAttribute(employeEClass, EMPLOYE__PRENOM);
		createEAttribute(employeEClass, EMPLOYE__NOM);
		createEAttribute(employeEClass, EMPLOYE__NOM_JEUNE_FILLE);
		createEAttribute(employeEClass, EMPLOYE__DATE_NAISSANCE);
		createEAttribute(employeEClass, EMPLOYE__DATE_EMBAUCHE);
		createEAttribute(employeEClass, EMPLOYE__DIPLOMES);
		createEReference(employeEClass, EMPLOYE__ETABLISSEMENT);
		createEReference(employeEClass, EMPLOYE__AFFECTATIONS_EMPLOI);
		createEReference(employeEClass, EMPLOYE__AFFECTATION_EMPLOI_COURANTE);
		createEReference(employeEClass, EMPLOYE__AFFECTATIONS_CLASSIFICATION);
		createEReference(employeEClass, EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE);
		createEReference(employeEClass, EMPLOYE__SESSIONS_FORMATION);
		createEReference(employeEClass, EMPLOYE__ENTRETIENS);
		createEReference(employeEClass, EMPLOYE__ENTRETIENS_MENES);
		createEAttribute(employeEClass, EMPLOYE__DATE_SORTIE_ENTREPRISE);
		createEReference(employeEClass, EMPLOYE__RESPONSABLE);
		createEReference(employeEClass, EMPLOYE__SUBALTERNES);
		createEReference(employeEClass, EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE);
		createEReference(employeEClass, EMPLOYE__ENTRETENEURS);
		createEReference(employeEClass, EMPLOYE__EMPLOYES_ENTRETENUS);
		createEAttribute(employeEClass, EMPLOYE__LABEL);
		createEOperation(employeEClass, EMPLOYE___HAS_VALID_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeEClass, EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeEClass, EMPLOYE___HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeEClass, EMPLOYE___HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(employeEClass, EMPLOYE___RESPONSABLE);

		affectationEClass = createEClass(AFFECTATION);
		createEAttribute(affectationEClass, AFFECTATION__DATE_DEBUT);
		createEAttribute(affectationEClass, AFFECTATION__DATE_FIN);
		createEReference(affectationEClass, AFFECTATION__EMPLOI);

		emploiEClass = createEClass(EMPLOI);
		createEAttribute(emploiEClass, EMPLOI__INTITULE);

		affectationClassificationEClass = createEClass(AFFECTATION_CLASSIFICATION);
		createEAttribute(affectationClassificationEClass, AFFECTATION_CLASSIFICATION__DATE_DEBUT);
		createEAttribute(affectationClassificationEClass, AFFECTATION_CLASSIFICATION__DATE_FIN);
		createEAttribute(affectationClassificationEClass, AFFECTATION_CLASSIFICATION__CLASSIFICATION);

		formationEClass = createEClass(FORMATION);
		createEAttribute(formationEClass, FORMATION__LIBELLE);
		createEReference(formationEClass, FORMATION__SESSIONFORMATION);

		organismeFormationEClass = createEClass(ORGANISME_FORMATION);
		createEAttribute(organismeFormationEClass, ORGANISME_FORMATION__NOM);
		createEReference(organismeFormationEClass, ORGANISME_FORMATION__FORMATIONS);

		sessionFormationEClass = createEClass(SESSION_FORMATION);
		createEAttribute(sessionFormationEClass, SESSION_FORMATION__DATE_DEBUT);
		createEAttribute(sessionFormationEClass, SESSION_FORMATION__DATE_FIN);
		createEAttribute(sessionFormationEClass, SESSION_FORMATION__DUREE);
		createEReference(sessionFormationEClass, SESSION_FORMATION__EMPLOYES);
		createEReference(sessionFormationEClass, SESSION_FORMATION__APPRECIATIONS);

		entretienEClass = createEClass(ENTRETIEN);
		createEAttribute(entretienEClass, ENTRETIEN__DATE);
		createEReference(entretienEClass, ENTRETIEN__MENEUR);
		createEAttribute(entretienEClass, ENTRETIEN__EN_COURS);
		createEAttribute(entretienEClass, ENTRETIEN__FAKE);
		createEAttribute(entretienEClass, ENTRETIEN__SCAN);
		createEOperation(entretienEClass, ENTRETIEN___EMPLOYE);
		createEOperation(entretienEClass, ENTRETIEN___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP);

		entretienProfessionnelEClass = createEClass(ENTRETIEN_PROFESSIONNEL);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__COMMENTAIRE_BILAN_FORMATION);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__ECHEANCE);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE);
		createEAttribute(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__SYNTHESE);
		createEReference(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__APPRECIATIONS_SESSION_FORMATION);
		createEReference(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_SALARIE);
		createEReference(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL__SOUHAITS_FORMATION_EVALUATEUR);
		createEOperation(entretienProfessionnelEClass, ENTRETIEN_PROFESSIONNEL___HAS_VALID_SYNTHESE__DIAGNOSTICCHAIN_MAP);

		appreciationSessionFormationEClass = createEClass(APPRECIATION_SESSION_FORMATION);
		createEAttribute(appreciationSessionFormationEClass, APPRECIATION_SESSION_FORMATION__VALEUR);
		createEReference(appreciationSessionFormationEClass, APPRECIATION_SESSION_FORMATION__SESSION_FORMATION);
		createEAttribute(appreciationSessionFormationEClass, APPRECIATION_SESSION_FORMATION__ID_FORMATION);
		createEAttribute(appreciationSessionFormationEClass, APPRECIATION_SESSION_FORMATION__LIBELLE_FORMATION);
		createEAttribute(appreciationSessionFormationEClass, APPRECIATION_SESSION_FORMATION__DATE_FORMATION);

		souhaitFormationEvaluateurEClass = createEClass(SOUHAIT_FORMATION_EVALUATEUR);
		createEAttribute(souhaitFormationEvaluateurEClass, SOUHAIT_FORMATION_EVALUATEUR__TEXTE);
		createEAttribute(souhaitFormationEvaluateurEClass, SOUHAIT_FORMATION_EVALUATEUR__ID);

		souhaitFormationSalarieEClass = createEClass(SOUHAIT_FORMATION_SALARIE);
		createEAttribute(souhaitFormationSalarieEClass, SOUHAIT_FORMATION_SALARIE__TEXTE);
		createEAttribute(souhaitFormationSalarieEClass, SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR);
		createEAttribute(souhaitFormationSalarieEClass, SOUHAIT_FORMATION_SALARIE__ID);

		mutualiteEClass = createEClass(MUTUALITE);
		createEReference(mutualiteEClass, MUTUALITE__ETABLISSEMENTS);
		createEReference(mutualiteEClass, MUTUALITE__EMPLOIS);
		createEReference(mutualiteEClass, MUTUALITE__EFFECTIF);
		createEReference(mutualiteEClass, MUTUALITE__ORGANISMES);
		createEReference(mutualiteEClass, MUTUALITE__UTILISATEURS);

		etablissementsEClass = createEClass(ETABLISSEMENTS);
		createEReference(etablissementsEClass, ETABLISSEMENTS__ETABLISSEMENTS);

		emploisEClass = createEClass(EMPLOIS);
		createEReference(emploisEClass, EMPLOIS__EMPLOIS);

		effectifEClass = createEClass(EFFECTIF);
		createEReference(effectifEClass, EFFECTIF__EMPLOYES);

		organismesEClass = createEClass(ORGANISMES);
		createEReference(organismesEClass, ORGANISMES__ORGANISME_FORMATIONS);

		etablissementEClass = createEClass(ETABLISSEMENT);
		createEAttribute(etablissementEClass, ETABLISSEMENT__NOM);
		createEReference(etablissementEClass, ETABLISSEMENT__EMPLOYES);
		createEAttribute(etablissementEClass, ETABLISSEMENT__ID);
		createEReference(etablissementEClass, ETABLISSEMENT__RESPONSABLE);

		utilisateurEClass = createEClass(UTILISATEUR);
		createEReference(utilisateurEClass, UTILISATEUR__EMPLOYE);
		createEAttribute(utilisateurEClass, UTILISATEUR__LOGIN);
		createEAttribute(utilisateurEClass, UTILISATEUR__ROLES);

		utilisateursEClass = createEClass(UTILISATEURS);
		createEReference(utilisateursEClass, UTILISATEURS__UTILISATEURS);

		// Create enums
		classificationStatutEEnum = createEEnum(CLASSIFICATION_STATUT);
		appreciationEEnum = createEEnum(APPRECIATION);
		avisEEnum = createEEnum(AVIS);
		roleEEnum = createEEnum(ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DtoPackage theDtoPackage = (DtoPackage)EPackage.Registry.INSTANCE.getEPackage(DtoPackage.eNS_URI);
		ConfigPackage theConfigPackage = (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDtoPackage);
		getESubpackages().add(theConfigPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entretienProfessionnelEClass.getESuperTypes().add(this.getEntretien());

		// Initialize classes, features, and operations; add parameters
		initEClass(employeEClass, Employe.class, "Employe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmploye_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_NomJeuneFille(), ecorePackage.getEString(), "nomJeuneFille", null, 0, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_DateNaissance(), ecorePackage.getEDate(), "dateNaissance", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_DateEmbauche(), ecorePackage.getEDate(), "dateEmbauche", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Diplomes(), ecorePackage.getEString(), "diplomes", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_Etablissement(), this.getEtablissement(), this.getEtablissement_Employes(), "etablissement", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_AffectationsEmploi(), this.getAffectation(), null, "affectationsEmploi", null, 1, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_AffectationEmploiCourante(), this.getAffectation(), null, "affectationEmploiCourante", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_AffectationsClassification(), this.getAffectationClassification(), null, "affectationsClassification", null, 1, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_AffectationClassificationCourante(), this.getAffectationClassification(), null, "affectationClassificationCourante", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_SessionsFormation(), this.getSessionFormation(), this.getSessionFormation_Employes(), "sessionsFormation", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_Entretiens(), this.getEntretien(), null, "entretiens", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_EntretiensMenes(), this.getEntretien(), this.getEntretien_Meneur(), "entretiensMenes", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_DateSortieEntreprise(), ecorePackage.getEDate(), "dateSortieEntreprise", null, 0, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_Responsable(), this.getEmploye(), this.getEmploye_Subalternes(), "responsable", null, 1, 1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_Subalternes(), this.getEmploye(), this.getEmploye_Responsable(), "subalternes", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_EtablissementsEnResponsabilite(), this.getEtablissement(), this.getEtablissement_Responsable(), "etablissementsEnResponsabilite", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_Entreteneurs(), this.getEmploye(), this.getEmploye_EmployesEntretenus(), "entreteneurs", null, 1, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmploye_EmployesEntretenus(), this.getEmploye(), this.getEmploye_Entreteneurs(), "employesEntretenus", null, 0, -1, Employe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmploye_Label(), ecorePackage.getEString(), "label", null, 1, 1, Employe.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEmploye__HasValidAffectationEmploiCourante__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidAffectationEmploiCourante", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEmploye__HasOneAndOnlyOneAffectationEmploiCourante__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOneAndOnlyOneAffectationEmploiCourante", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEmploye__HasOneAndOnlyOneAffectationClassificationCourante__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOneAndOnlyOneAffectationClassificationCourante", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEmploye__HasValidAffectationClassificationCourante__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidAffectationClassificationCourante", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEmploye__Responsable(), this.getEmploye(), "responsable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(affectationEClass, Affectation.class, "Affectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffectation_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 1, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectation_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAffectation_Emploi(), this.getEmploi(), null, "emploi", null, 1, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emploiEClass, Emploi.class, "Emploi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmploi_Intitule(), ecorePackage.getEString(), "intitule", null, 1, 1, Emploi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affectationClassificationEClass, AffectationClassification.class, "AffectationClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAffectationClassification_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, AffectationClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectationClassification_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, AffectationClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAffectationClassification_Classification(), this.getClassificationStatut(), "classification", null, 1, 1, AffectationClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formationEClass, Formation.class, "Formation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormation_Libelle(), ecorePackage.getEString(), "libelle", null, 1, 1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormation_Sessionformation(), this.getSessionFormation(), null, "sessionformation", null, 0, -1, Formation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organismeFormationEClass, OrganismeFormation.class, "OrganismeFormation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrganismeFormation_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, OrganismeFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganismeFormation_Formations(), this.getFormation(), null, "formations", null, 0, -1, OrganismeFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sessionFormationEClass, SessionFormation.class, "SessionFormation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSessionFormation_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 1, 1, SessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionFormation_DateFin(), ecorePackage.getEDate(), "dateFin", null, 1, 1, SessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSessionFormation_Duree(), ecorePackage.getEFloatObject(), "duree", null, 1, 1, SessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionFormation_Employes(), this.getEmploye(), this.getEmploye_SessionsFormation(), "employes", null, 0, -1, SessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionFormation_Appreciations(), this.getAppreciationSessionFormation(), this.getAppreciationSessionFormation_SessionFormation(), "appreciations", null, 0, -1, SessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entretienEClass, Entretien.class, "Entretien", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntretien_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Entretien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntretien_Meneur(), this.getEmploye(), this.getEmploye_EntretiensMenes(), "meneur", null, 0, 1, Entretien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretien_EnCours(), ecorePackage.getEBoolean(), "enCours", "true", 1, 1, Entretien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretien_Fake(), ecorePackage.getEBoolean(), "fake", "false", 1, 1, Entretien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretien_Scan(), ecorePackage.getEByteArray(), "scan", null, 0, 1, Entretien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntretien__Employe(), this.getEmploye(), "employe", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntretien__HasValidMeneur__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidMeneur", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entretienProfessionnelEClass, EntretienProfessionnel.class, "EntretienProfessionnel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntretienProfessionnel_EvolutionDepuisDernierEntretien(), ecorePackage.getEString(), "evolutionDepuisDernierEntretien", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_CommentaireBilanFormation(), ecorePackage.getEString(), "commentaireBilanFormation", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_EvolutionSouhaiteeDansEmploiActuel(), ecorePackage.getEString(), "evolutionSouhaiteeDansEmploiActuel", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_EvolutionSouhaiteeDansNouvelEmploi(), ecorePackage.getEString(), "evolutionSouhaiteeDansNouvelEmploi", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_Echeance(), ecorePackage.getEString(), "echeance", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_EvolutionSouhaiteeCompetencesAcquises(), ecorePackage.getEString(), "evolutionSouhaiteeCompetencesAcquises", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_EvolutionSouhaiteeCompetencesRequises(), ecorePackage.getEString(), "evolutionSouhaiteeCompetencesRequises", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_EvolutionSouhaiteeMoyensRealisation(), ecorePackage.getEString(), "evolutionSouhaiteeMoyensRealisation", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_AutresActionsDeveloppementCompetences(), ecorePackage.getEString(), "autresActionsDeveloppementCompetences", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_PerspectivesEvolutionProfessionnelle(), ecorePackage.getEString(), "perspectivesEvolutionProfessionnelle", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_PerspectivesEvolutionProfessionnelleCompetencesAssociees(), ecorePackage.getEString(), "perspectivesEvolutionProfessionnelleCompetencesAssociees", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_AdequationProjetProBesoinsEntreprise(), ecorePackage.getEBoolean(), "adequationProjetProBesoinsEntreprise", "true", 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_AdequationProjetProBesoinsEntrepriseCommentaire(), ecorePackage.getEString(), "adequationProjetProBesoinsEntrepriseCommentaire", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_RencontreRh(), ecorePackage.getEBoolean(), "rencontreRh", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_RencontreRhCommentaire(), ecorePackage.getEString(), "rencontreRhCommentaire", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntretienProfessionnel_Synthese(), ecorePackage.getEString(), "synthese", null, 0, 1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntretienProfessionnel_AppreciationsSessionFormation(), this.getAppreciationSessionFormation(), null, "appreciationsSessionFormation", null, 0, -1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntretienProfessionnel_SouhaitsFormationSalarie(), this.getSouhaitFormationSalarie(), null, "souhaitsFormationSalarie", null, 0, -1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntretienProfessionnel_SouhaitsFormationEvaluateur(), this.getSouhaitFormationEvaluateur(), null, "souhaitsFormationEvaluateur", null, 0, -1, EntretienProfessionnel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEntretienProfessionnel__HasValidSynthese__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasValidSynthese", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(appreciationSessionFormationEClass, AppreciationSessionFormation.class, "AppreciationSessionFormation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppreciationSessionFormation_Valeur(), this.getAppreciation(), "valeur", null, 1, 1, AppreciationSessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppreciationSessionFormation_SessionFormation(), this.getSessionFormation(), this.getSessionFormation_Appreciations(), "sessionFormation", null, 1, 1, AppreciationSessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppreciationSessionFormation_IdFormation(), ecorePackage.getEString(), "idFormation", null, 1, 1, AppreciationSessionFormation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppreciationSessionFormation_LibelleFormation(), ecorePackage.getEString(), "libelleFormation", null, 1, 1, AppreciationSessionFormation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppreciationSessionFormation_DateFormation(), ecorePackage.getEString(), "dateFormation", null, 1, 1, AppreciationSessionFormation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(souhaitFormationEvaluateurEClass, SouhaitFormationEvaluateur.class, "SouhaitFormationEvaluateur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSouhaitFormationEvaluateur_Texte(), ecorePackage.getEString(), "texte", null, 1, 1, SouhaitFormationEvaluateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSouhaitFormationEvaluateur_Id(), ecorePackage.getELong(), "id", null, 1, 1, SouhaitFormationEvaluateur.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(souhaitFormationSalarieEClass, SouhaitFormationSalarie.class, "SouhaitFormationSalarie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSouhaitFormationSalarie_Texte(), ecorePackage.getEString(), "texte", null, 1, 1, SouhaitFormationSalarie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSouhaitFormationSalarie_AvisEvaluateur(), this.getAvis(), "avisEvaluateur", null, 1, 1, SouhaitFormationSalarie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSouhaitFormationSalarie_Id(), ecorePackage.getELong(), "id", null, 1, 1, SouhaitFormationSalarie.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mutualiteEClass, Mutualite.class, "Mutualite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMutualite_Etablissements(), this.getEtablissements(), null, "etablissements", null, 1, 1, Mutualite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualite_Emplois(), this.getEmplois(), null, "emplois", null, 1, 1, Mutualite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualite_Effectif(), this.getEffectif(), null, "effectif", null, 1, 1, Mutualite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualite_Organismes(), this.getOrganismes(), null, "organismes", null, 1, 1, Mutualite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMutualite_Utilisateurs(), this.getUtilisateurs(), null, "utilisateurs", null, 1, 1, Mutualite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etablissementsEClass, Etablissements.class, "Etablissements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtablissements_Etablissements(), this.getEtablissement(), null, "etablissements", null, 0, -1, Etablissements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emploisEClass, Emplois.class, "Emplois", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmplois_Emplois(), this.getEmploi(), null, "emplois", null, 0, -1, Emplois.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(effectifEClass, Effectif.class, "Effectif", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffectif_Employes(), this.getEmploye(), null, "employes", null, 0, -1, Effectif.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organismesEClass, Organismes.class, "Organismes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganismes_OrganismeFormations(), this.getOrganismeFormation(), null, "organismeFormations", null, 0, -1, Organismes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etablissementEClass, Etablissement.class, "Etablissement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtablissement_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Etablissement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtablissement_Employes(), this.getEmploye(), this.getEmploye_Etablissement(), "employes", null, 1, -1, Etablissement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtablissement_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Etablissement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEtablissement_Responsable(), this.getEmploye(), this.getEmploye_EtablissementsEnResponsabilite(), "responsable", null, 0, 1, Etablissement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilisateurEClass, Utilisateur.class, "Utilisateur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilisateur_Employe(), this.getEmploye(), null, "employe", null, 1, 1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_Login(), ecorePackage.getEString(), "login", null, 1, 1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_Roles(), this.getRole(), "roles", null, 0, -1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(utilisateursEClass, Utilisateurs.class, "Utilisateurs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilisateurs_Utilisateurs(), this.getUtilisateur(), null, "utilisateurs", null, 0, -1, Utilisateurs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(classificationStatutEEnum, ClassificationStatut.class, "ClassificationStatut");
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.E1);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.E2);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.E3);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.E4);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.T1);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.T2);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.C1);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.C2);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.C3);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.C4);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.D);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.DENT);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.ALTERNANCE);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.ADMINISTRATEUR);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.AUTRE);
		addEEnumLiteral(classificationStatutEEnum, ClassificationStatut.APPRENTI);

		initEEnum(appreciationEEnum, Appreciation.class, "Appreciation");
		addEEnumLiteral(appreciationEEnum, Appreciation.SATISFAISANT);
		addEEnumLiteral(appreciationEEnum, Appreciation.ACOMPLETER);
		addEEnumLiteral(appreciationEEnum, Appreciation.INUTILE);

		initEEnum(avisEEnum, Avis.class, "Avis");
		addEEnumLiteral(avisEEnum, Avis.FAVORABLE);
		addEEnumLiteral(avisEEnum, Avis.NON_FAVORABLE);
		addEEnumLiteral(avisEEnum, Avis.FAVORABLE_NON_PRIORITAIRE);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.RESPONSABLE_ENTRETIEN);
		addEEnumLiteral(roleEEnum, Role.DRH);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/CDO/DBStore
		createDBStoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/CDO/DBStore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDBStoreAnnotations() {
		String source = "http://www.eclipse.org/CDO/DBStore";	
		addAnnotation
		  (getEmploye_DateNaissance(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getEmploye_DateEmbauche(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getEmploye_DateSortieEntreprise(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getAffectation_DateDebut(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getAffectation_DateFin(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getAffectationClassification_DateDebut(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getAffectationClassification_DateFin(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getSessionFormation_DateDebut(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getSessionFormation_DateFin(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getEntretien_Date(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });	
		addAnnotation
		  (getAppreciationSessionFormation_DateFormation(), 
		   source, 
		   new String[] {
			 "columnType", "DATE"
		   });
	}

} //MutPackageImpl
