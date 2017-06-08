/**
 */
package fr.mutualite.rh.model.dto.impl;

import fr.mutualite.rh.model.MutPackage;

import fr.mutualite.rh.model.config.ConfigPackage;
import fr.mutualite.rh.model.config.impl.ConfigPackageImpl;
import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.Formulaire;

import fr.mutualite.rh.model.dto.UIEmploye;
import fr.mutualite.rh.model.dto.UISessionFormation;
import fr.mutualite.rh.model.impl.MutPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtoPackageImpl extends EPackageImpl implements DtoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEmployeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiSessionFormationEClass = null;

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
	 * @see fr.mutualite.rh.model.dto.DtoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DtoPackageImpl() {
		super(eNS_URI, DtoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DtoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DtoPackage init() {
		if (isInited) return (DtoPackage)EPackage.Registry.INSTANCE.getEPackage(DtoPackage.eNS_URI);

		// Obtain or create and register package
		DtoPackageImpl theDtoPackage = (DtoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DtoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DtoPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MutPackageImpl theMutPackage = (MutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MutPackage.eNS_URI) instanceof MutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MutPackage.eNS_URI) : MutPackage.eINSTANCE);
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI) : ConfigPackage.eINSTANCE);

		// Create package meta-data objects
		theDtoPackage.createPackageContents();
		theMutPackage.createPackageContents();
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theDtoPackage.initializePackageContents();
		theMutPackage.initializePackageContents();
		theConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDtoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DtoPackage.eNS_URI, theDtoPackage);
		return theDtoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormulaire() {
		return formulaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Prenom() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Matricule() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Nom() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Diplomes() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Service() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Poste() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Responsable() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_MenePar() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormulaire_Entretien() {
		return (EReference)formulaireEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Date() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_DatePrecedentEntretien() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_Anciennete() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormulaire_DateEntreeEntreprise() {
		return (EAttribute)formulaireEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIEmploye() {
		return uiEmployeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIEmploye_Prenom() {
		return (EAttribute)uiEmployeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIEmploye_Matricule() {
		return (EAttribute)uiEmployeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIEmploye_Nom() {
		return (EAttribute)uiEmployeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUISessionFormation() {
		return uiSessionFormationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISessionFormation_Quand() {
		return (EAttribute)uiSessionFormationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISessionFormation_Duree() {
		return (EAttribute)uiSessionFormationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISessionFormation_Libelle() {
		return (EAttribute)uiSessionFormationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISessionFormation_Organisme() {
		return (EAttribute)uiSessionFormationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUISessionFormation_Dpc() {
		return (EAttribute)uiSessionFormationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtoFactory getDtoFactory() {
		return (DtoFactory)getEFactoryInstance();
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
		formulaireEClass = createEClass(FORMULAIRE);
		createEAttribute(formulaireEClass, FORMULAIRE__PRENOM);
		createEAttribute(formulaireEClass, FORMULAIRE__MATRICULE);
		createEAttribute(formulaireEClass, FORMULAIRE__NOM);
		createEAttribute(formulaireEClass, FORMULAIRE__DIPLOMES);
		createEAttribute(formulaireEClass, FORMULAIRE__SERVICE);
		createEAttribute(formulaireEClass, FORMULAIRE__POSTE);
		createEAttribute(formulaireEClass, FORMULAIRE__RESPONSABLE);
		createEAttribute(formulaireEClass, FORMULAIRE__MENE_PAR);
		createEReference(formulaireEClass, FORMULAIRE__ENTRETIEN);
		createEAttribute(formulaireEClass, FORMULAIRE__DATE);
		createEAttribute(formulaireEClass, FORMULAIRE__DATE_PRECEDENT_ENTRETIEN);
		createEAttribute(formulaireEClass, FORMULAIRE__ANCIENNETE);
		createEAttribute(formulaireEClass, FORMULAIRE__DATE_ENTREE_ENTREPRISE);

		uiEmployeEClass = createEClass(UI_EMPLOYE);
		createEAttribute(uiEmployeEClass, UI_EMPLOYE__PRENOM);
		createEAttribute(uiEmployeEClass, UI_EMPLOYE__MATRICULE);
		createEAttribute(uiEmployeEClass, UI_EMPLOYE__NOM);

		uiSessionFormationEClass = createEClass(UI_SESSION_FORMATION);
		createEAttribute(uiSessionFormationEClass, UI_SESSION_FORMATION__QUAND);
		createEAttribute(uiSessionFormationEClass, UI_SESSION_FORMATION__DUREE);
		createEAttribute(uiSessionFormationEClass, UI_SESSION_FORMATION__LIBELLE);
		createEAttribute(uiSessionFormationEClass, UI_SESSION_FORMATION__ORGANISME);
		createEAttribute(uiSessionFormationEClass, UI_SESSION_FORMATION__DPC);
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
		MutPackage theMutPackage = (MutPackage)EPackage.Registry.INSTANCE.getEPackage(MutPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(formulaireEClass, Formulaire.class, "Formulaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormulaire_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Diplomes(), ecorePackage.getEString(), "diplomes", null, 1, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Service(), ecorePackage.getEString(), "service", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Poste(), ecorePackage.getEString(), "poste", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Responsable(), ecorePackage.getEString(), "responsable", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_MenePar(), ecorePackage.getEString(), "menePar", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaire_Entretien(), theMutPackage.getEntretien(), null, "entretien", null, 1, 1, Formulaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_DatePrecedentEntretien(), ecorePackage.getEDate(), "datePrecedentEntretien", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_Anciennete(), ecorePackage.getEString(), "anciennete", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaire_DateEntreeEntreprise(), ecorePackage.getEDate(), "dateEntreeEntreprise", null, 0, 1, Formulaire.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(uiEmployeEClass, UIEmploye.class, "UIEmploye", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIEmploye_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, UIEmploye.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIEmploye_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, UIEmploye.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIEmploye_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, UIEmploye.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiSessionFormationEClass, UISessionFormation.class, "UISessionFormation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUISessionFormation_Quand(), ecorePackage.getEString(), "quand", null, 0, 1, UISessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISessionFormation_Duree(), ecorePackage.getEString(), "duree", null, 0, 1, UISessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISessionFormation_Libelle(), ecorePackage.getEString(), "libelle", null, 0, 1, UISessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISessionFormation_Organisme(), ecorePackage.getEString(), "organisme", null, 0, 1, UISessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUISessionFormation_Dpc(), ecorePackage.getEBoolean(), "dpc", null, 0, 1, UISessionFormation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DtoPackageImpl
