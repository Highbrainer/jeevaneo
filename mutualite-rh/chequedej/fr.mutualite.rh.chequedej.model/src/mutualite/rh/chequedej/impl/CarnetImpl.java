/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Commande;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Carnet</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.CarnetImpl#getCommandes <em>Commandes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarnetImpl extends MinimalEObjectImpl.Container implements Carnet {
	/**
	 * The cached value of the '{@link #getCommandes() <em>Commandes</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCommandes()
	 * @generated
	 * @ordered
	 */
	protected EList<Commande> commandes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CarnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CARNET;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commande> getCommandes() {
		if (commandes == null) {
			commandes = new EObjectContainmentEList<Commande>(Commande.class, this, ChequedejPackage.CARNET__COMMANDES);
		}
		return commandes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ChequeDej root() {
		ChequeDej root = (ChequeDej) eContainer();
		return root;
	}

	private static DateTimeFormatter parseFormatter = DateTimeFormatter.ofPattern("yyyyMM");
	private static DateFormat parseDf = new SimpleDateFormat("yyyyMM");
	
	public LocalDate mois(String mois) {
//		LocalDate month = LocalDate.parse(mois+"01", parseFormatter);
		try {
			return Instant.ofEpochMilli(parseDf.parse(mois).getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String formatMois(LocalDate month) {
		return parseFormatter.format(month);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Commande getOrCreateCommande(String mois) {
		Optional<Commande> opt = getCommandes().stream().filter(c -> c.getMois().equals(mois)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		Commande c = ChequedejFactory.eINSTANCE.createCommande();
		c.setDate(new Date());
		c.setMois(mois);
		c.setParticipationPatronale(root().getParticipationPatronale());
		c.setValeurNominale(root().getValeurNominale());
		getCommandes().add(c);
		return c;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.CARNET__COMMANDES:
				return ((InternalEList<?>)getCommandes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.CARNET__COMMANDES:
				return getCommandes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChequedejPackage.CARNET__COMMANDES:
				getCommandes().clear();
				getCommandes().addAll((Collection<? extends Commande>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ChequedejPackage.CARNET__COMMANDES:
				getCommandes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ChequedejPackage.CARNET__COMMANDES:
				return commandes != null && !commandes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ChequedejPackage.CARNET___ROOT:
				return root();
			case ChequedejPackage.CARNET___GET_OR_CREATE_COMMANDE__STRING:
				return getOrCreateCommande((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // CarnetImpl
