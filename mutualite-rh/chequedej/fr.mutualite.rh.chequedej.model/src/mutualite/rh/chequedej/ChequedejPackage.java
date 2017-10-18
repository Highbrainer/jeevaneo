/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mutualite.rh.chequedej.ChequedejFactory
 * @model kind="package"
 * @generated
 */
public interface ChequedejPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chequedej";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mutualite.fr/chequedej/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chequedej";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChequedejPackage eINSTANCE = mutualite.rh.chequedej.impl.ChequedejPackageImpl.init();

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.SuccursaleImpl <em>Succursale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.SuccursaleImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSuccursale()
	 * @generated
	 */
	int SUCCURSALE = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE__NUMERO = 0;

	/**
	 * The feature id for the '<em><b>Id Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE__ID_ETABLISSEMENT = 1;

	/**
	 * The number of structural features of the '<em>Succursale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Code Client</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE___CODE_CLIENT = 0;

	/**
	 * The number of operations of the '<em>Succursale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.CodeClientImpl <em>Code Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.CodeClientImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCodeClient()
	 * @generated
	 */
	int CODE_CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Succursales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CLIENT__SUCCURSALES = 0;

	/**
	 * The feature id for the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CLIENT__NUMERO = 1;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CLIENT__LIBELLE = 2;

	/**
	 * The number of structural features of the '<em>Code Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Code Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ChequeDejImpl <em>Cheque Dej</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ChequeDejImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChequeDej()
	 * @generated
	 */
	int CHEQUE_DEJ = 2;

	/**
	 * The feature id for the '<em><b>Carnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__CARNET = 0;

	/**
	 * The feature id for the '<em><b>Valeur Nominale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__VALEUR_NOMINALE = 1;

	/**
	 * The feature id for the '<em><b>Participation Patronale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__PARTICIPATION_PATRONALE = 2;

	/**
	 * The feature id for the '<em><b>Etablissements Virtuels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS = 3;

	/**
	 * The feature id for the '<em><b>Parametrage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__PARAMETRAGE = 4;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__STOCK = 5;

	/**
	 * The feature id for the '<em><b>Solde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__SOLDE = 6;

	/**
	 * The feature id for the '<em><b>Dejes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__DEJES = 7;

	/**
	 * The feature id for the '<em><b>Choix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__CHOIX = 8;

	/**
	 * The feature id for the '<em><b>Commande Max Par Defaut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT = 9;

	/**
	 * The feature id for the '<em><b>Contrats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ__CONTRATS = 10;

	/**
	 * The number of structural features of the '<em>Cheque Dej</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Integrate Deje</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ___INTEGRATE_DEJE__STRING_INT_INT_INTEGER = 0;

	/**
	 * The number of operations of the '<em>Cheque Dej</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.CommandeImpl <em>Commande</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.CommandeImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCommande()
	 * @generated
	 */
	int COMMANDE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Participation Patronale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__PARTICIPATION_PATRONALE = 2;

	/**
	 * The feature id for the '<em><b>Valeur Nominale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__VALEUR_NOMINALE = 3;

	/**
	 * The feature id for the '<em><b>Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__MOIS = 4;

	/**
	 * The feature id for the '<em><b>Commande Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__COMMANDE_PRECEDENTE = 5;

	/**
	 * The feature id for the '<em><b>Commande Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__COMMANDE_SUIVANTE = 6;

	/**
	 * The number of structural features of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Carnet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE___CARNET = 0;

	/**
	 * The operation id for the '<em>Get Or Create Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE___GET_OR_CREATE_ITEM__INT = 1;

	/**
	 * The number of operations of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ItemImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The feature id for the '<em><b>Succursale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SUCCURSALE = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__MATRICULE = 1;

	/**
	 * The feature id for the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NB_CHEQUES = 2;

	/**
	 * The feature id for the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMMENTAIRE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NOM = 4;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRENOM = 5;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.EtablissementVirtuelImpl <em>Etablissement Virtuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.EtablissementVirtuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getEtablissementVirtuel()
	 * @generated
	 */
	int ETABLISSEMENT_VIRTUEL = 5;

	/**
	 * The feature id for the '<em><b>Matricules Employes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES = 0;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL__LIBELLE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL__ID = 2;

	/**
	 * The number of structural features of the '<em>Etablissement Virtuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Etablissement Virtuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.CarnetImpl <em>Carnet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.CarnetImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCarnet()
	 * @generated
	 */
	int CARNET = 6;

	/**
	 * The feature id for the '<em><b>Commandes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET__COMMANDES = 0;

	/**
	 * The number of structural features of the '<em>Carnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET___ROOT = 0;

	/**
	 * The operation id for the '<em>Get Or Create Commande</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET___GET_OR_CREATE_COMMANDE__STRING = 1;

	/**
	 * The number of operations of the '<em>Carnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.EtablissementsVirtuelsImpl <em>Etablissements Virtuels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.EtablissementsVirtuelsImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getEtablissementsVirtuels()
	 * @generated
	 */
	int ETABLISSEMENTS_VIRTUELS = 7;

	/**
	 * The feature id for the '<em><b>Etablissements Virtuels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS = 0;

	/**
	 * The number of structural features of the '<em>Etablissements Virtuels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS_VIRTUELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Etablissements Virtuels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENTS_VIRTUELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ParametrageImpl <em>Parametrage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ParametrageImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getParametrage()
	 * @generated
	 */
	int PARAMETRAGE = 8;

	/**
	 * The feature id for the '<em><b>Codes Client</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRAGE__CODES_CLIENT = 0;

	/**
	 * The number of structural features of the '<em>Parametrage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parametrage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETRAGE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.StockImpl <em>Stock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.StockImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getStock()
	 * @generated
	 */
	int STOCK = 9;

	/**
	 * The feature id for the '<em><b>Cheque</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__CHEQUE = 0;

	/**
	 * The feature id for the '<em><b>Derniere Maj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK__DERNIERE_MAJ = 1;

	/**
	 * The number of structural features of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ChequeImpl <em>Cheque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ChequeImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCheque()
	 * @generated
	 */
	int CHEQUE = 10;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__MATRICULE = 0;

	/**
	 * The feature id for the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__NB_CHEQUES = 1;

	/**
	 * The number of structural features of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.SoldeImpl <em>Solde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.SoldeImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSolde()
	 * @generated
	 */
	int SOLDE = 11;

	/**
	 * The feature id for the '<em><b>Soldes Individuels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE__SOLDES_INDIVIDUELS = 0;

	/**
	 * The number of structural features of the '<em>Solde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Or Create Solde Individual</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE___GET_OR_CREATE_SOLDE_INDIVIDUAL__INT_INT = 0;

	/**
	 * The operation id for the '<em>Get Solde</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE___GET_SOLDE__INT_INT = 1;

	/**
	 * The operation id for the '<em>Annee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE___ANNEE__STRING = 2;

	/**
	 * The number of operations of the '<em>Solde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl <em>Solde Individuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.SoldeIndividuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSoldeIndividuel()
	 * @generated
	 */
	int SOLDE_INDIVIDUEL = 12;

	/**
	 * The feature id for the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL__NB_CHEQUES = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL__MATRICULE = 1;

	/**
	 * The feature id for the '<em><b>Historique</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL__HISTORIQUE = 2;

	/**
	 * The feature id for the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL__ANNEE = 3;

	/**
	 * The number of structural features of the '<em>Solde Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Incremente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL___INCREMENTE__INT_STRING = 0;

	/**
	 * The number of operations of the '<em>Solde Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLDE_INDIVIDUEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl <em>Historique Solde Individuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getHistoriqueSoldeIndividuel()
	 * @generated
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL = 13;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL__DATE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Solde Avant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT = 2;

	/**
	 * The feature id for the '<em><b>Solde Apres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES = 3;

	/**
	 * The number of structural features of the '<em>Historique Solde Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Historique Solde Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_SOLDE_INDIVIDUEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.DejeImpl <em>Deje</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.DejeImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDeje()
	 * @generated
	 */
	int DEJE = 14;

	/**
	 * The feature id for the '<em><b>Dejes Mensuels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE__DEJES_MENSUELS = 0;

	/**
	 * The number of structural features of the '<em>Deje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Or Create Deje Mensuel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE___GET_OR_CREATE_DEJE_MENSUEL__STRING = 0;

	/**
	 * The operation id for the '<em>Root</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE___ROOT = 1;

	/**
	 * The number of operations of the '<em>Deje</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.DejeIndividuelImpl <em>Deje Individuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.DejeIndividuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDejeIndividuel()
	 * @generated
	 */
	int DEJE_INDIVIDUEL = 15;

	/**
	 * The feature id for the '<em><b>Nb Estime Jours Entiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL__MATRICULE = 1;

	/**
	 * The feature id for the '<em><b>Nb Reel Jours Entiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS = 2;

	/**
	 * The feature id for the '<em><b>Avance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL__AVANCE = 3;

	/**
	 * The number of structural features of the '<em>Deje Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Deje Mensuel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL___DEJE_MENSUEL = 0;

	/**
	 * The number of operations of the '<em>Deje Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_INDIVIDUEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.DejeMensuelImpl <em>Deje Mensuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.DejeMensuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDejeMensuel()
	 * @generated
	 */
	int DEJE_MENSUEL = 16;

	/**
	 * The feature id for the '<em><b>Dejes Individuels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL__DEJES_INDIVIDUELS = 0;

	/**
	 * The feature id for the '<em><b>Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL__MOIS = 1;

	/**
	 * The number of structural features of the '<em>Deje Mensuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL___LABEL = 0;

	/**
	 * The operation id for the '<em>Get Or Create Deje Individuel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL___GET_OR_CREATE_DEJE_INDIVIDUEL__INT = 1;

	/**
	 * The operation id for the '<em>Deje</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL___DEJE = 2;

	/**
	 * The number of operations of the '<em>Deje Mensuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEJE_MENSUEL_OPERATION_COUNT = 3;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ChoixImpl <em>Choix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ChoixImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChoix()
	 * @generated
	 */
	int CHOIX = 17;

	/**
	 * The feature id for the '<em><b>Choix Individuels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX__CHOIX_INDIVIDUELS = 0;

	/**
	 * The number of structural features of the '<em>Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Choix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX___GET_CHOIX__INT = 0;

	/**
	 * The operation id for the '<em>Get Or Create Choix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX___GET_OR_CREATE_CHOIX__INT = 1;

	/**
	 * The number of operations of the '<em>Choix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ChoixIndividuelImpl <em>Choix Individuel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ChoixIndividuelImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChoixIndividuel()
	 * @generated
	 */
	int CHOIX_INDIVIDUEL = 18;

	/**
	 * The feature id for the '<em><b>Nb Max Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_INDIVIDUEL__NB_MAX_CHEQUES = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_INDIVIDUEL__MATRICULE = 1;

	/**
	 * The number of structural features of the '<em>Choix Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_INDIVIDUEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Choix Individuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOIX_INDIVIDUEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ContratsImpl <em>Contrats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ContratsImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getContrats()
	 * @generated
	 */
	int CONTRATS = 19;

	/**
	 * The feature id for the '<em><b>Contrats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRATS__CONTRATS = 0;

	/**
	 * The number of structural features of the '<em>Contrats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRATS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Or Create Contrat</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRATS___GET_OR_CREATE_CONTRAT__INT = 0;

	/**
	 * The operation id for the '<em>Is Partiel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRATS___IS_PARTIEL__INT = 1;

	/**
	 * The number of operations of the '<em>Contrats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRATS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.ContratImpl <em>Contrat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.ContratImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getContrat()
	 * @generated
	 */
	int CONTRAT = 20;

	/**
	 * The feature id for the '<em><b>Temps Travail Mensuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__TEMPS_TRAVAIL_MENSUEL = 0;

	/**
	 * The feature id for the '<em><b>Partiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__PARTIEL = 1;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT__MATRICULE = 2;

	/**
	 * The number of structural features of the '<em>Contrat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contrat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link mutualite.rh.chequedej.impl.AvanceImpl <em>Avance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mutualite.rh.chequedej.impl.AvanceImpl
	 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getAvance()
	 * @generated
	 */
	int AVANCE = 21;

	/**
	 * The feature id for the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE__NB_CHEQUES = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Avance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Deje Individuel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE___DEJE_INDIVIDUEL = 0;

	/**
	 * The number of operations of the '<em>Avance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVANCE_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Succursale <em>Succursale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Succursale</em>'.
	 * @see mutualite.rh.chequedej.Succursale
	 * @generated
	 */
	EClass getSuccursale();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Succursale#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mutualite.rh.chequedej.Succursale#getNumero()
	 * @see #getSuccursale()
	 * @generated
	 */
	EAttribute getSuccursale_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Succursale#getIdEtablissement <em>Id Etablissement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Etablissement</em>'.
	 * @see mutualite.rh.chequedej.Succursale#getIdEtablissement()
	 * @see #getSuccursale()
	 * @generated
	 */
	EAttribute getSuccursale_IdEtablissement();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Succursale#codeClient() <em>Code Client</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Code Client</em>' operation.
	 * @see mutualite.rh.chequedej.Succursale#codeClient()
	 * @generated
	 */
	EOperation getSuccursale__CodeClient();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.CodeClient <em>Code Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Client</em>'.
	 * @see mutualite.rh.chequedej.CodeClient
	 * @generated
	 */
	EClass getCodeClient();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.CodeClient#getSuccursales <em>Succursales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Succursales</em>'.
	 * @see mutualite.rh.chequedej.CodeClient#getSuccursales()
	 * @see #getCodeClient()
	 * @generated
	 */
	EReference getCodeClient_Succursales();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.CodeClient#getNumero <em>Numero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero</em>'.
	 * @see mutualite.rh.chequedej.CodeClient#getNumero()
	 * @see #getCodeClient()
	 * @generated
	 */
	EAttribute getCodeClient_Numero();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.CodeClient#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see mutualite.rh.chequedej.CodeClient#getLibelle()
	 * @see #getCodeClient()
	 * @generated
	 */
	EAttribute getCodeClient_Libelle();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.ChequeDej <em>Cheque Dej</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque Dej</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej
	 * @generated
	 */
	EClass getChequeDej();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getCarnet <em>Carnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Carnet</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getCarnet()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Carnet();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.ChequeDej#getValeurNominale <em>Valeur Nominale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur Nominale</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getValeurNominale()
	 * @see #getChequeDej()
	 * @generated
	 */
	EAttribute getChequeDej_ValeurNominale();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.ChequeDej#getParticipationPatronale <em>Participation Patronale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participation Patronale</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getParticipationPatronale()
	 * @see #getChequeDej()
	 * @generated
	 */
	EAttribute getChequeDej_ParticipationPatronale();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Etablissements Virtuels</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getEtablissementsVirtuels()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_EtablissementsVirtuels();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getParametrage <em>Parametrage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parametrage</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getParametrage()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Parametrage();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stock</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getStock()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Stock();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getSolde <em>Solde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solde</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getSolde()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Solde();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getDejes <em>Dejes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dejes</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getDejes()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Dejes();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getChoix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choix</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getChoix()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Choix();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.ChequeDej#getCommandeMaxParDefaut <em>Commande Max Par Defaut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commande Max Par Defaut</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getCommandeMaxParDefaut()
	 * @see #getChequeDej()
	 * @generated
	 */
	EAttribute getChequeDej_CommandeMaxParDefaut();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.ChequeDej#getContrats <em>Contrats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contrats</em>'.
	 * @see mutualite.rh.chequedej.ChequeDej#getContrats()
	 * @see #getChequeDej()
	 * @generated
	 */
	EReference getChequeDej_Contrats();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.ChequeDej#integrateDeje(java.lang.String, int, int, java.lang.Integer) <em>Integrate Deje</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Integrate Deje</em>' operation.
	 * @see mutualite.rh.chequedej.ChequeDej#integrateDeje(java.lang.String, int, int, java.lang.Integer)
	 * @generated
	 */
	EOperation getChequeDej__IntegrateDeje__String_int_int_Integer();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Commande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commande</em>'.
	 * @see mutualite.rh.chequedej.Commande
	 * @generated
	 */
	EClass getCommande();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Commande#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mutualite.rh.chequedej.Commande#getDate()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Commande#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see mutualite.rh.chequedej.Commande#getItems()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Items();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Commande#getParticipationPatronale <em>Participation Patronale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participation Patronale</em>'.
	 * @see mutualite.rh.chequedej.Commande#getParticipationPatronale()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_ParticipationPatronale();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Commande#getValeurNominale <em>Valeur Nominale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valeur Nominale</em>'.
	 * @see mutualite.rh.chequedej.Commande#getValeurNominale()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_ValeurNominale();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Commande#getMois <em>Mois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mois</em>'.
	 * @see mutualite.rh.chequedej.Commande#getMois()
	 * @see #getCommande()
	 * @generated
	 */
	EAttribute getCommande_Mois();

	/**
	 * Returns the meta object for the reference '{@link mutualite.rh.chequedej.Commande#getCommandePrecedente <em>Commande Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commande Precedente</em>'.
	 * @see mutualite.rh.chequedej.Commande#getCommandePrecedente()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_CommandePrecedente();

	/**
	 * Returns the meta object for the reference '{@link mutualite.rh.chequedej.Commande#getCommandeSuivante <em>Commande Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commande Suivante</em>'.
	 * @see mutualite.rh.chequedej.Commande#getCommandeSuivante()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_CommandeSuivante();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Commande#carnet() <em>Carnet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Carnet</em>' operation.
	 * @see mutualite.rh.chequedej.Commande#carnet()
	 * @generated
	 */
	EOperation getCommande__Carnet();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Commande#getOrCreateItem(int) <em>Get Or Create Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Item</em>' operation.
	 * @see mutualite.rh.chequedej.Commande#getOrCreateItem(int)
	 * @generated
	 */
	EOperation getCommande__GetOrCreateItem__int();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see mutualite.rh.chequedej.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the reference '{@link mutualite.rh.chequedej.Item#getSuccursale <em>Succursale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Succursale</em>'.
	 * @see mutualite.rh.chequedej.Item#getSuccursale()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Succursale();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.Item#getMatricule()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getNbCheques <em>Nb Cheques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Cheques</em>'.
	 * @see mutualite.rh.chequedej.Item#getNbCheques()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_NbCheques();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getCommentaire <em>Commentaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commentaire</em>'.
	 * @see mutualite.rh.chequedej.Item#getCommentaire()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Commentaire();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see mutualite.rh.chequedej.Item#getNom()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Nom();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see mutualite.rh.chequedej.Item#getPrenom()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Prenom();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.EtablissementVirtuel <em>Etablissement Virtuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etablissement Virtuel</em>'.
	 * @see mutualite.rh.chequedej.EtablissementVirtuel
	 * @generated
	 */
	EClass getEtablissementVirtuel();

	/**
	 * Returns the meta object for the attribute list '{@link mutualite.rh.chequedej.EtablissementVirtuel#getMatriculesEmployes <em>Matricules Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Matricules Employes</em>'.
	 * @see mutualite.rh.chequedej.EtablissementVirtuel#getMatriculesEmployes()
	 * @see #getEtablissementVirtuel()
	 * @generated
	 */
	EAttribute getEtablissementVirtuel_MatriculesEmployes();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.EtablissementVirtuel#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see mutualite.rh.chequedej.EtablissementVirtuel#getLibelle()
	 * @see #getEtablissementVirtuel()
	 * @generated
	 */
	EAttribute getEtablissementVirtuel_Libelle();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.EtablissementVirtuel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see mutualite.rh.chequedej.EtablissementVirtuel#getId()
	 * @see #getEtablissementVirtuel()
	 * @generated
	 */
	EAttribute getEtablissementVirtuel_Id();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Carnet <em>Carnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Carnet</em>'.
	 * @see mutualite.rh.chequedej.Carnet
	 * @generated
	 */
	EClass getCarnet();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Carnet#getCommandes <em>Commandes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commandes</em>'.
	 * @see mutualite.rh.chequedej.Carnet#getCommandes()
	 * @see #getCarnet()
	 * @generated
	 */
	EReference getCarnet_Commandes();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Carnet#root() <em>Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Root</em>' operation.
	 * @see mutualite.rh.chequedej.Carnet#root()
	 * @generated
	 */
	EOperation getCarnet__Root();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Carnet#getOrCreateCommande(java.lang.String) <em>Get Or Create Commande</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Commande</em>' operation.
	 * @see mutualite.rh.chequedej.Carnet#getOrCreateCommande(java.lang.String)
	 * @generated
	 */
	EOperation getCarnet__GetOrCreateCommande__String();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.EtablissementsVirtuels <em>Etablissements Virtuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etablissements Virtuels</em>'.
	 * @see mutualite.rh.chequedej.EtablissementsVirtuels
	 * @generated
	 */
	EClass getEtablissementsVirtuels();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.EtablissementsVirtuels#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Etablissements Virtuels</em>'.
	 * @see mutualite.rh.chequedej.EtablissementsVirtuels#getEtablissementsVirtuels()
	 * @see #getEtablissementsVirtuels()
	 * @generated
	 */
	EReference getEtablissementsVirtuels_EtablissementsVirtuels();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Parametrage <em>Parametrage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parametrage</em>'.
	 * @see mutualite.rh.chequedej.Parametrage
	 * @generated
	 */
	EClass getParametrage();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Parametrage#getCodesClient <em>Codes Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codes Client</em>'.
	 * @see mutualite.rh.chequedej.Parametrage#getCodesClient()
	 * @see #getParametrage()
	 * @generated
	 */
	EReference getParametrage_CodesClient();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock</em>'.
	 * @see mutualite.rh.chequedej.Stock
	 * @generated
	 */
	EClass getStock();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Stock#getCheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cheque</em>'.
	 * @see mutualite.rh.chequedej.Stock#getCheque()
	 * @see #getStock()
	 * @generated
	 */
	EReference getStock_Cheque();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Stock#getDerniereMaj <em>Derniere Maj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derniere Maj</em>'.
	 * @see mutualite.rh.chequedej.Stock#getDerniereMaj()
	 * @see #getStock()
	 * @generated
	 */
	EAttribute getStock_DerniereMaj();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque</em>'.
	 * @see mutualite.rh.chequedej.Cheque
	 * @generated
	 */
	EClass getCheque();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Cheque#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.Cheque#getMatricule()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Cheque#getNbCheques <em>Nb Cheques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Cheques</em>'.
	 * @see mutualite.rh.chequedej.Cheque#getNbCheques()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_NbCheques();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Solde <em>Solde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solde</em>'.
	 * @see mutualite.rh.chequedej.Solde
	 * @generated
	 */
	EClass getSolde();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Solde#getSoldesIndividuels <em>Soldes Individuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Soldes Individuels</em>'.
	 * @see mutualite.rh.chequedej.Solde#getSoldesIndividuels()
	 * @see #getSolde()
	 * @generated
	 */
	EReference getSolde_SoldesIndividuels();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Solde#getOrCreateSoldeIndividual(int, int) <em>Get Or Create Solde Individual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Solde Individual</em>' operation.
	 * @see mutualite.rh.chequedej.Solde#getOrCreateSoldeIndividual(int, int)
	 * @generated
	 */
	EOperation getSolde__GetOrCreateSoldeIndividual__int_int();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Solde#getSolde(int, int) <em>Get Solde</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Solde</em>' operation.
	 * @see mutualite.rh.chequedej.Solde#getSolde(int, int)
	 * @generated
	 */
	EOperation getSolde__GetSolde__int_int();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Solde#annee(java.lang.String) <em>Annee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Annee</em>' operation.
	 * @see mutualite.rh.chequedej.Solde#annee(java.lang.String)
	 * @generated
	 */
	EOperation getSolde__Annee__String();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.SoldeIndividuel <em>Solde Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solde Individuel</em>'.
	 * @see mutualite.rh.chequedej.SoldeIndividuel
	 * @generated
	 */
	EClass getSoldeIndividuel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.SoldeIndividuel#getNbCheques <em>Nb Cheques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Cheques</em>'.
	 * @see mutualite.rh.chequedej.SoldeIndividuel#getNbCheques()
	 * @see #getSoldeIndividuel()
	 * @generated
	 */
	EAttribute getSoldeIndividuel_NbCheques();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.SoldeIndividuel#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.SoldeIndividuel#getMatricule()
	 * @see #getSoldeIndividuel()
	 * @generated
	 */
	EAttribute getSoldeIndividuel_Matricule();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.SoldeIndividuel#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Historique</em>'.
	 * @see mutualite.rh.chequedej.SoldeIndividuel#getHistorique()
	 * @see #getSoldeIndividuel()
	 * @generated
	 */
	EReference getSoldeIndividuel_Historique();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.SoldeIndividuel#getAnnee <em>Annee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee</em>'.
	 * @see mutualite.rh.chequedej.SoldeIndividuel#getAnnee()
	 * @see #getSoldeIndividuel()
	 * @generated
	 */
	EAttribute getSoldeIndividuel_Annee();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.SoldeIndividuel#incremente(int, java.lang.String) <em>Incremente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incremente</em>' operation.
	 * @see mutualite.rh.chequedej.SoldeIndividuel#incremente(int, java.lang.String)
	 * @generated
	 */
	EOperation getSoldeIndividuel__Incremente__int_String();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel <em>Historique Solde Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historique Solde Individuel</em>'.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel
	 * @generated
	 */
	EClass getHistoriqueSoldeIndividuel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getDate()
	 * @see #getHistoriqueSoldeIndividuel()
	 * @generated
	 */
	EAttribute getHistoriqueSoldeIndividuel_Date();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getComment()
	 * @see #getHistoriqueSoldeIndividuel()
	 * @generated
	 */
	EAttribute getHistoriqueSoldeIndividuel_Comment();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeAvant <em>Solde Avant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solde Avant</em>'.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeAvant()
	 * @see #getHistoriqueSoldeIndividuel()
	 * @generated
	 */
	EAttribute getHistoriqueSoldeIndividuel_SoldeAvant();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeApres <em>Solde Apres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solde Apres</em>'.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel#getSoldeApres()
	 * @see #getHistoriqueSoldeIndividuel()
	 * @generated
	 */
	EAttribute getHistoriqueSoldeIndividuel_SoldeApres();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Deje <em>Deje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deje</em>'.
	 * @see mutualite.rh.chequedej.Deje
	 * @generated
	 */
	EClass getDeje();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Deje#getDejesMensuels <em>Dejes Mensuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dejes Mensuels</em>'.
	 * @see mutualite.rh.chequedej.Deje#getDejesMensuels()
	 * @see #getDeje()
	 * @generated
	 */
	EReference getDeje_DejesMensuels();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Deje#getOrCreateDejeMensuel(java.lang.String) <em>Get Or Create Deje Mensuel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Deje Mensuel</em>' operation.
	 * @see mutualite.rh.chequedej.Deje#getOrCreateDejeMensuel(java.lang.String)
	 * @generated
	 */
	EOperation getDeje__GetOrCreateDejeMensuel__String();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Deje#root() <em>Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Root</em>' operation.
	 * @see mutualite.rh.chequedej.Deje#root()
	 * @generated
	 */
	EOperation getDeje__Root();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.DejeIndividuel <em>Deje Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deje Individuel</em>'.
	 * @see mutualite.rh.chequedej.DejeIndividuel
	 * @generated
	 */
	EClass getDejeIndividuel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.DejeIndividuel#getNbEstimeJoursEntiers <em>Nb Estime Jours Entiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Estime Jours Entiers</em>'.
	 * @see mutualite.rh.chequedej.DejeIndividuel#getNbEstimeJoursEntiers()
	 * @see #getDejeIndividuel()
	 * @generated
	 */
	EAttribute getDejeIndividuel_NbEstimeJoursEntiers();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.DejeIndividuel#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.DejeIndividuel#getMatricule()
	 * @see #getDejeIndividuel()
	 * @generated
	 */
	EAttribute getDejeIndividuel_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.DejeIndividuel#getNbReelJoursEntiers <em>Nb Reel Jours Entiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Reel Jours Entiers</em>'.
	 * @see mutualite.rh.chequedej.DejeIndividuel#getNbReelJoursEntiers()
	 * @see #getDejeIndividuel()
	 * @generated
	 */
	EAttribute getDejeIndividuel_NbReelJoursEntiers();

	/**
	 * Returns the meta object for the containment reference '{@link mutualite.rh.chequedej.DejeIndividuel#getAvance <em>Avance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Avance</em>'.
	 * @see mutualite.rh.chequedej.DejeIndividuel#getAvance()
	 * @see #getDejeIndividuel()
	 * @generated
	 */
	EReference getDejeIndividuel_Avance();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.DejeIndividuel#dejeMensuel() <em>Deje Mensuel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deje Mensuel</em>' operation.
	 * @see mutualite.rh.chequedej.DejeIndividuel#dejeMensuel()
	 * @generated
	 */
	EOperation getDejeIndividuel__DejeMensuel();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.DejeMensuel <em>Deje Mensuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deje Mensuel</em>'.
	 * @see mutualite.rh.chequedej.DejeMensuel
	 * @generated
	 */
	EClass getDejeMensuel();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.DejeMensuel#getDejesIndividuels <em>Dejes Individuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dejes Individuels</em>'.
	 * @see mutualite.rh.chequedej.DejeMensuel#getDejesIndividuels()
	 * @see #getDejeMensuel()
	 * @generated
	 */
	EReference getDejeMensuel_DejesIndividuels();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.DejeMensuel#getMois <em>Mois</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mois</em>'.
	 * @see mutualite.rh.chequedej.DejeMensuel#getMois()
	 * @see #getDejeMensuel()
	 * @generated
	 */
	EAttribute getDejeMensuel_Mois();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.DejeMensuel#label() <em>Label</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Label</em>' operation.
	 * @see mutualite.rh.chequedej.DejeMensuel#label()
	 * @generated
	 */
	EOperation getDejeMensuel__Label();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.DejeMensuel#getOrCreateDejeIndividuel(int) <em>Get Or Create Deje Individuel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Deje Individuel</em>' operation.
	 * @see mutualite.rh.chequedej.DejeMensuel#getOrCreateDejeIndividuel(int)
	 * @generated
	 */
	EOperation getDejeMensuel__GetOrCreateDejeIndividuel__int();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.DejeMensuel#deje() <em>Deje</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deje</em>' operation.
	 * @see mutualite.rh.chequedej.DejeMensuel#deje()
	 * @generated
	 */
	EOperation getDejeMensuel__Deje();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Choix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choix</em>'.
	 * @see mutualite.rh.chequedej.Choix
	 * @generated
	 */
	EClass getChoix();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Choix#getChoixIndividuels <em>Choix Individuels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choix Individuels</em>'.
	 * @see mutualite.rh.chequedej.Choix#getChoixIndividuels()
	 * @see #getChoix()
	 * @generated
	 */
	EReference getChoix_ChoixIndividuels();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Choix#getChoix(int) <em>Get Choix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Choix</em>' operation.
	 * @see mutualite.rh.chequedej.Choix#getChoix(int)
	 * @generated
	 */
	EOperation getChoix__GetChoix__int();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Choix#getOrCreateChoix(int) <em>Get Or Create Choix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Choix</em>' operation.
	 * @see mutualite.rh.chequedej.Choix#getOrCreateChoix(int)
	 * @generated
	 */
	EOperation getChoix__GetOrCreateChoix__int();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.ChoixIndividuel <em>Choix Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choix Individuel</em>'.
	 * @see mutualite.rh.chequedej.ChoixIndividuel
	 * @generated
	 */
	EClass getChoixIndividuel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.ChoixIndividuel#getNbMaxCheques <em>Nb Max Cheques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Max Cheques</em>'.
	 * @see mutualite.rh.chequedej.ChoixIndividuel#getNbMaxCheques()
	 * @see #getChoixIndividuel()
	 * @generated
	 */
	EAttribute getChoixIndividuel_NbMaxCheques();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.ChoixIndividuel#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.ChoixIndividuel#getMatricule()
	 * @see #getChoixIndividuel()
	 * @generated
	 */
	EAttribute getChoixIndividuel_Matricule();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Contrats <em>Contrats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrats</em>'.
	 * @see mutualite.rh.chequedej.Contrats
	 * @generated
	 */
	EClass getContrats();

	/**
	 * Returns the meta object for the containment reference list '{@link mutualite.rh.chequedej.Contrats#getContrats <em>Contrats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contrats</em>'.
	 * @see mutualite.rh.chequedej.Contrats#getContrats()
	 * @see #getContrats()
	 * @generated
	 */
	EReference getContrats_Contrats();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Contrats#getOrCreateContrat(int) <em>Get Or Create Contrat</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Or Create Contrat</em>' operation.
	 * @see mutualite.rh.chequedej.Contrats#getOrCreateContrat(int)
	 * @generated
	 */
	EOperation getContrats__GetOrCreateContrat__int();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Contrats#isPartiel(int) <em>Is Partiel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Partiel</em>' operation.
	 * @see mutualite.rh.chequedej.Contrats#isPartiel(int)
	 * @generated
	 */
	EOperation getContrats__IsPartiel__int();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Contrat <em>Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrat</em>'.
	 * @see mutualite.rh.chequedej.Contrat
	 * @generated
	 */
	EClass getContrat();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Contrat#getTempsTravailMensuel <em>Temps Travail Mensuel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temps Travail Mensuel</em>'.
	 * @see mutualite.rh.chequedej.Contrat#getTempsTravailMensuel()
	 * @see #getContrat()
	 * @generated
	 */
	EAttribute getContrat_TempsTravailMensuel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Contrat#isPartiel <em>Partiel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partiel</em>'.
	 * @see mutualite.rh.chequedej.Contrat#isPartiel()
	 * @see #getContrat()
	 * @generated
	 */
	EAttribute getContrat_Partiel();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Contrat#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see mutualite.rh.chequedej.Contrat#getMatricule()
	 * @see #getContrat()
	 * @generated
	 */
	EAttribute getContrat_Matricule();

	/**
	 * Returns the meta object for class '{@link mutualite.rh.chequedej.Avance <em>Avance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avance</em>'.
	 * @see mutualite.rh.chequedej.Avance
	 * @generated
	 */
	EClass getAvance();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Avance#getNbCheques <em>Nb Cheques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Cheques</em>'.
	 * @see mutualite.rh.chequedej.Avance#getNbCheques()
	 * @see #getAvance()
	 * @generated
	 */
	EAttribute getAvance_NbCheques();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Avance#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see mutualite.rh.chequedej.Avance#getDate()
	 * @see #getAvance()
	 * @generated
	 */
	EAttribute getAvance_Date();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Avance#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see mutualite.rh.chequedej.Avance#getComment()
	 * @see #getAvance()
	 * @generated
	 */
	EAttribute getAvance_Comment();

	/**
	 * Returns the meta object for the '{@link mutualite.rh.chequedej.Avance#dejeIndividuel() <em>Deje Individuel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deje Individuel</em>' operation.
	 * @see mutualite.rh.chequedej.Avance#dejeIndividuel()
	 * @generated
	 */
	EOperation getAvance__DejeIndividuel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChequedejFactory getChequedejFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.SuccursaleImpl <em>Succursale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.SuccursaleImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSuccursale()
		 * @generated
		 */
		EClass SUCCURSALE = eINSTANCE.getSuccursale();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCURSALE__NUMERO = eINSTANCE.getSuccursale_Numero();

		/**
		 * The meta object literal for the '<em><b>Id Etablissement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUCCURSALE__ID_ETABLISSEMENT = eINSTANCE.getSuccursale_IdEtablissement();

		/**
		 * The meta object literal for the '<em><b>Code Client</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUCCURSALE___CODE_CLIENT = eINSTANCE.getSuccursale__CodeClient();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.CodeClientImpl <em>Code Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.CodeClientImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCodeClient()
		 * @generated
		 */
		EClass CODE_CLIENT = eINSTANCE.getCodeClient();

		/**
		 * The meta object literal for the '<em><b>Succursales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_CLIENT__SUCCURSALES = eINSTANCE.getCodeClient_Succursales();

		/**
		 * The meta object literal for the '<em><b>Numero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CLIENT__NUMERO = eINSTANCE.getCodeClient_Numero();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CLIENT__LIBELLE = eINSTANCE.getCodeClient_Libelle();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ChequeDejImpl <em>Cheque Dej</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ChequeDejImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChequeDej()
		 * @generated
		 */
		EClass CHEQUE_DEJ = eINSTANCE.getChequeDej();

		/**
		 * The meta object literal for the '<em><b>Carnet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__CARNET = eINSTANCE.getChequeDej_Carnet();

		/**
		 * The meta object literal for the '<em><b>Valeur Nominale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE_DEJ__VALEUR_NOMINALE = eINSTANCE.getChequeDej_ValeurNominale();

		/**
		 * The meta object literal for the '<em><b>Participation Patronale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE_DEJ__PARTICIPATION_PATRONALE = eINSTANCE.getChequeDej_ParticipationPatronale();

		/**
		 * The meta object literal for the '<em><b>Etablissements Virtuels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS = eINSTANCE.getChequeDej_EtablissementsVirtuels();

		/**
		 * The meta object literal for the '<em><b>Parametrage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__PARAMETRAGE = eINSTANCE.getChequeDej_Parametrage();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__STOCK = eINSTANCE.getChequeDej_Stock();

		/**
		 * The meta object literal for the '<em><b>Solde</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__SOLDE = eINSTANCE.getChequeDej_Solde();

		/**
		 * The meta object literal for the '<em><b>Dejes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__DEJES = eINSTANCE.getChequeDej_Dejes();

		/**
		 * The meta object literal for the '<em><b>Choix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__CHOIX = eINSTANCE.getChequeDej_Choix();

		/**
		 * The meta object literal for the '<em><b>Commande Max Par Defaut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT = eINSTANCE.getChequeDej_CommandeMaxParDefaut();

		/**
		 * The meta object literal for the '<em><b>Contrats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHEQUE_DEJ__CONTRATS = eINSTANCE.getChequeDej_Contrats();

		/**
		 * The meta object literal for the '<em><b>Integrate Deje</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHEQUE_DEJ___INTEGRATE_DEJE__STRING_INT_INT_INTEGER = eINSTANCE.getChequeDej__IntegrateDeje__String_int_int_Integer();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.CommandeImpl <em>Commande</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.CommandeImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCommande()
		 * @generated
		 */
		EClass COMMANDE = eINSTANCE.getCommande();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__DATE = eINSTANCE.getCommande_Date();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__ITEMS = eINSTANCE.getCommande_Items();

		/**
		 * The meta object literal for the '<em><b>Participation Patronale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__PARTICIPATION_PATRONALE = eINSTANCE.getCommande_ParticipationPatronale();

		/**
		 * The meta object literal for the '<em><b>Valeur Nominale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__VALEUR_NOMINALE = eINSTANCE.getCommande_ValeurNominale();

		/**
		 * The meta object literal for the '<em><b>Mois</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMANDE__MOIS = eINSTANCE.getCommande_Mois();

		/**
		 * The meta object literal for the '<em><b>Commande Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__COMMANDE_PRECEDENTE = eINSTANCE.getCommande_CommandePrecedente();

		/**
		 * The meta object literal for the '<em><b>Commande Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__COMMANDE_SUIVANTE = eINSTANCE.getCommande_CommandeSuivante();

		/**
		 * The meta object literal for the '<em><b>Carnet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMANDE___CARNET = eINSTANCE.getCommande__Carnet();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMANDE___GET_OR_CREATE_ITEM__INT = eINSTANCE.getCommande__GetOrCreateItem__int();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ItemImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Succursale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SUCCURSALE = eINSTANCE.getItem_Succursale();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__MATRICULE = eINSTANCE.getItem_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nb Cheques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NB_CHEQUES = eINSTANCE.getItem_NbCheques();

		/**
		 * The meta object literal for the '<em><b>Commentaire</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__COMMENTAIRE = eINSTANCE.getItem_Commentaire();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NOM = eINSTANCE.getItem_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRENOM = eINSTANCE.getItem_Prenom();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.EtablissementVirtuelImpl <em>Etablissement Virtuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.EtablissementVirtuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getEtablissementVirtuel()
		 * @generated
		 */
		EClass ETABLISSEMENT_VIRTUEL = eINSTANCE.getEtablissementVirtuel();

		/**
		 * The meta object literal for the '<em><b>Matricules Employes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLISSEMENT_VIRTUEL__MATRICULES_EMPLOYES = eINSTANCE.getEtablissementVirtuel_MatriculesEmployes();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLISSEMENT_VIRTUEL__LIBELLE = eINSTANCE.getEtablissementVirtuel_Libelle();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETABLISSEMENT_VIRTUEL__ID = eINSTANCE.getEtablissementVirtuel_Id();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.CarnetImpl <em>Carnet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.CarnetImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCarnet()
		 * @generated
		 */
		EClass CARNET = eINSTANCE.getCarnet();

		/**
		 * The meta object literal for the '<em><b>Commandes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARNET__COMMANDES = eINSTANCE.getCarnet_Commandes();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARNET___ROOT = eINSTANCE.getCarnet__Root();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Commande</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CARNET___GET_OR_CREATE_COMMANDE__STRING = eINSTANCE.getCarnet__GetOrCreateCommande__String();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.EtablissementsVirtuelsImpl <em>Etablissements Virtuels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.EtablissementsVirtuelsImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getEtablissementsVirtuels()
		 * @generated
		 */
		EClass ETABLISSEMENTS_VIRTUELS = eINSTANCE.getEtablissementsVirtuels();

		/**
		 * The meta object literal for the '<em><b>Etablissements Virtuels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETABLISSEMENTS_VIRTUELS__ETABLISSEMENTS_VIRTUELS = eINSTANCE.getEtablissementsVirtuels_EtablissementsVirtuels();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ParametrageImpl <em>Parametrage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ParametrageImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getParametrage()
		 * @generated
		 */
		EClass PARAMETRAGE = eINSTANCE.getParametrage();

		/**
		 * The meta object literal for the '<em><b>Codes Client</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETRAGE__CODES_CLIENT = eINSTANCE.getParametrage_CodesClient();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.StockImpl <em>Stock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.StockImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getStock()
		 * @generated
		 */
		EClass STOCK = eINSTANCE.getStock();

		/**
		 * The meta object literal for the '<em><b>Cheque</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOCK__CHEQUE = eINSTANCE.getStock_Cheque();

		/**
		 * The meta object literal for the '<em><b>Derniere Maj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STOCK__DERNIERE_MAJ = eINSTANCE.getStock_DerniereMaj();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ChequeImpl <em>Cheque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ChequeImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getCheque()
		 * @generated
		 */
		EClass CHEQUE = eINSTANCE.getCheque();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__MATRICULE = eINSTANCE.getCheque_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nb Cheques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__NB_CHEQUES = eINSTANCE.getCheque_NbCheques();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.SoldeImpl <em>Solde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.SoldeImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSolde()
		 * @generated
		 */
		EClass SOLDE = eINSTANCE.getSolde();

		/**
		 * The meta object literal for the '<em><b>Soldes Individuels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLDE__SOLDES_INDIVIDUELS = eINSTANCE.getSolde_SoldesIndividuels();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Solde Individual</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLDE___GET_OR_CREATE_SOLDE_INDIVIDUAL__INT_INT = eINSTANCE.getSolde__GetOrCreateSoldeIndividual__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Solde</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLDE___GET_SOLDE__INT_INT = eINSTANCE.getSolde__GetSolde__int_int();

		/**
		 * The meta object literal for the '<em><b>Annee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLDE___ANNEE__STRING = eINSTANCE.getSolde__Annee__String();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl <em>Solde Individuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.SoldeIndividuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getSoldeIndividuel()
		 * @generated
		 */
		EClass SOLDE_INDIVIDUEL = eINSTANCE.getSoldeIndividuel();

		/**
		 * The meta object literal for the '<em><b>Nb Cheques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLDE_INDIVIDUEL__NB_CHEQUES = eINSTANCE.getSoldeIndividuel_NbCheques();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLDE_INDIVIDUEL__MATRICULE = eINSTANCE.getSoldeIndividuel_Matricule();

		/**
		 * The meta object literal for the '<em><b>Historique</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLDE_INDIVIDUEL__HISTORIQUE = eINSTANCE.getSoldeIndividuel_Historique();

		/**
		 * The meta object literal for the '<em><b>Annee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLDE_INDIVIDUEL__ANNEE = eINSTANCE.getSoldeIndividuel_Annee();

		/**
		 * The meta object literal for the '<em><b>Incremente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOLDE_INDIVIDUEL___INCREMENTE__INT_STRING = eINSTANCE.getSoldeIndividuel__Incremente__int_String();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl <em>Historique Solde Individuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getHistoriqueSoldeIndividuel()
		 * @generated
		 */
		EClass HISTORIQUE_SOLDE_INDIVIDUEL = eINSTANCE.getHistoriqueSoldeIndividuel();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIQUE_SOLDE_INDIVIDUEL__DATE = eINSTANCE.getHistoriqueSoldeIndividuel_Date();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT = eINSTANCE.getHistoriqueSoldeIndividuel_Comment();

		/**
		 * The meta object literal for the '<em><b>Solde Avant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT = eINSTANCE.getHistoriqueSoldeIndividuel_SoldeAvant();

		/**
		 * The meta object literal for the '<em><b>Solde Apres</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES = eINSTANCE.getHistoriqueSoldeIndividuel_SoldeApres();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.DejeImpl <em>Deje</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.DejeImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDeje()
		 * @generated
		 */
		EClass DEJE = eINSTANCE.getDeje();

		/**
		 * The meta object literal for the '<em><b>Dejes Mensuels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEJE__DEJES_MENSUELS = eINSTANCE.getDeje_DejesMensuels();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Deje Mensuel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE___GET_OR_CREATE_DEJE_MENSUEL__STRING = eINSTANCE.getDeje__GetOrCreateDejeMensuel__String();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE___ROOT = eINSTANCE.getDeje__Root();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.DejeIndividuelImpl <em>Deje Individuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.DejeIndividuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDejeIndividuel()
		 * @generated
		 */
		EClass DEJE_INDIVIDUEL = eINSTANCE.getDejeIndividuel();

		/**
		 * The meta object literal for the '<em><b>Nb Estime Jours Entiers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS = eINSTANCE.getDejeIndividuel_NbEstimeJoursEntiers();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEJE_INDIVIDUEL__MATRICULE = eINSTANCE.getDejeIndividuel_Matricule();

		/**
		 * The meta object literal for the '<em><b>Nb Reel Jours Entiers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS = eINSTANCE.getDejeIndividuel_NbReelJoursEntiers();

		/**
		 * The meta object literal for the '<em><b>Avance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEJE_INDIVIDUEL__AVANCE = eINSTANCE.getDejeIndividuel_Avance();

		/**
		 * The meta object literal for the '<em><b>Deje Mensuel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE_INDIVIDUEL___DEJE_MENSUEL = eINSTANCE.getDejeIndividuel__DejeMensuel();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.DejeMensuelImpl <em>Deje Mensuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.DejeMensuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getDejeMensuel()
		 * @generated
		 */
		EClass DEJE_MENSUEL = eINSTANCE.getDejeMensuel();

		/**
		 * The meta object literal for the '<em><b>Dejes Individuels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEJE_MENSUEL__DEJES_INDIVIDUELS = eINSTANCE.getDejeMensuel_DejesIndividuels();

		/**
		 * The meta object literal for the '<em><b>Mois</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEJE_MENSUEL__MOIS = eINSTANCE.getDejeMensuel_Mois();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE_MENSUEL___LABEL = eINSTANCE.getDejeMensuel__Label();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Deje Individuel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE_MENSUEL___GET_OR_CREATE_DEJE_INDIVIDUEL__INT = eINSTANCE.getDejeMensuel__GetOrCreateDejeIndividuel__int();

		/**
		 * The meta object literal for the '<em><b>Deje</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEJE_MENSUEL___DEJE = eINSTANCE.getDejeMensuel__Deje();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ChoixImpl <em>Choix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ChoixImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChoix()
		 * @generated
		 */
		EClass CHOIX = eINSTANCE.getChoix();

		/**
		 * The meta object literal for the '<em><b>Choix Individuels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOIX__CHOIX_INDIVIDUELS = eINSTANCE.getChoix_ChoixIndividuels();

		/**
		 * The meta object literal for the '<em><b>Get Choix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHOIX___GET_CHOIX__INT = eINSTANCE.getChoix__GetChoix__int();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Choix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CHOIX___GET_OR_CREATE_CHOIX__INT = eINSTANCE.getChoix__GetOrCreateChoix__int();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ChoixIndividuelImpl <em>Choix Individuel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ChoixIndividuelImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getChoixIndividuel()
		 * @generated
		 */
		EClass CHOIX_INDIVIDUEL = eINSTANCE.getChoixIndividuel();

		/**
		 * The meta object literal for the '<em><b>Nb Max Cheques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOIX_INDIVIDUEL__NB_MAX_CHEQUES = eINSTANCE.getChoixIndividuel_NbMaxCheques();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOIX_INDIVIDUEL__MATRICULE = eINSTANCE.getChoixIndividuel_Matricule();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ContratsImpl <em>Contrats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ContratsImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getContrats()
		 * @generated
		 */
		EClass CONTRATS = eINSTANCE.getContrats();

		/**
		 * The meta object literal for the '<em><b>Contrats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRATS__CONTRATS = eINSTANCE.getContrats_Contrats();

		/**
		 * The meta object literal for the '<em><b>Get Or Create Contrat</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRATS___GET_OR_CREATE_CONTRAT__INT = eINSTANCE.getContrats__GetOrCreateContrat__int();

		/**
		 * The meta object literal for the '<em><b>Is Partiel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTRATS___IS_PARTIEL__INT = eINSTANCE.getContrats__IsPartiel__int();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.ContratImpl <em>Contrat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.ContratImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getContrat()
		 * @generated
		 */
		EClass CONTRAT = eINSTANCE.getContrat();

		/**
		 * The meta object literal for the '<em><b>Temps Travail Mensuel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAT__TEMPS_TRAVAIL_MENSUEL = eINSTANCE.getContrat_TempsTravailMensuel();

		/**
		 * The meta object literal for the '<em><b>Partiel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAT__PARTIEL = eINSTANCE.getContrat_Partiel();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRAT__MATRICULE = eINSTANCE.getContrat_Matricule();

		/**
		 * The meta object literal for the '{@link mutualite.rh.chequedej.impl.AvanceImpl <em>Avance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mutualite.rh.chequedej.impl.AvanceImpl
		 * @see mutualite.rh.chequedej.impl.ChequedejPackageImpl#getAvance()
		 * @generated
		 */
		EClass AVANCE = eINSTANCE.getAvance();

		/**
		 * The meta object literal for the '<em><b>Nb Cheques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVANCE__NB_CHEQUES = eINSTANCE.getAvance_NbCheques();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVANCE__DATE = eINSTANCE.getAvance_Date();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVANCE__COMMENT = eINSTANCE.getAvance_Comment();

		/**
		 * The meta object literal for the '<em><b>Deje Individuel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AVANCE___DEJE_INDIVIDUEL = eINSTANCE.getAvance__DejeIndividuel();

	}

} //ChequedejPackage
