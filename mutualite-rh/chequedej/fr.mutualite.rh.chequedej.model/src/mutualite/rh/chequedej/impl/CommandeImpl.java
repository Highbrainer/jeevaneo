/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Commande;
import mutualite.rh.chequedej.Item;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getItems <em>Items</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getParticipationPatronale <em>Participation Patronale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getValeurNominale <em>Valeur Nominale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getMois <em>Mois</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getCommandePrecedente <em>Commande Precedente</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.CommandeImpl#getCommandeSuivante <em>Commande Suivante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandeImpl extends MinimalEObjectImpl.Container implements Commande {
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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #getParticipationPatronale() <em>Participation Patronale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipationPatronale()
	 * @generated
	 * @ordered
	 */
	protected static final float PARTICIPATION_PATRONALE_EDEFAULT = 3.58F;

	/**
	 * The cached value of the '{@link #getParticipationPatronale() <em>Participation Patronale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipationPatronale()
	 * @generated
	 * @ordered
	 */
	protected float participationPatronale = PARTICIPATION_PATRONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValeurNominale() <em>Valeur Nominale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurNominale()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_NOMINALE_EDEFAULT = 6.5F;

	/**
	 * The cached value of the '{@link #getValeurNominale() <em>Valeur Nominale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurNominale()
	 * @generated
	 * @ordered
	 */
	protected float valeurNominale = VALEUR_NOMINALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMois() <em>Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMois()
	 * @generated
	 * @ordered
	 */
	protected static final String MOIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMois() <em>Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMois()
	 * @generated
	 * @ordered
	 */
	protected String mois = MOIS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommandePrecedente() <em>Commande Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandePrecedente()
	 * @generated
	 * @ordered
	 */
	protected Commande commandePrecedente;

	/**
	 * The cached value of the '{@link #getCommandeSuivante() <em>Commande Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandeSuivante()
	 * @generated
	 * @ordered
	 */
	protected Commande commandeSuivante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.COMMANDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, ChequedejPackage.COMMANDE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getParticipationPatronale() {
		return participationPatronale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipationPatronale(float newParticipationPatronale) {
		float oldParticipationPatronale = participationPatronale;
		participationPatronale = newParticipationPatronale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__PARTICIPATION_PATRONALE, oldParticipationPatronale, participationPatronale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValeurNominale() {
		return valeurNominale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeurNominale(float newValeurNominale) {
		float oldValeurNominale = valeurNominale;
		valeurNominale = newValeurNominale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__VALEUR_NOMINALE, oldValeurNominale, valeurNominale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMois() {
		return mois;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMois(String newMois) {
		String oldMois = mois;
		mois = newMois;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__MOIS, oldMois, mois));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande getCommandePrecedente() {
		if (commandePrecedente != null && commandePrecedente.eIsProxy()) {
			InternalEObject oldCommandePrecedente = (InternalEObject)commandePrecedente;
			commandePrecedente = (Commande)eResolveProxy(oldCommandePrecedente);
			if (commandePrecedente != oldCommandePrecedente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, oldCommandePrecedente, commandePrecedente));
			}
		}
		return commandePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande basicGetCommandePrecedente() {
		return commandePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandePrecedente(Commande newCommandePrecedente, NotificationChain msgs) {
		Commande oldCommandePrecedente = commandePrecedente;
		commandePrecedente = newCommandePrecedente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, oldCommandePrecedente, newCommandePrecedente);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandePrecedente(Commande newCommandePrecedente) {
		if (newCommandePrecedente != commandePrecedente) {
			NotificationChain msgs = null;
			if (commandePrecedente != null)
				msgs = ((InternalEObject)commandePrecedente).eInverseRemove(this, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, Commande.class, msgs);
			if (newCommandePrecedente != null)
				msgs = ((InternalEObject)newCommandePrecedente).eInverseAdd(this, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, Commande.class, msgs);
			msgs = basicSetCommandePrecedente(newCommandePrecedente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, newCommandePrecedente, newCommandePrecedente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande getCommandeSuivante() {
		if (commandeSuivante != null && commandeSuivante.eIsProxy()) {
			InternalEObject oldCommandeSuivante = (InternalEObject)commandeSuivante;
			commandeSuivante = (Commande)eResolveProxy(oldCommandeSuivante);
			if (commandeSuivante != oldCommandeSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, oldCommandeSuivante, commandeSuivante));
			}
		}
		return commandeSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande basicGetCommandeSuivante() {
		return commandeSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandeSuivante(Commande newCommandeSuivante, NotificationChain msgs) {
		Commande oldCommandeSuivante = commandeSuivante;
		commandeSuivante = newCommandeSuivante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, oldCommandeSuivante, newCommandeSuivante);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandeSuivante(Commande newCommandeSuivante) {
		if (newCommandeSuivante != commandeSuivante) {
			NotificationChain msgs = null;
			if (commandeSuivante != null)
				msgs = ((InternalEObject)commandeSuivante).eInverseRemove(this, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, Commande.class, msgs);
			if (newCommandeSuivante != null)
				msgs = ((InternalEObject)newCommandeSuivante).eInverseAdd(this, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, Commande.class, msgs);
			msgs = basicSetCommandeSuivante(newCommandeSuivante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, newCommandeSuivante, newCommandeSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Carnet carnet() {
		return (Carnet) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Item getOrCreateItem(int matricule) {
		Optional<Item> opt = getItems().stream().filter(i -> i.getMatricule()==matricule).findAny();
		if(opt.isPresent()) {
			return opt.get();
		}
		Item item = ChequedejFactory.eINSTANCE.createItem();
		item.setMatricule(matricule);
		getItems().add(item);
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				if (commandePrecedente != null)
					msgs = ((InternalEObject)commandePrecedente).eInverseRemove(this, ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE, Commande.class, msgs);
				return basicSetCommandePrecedente((Commande)otherEnd, msgs);
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				if (commandeSuivante != null)
					msgs = ((InternalEObject)commandeSuivante).eInverseRemove(this, ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE, Commande.class, msgs);
				return basicSetCommandeSuivante((Commande)otherEnd, msgs);
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
			case ChequedejPackage.COMMANDE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				return basicSetCommandePrecedente(null, msgs);
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				return basicSetCommandeSuivante(null, msgs);
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
			case ChequedejPackage.COMMANDE__DATE:
				return getDate();
			case ChequedejPackage.COMMANDE__ITEMS:
				return getItems();
			case ChequedejPackage.COMMANDE__PARTICIPATION_PATRONALE:
				return getParticipationPatronale();
			case ChequedejPackage.COMMANDE__VALEUR_NOMINALE:
				return getValeurNominale();
			case ChequedejPackage.COMMANDE__MOIS:
				return getMois();
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				if (resolve) return getCommandePrecedente();
				return basicGetCommandePrecedente();
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				if (resolve) return getCommandeSuivante();
				return basicGetCommandeSuivante();
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
			case ChequedejPackage.COMMANDE__DATE:
				setDate((Date)newValue);
				return;
			case ChequedejPackage.COMMANDE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case ChequedejPackage.COMMANDE__PARTICIPATION_PATRONALE:
				setParticipationPatronale((Float)newValue);
				return;
			case ChequedejPackage.COMMANDE__VALEUR_NOMINALE:
				setValeurNominale((Float)newValue);
				return;
			case ChequedejPackage.COMMANDE__MOIS:
				setMois((String)newValue);
				return;
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				setCommandePrecedente((Commande)newValue);
				return;
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				setCommandeSuivante((Commande)newValue);
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
			case ChequedejPackage.COMMANDE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ChequedejPackage.COMMANDE__ITEMS:
				getItems().clear();
				return;
			case ChequedejPackage.COMMANDE__PARTICIPATION_PATRONALE:
				setParticipationPatronale(PARTICIPATION_PATRONALE_EDEFAULT);
				return;
			case ChequedejPackage.COMMANDE__VALEUR_NOMINALE:
				setValeurNominale(VALEUR_NOMINALE_EDEFAULT);
				return;
			case ChequedejPackage.COMMANDE__MOIS:
				setMois(MOIS_EDEFAULT);
				return;
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				setCommandePrecedente((Commande)null);
				return;
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				setCommandeSuivante((Commande)null);
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
			case ChequedejPackage.COMMANDE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ChequedejPackage.COMMANDE__ITEMS:
				return items != null && !items.isEmpty();
			case ChequedejPackage.COMMANDE__PARTICIPATION_PATRONALE:
				return participationPatronale != PARTICIPATION_PATRONALE_EDEFAULT;
			case ChequedejPackage.COMMANDE__VALEUR_NOMINALE:
				return valeurNominale != VALEUR_NOMINALE_EDEFAULT;
			case ChequedejPackage.COMMANDE__MOIS:
				return MOIS_EDEFAULT == null ? mois != null : !MOIS_EDEFAULT.equals(mois);
			case ChequedejPackage.COMMANDE__COMMANDE_PRECEDENTE:
				return commandePrecedente != null;
			case ChequedejPackage.COMMANDE__COMMANDE_SUIVANTE:
				return commandeSuivante != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ChequedejPackage.COMMANDE___CARNET:
				return carnet();
			case ChequedejPackage.COMMANDE___GET_OR_CREATE_ITEM__INT:
				return getOrCreateItem((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (date: ");
		result.append(date);
		result.append(", participationPatronale: ");
		result.append(participationPatronale);
		result.append(", valeurNominale: ");
		result.append(valeurNominale);
		result.append(", mois: ");
		result.append(mois);
		result.append(')');
		return result.toString();
	}

} //CommandeImpl
