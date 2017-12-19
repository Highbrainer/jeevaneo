/**
 */
package mutualite.rh.chequedej.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import mutualite.rh.chequedej.ChequedejFactory;
import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.HistoriqueSoldeIndividuel;
import mutualite.rh.chequedej.SoldeIndividuel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solde Individuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl#getNbCheques <em>Nb Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.SoldeIndividuelImpl#getAnnee <em>Annee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoldeIndividuelImpl extends MinimalEObjectImpl.Container implements SoldeIndividuel {
	/**
	 * The default value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_CHEQUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbCheques() <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbCheques()
	 * @generated
	 * @ordered
	 */
	protected int nbCheques = NB_CHEQUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final int MATRICULE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected int matricule = MATRICULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHistorique() <em>Historique</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorique()
	 * @generated
	 * @ordered
	 */
	protected EList<HistoriqueSoldeIndividuel> historique;

	/**
	 * The default value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected static final int ANNEE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected int annee = ANNEE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoldeIndividuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.SOLDE_INDIVIDUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbCheques() {
		return nbCheques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbCheques(int newNbCheques) {
		int oldNbCheques = nbCheques;
		nbCheques = newNbCheques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.SOLDE_INDIVIDUEL__NB_CHEQUES, oldNbCheques, nbCheques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(int newMatricule) {
		int oldMatricule = matricule;
		matricule = newMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.SOLDE_INDIVIDUEL__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HistoriqueSoldeIndividuel> getHistorique() {
		if (historique == null) {
			historique = new EObjectContainmentEList<HistoriqueSoldeIndividuel>(HistoriqueSoldeIndividuel.class, this, ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE);
		}
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnnee() {
		return annee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnee(int newAnnee) {
		int oldAnnee = annee;
		annee = newAnnee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.SOLDE_INDIVIDUEL__ANNEE, oldAnnee, annee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void incremente(int delta, String comment) {
		int ancienSolde = getNbCheques();
		setNbCheques(ancienSolde + delta);
		int nouveauSolde = getNbCheques();
		if(delta==0) {
			comment = "RAS / " + comment;
		} else {
		comment += " Ancien solde : " + ancienSolde + ". Nouveau solde : " + ancienSolde + (delta>0?" + ":" - ") + Math.abs(delta) + " = " + nouveauSolde + ".";
		}
		HistoriqueSoldeIndividuel log = ChequedejFactory.eINSTANCE.createHistoriqueSoldeIndividuel();
		log.setComment(comment);
		log.setDate(new Date());
		log.setSoldeApres(nouveauSolde);
		log.setSoldeAvant(ancienSolde);
		getHistorique().add(log);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE:
				return ((InternalEList<?>)getHistorique()).basicRemove(otherEnd, msgs);
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
			case ChequedejPackage.SOLDE_INDIVIDUEL__NB_CHEQUES:
				return getNbCheques();
			case ChequedejPackage.SOLDE_INDIVIDUEL__MATRICULE:
				return getMatricule();
			case ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE:
				return getHistorique();
			case ChequedejPackage.SOLDE_INDIVIDUEL__ANNEE:
				return getAnnee();
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
			case ChequedejPackage.SOLDE_INDIVIDUEL__NB_CHEQUES:
				setNbCheques((Integer)newValue);
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__MATRICULE:
				setMatricule((Integer)newValue);
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE:
				getHistorique().clear();
				getHistorique().addAll((Collection<? extends HistoriqueSoldeIndividuel>)newValue);
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__ANNEE:
				setAnnee((Integer)newValue);
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
			case ChequedejPackage.SOLDE_INDIVIDUEL__NB_CHEQUES:
				setNbCheques(NB_CHEQUES_EDEFAULT);
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE:
				getHistorique().clear();
				return;
			case ChequedejPackage.SOLDE_INDIVIDUEL__ANNEE:
				setAnnee(ANNEE_EDEFAULT);
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
			case ChequedejPackage.SOLDE_INDIVIDUEL__NB_CHEQUES:
				return nbCheques != NB_CHEQUES_EDEFAULT;
			case ChequedejPackage.SOLDE_INDIVIDUEL__MATRICULE:
				return matricule != MATRICULE_EDEFAULT;
			case ChequedejPackage.SOLDE_INDIVIDUEL__HISTORIQUE:
				return historique != null && !historique.isEmpty();
			case ChequedejPackage.SOLDE_INDIVIDUEL__ANNEE:
				return annee != ANNEE_EDEFAULT;
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
			case ChequedejPackage.SOLDE_INDIVIDUEL___INCREMENTE__INT_STRING:
				incremente((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
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
		result.append(" (nbCheques: ");
		result.append(nbCheques);
		result.append(", matricule: ");
		result.append(matricule);
		result.append(", annee: ");
		result.append(annee);
		result.append(')');
		return result.toString();
	}

} //SoldeIndividuelImpl
