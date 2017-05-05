/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Formation;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SessionFormation;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.FormationImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.FormationImpl#getSessionformation <em>Sessionformation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.FormationImpl#isDpc <em>Dpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends CDOObjectImpl implements Formation {
	/**
	 * The default value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isDpc() <em>Dpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDpc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DPC_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.FORMATION;
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
	public String getLibelle() {
		return (String)eDynamicGet(MutPackage.FORMATION__LIBELLE, MutPackage.Literals.FORMATION__LIBELLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		eDynamicSet(MutPackage.FORMATION__LIBELLE, MutPackage.Literals.FORMATION__LIBELLE, newLibelle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SessionFormation> getSessionformation() {
		return (EList<SessionFormation>)eDynamicGet(MutPackage.FORMATION__SESSIONFORMATION, MutPackage.Literals.FORMATION__SESSIONFORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDpc() {
		return (Boolean)eDynamicGet(MutPackage.FORMATION__DPC, MutPackage.Literals.FORMATION__DPC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDpc(boolean newDpc) {
		eDynamicSet(MutPackage.FORMATION__DPC, MutPackage.Literals.FORMATION__DPC, newDpc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.FORMATION__SESSIONFORMATION:
				return ((InternalEList<?>)getSessionformation()).basicRemove(otherEnd, msgs);
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
			case MutPackage.FORMATION__LIBELLE:
				return getLibelle();
			case MutPackage.FORMATION__SESSIONFORMATION:
				return getSessionformation();
			case MutPackage.FORMATION__DPC:
				return isDpc();
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
			case MutPackage.FORMATION__LIBELLE:
				setLibelle((String)newValue);
				return;
			case MutPackage.FORMATION__SESSIONFORMATION:
				getSessionformation().clear();
				getSessionformation().addAll((Collection<? extends SessionFormation>)newValue);
				return;
			case MutPackage.FORMATION__DPC:
				setDpc((Boolean)newValue);
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
			case MutPackage.FORMATION__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case MutPackage.FORMATION__SESSIONFORMATION:
				getSessionformation().clear();
				return;
			case MutPackage.FORMATION__DPC:
				setDpc(DPC_EDEFAULT);
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
			case MutPackage.FORMATION__LIBELLE:
				return LIBELLE_EDEFAULT == null ? getLibelle() != null : !LIBELLE_EDEFAULT.equals(getLibelle());
			case MutPackage.FORMATION__SESSIONFORMATION:
				return !getSessionformation().isEmpty();
			case MutPackage.FORMATION__DPC:
				return isDpc() != DPC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FormationImpl
