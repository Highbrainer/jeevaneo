/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.Cheque;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.ChoixIndividuel;
import mutualite.rh.chequedej.CodeClient;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Deje;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.DejeMensuel;
import mutualite.rh.chequedej.EtablissementVirtuel;
import mutualite.rh.chequedej.EtablissementsVirtuels;
import mutualite.rh.chequedej.HistoriqueSoldeIndividuel;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Parametrage;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;
import mutualite.rh.chequedej.Stock;
import mutualite.rh.chequedej.Succursale;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chequeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soldeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soldeIndividuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historiqueSoldeIndividuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dejeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dejeIndividuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dejeMensuelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choixIndividuelEClass = null;

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
	public EReference getChequeDej_Stock() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_Solde() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_Dejes() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChequeDej_Choix() {
		return (EReference)chequeDejEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChequeDej_CommandeMaxParDefaut() {
		return (EAttribute)chequeDejEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChequeDej__IntegrateDeje__String_int_int() {
		return chequeDejEClass.getEOperations().get(0);
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
	public EReference getCommande_CommandePrecedente() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommande_CommandeSuivante() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommande__Carnet() {
		return commandeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommande__GetOrCreateItem__int() {
		return commandeEClass.getEOperations().get(1);
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
	public EAttribute getItem_Commentaire() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Nom() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Prenom() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
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
	public EOperation getCarnet__Root() {
		return carnetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCarnet__GetOrCreateCommande__String() {
		return carnetEClass.getEOperations().get(1);
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
	public EClass getStock() {
		return stockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStock_Cheque() {
		return (EReference)stockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStock_DerniereMaj() {
		return (EAttribute)stockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheque() {
		return chequeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_Matricule() {
		return (EAttribute)chequeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCheque_NbCheques() {
		return (EAttribute)chequeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolde() {
		return soldeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolde_SoldesIndividuels() {
		return (EReference)soldeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolde__GetOrCreateSoldeIndividual__int() {
		return soldeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSolde__GetSolde__int() {
		return soldeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoldeIndividuel() {
		return soldeIndividuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoldeIndividuel_NbCheques() {
		return (EAttribute)soldeIndividuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoldeIndividuel_Matricule() {
		return (EAttribute)soldeIndividuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoldeIndividuel_Historique() {
		return (EReference)soldeIndividuelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSoldeIndividuel__Incremente__int_String() {
		return soldeIndividuelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoriqueSoldeIndividuel() {
		return historiqueSoldeIndividuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoriqueSoldeIndividuel_Date() {
		return (EAttribute)historiqueSoldeIndividuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoriqueSoldeIndividuel_Comment() {
		return (EAttribute)historiqueSoldeIndividuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoriqueSoldeIndividuel_SoldeAvant() {
		return (EAttribute)historiqueSoldeIndividuelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistoriqueSoldeIndividuel_SoldeApres() {
		return (EAttribute)historiqueSoldeIndividuelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeje() {
		return dejeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeje_DejesMensuels() {
		return (EReference)dejeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeje__GetOrCreateDejeMensuel__String() {
		return dejeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeje__Root() {
		return dejeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDejeIndividuel() {
		return dejeIndividuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDejeIndividuel_NbEstimeJoursEntiers() {
		return (EAttribute)dejeIndividuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDejeIndividuel_Matricule() {
		return (EAttribute)dejeIndividuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDejeIndividuel_NbReelJoursEntiers() {
		return (EAttribute)dejeIndividuelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDejeIndividuel__DejeMensuel() {
		return dejeIndividuelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDejeMensuel() {
		return dejeMensuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDejeMensuel_DejesIndividuels() {
		return (EReference)dejeMensuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDejeMensuel_Mois() {
		return (EAttribute)dejeMensuelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDejeMensuel__Label() {
		return dejeMensuelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDejeMensuel__GetOrCreateDejeIndividuel__int() {
		return dejeMensuelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDejeMensuel__Deje() {
		return dejeMensuelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoix() {
		return choixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChoix_ChoixIndividuels() {
		return (EReference)choixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoix__GetChoix__int() {
		return choixEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getChoix__GetOrCreateChoix__int() {
		return choixEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChoixIndividuel() {
		return choixIndividuelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoixIndividuel_NbMaxCheques() {
		return (EAttribute)choixIndividuelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChoixIndividuel_Matricule() {
		return (EAttribute)choixIndividuelEClass.getEStructuralFeatures().get(1);
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
		createEReference(chequeDejEClass, CHEQUE_DEJ__STOCK);
		createEReference(chequeDejEClass, CHEQUE_DEJ__SOLDE);
		createEReference(chequeDejEClass, CHEQUE_DEJ__DEJES);
		createEReference(chequeDejEClass, CHEQUE_DEJ__CHOIX);
		createEAttribute(chequeDejEClass, CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT);
		createEOperation(chequeDejEClass, CHEQUE_DEJ___INTEGRATE_DEJE__STRING_INT_INT);

		commandeEClass = createEClass(COMMANDE);
		createEAttribute(commandeEClass, COMMANDE__DATE);
		createEReference(commandeEClass, COMMANDE__ITEMS);
		createEAttribute(commandeEClass, COMMANDE__PARTICIPATION_PATRONALE);
		createEAttribute(commandeEClass, COMMANDE__VALEUR_NOMINALE);
		createEAttribute(commandeEClass, COMMANDE__MOIS);
		createEReference(commandeEClass, COMMANDE__COMMANDE_PRECEDENTE);
		createEReference(commandeEClass, COMMANDE__COMMANDE_SUIVANTE);
		createEOperation(commandeEClass, COMMANDE___CARNET);
		createEOperation(commandeEClass, COMMANDE___GET_OR_CREATE_ITEM__INT);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__SUCCURSALE);
		createEAttribute(itemEClass, ITEM__MATRICULE);
		createEAttribute(itemEClass, ITEM__NB_CHEQUES);
		createEAttribute(itemEClass, ITEM__COMMENTAIRE);
		createEAttribute(itemEClass, ITEM__NOM);
		createEAttribute(itemEClass, ITEM__PRENOM);

		etablissementVirtuelEClass = createEClass(ETABLISSEMENT_VIRTUEL);
		createEAttribute(etablissementVirtuelEClass, ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES);
		createEAttribute(etablissementVirtuelEClass, ETABLISSEMENT_VIRTUEL__LIBELLE);

		carnetEClass = createEClass(CARNET);
		createEReference(carnetEClass, CARNET__COMMANDES);
		createEOperation(carnetEClass, CARNET___ROOT);
		createEOperation(carnetEClass, CARNET___GET_OR_CREATE_COMMANDE__STRING);

		etablissementsVirtuelsEClass = createEClass(ETABLISSEMENTS_VIRTUELS);
		createEReference(etablissementsVirtuelsEClass, ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS);

		parametrageEClass = createEClass(PARAMETRAGE);
		createEReference(parametrageEClass, PARAMETRAGE__CODES_CLIENT);

		stockEClass = createEClass(STOCK);
		createEReference(stockEClass, STOCK__CHEQUE);
		createEAttribute(stockEClass, STOCK__DERNIERE_MAJ);

		chequeEClass = createEClass(CHEQUE);
		createEAttribute(chequeEClass, CHEQUE__MATRICULE);
		createEAttribute(chequeEClass, CHEQUE__NB_CHEQUES);

		soldeEClass = createEClass(SOLDE);
		createEReference(soldeEClass, SOLDE__SOLDES_INDIVIDUELS);
		createEOperation(soldeEClass, SOLDE___GET_OR_CREATE_SOLDE_INDIVIDUAL__INT);
		createEOperation(soldeEClass, SOLDE___GET_SOLDE__INT);

		soldeIndividuelEClass = createEClass(SOLDE_INDIVIDUEL);
		createEAttribute(soldeIndividuelEClass, SOLDE_INDIVIDUEL__NB_CHEQUES);
		createEAttribute(soldeIndividuelEClass, SOLDE_INDIVIDUEL__MATRICULE);
		createEReference(soldeIndividuelEClass, SOLDE_INDIVIDUEL__HISTORIQUE);
		createEOperation(soldeIndividuelEClass, SOLDE_INDIVIDUEL___INCREMENTE__INT_STRING);

		historiqueSoldeIndividuelEClass = createEClass(HISTORIQUE_SOLDE_INDIVIDUEL);
		createEAttribute(historiqueSoldeIndividuelEClass, HISTORIQUE_SOLDE_INDIVIDUEL__DATE);
		createEAttribute(historiqueSoldeIndividuelEClass, HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT);
		createEAttribute(historiqueSoldeIndividuelEClass, HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT);
		createEAttribute(historiqueSoldeIndividuelEClass, HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES);

		dejeEClass = createEClass(DEJE);
		createEReference(dejeEClass, DEJE__DEJES_MENSUELS);
		createEOperation(dejeEClass, DEJE___GET_OR_CREATE_DEJE_MENSUEL__STRING);
		createEOperation(dejeEClass, DEJE___ROOT);

		dejeIndividuelEClass = createEClass(DEJE_INDIVIDUEL);
		createEAttribute(dejeIndividuelEClass, DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS);
		createEAttribute(dejeIndividuelEClass, DEJE_INDIVIDUEL__MATRICULE);
		createEAttribute(dejeIndividuelEClass, DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS);
		createEOperation(dejeIndividuelEClass, DEJE_INDIVIDUEL___DEJE_MENSUEL);

		dejeMensuelEClass = createEClass(DEJE_MENSUEL);
		createEReference(dejeMensuelEClass, DEJE_MENSUEL__DEJES_INDIVIDUELS);
		createEAttribute(dejeMensuelEClass, DEJE_MENSUEL__MOIS);
		createEOperation(dejeMensuelEClass, DEJE_MENSUEL___LABEL);
		createEOperation(dejeMensuelEClass, DEJE_MENSUEL___GET_OR_CREATE_DEJE_INDIVIDUEL__INT);
		createEOperation(dejeMensuelEClass, DEJE_MENSUEL___DEJE);

		choixEClass = createEClass(CHOIX);
		createEReference(choixEClass, CHOIX__CHOIX_INDIVIDUELS);
		createEOperation(choixEClass, CHOIX___GET_CHOIX__INT);
		createEOperation(choixEClass, CHOIX___GET_OR_CREATE_CHOIX__INT);

		choixIndividuelEClass = createEClass(CHOIX_INDIVIDUEL);
		createEAttribute(choixIndividuelEClass, CHOIX_INDIVIDUEL__NB_MAX_CHEQUES);
		createEAttribute(choixIndividuelEClass, CHOIX_INDIVIDUEL__MATRICULE);
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
		initEReference(getChequeDej_Stock(), this.getStock(), null, "stock", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChequeDej_Solde(), this.getSolde(), null, "solde", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChequeDej_Dejes(), this.getDeje(), null, "dejes", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChequeDej_Choix(), this.getChoix(), null, "choix", null, 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChequeDej_CommandeMaxParDefaut(), ecorePackage.getEInt(), "commandeMaxParDefaut", "25", 1, 1, ChequeDej.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getChequeDej__IntegrateDeje__String_int_int(), null, "integrateDeje", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mois", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbEstimeJoursEntiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nbReelJoursEntiers", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandeEClass, Commande.class, "Commande", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommande_Date(), ecorePackage.getEDate(), "date", null, 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_Items(), this.getItem(), null, "items", null, 0, -1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_ParticipationPatronale(), ecorePackage.getEFloat(), "participationPatronale", "3.58", 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_ValeurNominale(), ecorePackage.getEFloat(), "valeurNominale", "6.5", 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommande_Mois(), ecorePackage.getEString(), "mois", null, 1, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_CommandePrecedente(), this.getCommande(), this.getCommande_CommandeSuivante(), "commandePrecedente", null, 0, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_CommandeSuivante(), this.getCommande(), this.getCommande_CommandePrecedente(), "commandeSuivante", null, 0, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommande__Carnet(), this.getCarnet(), "carnet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCommande__GetOrCreateItem__int(), this.getItem(), "getOrCreateItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Succursale(), this.getSuccursale(), null, "succursale", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_NbCheques(), ecorePackage.getEIntegerObject(), "nbCheques", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Commentaire(), ecorePackage.getEString(), "commentaire", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Nom(), ecorePackage.getEString(), "nom", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Prenom(), ecorePackage.getEString(), "prenom", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(etablissementVirtuelEClass, EtablissementVirtuel.class, "EtablissementVirtuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEtablissementVirtuel_MatriculesEmployes(), ecorePackage.getEInt(), "matriculesEmployes", null, 0, -1, EtablissementVirtuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEtablissementVirtuel_Libelle(), ecorePackage.getEString(), "libelle", null, 1, 1, EtablissementVirtuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(carnetEClass, Carnet.class, "Carnet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCarnet_Commandes(), this.getCommande(), null, "commandes", null, 0, -1, Carnet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCarnet__Root(), this.getChequeDej(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCarnet__GetOrCreateCommande__String(), this.getCommande(), "getOrCreateCommande", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mois", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(etablissementsVirtuelsEClass, EtablissementsVirtuels.class, "EtablissementsVirtuels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEtablissementsVirtuels_EtablissementsVirtuels(), this.getEtablissementVirtuel(), null, "etablissementsVirtuels", null, 0, -1, EtablissementsVirtuels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametrageEClass, Parametrage.class, "Parametrage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParametrage_CodesClient(), this.getCodeClient(), null, "codesClient", null, 0, -1, Parametrage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stockEClass, Stock.class, "Stock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStock_Cheque(), this.getCheque(), null, "cheque", null, 0, -1, Stock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStock_DerniereMaj(), ecorePackage.getEDate(), "derniereMaj", null, 0, 1, Stock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chequeEClass, Cheque.class, "Cheque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCheque_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, Cheque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheque_NbCheques(), ecorePackage.getEIntegerObject(), "nbCheques", null, 1, 1, Cheque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(soldeEClass, Solde.class, "Solde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolde_SoldesIndividuels(), this.getSoldeIndividuel(), null, "soldesIndividuels", null, 0, -1, Solde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSolde__GetOrCreateSoldeIndividual__int(), this.getSoldeIndividuel(), "getOrCreateSoldeIndividual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSolde__GetSolde__int(), ecorePackage.getEInt(), "getSolde", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(soldeIndividuelEClass, SoldeIndividuel.class, "SoldeIndividuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoldeIndividuel_NbCheques(), ecorePackage.getEInt(), "nbCheques", null, 1, 1, SoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoldeIndividuel_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, SoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoldeIndividuel_Historique(), this.getHistoriqueSoldeIndividuel(), null, "historique", null, 0, -1, SoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSoldeIndividuel__Incremente__int_String(), null, "incremente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "delta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "comment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historiqueSoldeIndividuelEClass, HistoriqueSoldeIndividuel.class, "HistoriqueSoldeIndividuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHistoriqueSoldeIndividuel_Date(), ecorePackage.getEDate(), "date", null, 1, 1, HistoriqueSoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoriqueSoldeIndividuel_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, HistoriqueSoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoriqueSoldeIndividuel_SoldeAvant(), ecorePackage.getEInt(), "soldeAvant", null, 1, 1, HistoriqueSoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistoriqueSoldeIndividuel_SoldeApres(), ecorePackage.getEInt(), "soldeApres", null, 1, 1, HistoriqueSoldeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dejeEClass, Deje.class, "Deje", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeje_DejesMensuels(), this.getDejeMensuel(), null, "dejesMensuels", null, 0, -1, Deje.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDeje__GetOrCreateDejeMensuel__String(), this.getDejeMensuel(), "getOrCreateDejeMensuel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "mois", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDeje__Root(), this.getChequeDej(), "root", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dejeIndividuelEClass, DejeIndividuel.class, "DejeIndividuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDejeIndividuel_NbEstimeJoursEntiers(), ecorePackage.getEIntegerObject(), "nbEstimeJoursEntiers", null, 0, 1, DejeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDejeIndividuel_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, DejeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDejeIndividuel_NbReelJoursEntiers(), ecorePackage.getEIntegerObject(), "nbReelJoursEntiers", null, 0, 1, DejeIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDejeIndividuel__DejeMensuel(), this.getDejeMensuel(), "dejeMensuel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dejeMensuelEClass, DejeMensuel.class, "DejeMensuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDejeMensuel_DejesIndividuels(), this.getDejeIndividuel(), null, "dejesIndividuels", null, 0, -1, DejeMensuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDejeMensuel_Mois(), ecorePackage.getEString(), "mois", null, 0, 1, DejeMensuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDejeMensuel__Label(), ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDejeMensuel__GetOrCreateDejeIndividuel__int(), this.getDejeIndividuel(), "getOrCreateDejeIndividuel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDejeMensuel__Deje(), this.getDeje(), "deje", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(choixEClass, Choix.class, "Choix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChoix_ChoixIndividuels(), this.getChoixIndividuel(), null, "choixIndividuels", null, 0, -1, Choix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getChoix__GetChoix__int(), this.getChoixIndividuel(), "getChoix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getChoix__GetOrCreateChoix__int(), this.getChoixIndividuel(), "getOrCreateChoix", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "matricule", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(choixIndividuelEClass, ChoixIndividuel.class, "ChoixIndividuel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoixIndividuel_NbMaxCheques(), ecorePackage.getEIntegerObject(), "nbMaxCheques", null, 1, 1, ChoixIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChoixIndividuel_Matricule(), ecorePackage.getEInt(), "matricule", null, 1, 1, ChoixIndividuel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ChequedejPackageImpl
