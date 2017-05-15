/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.AppreciationSessionFormation;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.PhotoEmploye;
import fr.mutualite.rh.model.SouhaitFormationEvaluateur;
import fr.mutualite.rh.model.SouhaitFormationSalarie;
import fr.mutualite.rh.model.util.MutValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entretien</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getMeneur <em>Meneur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#isEnCours <em>En Cours</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#isFake <em>Fake</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getScan <em>Scan</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getAppreciationsSessionFormation <em>Appreciations Session Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getSouhaitsFormationSalarie <em>Souhaits Formation Salarie</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getSouhaitsFormationEvaluateur <em>Souhaits Formation Evaluateur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getAutresActionsDeveloppementCompetences <em>Autres Actions Developpement Competences</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienImpl#getPhotoEmploye <em>Photo Employe</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntretienImpl extends CDOObjectImpl implements Entretien {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isEnCours() <em>En Cours</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEnCours()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EN_COURS_EDEFAULT = true;

	/**
	 * The default value of the '{@link #isFake() <em>Fake</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isFake()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAKE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getScan() <em>Scan</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScan()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SCAN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAutresActionsDeveloppementCompetences() <em>Autres Actions Developpement Competences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresActionsDeveloppementCompetences()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected EntretienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.ENTRETIEN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eDynamicGet(MutPackage.ENTRETIEN__DATE, MutPackage.Literals.ENTRETIEN__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eDynamicSet(MutPackage.ENTRETIEN__DATE, MutPackage.Literals.ENTRETIEN__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Employe getMeneur() {
		return (Employe)eDynamicGet(MutPackage.ENTRETIEN__MENEUR, MutPackage.Literals.ENTRETIEN__MENEUR, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Employe basicGetMeneur() {
		return (Employe)eDynamicGet(MutPackage.ENTRETIEN__MENEUR, MutPackage.Literals.ENTRETIEN__MENEUR, false, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeneur(Employe newMeneur, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newMeneur, MutPackage.ENTRETIEN__MENEUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeneur(Employe newMeneur) {
		eDynamicSet(MutPackage.ENTRETIEN__MENEUR, MutPackage.Literals.ENTRETIEN__MENEUR, newMeneur);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnCours() {
		return (Boolean)eDynamicGet(MutPackage.ENTRETIEN__EN_COURS, MutPackage.Literals.ENTRETIEN__EN_COURS, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnCours(boolean newEnCours) {
		eDynamicSet(MutPackage.ENTRETIEN__EN_COURS, MutPackage.Literals.ENTRETIEN__EN_COURS, newEnCours);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFake() {
		return (Boolean)eDynamicGet(MutPackage.ENTRETIEN__FAKE, MutPackage.Literals.ENTRETIEN__FAKE, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFake(boolean newFake) {
		eDynamicSet(MutPackage.ENTRETIEN__FAKE, MutPackage.Literals.ENTRETIEN__FAKE, newFake);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getScan() {
		return (byte[])eDynamicGet(MutPackage.ENTRETIEN__SCAN, MutPackage.Literals.ENTRETIEN__SCAN, true, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScan(byte[] newScan) {
		eDynamicSet(MutPackage.ENTRETIEN__SCAN, MutPackage.Literals.ENTRETIEN__SCAN, newScan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AppreciationSessionFormation> getAppreciationsSessionFormation() {
		return (EList<AppreciationSessionFormation>)eDynamicGet(MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION, MutPackage.Literals.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SouhaitFormationSalarie> getSouhaitsFormationSalarie() {
		return (EList<SouhaitFormationSalarie>)eDynamicGet(MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE, MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_SALARIE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SouhaitFormationEvaluateur> getSouhaitsFormationEvaluateur() {
		return (EList<SouhaitFormationEvaluateur>)eDynamicGet(MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR, MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutresActionsDeveloppementCompetences() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES, MutPackage.Literals.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutresActionsDeveloppementCompetences(String newAutresActionsDeveloppementCompetences) {
		eDynamicSet(MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES, MutPackage.Literals.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES, newAutresActionsDeveloppementCompetences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoEmploye getPhotoEmploye() {
		return (PhotoEmploye)eDynamicGet(MutPackage.ENTRETIEN__PHOTO_EMPLOYE, MutPackage.Literals.ENTRETIEN__PHOTO_EMPLOYE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhotoEmploye(PhotoEmploye newPhotoEmploye, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPhotoEmploye, MutPackage.ENTRETIEN__PHOTO_EMPLOYE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotoEmploye(PhotoEmploye newPhotoEmploye) {
		eDynamicSet(MutPackage.ENTRETIEN__PHOTO_EMPLOYE, MutPackage.Literals.ENTRETIEN__PHOTO_EMPLOYE, newPhotoEmploye);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Employe employe() {
		Employe emp = (Employe) eContainer();
		return emp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean hasValidMeneur(DiagnosticChain chain, Map<Object, Object> context) {
		if (isFake()) {
			return true;
		}
		if (getMeneur() == null) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR, MutValidator.DIAGNOSTIC_SOURCE, MutValidator.ENTRETIEN__HAS_VALID_MENEUR, "Meneur non défini",
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.ENTRETIEN__MENEUR:
				Employe meneur = basicGetMeneur();
				if (meneur != null)
					msgs = ((InternalEObject)meneur).eInverseRemove(this, MutPackage.EMPLOYE__ENTRETIENS_MENES, Employe.class, msgs);
				return basicSetMeneur((Employe)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.ENTRETIEN__MENEUR:
				return basicSetMeneur(null, msgs);
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
				return ((InternalEList<?>)getAppreciationsSessionFormation()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
				return ((InternalEList<?>)getSouhaitsFormationSalarie()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
				return ((InternalEList<?>)getSouhaitsFormationEvaluateur()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
				return basicSetPhotoEmploye(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.ENTRETIEN__DATE:
				return getDate();
			case MutPackage.ENTRETIEN__MENEUR:
				if (resolve) return getMeneur();
				return basicGetMeneur();
			case MutPackage.ENTRETIEN__EN_COURS:
				return isEnCours();
			case MutPackage.ENTRETIEN__FAKE:
				return isFake();
			case MutPackage.ENTRETIEN__SCAN:
				return getScan();
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
				return getAppreciationsSessionFormation();
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
				return getSouhaitsFormationSalarie();
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
				return getSouhaitsFormationEvaluateur();
			case MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES:
				return getAutresActionsDeveloppementCompetences();
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
				return getPhotoEmploye();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MutPackage.ENTRETIEN__DATE:
				setDate((Date)newValue);
				return;
			case MutPackage.ENTRETIEN__MENEUR:
				setMeneur((Employe)newValue);
				return;
			case MutPackage.ENTRETIEN__EN_COURS:
				setEnCours((Boolean)newValue);
				return;
			case MutPackage.ENTRETIEN__FAKE:
				setFake((Boolean)newValue);
				return;
			case MutPackage.ENTRETIEN__SCAN:
				setScan((byte[])newValue);
				return;
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
				getAppreciationsSessionFormation().clear();
				getAppreciationsSessionFormation().addAll((Collection<? extends AppreciationSessionFormation>)newValue);
				return;
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
				getSouhaitsFormationSalarie().clear();
				getSouhaitsFormationSalarie().addAll((Collection<? extends SouhaitFormationSalarie>)newValue);
				return;
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
				getSouhaitsFormationEvaluateur().clear();
				getSouhaitsFormationEvaluateur().addAll((Collection<? extends SouhaitFormationEvaluateur>)newValue);
				return;
			case MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES:
				setAutresActionsDeveloppementCompetences((String)newValue);
				return;
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
				setPhotoEmploye((PhotoEmploye)newValue);
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
			case MutPackage.ENTRETIEN__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN__MENEUR:
				setMeneur((Employe)null);
				return;
			case MutPackage.ENTRETIEN__EN_COURS:
				setEnCours(EN_COURS_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN__FAKE:
				setFake(FAKE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN__SCAN:
				setScan(SCAN_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
				getAppreciationsSessionFormation().clear();
				return;
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
				getSouhaitsFormationSalarie().clear();
				return;
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
				getSouhaitsFormationEvaluateur().clear();
				return;
			case MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES:
				setAutresActionsDeveloppementCompetences(AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
				setPhotoEmploye((PhotoEmploye)null);
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
			case MutPackage.ENTRETIEN__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case MutPackage.ENTRETIEN__MENEUR:
				return basicGetMeneur() != null;
			case MutPackage.ENTRETIEN__EN_COURS:
				return isEnCours() != EN_COURS_EDEFAULT;
			case MutPackage.ENTRETIEN__FAKE:
				return isFake() != FAKE_EDEFAULT;
			case MutPackage.ENTRETIEN__SCAN:
				return SCAN_EDEFAULT == null ? getScan() != null : !SCAN_EDEFAULT.equals(getScan());
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
				return !getAppreciationsSessionFormation().isEmpty();
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
				return !getSouhaitsFormationSalarie().isEmpty();
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
				return !getSouhaitsFormationEvaluateur().isEmpty();
			case MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES:
				return AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES_EDEFAULT == null ? getAutresActionsDeveloppementCompetences() != null : !AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES_EDEFAULT.equals(getAutresActionsDeveloppementCompetences());
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
				return getPhotoEmploye() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MutPackage.ENTRETIEN___EMPLOYE:
				return employe();
			case MutPackage.ENTRETIEN___HAS_VALID_MENEUR__DIAGNOSTICCHAIN_MAP:
				return hasValidMeneur((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // EntretienImpl
