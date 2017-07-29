/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of operations of the '<em>Succursale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCURSALE_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Cheque Dej</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Cheque Dej</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_DEJ_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nb Jours Entiers Mois Precedent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT = 3;

	/**
	 * The feature id for the '<em><b>Nb Jours Entiers Mois Suivant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT = 4;

	/**
	 * The feature id for the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__COMMENTAIRE = 5;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NOM = 6;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRENOM = 7;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 8;

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
	 * The number of structural features of the '<em>Etablissement Virtuel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETABLISSEMENT_VIRTUEL_FEATURE_COUNT = 2;

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
	 * The number of operations of the '<em>Carnet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARNET_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisPrecedent <em>Nb Jours Entiers Mois Precedent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Jours Entiers Mois Precedent</em>'.
	 * @see mutualite.rh.chequedej.Item#getNbJoursEntiersMoisPrecedent()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_NbJoursEntiersMoisPrecedent();

	/**
	 * Returns the meta object for the attribute '{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisSuivant <em>Nb Jours Entiers Mois Suivant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Jours Entiers Mois Suivant</em>'.
	 * @see mutualite.rh.chequedej.Item#getNbJoursEntiersMoisSuivant()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_NbJoursEntiersMoisSuivant();

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
		 * The meta object literal for the '<em><b>Nb Jours Entiers Mois Precedent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NB_JOURS_ENTIERS_MOIS_PRECEDENT = eINSTANCE.getItem_NbJoursEntiersMoisPrecedent();

		/**
		 * The meta object literal for the '<em><b>Nb Jours Entiers Mois Suivant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NB_JOURS_ENTIERS_MOIS_SUIVANT = eINSTANCE.getItem_NbJoursEntiersMoisSuivant();

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

	}

} //ChequedejPackage
