/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Emploi;
import fr.mutualite.rh.model.MutPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emploi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EmploiImpl#getIntitule <em>Intitule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmploiImpl extends CDOObjectImpl implements Emploi {
	/**
	 * The default value of the '{@link #getIntitule() <em>Intitule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntitule()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmploiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.EMPLOI;
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
	public String getIntitule() {
		return (String)eDynamicGet(MutPackage.EMPLOI__INTITULE, MutPackage.Literals.EMPLOI__INTITULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntitule(String newIntitule) {
		eDynamicSet(MutPackage.EMPLOI__INTITULE, MutPackage.Literals.EMPLOI__INTITULE, newIntitule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.EMPLOI__INTITULE:
				return getIntitule();
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
			case MutPackage.EMPLOI__INTITULE:
				setIntitule((String)newValue);
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
			case MutPackage.EMPLOI__INTITULE:
				setIntitule(INTITULE_EDEFAULT);
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
			case MutPackage.EMPLOI__INTITULE:
				return INTITULE_EDEFAULT == null ? getIntitule() != null : !INTITULE_EDEFAULT.equals(getIntitule());
		}
		return super.eIsSet(featureID);
	}

} //EmploiImpl
