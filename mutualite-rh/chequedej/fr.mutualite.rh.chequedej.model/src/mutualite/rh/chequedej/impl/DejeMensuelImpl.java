/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Optional;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.Deje;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.DejeMensuel;

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
 * An implementation of the model object '<em><b>Deje Mensuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeMensuelImpl#getDejesIndividuels <em>Dejes Individuels</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeMensuelImpl#getMois <em>Mois</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DejeMensuelImpl extends MinimalEObjectImpl.Container implements DejeMensuel {
	/**
	 * The cached value of the '{@link #getDejesIndividuels() <em>Dejes Individuels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDejesIndividuels()
	 * @generated
	 * @ordered
	 */
	protected EList<DejeIndividuel> dejesIndividuels;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DejeMensuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.DEJE_MENSUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DejeIndividuel> getDejesIndividuels() {
		if (dejesIndividuels == null) {
			dejesIndividuels = new EObjectContainmentEList<DejeIndividuel>(DejeIndividuel.class, this, ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS);
		}
		return dejesIndividuels;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.DEJE_MENSUEL__MOIS, oldMois, mois));
	}

	private final DateFormat labelDf = new SimpleDateFormat("MMM YYYY");
	private final DateFormat parseDf = new SimpleDateFormat("yyyyMM");
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String label() {
		try {
			return labelDf.format(parseDf.parse(getMois()));
		} catch (ParseException e) {
			throw new IllegalArgumentException("Format de mois incorrect : '" + getMois() + "' devrait être de la forme aaaamm. Exemple: 201705.", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DejeIndividuel getOrCreateDejeIndividuel(int matricule) {
		Optional<DejeIndividuel> opt = getDejesIndividuels().stream().filter(di -> di.getMatricule()==matricule).findAny();
		if(opt.isPresent()) {
			return opt.get();
		}
		DejeIndividuel di = ChequedejFactory.eINSTANCE.createDejeIndividuel();
		di.setMatricule(matricule);
		getDejesIndividuels().add(di);
		return di;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Deje deje() {
		Deje ret = (Deje) eContainer();
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS:
				return ((InternalEList<?>)getDejesIndividuels()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS:
				return getDejesIndividuels();
			case ChequedejPackage.DEJE_MENSUEL__MOIS:
				return getMois();
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
			case ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS:
				getDejesIndividuels().clear();
				getDejesIndividuels().addAll((Collection<? extends DejeIndividuel>)newValue);
				return;
			case ChequedejPackage.DEJE_MENSUEL__MOIS:
				setMois((String)newValue);
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
			case ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS:
				getDejesIndividuels().clear();
				return;
			case ChequedejPackage.DEJE_MENSUEL__MOIS:
				setMois(MOIS_EDEFAULT);
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
			case ChequedejPackage.DEJE_MENSUEL__DEJES_INDIVIDUELS:
				return dejesIndividuels != null && !dejesIndividuels.isEmpty();
			case ChequedejPackage.DEJE_MENSUEL__MOIS:
				return MOIS_EDEFAULT == null ? mois != null : !MOIS_EDEFAULT.equals(mois);
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
			case ChequedejPackage.DEJE_MENSUEL___LABEL:
				return label();
			case ChequedejPackage.DEJE_MENSUEL___GET_OR_CREATE_DEJE_INDIVIDUEL__INT:
				return getOrCreateDejeIndividuel((Integer)arguments.get(0));
			case ChequedejPackage.DEJE_MENSUEL___DEJE:
				return deje();
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
		result.append(" (mois: ");
		result.append(mois);
		result.append(')');
		return result.toString();
	}

} //DejeMensuelImpl
