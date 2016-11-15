/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Appreciation;
import fr.mutualite.rh.model.AppreciationSessionFormation;
import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SessionFormation;

import java.text.DateFormat;
import java.util.Date;

import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appreciation Session Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl#getSessionFormation <em>Session Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl#getIdFormation <em>Id Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl#getLibelleFormation <em>Libelle Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.AppreciationSessionFormationImpl#getDateFormation <em>Date Formation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppreciationSessionFormationImpl extends CDOObjectImpl implements AppreciationSessionFormation {
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final Appreciation VALEUR_EDEFAULT = Appreciation.SATISFAISANT;

	/**
	 * The default value of the '{@link #getIdFormation() <em>Id Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdFormation()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_FORMATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLibelleFormation() <em>Libelle Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelleFormation()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_FORMATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDateFormation() <em>Date Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFormation()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FORMATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppreciationSessionFormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.APPRECIATION_SESSION_FORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appreciation getValeur() {
		return (Appreciation)eDynamicGet(MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR, MutPackage.Literals.APPRECIATION_SESSION_FORMATION__VALEUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(Appreciation newValeur) {
		eDynamicSet(MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR, MutPackage.Literals.APPRECIATION_SESSION_FORMATION__VALEUR, newValeur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionFormation getSessionFormation() {
		return (SessionFormation)eDynamicGet(MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, MutPackage.Literals.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionFormation basicGetSessionFormation() {
		return (SessionFormation)eDynamicGet(MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, MutPackage.Literals.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSessionFormation(SessionFormation newSessionFormation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSessionFormation, MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionFormation(SessionFormation newSessionFormation) {
		eDynamicSet(MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, MutPackage.Literals.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION, newSessionFormation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getIdFormation() {
		
		SessionFormation sessionFormation = getSessionFormation();
		if(null==sessionFormation) {
			return null;
		}
		CDOID cdoID = sessionFormation.cdoID();
		if(null==cdoID) {
			return null;
		}
		return cdoID.toURIFragment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getLibelleFormation() {
		SessionFormation sessionFormation = getSessionFormation();
		if(null==sessionFormation) {
			return null;
		}
		Formation formation = (Formation) sessionFormation.eContainer();
		if(null==formation) {
			return null;
		}
		return formation.getLibelle();
	}
	
	private static final DateFormat df = DateFormat.getDateInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getDateFormation() {
		SessionFormation sessionFormation = getSessionFormation();
		if(null==sessionFormation) {
			return null;
		}
		Date dateDebut = sessionFormation.getDateDebut();
		
		return df.format(dateDebut); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				SessionFormation sessionFormation = basicGetSessionFormation();
				if (sessionFormation != null)
					msgs = ((InternalEObject)sessionFormation).eInverseRemove(this, MutPackage.SESSION_FORMATION__APPRECIATIONS, SessionFormation.class, msgs);
				return basicSetSessionFormation((SessionFormation)otherEnd, msgs);
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
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				return basicSetSessionFormation(null, msgs);
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
			case MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR:
				return getValeur();
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				if (resolve) return getSessionFormation();
				return basicGetSessionFormation();
			case MutPackage.APPRECIATION_SESSION_FORMATION__ID_FORMATION:
				return getIdFormation();
			case MutPackage.APPRECIATION_SESSION_FORMATION__LIBELLE_FORMATION:
				return getLibelleFormation();
			case MutPackage.APPRECIATION_SESSION_FORMATION__DATE_FORMATION:
				return getDateFormation();
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
			case MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR:
				setValeur((Appreciation)newValue);
				return;
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				setSessionFormation((SessionFormation)newValue);
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
			case MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR:
				setValeur(VALEUR_EDEFAULT);
				return;
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				setSessionFormation((SessionFormation)null);
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
			case MutPackage.APPRECIATION_SESSION_FORMATION__VALEUR:
				return getValeur() != VALEUR_EDEFAULT;
			case MutPackage.APPRECIATION_SESSION_FORMATION__SESSION_FORMATION:
				return basicGetSessionFormation() != null;
			case MutPackage.APPRECIATION_SESSION_FORMATION__ID_FORMATION:
				return ID_FORMATION_EDEFAULT == null ? getIdFormation() != null : !ID_FORMATION_EDEFAULT.equals(getIdFormation());
			case MutPackage.APPRECIATION_SESSION_FORMATION__LIBELLE_FORMATION:
				return LIBELLE_FORMATION_EDEFAULT == null ? getLibelleFormation() != null : !LIBELLE_FORMATION_EDEFAULT.equals(getLibelleFormation());
			case MutPackage.APPRECIATION_SESSION_FORMATION__DATE_FORMATION:
				return DATE_FORMATION_EDEFAULT == null ? getDateFormation() != null : !DATE_FORMATION_EDEFAULT.equals(getDateFormation());
		}
		return super.eIsSet(featureID);
	}

} //AppreciationSessionFormationImpl
