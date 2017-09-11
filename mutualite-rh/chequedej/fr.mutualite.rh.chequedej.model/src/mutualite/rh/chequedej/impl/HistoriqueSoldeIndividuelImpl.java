/**
 */
package mutualite.rh.chequedej.impl;

import java.util.Date;

import mutualite.rh.chequedej.ChequedejPackage;
import mutualite.rh.chequedej.HistoriqueSoldeIndividuel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Historique Solde Individuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl#getSoldeAvant <em>Solde Avant</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.impl.HistoriqueSoldeIndividuelImpl#getSoldeApres <em>Solde Apres</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HistoriqueSoldeIndividuelImpl extends MinimalEObjectImpl.Container implements HistoriqueSoldeIndividuel {
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoldeAvant() <em>Solde Avant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldeAvant()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLDE_AVANT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoldeAvant() <em>Solde Avant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldeAvant()
	 * @generated
	 * @ordered
	 */
	protected int soldeAvant = SOLDE_AVANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoldeApres() <em>Solde Apres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldeApres()
	 * @generated
	 * @ordered
	 */
	protected static final int SOLDE_APRES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSoldeApres() <em>Solde Apres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoldeApres()
	 * @generated
	 * @ordered
	 */
	protected int soldeApres = SOLDE_APRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoriqueSoldeIndividuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChequedejPackage.Literals.HISTORIQUE_SOLDE_INDIVIDUEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoldeAvant() {
		return soldeAvant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoldeAvant(int newSoldeAvant) {
		int oldSoldeAvant = soldeAvant;
		soldeAvant = newSoldeAvant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT, oldSoldeAvant, soldeAvant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSoldeApres() {
		return soldeApres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoldeApres(int newSoldeApres) {
		int oldSoldeApres = soldeApres;
		soldeApres = newSoldeApres;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES, oldSoldeApres, soldeApres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__DATE:
				return getDate();
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT:
				return getComment();
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT:
				return getSoldeAvant();
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES:
				return getSoldeApres();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__DATE:
				setDate((Date)newValue);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT:
				setComment((String)newValue);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT:
				setSoldeAvant((Integer)newValue);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES:
				setSoldeApres((Integer)newValue);
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
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT:
				setSoldeAvant(SOLDE_AVANT_EDEFAULT);
				return;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES:
				setSoldeApres(SOLDE_APRES_EDEFAULT);
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
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_AVANT:
				return soldeAvant != SOLDE_AVANT_EDEFAULT;
			case ChequedejPackage.HISTORIQUE_SOLDE_INDIVIDUEL__SOLDE_APRES:
				return soldeApres != SOLDE_APRES_EDEFAULT;
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
		result.append(" (date: ");
		result.append(date);
		result.append(", comment: ");
		result.append(comment);
		result.append(", soldeAvant: ");
		result.append(soldeAvant);
		result.append(", soldeApres: ");
		result.append(soldeApres);
		result.append(')');
		return result.toString();
	}

} //HistoriqueSoldeIndividuelImpl
