/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChequedejFactoryImpl extends EFactoryImpl implements ChequedejFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChequedejFactory init() {
		try {
			ChequedejFactory theChequedejFactory = (ChequedejFactory)EPackage.Registry.INSTANCE.getEFactory(ChequedejPackage.eNS_URI);
			if (theChequedejFactory != null) {
				return theChequedejFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChequedejFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ChequedejPackage.SUCCURSALE: return createSuccursale();
			case ChequedejPackage.CODE_CLIENT: return createCodeClient();
			case ChequedejPackage.CHEQUE_DEJ: return createChequeDej();
			case ChequedejPackage.COMMANDE: return createCommande();
			case ChequedejPackage.ITEM: return createItem();
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL: return createEtablissementVirtuel();
			case ChequedejPackage.CARNET: return createCarnet();
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS: return createEtablissementsVirtuels();
			case ChequedejPackage.PARAMETRAGE: return createParametrage();
			case ChequedejPackage.STOCK: return createStock();
			case ChequedejPackage.CHEQUE: return createCheque();
			case ChequedejPackage.SOLDE: return createSolde();
			case ChequedejPackage.SOLDE_INDIVIDUEL: return createSoldeIndividuel();
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL: return createHistoriqueSoldeIndividuel();
			case ChequedejPackage.DEJE: return createDeje();
			case ChequedejPackage.DEJE_INDIVIDUEL: return createDejeIndividuel();
			case ChequedejPackage.DEJE_MENSUEL: return createDejeMensuel();
			case ChequedejPackage.CHOIX: return createChoix();
			case ChequedejPackage.CHOIX_INDIVIDUEL: return createChoixIndividuel();
			case ChequedejPackage.CONTRATS: return createContrats();
			case ChequedejPackage.CONTRAT: return createContrat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succursale createSuccursale() {
		SuccursaleImpl succursale = new SuccursaleImpl();
		return succursale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeClient createCodeClient() {
		CodeClientImpl codeClient = new CodeClientImpl();
		return codeClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequeDej createChequeDej() {
		ChequeDejImpl chequeDej = new ChequeDejImpl();
		return chequeDej;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande createCommande() {
		CommandeImpl commande = new CommandeImpl();
		return commande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementVirtuel createEtablissementVirtuel() {
		EtablissementVirtuelImpl etablissementVirtuel = new EtablissementVirtuelImpl();
		return etablissementVirtuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carnet createCarnet() {
		CarnetImpl carnet = new CarnetImpl();
		return carnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementsVirtuels createEtablissementsVirtuels() {
		EtablissementsVirtuelsImpl etablissementsVirtuels = new EtablissementsVirtuelsImpl();
		return etablissementsVirtuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametrage createParametrage() {
		ParametrageImpl parametrage = new ParametrageImpl();
		return parametrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stock createStock() {
		StockImpl stock = new StockImpl();
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque createCheque() {
		ChequeImpl cheque = new ChequeImpl();
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solde createSolde() {
		SoldeImpl solde = new SoldeImpl();
		return solde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoldeIndividuel createSoldeIndividuel() {
		SoldeIndividuelImpl soldeIndividuel = new SoldeIndividuelImpl();
		return soldeIndividuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoriqueSoldeIndividuel createHistoriqueSoldeIndividuel() {
		HistoriqueSoldeIndividuelImpl historiqueSoldeIndividuel = new HistoriqueSoldeIndividuelImpl();
		return historiqueSoldeIndividuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deje createDeje() {
		DejeImpl deje = new DejeImpl();
		return deje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DejeIndividuel createDejeIndividuel() {
		DejeIndividuelImpl dejeIndividuel = new DejeIndividuelImpl();
		return dejeIndividuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DejeMensuel createDejeMensuel() {
		DejeMensuelImpl dejeMensuel = new DejeMensuelImpl();
		return dejeMensuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix createChoix() {
		ChoixImpl choix = new ChoixImpl();
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoixIndividuel createChoixIndividuel() {
		ChoixIndividuelImpl choixIndividuel = new ChoixIndividuelImpl();
		return choixIndividuel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contrats createContrats() {
		ContratsImpl contrats = new ContratsImpl();
		return contrats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contrat createContrat() {
		ContratImpl contrat = new ContratImpl();
		return contrat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejPackage getChequedejPackage() {
		return (ChequedejPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChequedejPackage getPackage() {
		return ChequedejPackage.eINSTANCE;
	}

} //ChequedejFactoryImpl
