/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Souhait Formation Evaluateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SouhaitFormationEvaluateurImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SouhaitFormationEvaluateurImpl extends CDOObjectImpl implements SouhaitFormationEvaluateur {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SouhaitFormationEvaluateurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.SOUHAIT_FORMATION_EVALUATEUR;
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
	public String getTexte() {
		return (String)eDynamicGet(MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE, MutPackage.Literals.SOUHAIT_FORMATION_EVALUATEUR__TEXTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexte(String newTexte) {
		eDynamicSet(MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE, MutPackage.Literals.SOUHAIT_FORMATION_EVALUATEUR__TEXTE, newTexte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public long getId() {
		return Long.parseLong(cdoID().toURIFragment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE:
				return getTexte();
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__ID:
				return getId();
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
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE:
				setTexte((String)newValue);
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
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE:
				setTexte(TEXTE_EDEFAULT);
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
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__TEXTE:
				return TEXTE_EDEFAULT == null ? getTexte() != null : !TEXTE_EDEFAULT.equals(getTexte());
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR__ID:
				return getId() != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SouhaitFormationEvaluateurImpl
