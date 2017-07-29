/**
 */
package mutualite.rh.chequedej.impl;

import mutualite.rh.chequedej.Carnet;
import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.EtablissementsVirtuels;
import mutualite.rh.chequedej.Parametrage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cheque Dej</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getCarnet <em>Carnet</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getValeurNominale <em>Valeur Nominale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getParticipationPatronale <em>Participation Patronale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getEtablissementsVirtuels <em>Etablissements Virtuels</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.ChequeDejImpl#getParametrage <em>Parametrage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChequeDejImpl extends MinimalEObjectImpl.Container implements ChequeDej {
	
	{
		setCarnet(ChequedejFactory.eINSTANCE.createCarnet());
		setEtablissementsVirtuels(ChequedejFactory.eINSTANCE.createEtablissementsVirtuels());
		setParametrage(ChequedejFactory.eINSTANCE.createParametrage());
	}
	/**
	 * The cached value of the '{@link #getCarnet() <em>Carnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarnet()
	 * @generated
	 * @ordered
	 */
	protected Carnet carnet;

	/**
	 * The default value of the '{@link #getValeurNominale() <em>Valeur Nominale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurNominale()
	 * @generated
	 * @ordered
	 */
	protected static final float VALEUR_NOMINALE_EDEFAULT = 6.7F;

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
	 * The default value of the '{@link #getParticipationPatronale() <em>Participation Patronale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipationPatronale()
	 * @generated
	 * @ordered
	 */
	protected static final float PARTICIPATION_PATRONALE_EDEFAULT = 3.69F;

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
	 * The cached value of the '{@link #getEtablissementsVirtuels() <em>Etablissements Virtuels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtablissementsVirtuels()
	 * @generated
	 * @ordered
	 */
	protected EtablissementsVirtuels etablissementsVirtuels;

	/**
	 * The cached value of the '{@link #getParametrage() <em>Parametrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametrage()
	 * @generated
	 * @ordered
	 */
	protected Parametrage parametrage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeDejImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.CHEQUE_DEJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carnet getCarnet() {
		return carnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarnet(Carnet newCarnet, NotificationChain msgs) {
		Carnet oldCarnet = carnet;
		carnet = newCarnet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CARNET, oldCarnet, newCarnet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarnet(Carnet newCarnet) {
		if (newCarnet != carnet) {
			NotificationChain msgs = null;
			if (carnet != null)
				msgs = ((InternalEObject)carnet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CARNET, null, msgs);
			if (newCarnet != null)
				msgs = ((InternalEObject)newCarnet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__CARNET, null, msgs);
			msgs = basicSetCarnet(newCarnet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__CARNET, newCarnet, newCarnet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE, oldValeurNominale, valeurNominale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE, oldParticipationPatronale, participationPatronale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementsVirtuels getEtablissementsVirtuels() {
		return etablissementsVirtuels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEtablissementsVirtuels(EtablissementsVirtuels newEtablissementsVirtuels, NotificationChain msgs) {
		EtablissementsVirtuels oldEtablissementsVirtuels = etablissementsVirtuels;
		etablissementsVirtuels = newEtablissementsVirtuels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, oldEtablissementsVirtuels, newEtablissementsVirtuels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtablissementsVirtuels(EtablissementsVirtuels newEtablissementsVirtuels) {
		if (newEtablissementsVirtuels != etablissementsVirtuels) {
			NotificationChain msgs = null;
			if (etablissementsVirtuels != null)
				msgs = ((InternalEObject)etablissementsVirtuels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, null, msgs);
			if (newEtablissementsVirtuels != null)
				msgs = ((InternalEObject)newEtablissementsVirtuels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, null, msgs);
			msgs = basicSetEtablissementsVirtuels(newEtablissementsVirtuels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS, newEtablissementsVirtuels, newEtablissementsVirtuels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametrage getParametrage() {
		return parametrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametrage(Parametrage newParametrage, NotificationChain msgs) {
		Parametrage oldParametrage = parametrage;
		parametrage = newParametrage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, oldParametrage, newParametrage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametrage(Parametrage newParametrage) {
		if (newParametrage != parametrage) {
			NotificationChain msgs = null;
			if (parametrage != null)
				msgs = ((InternalEObject)parametrage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, null, msgs);
			if (newParametrage != null)
				msgs = ((InternalEObject)newParametrage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, null, msgs);
			msgs = basicSetParametrage(newParametrage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE, newParametrage, newParametrage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			case ChequedejPackage.CHEQUE_DEJ__CARNET:
				setCarnet((Carnet)newValue);
				return;
			case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
				setValeurNominale((Float)newValue);
				return;
			case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
				setParticipationPatronale((Float)newValue);
				return;
			case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
				setEtablissementsVirtuels((EtablissementsVirtuels)newValue);
				return;
			case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
				setParametrage((Parametrage)newValue);
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
			case ChequedejPackage.CHEQUE_DEJ__CARNET:
				setCarnet((Carnet)null);
				return;
			case ChequedejPackage.CHEQUE_DEJ__VALEUR_NOMINALE:
				setValeurNominale(VALEUR_NOMINALE_EDEFAULT);
				return;
			case ChequedejPackage.CHEQUE_DEJ__PARTICIPATION_PATRONALE:
				setParticipationPatronale(PARTICIPATION_PATRONALE_EDEFAULT);
				return;
			case ChequedejPackage.CHEQUE_DEJ__ETABLISSEMENTS_VIRTUELS:
				setEtablissementsVirtuels((EtablissementsVirtuels)null);
				return;
			case ChequedejPackage.CHEQUE_DEJ__PARAMETRAGE:
				setParametrage((Parametrage)null);
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
		}
		return super.eIsSet(featureID);
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
		result.append(" (valeurNominale: ");
		result.append(valeurNominale);
		result.append(", participationPatronale: ");
		result.append(participationPatronale);
		result.append(')');
		return result.toString();
	}

} //ChequeDejImpl
