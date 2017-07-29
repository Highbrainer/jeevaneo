/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.EtablissementsVirtuels;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Parametrage;
import mutualite.rh.chequedej.Succursale;

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
public class ChequedejPackageImpl extends EPackageImpl implements ChequedejPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass succursaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chequeDejEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etablissementVirtuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carnetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass etablissementsVirtuelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametrageEClass = null;

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChequedejPackageImpl() {
		super(eNS_URI, ChequedejFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ChequedejPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChequedejPackage init() {
		if (isInited) return (ChequedejPackage)EPackage.Registry.INSTANCE.getEPackage(ChequedejPackage.eNS_URI);

		// Obtain or create and register package
		ChequedejPackageImpl theChequedejPackage = (ChequedejPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ChequedejPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ChequedejPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theChequedejPackage.createPackageContents();

		// Initialize created meta-data
		theChequedejPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChequedejPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChequedejPackage.eNS_URI, theChequedejPackage);
		return theChequedejPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccursale() {
		return succursaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuccursale_Numero() {
		return (EAttribute)succursaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSuccursale_IdEtablissement() {
		return (EAttribute)succursaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeClient() {
		return codeClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeClient_Succursales() {
		return (EReference)codeClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeClient_Numero() {
		return (EAttribute)codeClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeClient_Libelle() {
		return (EAttribute)codeClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChequeDej() {
		return chequeDejEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_Carnet() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChequeDej_ValeurNominale() {
		return (EAttribute)chequeDejEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChequeDej_ParticipationPatronale() {
		return (EAttribute)chequeDejEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_EtablissementsVirtuels() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_Parametrage() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommande() {
		return commandeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommande_Date() {
		return (EAttribute)commandeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommande_Items() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommande_ParticipationPatronale() {
		return (EAttribute)commandeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommande_ValeurNominale() {
		return (EAttribute)commandeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommande_Mois() {
		return (EAttribute)commandeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Succursale() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Matricule() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_NbCheques() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_NbJoursEntiersMoisPrecedent() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_NbJoursEntiersMoisSuivant() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Commentaire() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Nom() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Prenom() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtablissementVirtuel() {
		return etablissementVirtuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtablissementVirtuel_MatriculesEmployes() {
		return (EAttribute)etablissementVirtuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEtablissementVirtuel_Libelle() {
		return (EAttribute)etablissementVirtuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarnet() {
		return carnetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarnet_Commandes() {
		return (EReference)carnetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEtablissementsVirtuels() {
		return etablissementsVirtuelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEtablissementsVirtuels_EtablissementsVirtuels() {
		return (EReference)etablissementsVirtuelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametrage() {
		return parametrageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametrage_CodesClient() {
		return (EReference)parametrageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejFactory getChequedejFactory() {
		return (ChequedejFactory)getEFactoryInstance();
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
		succursaleEClass = createEClass(SUCCURSALE);
		createEAttribute(succursaleEClass, SUCCURSALE__NUMERO);
		createEAttribute(succursaleEClass, SUCCURSALE__ID_ETABLISSEMENT);

		codeClientEClass = createEClass(CODE_CLIENT);
		createEReference(codeClientEClass, CODE_CLIENT__SUCCURSALES);
		createEAttribute(codeClientEClass, CODE_CLIENT__NUMERO);
		createEAttribute(codeClientEClass, CODE_CLIENT__LIBELLE);

		chequeDejEClass = createEClass(CHEQUE_DEJ);
		createEReference(chequeDejEClass, CHEQUE_DEJ__CARNET);
		createEAttribute(chequeDejEClass, CHEQUE_DEJ__VALEUR_NOMINALE);
		createEAttribute(chequeDejEClass, CHEQUE_DEJ__PARTICIPATION_PATRONALE);
		createEReference(chequeDejEClass, CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS);
		createEReference(chequeDejEClass, CHEQUE_DEJ__PARAMETRAGE);

		commandeEClass = createEClass(COMMANDE);
		createEAttribute(commandeEClass, COMMANDE__DATE);
		createEReference(commandeEClass, COMMANDE__ITEMS);
		createEAttribute(commandeEClass, COMMANDE__PARTICIPATION_PATRONALE);
		createEAttribute(commandeEClass, COMMANDE__VALEUR_NOMINALE);
		createEAttribute(commandeEClass, COMMANDE__MOIS);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__SUCCURSALE);
		createEAttribute(itemEClass, ITEM__MATRICULE);
		createEAttribute(itemEClass, ITEM__NB_CHEQUES);
		createEAttribute(itemEClass, ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT);
		createEAttribute(itemEClass, ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT);
		createEAttribute(itemEClass, ITEM__COMMENTAIRE);
		createEAttribute(itemEClass, ITEM__NOM);
		createEAttribute(itemEClass, ITEM__PRENOM);

		etablissementVirtuelEClass = createEClass(ETABLISSEMENT_VIRTUEL);
		createEAttribute(etablissementVirtuelEClass, ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES);
		createEAttribute(etablissementVirtuelEClass, ETABLISSEMENT_VIRTUEL__LIBELLE);

		carnetEClass = createEClass(CARNET);
		createEReference(carnetEClass, CARNET__COMMANDES);

		etablissementsVirtuelsEClass = createEClass(ETABLISSEMENTS_VIRTUELS);
		createEReference(etablissementsVirtuelsEClass, ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS);

		parametrageEClass = createEClass(PARAMETRAGE);
		createEReference(parametrageEClass, PARAMETRAGE__CODES_CLIENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(succursaleEClass, Succursale.class, "Succursale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuccursale_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, Succursale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSuccursale_IdEtablissement(), ecorePackage.getEIntegerObject(), "idEtablissement", null, 1, 1, Succursale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeClientEClass, CodeClient.class, "CodeClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeClient_Succursales(), this.getSuccursale(), null, "succursales", null, 0, -1, CodeClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeClient_Numero(), ecorePackage.getEInt(), "numero", null, 1, 1, CodeClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeClient_Libelle(), ecorePackage.getEString(), "libelle", null, 1, 1, CodeClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chequeDejEClass, ChequeDej.class, "ChequeDej", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChequeDej_Carnet(), this.getCarnet(), null, "carnet", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChequeDej_ValeurNominale(), ecorePackage.getEFloat(), "valeurNominale", "6.7", 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChequeDej_ParticipationPatronale(), ecorePackage.getEFloat(), "participationPatronale", "3.69", 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChequeDej_EtablissementsVirtuels(), this.getEtablissementsVirtuels(), null, "etablissementsVirtuels", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChequeDej_Parametrage(), this.getParametrage(), null, "parametrage", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandeEClass, Commande.class, "Commande", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommande_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_Items(), this.getItem(), null, "items", null, 0, -1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_ParticipationPatronale(), ecorePackage.getEFloat(), "participationPatronale", "3.58", 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_ValeurNominale(), ecorePackage.getEFloat(), "valeurNominale", "6.5", 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_Mois(), ecorePackage.getEString(), "mois", null, 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Succursale(), this.getSuccursale(), null, "succursale", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_NbCheques(), ecorePackage.getEInt(), "nbCheques", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_NbJoursEntiersMoisPrecedent(), ecorePackage.getEInt(), "nbJoursEntiersMoisPrecedent", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_NbJoursEntiersMoisSuivant(), ecorePackage.getEInt(), "nbJoursEntiersMoisSuivant", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Commentaire(), ecorePackage.getEString(), "commentaire", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etablissementVirtuelEClass, EtablissementVirtuel.class, "EtablissementVirtuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtablissementVirtuel_MatriculesEmployes(), ecorePackage.getEInt(), "matriculesEmployes", null, 0, -1, EtablissementVirtuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtablissementVirtuel_Libelle(), ecorePackage.getEString(), "libelle", null, 1, 1, EtablissementVirtuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carnetEClass, Carnet.class, "Carnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarnet_Commandes(), this.getCommande(), null, "commandes", null, 0, -1, Carnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etablissementsVirtuelsEClass, EtablissementsVirtuels.class, "EtablissementsVirtuels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtablissementsVirtuels_EtablissementsVirtuels(), this.getEtablissementVirtuel(), null, "etablissementsVirtuels", null, 0, -1, EtablissementsVirtuels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametrageEClass, Parametrage.class, "Parametrage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametrage_CodesClient(), this.getCodeClient(), null, "codesClient", null, 0, -1, Parametrage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ChequedejPackageImpl
