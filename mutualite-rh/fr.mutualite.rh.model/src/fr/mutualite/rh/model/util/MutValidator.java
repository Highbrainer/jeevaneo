/**
 */
package fr.mutualite.rh.model.util;

import fr.mutualite.rh.model.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage
 * @generated
 */
public class MutValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MutValidator INSTANCE = new MutValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.mutualite.rh.model";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Affectation Emploi Courante' of 'Employe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYE__HAS_VALID_AFFECTATION_EMPLOI_COURANTE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One And Only One Affectation Emploi Courante' of 'Employe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYE__HAS_ONE_AND_ONLY_ONE_AFFECTATION_EMPLOI_COURANTE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has One And Only One Affectation Classification Courante' of 'Employe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYE__HAS_ONE_AND_ONLY_ONE_AFFECTATION_CLASSIFICATION_COURANTE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Affectation Classification Courante' of 'Employe'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EMPLOYE__HAS_VALID_AFFECTATION_CLASSIFICATION_COURANTE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Meneur' of 'Entretien'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRETIEN__HAS_VALID_MENEUR = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Has Valid Synthese' of 'Entretien Professionnel'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENTRETIEN_PROFESSIONNEL__HAS_VALID_SYNTHESE = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 6;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MutPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MutPackage.EMPLOYE:
				return validateEmploye((Employe)value, diagnostics, context);
			case MutPackage.AFFECTATION:
				return validateAffectation((Affectation)value, diagnostics, context);
			case MutPackage.EMPLOI:
				return validateEmploi((Emploi)value, diagnostics, context);
			case MutPackage.AFFECTATION_CLASSIFICATION:
				return validateAffectationClassification((AffectationClassification)value, diagnostics, context);
			case MutPackage.FORMATION:
				return validateFormation((Formation)value, diagnostics, context);
			case MutPackage.ORGANISME_FORMATION:
				return validateOrganismeFormation((OrganismeFormation)value, diagnostics, context);
			case MutPackage.SESSION_FORMATION:
				return validateSessionFormation((SessionFormation)value, diagnostics, context);
			case MutPackage.ENTRETIEN:
				return validateEntretien((Entretien)value, diagnostics, context);
			case MutPackage.ENTRETIEN_PROFESSIONNEL:
				return validateEntretienProfessionnel((EntretienProfessionnel)value, diagnostics, context);
			case MutPackage.APPRECIATION_SESSION_FORMATION:
				return validateAppreciationSessionFormation((AppreciationSessionFormation)value, diagnostics, context);
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR:
				return validateSouhaitFormationEvaluateur((SouhaitFormationEvaluateur)value, diagnostics, context);
			case MutPackage.SOUHAIT_FORMATION_SALARIE:
				return validateSouhaitFormationSalarie((SouhaitFormationSalarie)value, diagnostics, context);
			case MutPackage.MUTUALITE:
				return validateMutualite((Mutualite)value, diagnostics, context);
			case MutPackage.ETABLISSEMENTS:
				return validateEtablissements((Etablissements)value, diagnostics, context);
			case MutPackage.EMPLOIS:
				return validateEmplois((Emplois)value, diagnostics, context);
			case MutPackage.EFFECTIF:
				return validateEffectif((Effectif)value, diagnostics, context);
			case MutPackage.ORGANISMES:
				return validateOrganismes((Organismes)value, diagnostics, context);
			case MutPackage.ETABLISSEMENT:
				return validateEtablissement((Etablissement)value, diagnostics, context);
			case MutPackage.UTILISATEUR:
				return validateUtilisateur((Utilisateur)value, diagnostics, context);
			case MutPackage.UTILISATEURS:
				return validateUtilisateurs((Utilisateurs)value, diagnostics, context);
			case MutPackage.ENTRETIEN_ANNUEL:
				return validateEntretienAnnuel((EntretienAnnuel)value, diagnostics, context);
			case MutPackage.EVALUATION_TENUE_POSTE:
				return validateEvaluationTenuePoste((EvaluationTenuePoste)value, diagnostics, context);
			case MutPackage.EVALUATION_COMPETENCE:
				return validateEvaluationCompetence((EvaluationCompetence)value, diagnostics, context);
			case MutPackage.EVALUATION_SAVOIR_ETRE:
				return validateEvaluationSavoirEtre((EvaluationSavoirEtre)value, diagnostics, context);
			case MutPackage.OBJECTIF:
				return validateObjectif((Objectif)value, diagnostics, context);
			case MutPackage.OBJECTIF_PRECEDENT:
				return validateObjectifPrecedent((ObjectifPrecedent)value, diagnostics, context);
			case MutPackage.PHOTO_EMPLOYE:
				return validatePhotoEmploye((PhotoEmploye)value, diagnostics, context);
			case MutPackage.CLASSIFICATION_STATUT:
				return validateClassificationStatut((ClassificationStatut)value, diagnostics, context);
			case MutPackage.APPRECIATION:
				return validateAppreciation((Appreciation)value, diagnostics, context);
			case MutPackage.AVIS:
				return validateAvis((Avis)value, diagnostics, context);
			case MutPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case MutPackage.EVALUATION:
				return validateEvaluation((Evaluation)value, diagnostics, context);
			case MutPackage.EVOLUTION:
				return validateEvolution((Evolution)value, diagnostics, context);
			case MutPackage.COMPETENCE:
				return validateCompetence((Competence)value, diagnostics, context);
			case MutPackage.SAVOIR_ETRE:
				return validateSavoirEtre((SavoirEtre)value, diagnostics, context);
			case MutPackage.EVALUATION_ATTEINTE_OBJECTIF:
				return validateEvaluationAtteinteObjectif((EvaluationAtteinteObjectif)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtablissement(Etablissement etablissement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)etablissement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUtilisateur(Utilisateur utilisateur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)utilisateur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUtilisateurs(Utilisateurs utilisateurs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)utilisateurs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntretienAnnuel(EntretienAnnuel entretienAnnuel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)entretienAnnuel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)entretienAnnuel, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntretien_hasValidMeneur(entretienAnnuel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationTenuePoste(EvaluationTenuePoste evaluationTenuePoste, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)evaluationTenuePoste, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationCompetence(EvaluationCompetence evaluationCompetence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)evaluationCompetence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationSavoirEtre(EvaluationSavoirEtre evaluationSavoirEtre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)evaluationSavoirEtre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectif(Objectif objectif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)objectif, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectifPrecedent(ObjectifPrecedent objectifPrecedent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)objectifPrecedent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhotoEmploye(PhotoEmploye photoEmploye, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)photoEmploye, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)employe, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)employe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmploye_hasValidAffectationEmploiCourante(employe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmploye_hasOneAndOnlyOneAffectationEmploiCourante(employe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmploye_hasOneAndOnlyOneAffectationClassificationCourante(employe, diagnostics, context);
		if (result || diagnostics != null) result &= validateEmploye_hasValidAffectationClassificationCourante(employe, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidAffectationEmploiCourante constraint of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye_hasValidAffectationEmploiCourante(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employe.hasValidAffectationEmploiCourante(diagnostics, context);
	}

	/**
	 * Validates the hasOneAndOnlyOneAffectationEmploiCourante constraint of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye_hasOneAndOnlyOneAffectationEmploiCourante(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employe.hasOneAndOnlyOneAffectationEmploiCourante(diagnostics, context);
	}

	/**
	 * Validates the hasOneAndOnlyOneAffectationClassificationCourante constraint of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye_hasOneAndOnlyOneAffectationClassificationCourante(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employe.hasOneAndOnlyOneAffectationClassificationCourante(diagnostics, context);
	}

	/**
	 * Validates the hasValidAffectationClassificationCourante constraint of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploye_hasValidAffectationClassificationCourante(Employe employe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return employe.hasValidAffectationClassificationCourante(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectation(Affectation affectation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)affectation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmploi(Emploi emploi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)emploi, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectationClassification(AffectationClassification affectationClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)affectationClassification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)formation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganismeFormation(OrganismeFormation organismeFormation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)organismeFormation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSessionFormation(SessionFormation sessionFormation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)sessionFormation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntretien(Entretien entretien, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)entretien, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)entretien, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntretien_hasValidMeneur(entretien, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidMeneur constraint of '<em>Entretien</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntretien_hasValidMeneur(Entretien entretien, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entretien.hasValidMeneur(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntretienProfessionnel(EntretienProfessionnel entretienProfessionnel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)entretienProfessionnel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntretien_hasValidMeneur(entretienProfessionnel, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntretienProfessionnel_hasValidSynthese(entretienProfessionnel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the hasValidSynthese constraint of '<em>Entretien Professionnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntretienProfessionnel_hasValidSynthese(EntretienProfessionnel entretienProfessionnel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return entretienProfessionnel.hasValidSynthese(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppreciationSessionFormation(AppreciationSessionFormation appreciationSessionFormation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)appreciationSessionFormation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSouhaitFormationEvaluateur(SouhaitFormationEvaluateur souhaitFormationEvaluateur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)souhaitFormationEvaluateur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSouhaitFormationSalarie(SouhaitFormationSalarie souhaitFormationSalarie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)souhaitFormationSalarie, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMutualite(Mutualite mutualite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)mutualite, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtablissements(Etablissements etablissements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)etablissements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmplois(Emplois emplois, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)emplois, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffectif(Effectif effectif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)effectif, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganismes(Organismes organismes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)organismes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationStatut(ClassificationStatut classificationStatut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppreciation(Appreciation appreciation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvis(Avis avis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluation(Evaluation evaluation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvolution(Evolution evolution, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompetence(Competence competence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSavoirEtre(SavoirEtre savoirEtre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationAtteinteObjectif(EvaluationAtteinteObjectif evaluationAtteinteObjectif, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //MutValidator
