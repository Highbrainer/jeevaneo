/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Choix;
import mutualite.rh.chequedej.ChoixIndividuel;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Contrats;
import mutualite.rh.chequedej.Deje;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.DejeMensuel;
import mutualite.rh.chequedej.EtablissementsVirtuels;
import mutualite.rh.chequedej.Item;
import mutualite.rh.chequedej.Parametrage;
import mutualite.rh.chequedej.Solde;
import mutualite.rh.chequedej.SoldeIndividuel;
import mutualite.rh.chequedej.Stock;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cheque Dej</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getCarnet <em>Carnet</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getValeurNominale <em>Valeur Nominale</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getParticipationPatronale <em>Participation Patronale</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getParametrage <em>Parametrage</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getStock <em>Stock</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getSolde <em>Solde</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getDejes <em>Dejes</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getChoix <em>Choix</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getCommandeMaxParDefaut <em>Commande Max Par Defaut</em>}</li>
 * <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getContrats <em>Contrats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequeDejImpl extends MinimalEObjectImpl.Container implements ChequeDej {

	{
		setCarnet(ChequedejFactory.eINSTANCE.createCarnet());
		setChoix(ChequedejFactory.eINSTANCE.createChoix());
		setContrats(ChequedejFactory.eINSTANCE.createContrats());
		setDejes(ChequedejFactory.eINSTANCE.createDeje());
		setEtablissementsVirtuels(ChequedejFactory.eINSTANCE.createEtablissementsVirtuels());
		setParametrage(ChequedejFactory.eINSTANCE.createParametrage());
		setSolde(ChequedejFactory.eINSTANCE.createSolde());
		setStock(ChequedejFactory.eINSTANCE.createStock());
	}
	/**
	 * The cached value of the '{@link #getCarnet() <em>Carnet</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCarnet()
	 * @generated
	 * @ordered
	 */
	protected Carnet carnet;

	/**
	 * The default value of the '{@link #getValeurNominale() <em>Valeur Nominale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValeurNominale()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_NOMINALE_EDEFAULT = 6.7F;

	/**
	 * The cached value of the '{@link #getValeurNominale() <em>Valeur Nominale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValeurNominale()
	 * @generated
	 * @ordered
	 */
	protected float valeurNominale = VALEUR_NOMINALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParticipationPatronale() <em>Participation Patronale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipationPatronale()
	 * @generated
	 * @ordered
	 */
	protected static final float PARTICIPATION_PATRONALE_EDEFAULT = 3.69F;

	/**
	 * The cached value of the '{@link #getParticipationPatronale() <em>Participation Patronale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParticipationPatronale()
	 * @generated
	 * @ordered
	 */
	protected float participationPatronale = PARTICIPATION_PATRONALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEtablissementsVirtuels() <em>Etablissements Virtuels</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEtablissementsVirtuels()
	 * @generated
	 * @ordered
	 */
	protected EtablissementsVirtuels etablissementsVirtuels;

	/**
	 * The cached value of the '{@link #getParametrage() <em>Parametrage</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParametrage()
	 * @generated
	 * @ordered
	 */
	protected Parametrage parametrage;

	/**
	 * The cached value of the '{@link #getStock() <em>Stock</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected Stock stock;

	/**
	 * The cached value of the '{@link #getSolde() <em>Solde</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSolde()
	 * @generated
	 * @ordered
	 */
	protected Solde solde;

	/**
	 * The cached value of the '{@link #getDejes() <em>Dejes</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDejes()
	 * @generated
	 * @ordered
	 */
	protected Deje dejes;

	/**
	 * The cached value of the '{@link #getChoix() <em>Choix</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChoix()
	 * @generated
	 * @ordered
	 */
	protected Choix choix;

	/**
	 * The default value of the '{@link #getCommandeMaxParDefaut() <em>Commande Max Par Defaut</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCommandeMaxParDefaut()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMANDE_MAX_PAR_DEFAUT_EDEFAULT = 25;

	/**
	 * The cached value of the '{@link #getCommandeMaxParDefaut() <em>Commande Max Par Defaut</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCommandeMaxParDefaut()
	 * @generated
	 * @ordered
	 */
	protected int commandeMaxParDefaut = COMMANDE_MAX_PAR_DEFAUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContrats() <em>Contrats</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContrats()
	 * @generated
	 * @ordered
	 */
	protected Contrats contrats;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ChequeDejImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CHEQUE_DEJ;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Carnet getCarnet() {
		return carnet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCarnet(Carnet newCarnet, NotificationChain msgs) {
		Carnet oldCarnet = carnet;
		carnet = newCarnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CARNET, oldCarnet, newCarnet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCarnet(Carnet newCarnet) {
		if (newCarnet != carnet) {
			NotificationChain msgs = null;
			if (carnet != null)
				msgs = ((InternalEObject) carnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CARNET, null, msgs);
			if (newCarnet != null)
				msgs = ((InternalEObject) newCarnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CARNET, null, msgs);
			msgs = basicSetCarnet(newCarnet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CARNET, newCarnet, newCarnet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public float getValeurNominale() {
		return valeurNominale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValeurNominale(float newValeurNominale) {
		float oldValeurNominale = valeurNominale;
		valeurNominale = newValeurNominale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE, oldValeurNominale, valeurNominale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public float getParticipationPatronale() {
		return participationPatronale;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParticipationPatronale(float newParticipationPatronale) {
		float oldParticipationPatronale = participationPatronale;
		participationPatronale = newParticipationPatronale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE, oldParticipationPatronale, participationPatronale));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EtablissementsVirtuels getEtablissementsVirtuels() {
		return etablissementsVirtuels;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEtablissementsVirtuels(EtablissementsVirtuels newEtablissementsVirtuels, NotificationChain msgs) {
		EtablissementsVirtuels oldEtablissementsVirtuels = etablissementsVirtuels;
		etablissementsVirtuels = newEtablissementsVirtuels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, oldEtablissementsVirtuels,
					newEtablissementsVirtuels);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEtablissementsVirtuels(EtablissementsVirtuels newEtablissementsVirtuels) {
		if (newEtablissementsVirtuels != etablissementsVirtuels) {
			NotificationChain msgs = null;
			if (etablissementsVirtuels != null)
				msgs = ((InternalEObject) etablissementsVirtuels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, null, msgs);
			if (newEtablissementsVirtuels != null)
				msgs = ((InternalEObject) newEtablissementsVirtuels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, null, msgs);
			msgs = basicSetEtablissementsVirtuels(newEtablissementsVirtuels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, newEtablissementsVirtuels, newEtablissementsVirtuels));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parametrage getParametrage() {
		return parametrage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParametrage(Parametrage newParametrage, NotificationChain msgs) {
		Parametrage oldParametrage = parametrage;
		parametrage = newParametrage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, oldParametrage, newParametrage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParametrage(Parametrage newParametrage) {
		if (newParametrage != parametrage) {
			NotificationChain msgs = null;
			if (parametrage != null)
				msgs = ((InternalEObject) parametrage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, null, msgs);
			if (newParametrage != null)
				msgs = ((InternalEObject) newParametrage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, null, msgs);
			msgs = basicSetParametrage(newParametrage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, newParametrage, newParametrage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Stock getStock() {
		return stock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStock(Stock newStock, NotificationChain msgs) {
		Stock oldStock = stock;
		stock = newStock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__STOCK, oldStock, newStock);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStock(Stock newStock) {
		if (newStock != stock) {
			NotificationChain msgs = null;
			if (stock != null)
				msgs = ((InternalEObject) stock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__STOCK, null, msgs);
			if (newStock != null)
				msgs = ((InternalEObject) newStock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__STOCK, null, msgs);
			msgs = basicSetStock(newStock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__STOCK, newStock, newStock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Solde getSolde() {
		return solde;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSolde(Solde newSolde, NotificationChain msgs) {
		Solde oldSolde = solde;
		solde = newSolde;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__SOLDE, oldSolde, newSolde);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSolde(Solde newSolde) {
		if (newSolde != solde) {
			NotificationChain msgs = null;
			if (solde != null)
				msgs = ((InternalEObject) solde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__SOLDE, null, msgs);
			if (newSolde != null)
				msgs = ((InternalEObject) newSolde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__SOLDE, null, msgs);
			msgs = basicSetSolde(newSolde, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__SOLDE, newSolde, newSolde));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Deje getDejes() {
		return dejes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDejes(Deje newDejes, NotificationChain msgs) {
		Deje oldDejes = dejes;
		dejes = newDejes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__DEJES, oldDejes, newDejes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDejes(Deje newDejes) {
		if (newDejes != dejes) {
			NotificationChain msgs = null;
			if (dejes != null)
				msgs = ((InternalEObject) dejes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__DEJES, null, msgs);
			if (newDejes != null)
				msgs = ((InternalEObject) newDejes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__DEJES, null, msgs);
			msgs = basicSetDejes(newDejes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__DEJES, newDejes, newDejes));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Choix getChoix() {
		return choix;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetChoix(Choix newChoix, NotificationChain msgs) {
		Choix oldChoix = choix;
		choix = newChoix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CHOIX, oldChoix, newChoix);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setChoix(Choix newChoix) {
		if (newChoix != choix) {
			NotificationChain msgs = null;
			if (choix != null)
				msgs = ((InternalEObject) choix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CHOIX, null, msgs);
			if (newChoix != null)
				msgs = ((InternalEObject) newChoix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CHOIX, null, msgs);
			msgs = basicSetChoix(newChoix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CHOIX, newChoix, newChoix));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCommandeMaxParDefaut() {
		return commandeMaxParDefaut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCommandeMaxParDefaut(int newCommandeMaxParDefaut) {
		int oldCommandeMaxParDefaut = commandeMaxParDefaut;
		commandeMaxParDefaut = newCommandeMaxParDefaut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT, oldCommandeMaxParDefaut, commandeMaxParDefaut));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Contrats getContrats() {
		return contrats;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContrats(Contrats newContrats, NotificationChain msgs) {
		Contrats oldContrats = contrats;
		contrats = newContrats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CONTRATS, oldContrats, newContrats);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContrats(Contrats newContrats) {
		if (newContrats != contrats) {
			NotificationChain msgs = null;
			if (contrats != null)
				msgs = ((InternalEObject) contrats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CONTRATS, null, msgs);
			if (newContrats != null)
				msgs = ((InternalEObject) newContrats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CONTRATS, null, msgs);
			msgs = basicSetContrats(newContrats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CONTRATS, newContrats, newContrats));
	}

	private String moisPrecedent(String mois) {
		LocalDate month = getCarnet().mois(mois).minus(1, ChronoUnit.MONTHS);
		return getCarnet().formatMois(month);
	}

	private String moisSuivant(String mois) {
		LocalDate month = getCarnet().mois(mois).plus(1, ChronoUnit.MONTHS);
		return getCarnet().formatMois(month);
	}

	private final DateTimeFormatter dfMoisTextuel = DateTimeFormatter.ofPattern("MMMM yyyy");

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void integrateDeje(String mois, int matricule, int nbEstimeJoursEntiersMoisSuivant, Integer nbReelJoursEntiersMoisPrecedent) {

		// On tient à jour le deje de l'employe pour le mois précédent et le mois suivant : ça tiendra automatiquement le solde à jour...
		String moisPrecedent = moisPrecedent(moisPrecedent(mois));
		String moisSuivant = mois;
		ChequeDej chequeDej = getCarnet().root();
		if (null == nbReelJoursEntiersMoisPrecedent) {
			// ce n'est normal qu'à l'initialisation ==> pas de deje?
			boolean dejaUnDejePourCeMatricule = chequeDej.getDejes().getDejesMensuels().stream().map(DejeMensuel::getDejesIndividuels).flatMap(List::stream)
					.anyMatch(di -> di.getMatricule() == matricule);
			if (dejaUnDejePourCeMatricule) {
				throw new IllegalStateException("Mois précédent : le réel du mois précédent est obligatoire!");
			}
		} else {
			DejeIndividuel diMoisPrecedent = chequeDej.getDejes().getOrCreateDejeMensuel(moisPrecedent).getOrCreateDejeIndividuel(matricule);
			diMoisPrecedent.setNbReelJoursEntiers(nbReelJoursEntiersMoisPrecedent);
		}
		DejeIndividuel diMoisSuivant = chequeDej.getDejes().getOrCreateDejeMensuel(moisSuivant).getOrCreateDejeIndividuel(matricule);
		diMoisSuivant.setNbEstimeJoursEntiers(nbEstimeJoursEntiersMoisSuivant);

		SoldeIndividuel si = chequeDej.getSolde().getOrCreateSoldeIndividual(matricule, chequeDej.getSolde().annee(moisPrecedent));
		int soldeEmploye = si.getNbCheques();
		Integer estime = diMoisSuivant.getNbEstimeJoursEntiers();
		String commentaire = "Commande pour " + dfMoisTextuel.format(getCarnet().mois(mois)) + " : " + estime + " jours entiers prévus";

		int commande = estime;
		int deltaSolde = 0;
		if (soldeEmploye < 0) {
			// il nous doit des cheques...
			deltaSolde = Math.min(estime, -soldeEmploye); // on ajoute à son solde les chèques qu'on ne va pas commander
			commande -= deltaSolde;
			commentaire += " - " + deltaSolde + " jours pris sur le solde";
		}

		Integer plafond = null;
		ChoixIndividuel choixIndividuel = chequeDej.getChoix().getChoix(matricule);
		if (choixIndividuel != null) {
			plafond = choixIndividuel.getNbMaxCheques();
		}
		if (null == plafond) {
			plafond = chequeDej.getCommandeMaxParDefaut();
		}
		if (commande > plafond) {
			// on déverse le surplus au solde
			deltaSolde += commande - plafond;
			commande = plafond;
			commentaire += ", limité à " + plafond + " selon choix du salarié";
		} else if (soldeEmploye > 0 && commande < plafond) {
			// on lui doit des chèques
			// on lui rembourse... dans la limite du plafond
			deltaSolde -= Math.min(plafond - commande, soldeEmploye);
			commande += Math.min(plafond - commande, soldeEmploye);
			commentaire += " + " + (-deltaSolde) + " de solde";
		}
		commentaire += " = " + commande + " " + (commande > 1 ? "chèques" : "chèque") + " commandés.";
		si.incremente(deltaSolde, commentaire);

		// update the commande item!
		updateCommandeIndividuelle(mois, matricule, commande);

	}

	public void updateCommandeIndividuelle(String mois, int matricule, int commande) {
		if (commande == 0) {
			// dans ce cas on ne le crée pas s'il n'existe pas déjà...
			Optional<Item> opt = getCarnet().getCommandes().stream().map(Commande::getItems).flatMap(List::stream).filter(c -> c.getMatricule() == matricule).findAny();
			if (opt.isPresent()) {
				opt.get().setNbCheques(commande); // on pourrait même supprimer l'item...
			}
		} else {
			Item item = getCarnet().getOrCreateCommande(mois).getOrCreateItem(matricule);
			item.setNbCheques(commande);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChequedejPackage.CHEQUE_DEJ__CARNET:
			return basicSetCarnet(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
			return basicSetEtablissementsVirtuels(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
			return basicSetParametrage(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__STOCK:
			return basicSetStock(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__SOLDE:
			return basicSetSolde(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__DEJES:
			return basicSetDejes(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__CHOIX:
			return basicSetChoix(null, msgs);
		case ChequedejPackage.CHEQUE_DEJ__CONTRATS:
			return basicSetContrats(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChequedejPackage.CHEQUE_DEJ__CARNET:
			return getCarnet();
		case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
			return getValeurNominale();
		case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
			return getParticipationPatronale();
		case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
			return getEtablissementsVirtuels();
		case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
			return getParametrage();
		case ChequedejPackage.CHEQUE_DEJ__STOCK:
			return getStock();
		case ChequedejPackage.CHEQUE_DEJ__SOLDE:
			return getSolde();
		case ChequedejPackage.CHEQUE_DEJ__DEJES:
			return getDejes();
		case ChequedejPackage.CHEQUE_DEJ__CHOIX:
			return getChoix();
		case ChequedejPackage.CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT:
			return getCommandeMaxParDefaut();
		case ChequedejPackage.CHEQUE_DEJ__CONTRATS:
			return getContrats();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChequedejPackage.CHEQUE_DEJ__CARNET:
			setCarnet((Carnet) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
			setValeurNominale((Float) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
			setParticipationPatronale((Float) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
			setEtablissementsVirtuels((EtablissementsVirtuels) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
			setParametrage((Parametrage) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__STOCK:
			setStock((Stock) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__SOLDE:
			setSolde((Solde) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__DEJES:
			setDejes((Deje) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__CHOIX:
			setChoix((Choix) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT:
			setCommandeMaxParDefaut((Integer) newValue);
			return;
		case ChequedejPackage.CHEQUE_DEJ__CONTRATS:
			setContrats((Contrats) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChequedejPackage.CHEQUE_DEJ__CARNET:
			setCarnet((Carnet) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
			setValeurNominale(VALEUR_NOMINALE_EDEFAULT);
			return;
		case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
			setParticipationPatronale(PARTICIPATION_PATRONALE_EDEFAULT);
			return;
		case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
			setEtablissementsVirtuels((EtablissementsVirtuels) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
			setParametrage((Parametrage) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__STOCK:
			setStock((Stock) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__SOLDE:
			setSolde((Solde) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__DEJES:
			setDejes((Deje) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__CHOIX:
			setChoix((Choix) null);
			return;
		case ChequedejPackage.CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT:
			setCommandeMaxParDefaut(COMMANDE_MAX_PAR_DEFAUT_EDEFAULT);
			return;
		case ChequedejPackage.CHEQUE_DEJ__CONTRATS:
			setContrats((Contrats) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChequedejPackage.CHEQUE_DEJ__CARNET:
			return carnet != null;
		case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
			return valeurNominale != VALEUR_NOMINALE_EDEFAULT;
		case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
			return participationPatronale != PARTICIPATION_PATRONALE_EDEFAULT;
		case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
			return etablissementsVirtuels != null;
		case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
			return parametrage != null;
		case ChequedejPackage.CHEQUE_DEJ__STOCK:
			return stock != null;
		case ChequedejPackage.CHEQUE_DEJ__SOLDE:
			return solde != null;
		case ChequedejPackage.CHEQUE_DEJ__DEJES:
			return dejes != null;
		case ChequedejPackage.CHEQUE_DEJ__CHOIX:
			return choix != null;
		case ChequedejPackage.CHEQUE_DEJ__COMMANDE_MAX_PAR_DEFAUT:
			return commandeMaxParDefaut != COMMANDE_MAX_PAR_DEFAUT_EDEFAULT;
		case ChequedejPackage.CHEQUE_DEJ__CONTRATS:
			return contrats != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ChequedejPackage.CHEQUE_DEJ___INTEGRATE_DEJE__STRING_INT_INT_INTEGER:
			integrateDeje((String) arguments.get(0), (Integer) arguments.get(1), (Integer) arguments.get(2), (Integer) arguments.get(3));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (valeurNominale: ");
		result.append(valeurNominale);
		result.append(", participationPatronale: ");
		result.append(participationPatronale);
		result.append(", commandeMaxParDefaut: ");
		result.append(commandeMaxParDefaut);
		result.append(')');
		return result.toString();
	}

} // ChequeDejImpl
