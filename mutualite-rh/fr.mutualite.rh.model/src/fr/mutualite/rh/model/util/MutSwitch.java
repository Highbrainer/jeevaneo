/**
 */
package fr.mutualite.rh.model.util;

import fr.mutualite.rh.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage
 * @generated
 */
public class MutSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MutPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutSwitch() {
		if (modelPackage == null) {
			modelPackage = MutPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MutPackage.EMPLOYE: {
				Employe employe = (Employe)theEObject;
				T result = caseEmploye(employe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.AFFECTATION: {
				Affectation affectation = (Affectation)theEObject;
				T result = caseAffectation(affectation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EMPLOI: {
				Emploi emploi = (Emploi)theEObject;
				T result = caseEmploi(emploi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.AFFECTATION_CLASSIFICATION: {
				AffectationClassification affectationClassification = (AffectationClassification)theEObject;
				T result = caseAffectationClassification(affectationClassification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.FORMATION: {
				Formation formation = (Formation)theEObject;
				T result = caseFormation(formation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ORGANISME_FORMATION: {
				OrganismeFormation organismeFormation = (OrganismeFormation)theEObject;
				T result = caseOrganismeFormation(organismeFormation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.SESSION_FORMATION: {
				SessionFormation sessionFormation = (SessionFormation)theEObject;
				T result = caseSessionFormation(sessionFormation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ENTRETIEN: {
				Entretien entretien = (Entretien)theEObject;
				T result = caseEntretien(entretien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ENTRETIEN_PROFESSIONNEL: {
				EntretienProfessionnel entretienProfessionnel = (EntretienProfessionnel)theEObject;
				T result = caseEntretienProfessionnel(entretienProfessionnel);
				if (result == null) result = caseEntretien(entretienProfessionnel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.APPRECIATION_SESSION_FORMATION: {
				AppreciationSessionFormation appreciationSessionFormation = (AppreciationSessionFormation)theEObject;
				T result = caseAppreciationSessionFormation(appreciationSessionFormation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.SOUHAIT_FORMATION_EVALUATEUR: {
				SouhaitFormationEvaluateur souhaitFormationEvaluateur = (SouhaitFormationEvaluateur)theEObject;
				T result = caseSouhaitFormationEvaluateur(souhaitFormationEvaluateur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.SOUHAIT_FORMATION_SALARIE: {
				SouhaitFormationSalarie souhaitFormationSalarie = (SouhaitFormationSalarie)theEObject;
				T result = caseSouhaitFormationSalarie(souhaitFormationSalarie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.MUTUALITE: {
				Mutualite mutualite = (Mutualite)theEObject;
				T result = caseMutualite(mutualite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ETABLISSEMENTS: {
				Etablissements etablissements = (Etablissements)theEObject;
				T result = caseEtablissements(etablissements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EMPLOIS: {
				Emplois emplois = (Emplois)theEObject;
				T result = caseEmplois(emplois);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EFFECTIF: {
				Effectif effectif = (Effectif)theEObject;
				T result = caseEffectif(effectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ORGANISMES: {
				Organismes organismes = (Organismes)theEObject;
				T result = caseOrganismes(organismes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ETABLISSEMENT: {
				Etablissement etablissement = (Etablissement)theEObject;
				T result = caseEtablissement(etablissement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.UTILISATEUR: {
				Utilisateur utilisateur = (Utilisateur)theEObject;
				T result = caseUtilisateur(utilisateur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.UTILISATEURS: {
				Utilisateurs utilisateurs = (Utilisateurs)theEObject;
				T result = caseUtilisateurs(utilisateurs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.ENTRETIEN_ANNUEL: {
				EntretienAnnuel entretienAnnuel = (EntretienAnnuel)theEObject;
				T result = caseEntretienAnnuel(entretienAnnuel);
				if (result == null) result = caseEntretien(entretienAnnuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EVALUATION_TENUE_POSTE: {
				EvaluationTenuePoste evaluationTenuePoste = (EvaluationTenuePoste)theEObject;
				T result = caseEvaluationTenuePoste(evaluationTenuePoste);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EVALUATION_COMPETENCE: {
				EvaluationCompetence evaluationCompetence = (EvaluationCompetence)theEObject;
				T result = caseEvaluationCompetence(evaluationCompetence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.EVALUATION_SAVOIR_ETRE: {
				EvaluationSavoirEtre evaluationSavoirEtre = (EvaluationSavoirEtre)theEObject;
				T result = caseEvaluationSavoirEtre(evaluationSavoirEtre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.OBJECTIF: {
				Objectif objectif = (Objectif)theEObject;
				T result = caseObjectif(objectif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.OBJECTIF_PRECEDENT: {
				ObjectifPrecedent objectifPrecedent = (ObjectifPrecedent)theEObject;
				T result = caseObjectifPrecedent(objectifPrecedent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MutPackage.PHOTO_EMPLOYE: {
				PhotoEmploye photoEmploye = (PhotoEmploye)theEObject;
				T result = casePhotoEmploye(photoEmploye);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etablissement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etablissement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtablissement(Etablissement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilisateur(Utilisateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilisateurs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilisateurs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilisateurs(Utilisateurs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entretien Annuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entretien Annuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntretienAnnuel(EntretienAnnuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Tenue Poste</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Tenue Poste</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationTenuePoste(EvaluationTenuePoste object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Competence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Competence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationCompetence(EvaluationCompetence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluation Savoir Etre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluation Savoir Etre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluationSavoirEtre(EvaluationSavoirEtre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectif(Objectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectif Precedent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectif Precedent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifPrecedent(ObjectifPrecedent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photo Employe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photo Employe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotoEmploye(PhotoEmploye object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmploye(Employe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectation(Affectation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emploi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmploi(Emploi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affectation Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affectation Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectationClassification(AffectationClassification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormation(Formation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisme Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisme Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganismeFormation(OrganismeFormation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionFormation(SessionFormation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entretien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entretien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntretien(Entretien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entretien Professionnel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entretien Professionnel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntretienProfessionnel(EntretienProfessionnel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appreciation Session Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appreciation Session Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppreciationSessionFormation(AppreciationSessionFormation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Souhait Formation Evaluateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Souhait Formation Evaluateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSouhaitFormationEvaluateur(SouhaitFormationEvaluateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Souhait Formation Salarie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Souhait Formation Salarie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSouhaitFormationSalarie(SouhaitFormationSalarie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mutualite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mutualite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMutualite(Mutualite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etablissements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etablissements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtablissements(Etablissements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emplois</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emplois</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmplois(Emplois object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Effectif</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Effectif</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEffectif(Effectif object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organismes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organismes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganismes(Organismes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MutSwitch
