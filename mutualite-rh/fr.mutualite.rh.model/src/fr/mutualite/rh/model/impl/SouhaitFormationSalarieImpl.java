/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.Avis;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Souhait Formation Salarie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl#getAvisEvaluateur <em>Avis Evaluateur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.SouhaitFormationSalarieImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SouhaitFormationSalarieImpl extends CDOObjectImpl implements SouhaitFormationSalarie {
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
	 * The default value of the '{@link #getAvisEvaluateur() <em>Avis Evaluateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvisEvaluateur()
	 * @generated
	 * @ordered
	 */
	protected static final Avis AVIS_EVALUATEUR_EDEFAULT = Avis.FAVORABLE;

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
	protected SouhaitFormationSalarieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.SOUHAIT_FORMATION_SALARIE;
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
		return (String)eDynamicGet(MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE, MutPackage.Literals.SOUHAIT_FORMATION_SALARIE__TEXTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexte(String newTexte) {
		eDynamicSet(MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE, MutPackage.Literals.SOUHAIT_FORMATION_SALARIE__TEXTE, newTexte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avis getAvisEvaluateur() {
		return (Avis)eDynamicGet(MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR, MutPackage.Literals.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvisEvaluateur(Avis newAvisEvaluateur) {
		eDynamicSet(MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR, MutPackage.Literals.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR, newAvisEvaluateur);
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
			case MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE:
				return getTexte();
			case MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR:
				return getAvisEvaluateur();
			case MutPackage.SOUHAIT_FORMATION_SALARIE__ID:
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
			case MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE:
				setTexte((String)newValue);
				return;
			case MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR:
				setAvisEvaluateur((Avis)newValue);
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
			case MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR:
				setAvisEvaluateur(AVIS_EVALUATEUR_EDEFAULT);
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
			case MutPackage.SOUHAIT_FORMATION_SALARIE__TEXTE:
				return TEXTE_EDEFAULT == null ? getTexte() != null : !TEXTE_EDEFAULT.equals(getTexte());
			case MutPackage.SOUHAIT_FORMATION_SALARIE__AVIS_EVALUATEUR:
				return getAvisEvaluateur() != AVIS_EVALUATEUR_EDEFAULT;
			case MutPackage.SOUHAIT_FORMATION_SALARIE__ID:
				return getId() != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SouhaitFormationSalarieImpl
