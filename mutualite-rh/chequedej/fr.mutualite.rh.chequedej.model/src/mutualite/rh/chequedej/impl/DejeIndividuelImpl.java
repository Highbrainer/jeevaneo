/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import mutualite.rh.chequedej.ChequeDej;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.DejeIndividuel;
import mutualite.rh.chequedej.DejeMensuel;
import mutualite.rh.chequedej.SoldeIndividuel;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Deje Individuel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeIndividuelImpl#getNbEstimeJoursEntiers <em>Nb Estime Jours Entiers</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeIndividuelImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.DejeIndividuelImpl#getNbReelJoursEntiers <em>Nb Reel Jours Entiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DejeIndividuelImpl extends MinimalEObjectImpl.Container implements DejeIndividuel {

	private static final Adapter soldeUpdater = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature().equals(ChequedejPackage.Literals.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS)
					|| msg.getFeature().equals(ChequedejPackage.Literals.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS)) {
				DejeIndividuel di = (DejeIndividuel) msg.getNotifier();
				int estime = di.getNbEstimeJoursEntiers() == null ? 0 : di.getNbEstimeJoursEntiers();
				if (null == di.getNbReelJoursEntiers()) {
					// on ne fait rien tant qu'on n'a pas les jours reels...
					return;
				} else {
					int reel = di.getNbReelJoursEntiers();
					int nouveau = (Integer) msg.getNewValue();
					Integer ancien = (Integer) msg.getOldValue();
					if (ancien != null && ancien.intValue() == nouveau) {
						// pas vraiment de changement : rien à faire!
						return;
					}
					// on tient le solde à jour... S'agit-il d'une correction ou de l'initialisation?
					ChequeDej chequeDej = di.dejeMensuel().deje().root();
					SoldeIndividuel si = chequeDej.getSolde().getOrCreateSoldeIndividual(di.getMatricule(), chequeDej.getSolde().annee(di.dejeMensuel().getMois()));
					int delta;
					String comment;
					if (ancien == null) {
						// C'est une initialisation...
						delta = reel - estime;
						comment = "Pour " + di.dejeMensuel().label() + " : " + estime + " " + (estime > 1 ? "jours" : "jour") + " estimé" + (estime > 1 ? "s" : "") + " pour " + reel + " "
								+ (reel > 1 ? "jours" : "jour") + " entiers effectivement travaillés. Soit une différence de " + delta + ".";
					} else {
						// on avait déjà une valeur, qu'on corrige
						delta = ancien - nouveau;
						String label = "estimé";
						if (msg.getFeature().equals(ChequedejPackage.Literals.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS)) {
							label = "réel";
						}
						comment = "Le nombre " + label + " de jours entiers pour " + di.dejeMensuel().label() + " est passé de " + ancien + " à " + nouveau
								+ ". Soit une différence de " + delta + ".";

						if (msg.getFeature().equals(ChequedejPackage.Literals.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS)) {
							delta = -delta;
						}
					}
					si.incremente(delta, comment);
				}
			}

		}
	};

	{
		eAdapters().add(soldeUpdater);
	}

	/**
	 * The default value of the '{@link #getNbEstimeJoursEntiers() <em>Nb Estime Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNbEstimeJoursEntiers()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NB_ESTIME_JOURS_ENTIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNbEstimeJoursEntiers() <em>Nb Estime Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNbEstimeJoursEntiers()
	 * @generated
	 * @ordered
	 */
	protected Integer nbEstimeJoursEntiers = NB_ESTIME_JOURS_ENTIERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected int matricule = MATRICULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbReelJoursEntiers() <em>Nb Reel Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNbReelJoursEntiers()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NB_REEL_JOURS_ENTIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNbReelJoursEntiers() <em>Nb Reel Jours Entiers</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNbReelJoursEntiers()
	 * @generated
	 * @ordered
	 */
	protected Integer nbReelJoursEntiers = NB_REEL_JOURS_ENTIERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DejeIndividuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.DEJE_INDIVIDUEL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNbEstimeJoursEntiers() {
		return nbEstimeJoursEntiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEstimeJoursEntiers(Integer newNbEstimeJoursEntiers) {
		Integer oldNbEstimeJoursEntiers = nbEstimeJoursEntiers;
		nbEstimeJoursEntiers = newNbEstimeJoursEntiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS, oldNbEstimeJoursEntiers, nbEstimeJoursEntiers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		int oldMatricule = matricule;
		matricule = newMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.DEJE_INDIVIDUEL__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNbReelJoursEntiers() {
		return nbReelJoursEntiers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbReelJoursEntiers(Integer newNbReelJoursEntiers) {
		Integer oldNbReelJoursEntiers = nbReelJoursEntiers;
		nbReelJoursEntiers = newNbReelJoursEntiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS, oldNbReelJoursEntiers, nbReelJoursEntiers));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public DejeMensuel dejeMensuel() {
		return (DejeMensuel) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS:
				return getNbEstimeJoursEntiers();
			case ChequedejPackage.DEJE_INDIVIDUEL__MATRICULE:
				return getMatricule();
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS:
				return getNbReelJoursEntiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS:
				setNbEstimeJoursEntiers((Integer)newValue);
				return;
			case ChequedejPackage.DEJE_INDIVIDUEL__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS:
				setNbReelJoursEntiers((Integer)newValue);
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
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS:
				setNbEstimeJoursEntiers(NB_ESTIME_JOURS_ENTIERS_EDEFAULT);
				return;
			case ChequedejPackage.DEJE_INDIVIDUEL__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS:
				setNbReelJoursEntiers(NB_REEL_JOURS_ENTIERS_EDEFAULT);
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
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_ESTIME_JOURS_ENTIERS:
				return NB_ESTIME_JOURS_ENTIERS_EDEFAULT == null ? nbEstimeJoursEntiers != null : !NB_ESTIME_JOURS_ENTIERS_EDEFAULT.equals(nbEstimeJoursEntiers);
			case ChequedejPackage.DEJE_INDIVIDUEL__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
			case ChequedejPackage.DEJE_INDIVIDUEL__NB_REEL_JOURS_ENTIERS:
				return NB_REEL_JOURS_ENTIERS_EDEFAULT == null ? nbReelJoursEntiers != null : !NB_REEL_JOURS_ENTIERS_EDEFAULT.equals(nbReelJoursEntiers);
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
			case ChequedejPackage.DEJE_INDIVIDUEL___DEJE_MENSUEL:
				return dejeMensuel();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nbEstimeJoursEntiers: ");
		result.append(nbEstimeJoursEntiers);
		result.append(", matricule: ");
		result.append(matricule);
		result.append(", nbReelJoursEntiers: ");
		result.append(nbReelJoursEntiers);
		result.append(')');
		return result.toString();
	}

} // DejeIndividuelImpl
