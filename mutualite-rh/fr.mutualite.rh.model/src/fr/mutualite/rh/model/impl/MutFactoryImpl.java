/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutFactoryImpl extends EFactoryImpl implements MutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MutFactory init() {
		try {
			MutFactory theMutFactory = (MutFactory)EPackage.Registry.INSTANCE.getEFactory(MutPackage.eNS_URI);
			if (theMutFactory != null) {
				return theMutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MutPackage.EMPLOYE: return (EObject)createEmploye();
			case MutPackage.AFFECTATION: return (EObject)createAffectation();
			case MutPackage.EMPLOI: return (EObject)createEmploi();
			case MutPackage.AFFECTATION_CLASSIFICATION: return (EObject)createAffectationClassification();
			case MutPackage.FORMATION: return (EObject)createFormation();
			case MutPackage.ORGANISME_FORMATION: return (EObject)createOrganismeFormation();
			case MutPackage.SESSION_FORMATION: return (EObject)createSessionFormation();
			case MutPackage.ENTRETIEN_PROFESSIONNEL: return (EObject)createEntretienProfessionnel();
			case MutPackage.APPRECIATION_SESSION_FORMATION: return (EObject)createAppreciationSessionFormation();
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR: return (EObject)createSouhaitFormationEvaluateur();
			case MutPackage.SOUHAIT_FORMATION_SALARIE: return (EObject)createSouhaitFormationSalarie();
			case MutPackage.MUTUALITE: return (EObject)createMutualite();
			case MutPackage.ETABLISSEMENTS: return (EObject)createEtablissements();
			case MutPackage.EMPLOIS: return (EObject)createEmplois();
			case MutPackage.EFFECTIF: return (EObject)createEffectif();
			case MutPackage.ORGANISMES: return (EObject)createOrganismes();
			case MutPackage.ETABLISSEMENT: return (EObject)createEtablissement();
			case MutPackage.UTILISATEUR: return (EObject)createUtilisateur();
			case MutPackage.UTILISATEURS: return (EObject)createUtilisateurs();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MutPackage.CLASSIFICATION_STATUT:
				return createClassificationStatutFromString(eDataType, initialValue);
			case MutPackage.APPRECIATION:
				return createAppreciationFromString(eDataType, initialValue);
			case MutPackage.AVIS:
				return createAvisFromString(eDataType, initialValue);
			case MutPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MutPackage.CLASSIFICATION_STATUT:
				return convertClassificationStatutToString(eDataType, instanceValue);
			case MutPackage.APPRECIATION:
				return convertAppreciationToString(eDataType, instanceValue);
			case MutPackage.AVIS:
				return convertAvisToString(eDataType, instanceValue);
			case MutPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etablissement createEtablissement() {
		EtablissementImpl etablissement = new EtablissementImpl();
		return etablissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur createUtilisateur() {
		UtilisateurImpl utilisateur = new UtilisateurImpl();
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateurs createUtilisateurs() {
		UtilisateursImpl utilisateurs = new UtilisateursImpl();
		return utilisateurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employe createEmploye() {
		EmployeImpl employe = new EmployeImpl();
		return employe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Affectation createAffectation() {
		AffectationImpl affectation = new AffectationImpl();
		return affectation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emploi createEmploi() {
		EmploiImpl emploi = new EmploiImpl();
		return emploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffectationClassification createAffectationClassification() {
		AffectationClassificationImpl affectationClassification = new AffectationClassificationImpl();
		return affectationClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation createFormation() {
		FormationImpl formation = new FormationImpl();
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganismeFormation createOrganismeFormation() {
		OrganismeFormationImpl organismeFormation = new OrganismeFormationImpl();
		return organismeFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionFormation createSessionFormation() {
		SessionFormationImpl sessionFormation = new SessionFormationImpl();
		return sessionFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntretienProfessionnel createEntretienProfessionnel() {
		EntretienProfessionnelImpl entretienProfessionnel = new EntretienProfessionnelImpl();
		return entretienProfessionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppreciationSessionFormation createAppreciationSessionFormation() {
		AppreciationSessionFormationImpl appreciationSessionFormation = new AppreciationSessionFormationImpl();
		return appreciationSessionFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SouhaitFormationEvaluateur createSouhaitFormationEvaluateur() {
		SouhaitFormationEvaluateurImpl souhaitFormationEvaluateur = new SouhaitFormationEvaluateurImpl();
		return souhaitFormationEvaluateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SouhaitFormationSalarie createSouhaitFormationSalarie() {
		SouhaitFormationSalarieImpl souhaitFormationSalarie = new SouhaitFormationSalarieImpl();
		return souhaitFormationSalarie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mutualite createMutualite() {
		MutualiteImpl mutualite = new MutualiteImpl();
		return mutualite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Etablissements createEtablissements() {
		EtablissementsImpl etablissements = new EtablissementsImpl();
		return etablissements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emplois createEmplois() {
		EmploisImpl emplois = new EmploisImpl();
		return emplois;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Effectif createEffectif() {
		EffectifImpl effectif = new EffectifImpl();
		return effectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organismes createOrganismes() {
		OrganismesImpl organismes = new OrganismesImpl();
		return organismes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationStatut createClassificationStatutFromString(EDataType eDataType, String initialValue) {
		String val = initialValue.replaceAll("_", " ");
		ClassificationStatut result = ClassificationStatut.get(val);
		if (result == null) throw new IllegalArgumentException("The value '" + val + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationStatutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appreciation createAppreciationFromString(EDataType eDataType, String initialValue) {
		Appreciation result = Appreciation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppreciationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avis createAvisFromString(EDataType eDataType, String initialValue) {
		Avis result = Avis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutPackage getMutPackage() {
		return (MutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MutPackage getPackage() {
		return MutPackage.eINSTANCE;
	}

} //MutFactoryImpl
