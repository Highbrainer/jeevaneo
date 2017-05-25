/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.util.MutValidator;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entretien Professionnel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionDepuisDernierEntretien <em>Evolution Depuis Dernier Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionSouhaiteeDansEmploiActuel <em>Evolution Souhaitee Dans Emploi Actuel</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionSouhaiteeDansNouvelEmploi <em>Evolution Souhaitee Dans Nouvel Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEcheance <em>Echeance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionSouhaiteeCompetencesAcquises <em>Evolution Souhaitee Competences Acquises</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionSouhaiteeCompetencesRequises <em>Evolution Souhaitee Competences Requises</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getEvolutionSouhaiteeMoyensRealisation <em>Evolution Souhaitee Moyens Realisation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getPerspectivesEvolutionProfessionnelle <em>Perspectives Evolution Professionnelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getPerspectivesEvolutionProfessionnelleCompetencesAssociees <em>Perspectives Evolution Professionnelle Competences Associees</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#isAdequationProjetProBesoinsEntreprise <em>Adequation Projet Pro Besoins Entreprise</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getAdequationProjetProBesoinsEntrepriseCommentaire <em>Adequation Projet Pro Besoins Entreprise Commentaire</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#isRencontreRh <em>Rencontre Rh</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getRencontreRhCommentaire <em>Rencontre Rh Commentaire</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienProfessionnelImpl#getSynthese <em>Synthese</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntretienProfessionnelImpl extends EntretienImpl implements EntretienProfessionnel {
	/**
	 * The default value of the '{@link #getEvolutionDepuisDernierEntretien() <em>Evolution Depuis Dernier Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionDepuisDernierEntretien()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_DEPUIS_DERNIER_ENTRETIEN_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEvolutionSouhaiteeDansEmploiActuel() <em>Evolution Souhaitee Dans Emploi Actuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionSouhaiteeDansEmploiActuel()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEvolutionSouhaiteeDansNouvelEmploi() <em>Evolution Souhaitee Dans Nouvel Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionSouhaiteeDansNouvelEmploi()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEcheance() <em>Echeance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcheance()
	 * @generated
	 * @ordered
	 */
	protected static final String ECHEANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEvolutionSouhaiteeCompetencesAcquises() <em>Evolution Souhaitee Competences Acquises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionSouhaiteeCompetencesAcquises()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEvolutionSouhaiteeCompetencesRequises() <em>Evolution Souhaitee Competences Requises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionSouhaiteeCompetencesRequises()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEvolutionSouhaiteeMoyensRealisation() <em>Evolution Souhaitee Moyens Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolutionSouhaiteeMoyensRealisation()
	 * @generated
	 * @ordered
	 */
	protected static final String EVOLUTION_SOUHAITEE_MOYENS_REALISATION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPerspectivesEvolutionProfessionnelle() <em>Perspectives Evolution Professionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectivesEvolutionProfessionnelle()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPerspectivesEvolutionProfessionnelleCompetencesAssociees() <em>Perspectives Evolution Professionnelle Competences Associees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectivesEvolutionProfessionnelleCompetencesAssociees()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isAdequationProjetProBesoinsEntreprise() <em>Adequation Projet Pro Besoins Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdequationProjetProBesoinsEntreprise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_EDEFAULT = true;
	/**
	 * The default value of the '{@link #getAdequationProjetProBesoinsEntrepriseCommentaire() <em>Adequation Projet Pro Besoins Entreprise Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdequationProjetProBesoinsEntrepriseCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isRencontreRh() <em>Rencontre Rh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRencontreRh()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RENCONTRE_RH_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getRencontreRhCommentaire() <em>Rencontre Rh Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRencontreRhCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String RENCONTRE_RH_COMMENTAIRE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSynthese() <em>Synthese</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynthese()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESE_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntretienProfessionnelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.ENTRETIEN_PROFESSIONNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionDepuisDernierEntretien() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionDepuisDernierEntretien(String newEvolutionDepuisDernierEntretien) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN, newEvolutionDepuisDernierEntretien);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionSouhaiteeDansEmploiActuel() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionSouhaiteeDansEmploiActuel(String newEvolutionSouhaiteeDansEmploiActuel) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL, newEvolutionSouhaiteeDansEmploiActuel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionSouhaiteeDansNouvelEmploi() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionSouhaiteeDansNouvelEmploi(String newEvolutionSouhaiteeDansNouvelEmploi) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI, newEvolutionSouhaiteeDansNouvelEmploi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEcheance() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ECHEANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcheance(String newEcheance) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ECHEANCE, newEcheance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionSouhaiteeCompetencesAcquises() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionSouhaiteeCompetencesAcquises(String newEvolutionSouhaiteeCompetencesAcquises) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES, newEvolutionSouhaiteeCompetencesAcquises);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionSouhaiteeCompetencesRequises() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionSouhaiteeCompetencesRequises(String newEvolutionSouhaiteeCompetencesRequises) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES, newEvolutionSouhaiteeCompetencesRequises);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvolutionSouhaiteeMoyensRealisation() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolutionSouhaiteeMoyensRealisation(String newEvolutionSouhaiteeMoyensRealisation) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION, newEvolutionSouhaiteeMoyensRealisation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectivesEvolutionProfessionnelle() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectivesEvolutionProfessionnelle(String newPerspectivesEvolutionProfessionnelle) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE, newPerspectivesEvolutionProfessionnelle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectivesEvolutionProfessionnelleCompetencesAssociees() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectivesEvolutionProfessionnelleCompetencesAssociees(String newPerspectivesEvolutionProfessionnelleCompetencesAssociees) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES, newPerspectivesEvolutionProfessionnelleCompetencesAssociees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdequationProjetProBesoinsEntreprise() {
		return (Boolean)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdequationProjetProBesoinsEntreprise(boolean newAdequationProjetProBesoinsEntreprise) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE, newAdequationProjetProBesoinsEntreprise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdequationProjetProBesoinsEntrepriseCommentaire() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdequationProjetProBesoinsEntrepriseCommentaire(String newAdequationProjetProBesoinsEntrepriseCommentaire) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE, newAdequationProjetProBesoinsEntrepriseCommentaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRencontreRh() {
		return (Boolean)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRencontreRh(boolean newRencontreRh) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH, newRencontreRh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRencontreRhCommentaire() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRencontreRhCommentaire(String newRencontreRhCommentaire) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE, newRencontreRhCommentaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSynthese() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__SYNTHESE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynthese(String newSynthese) {
		eDynamicSet(MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE, MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__SYNTHESE, newSynthese);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasValidSynthese(DiagnosticChain chain, Map<Object, Object> context) {
		if(isFake()) {
			return true;
		}
		if (getSynthese()==null || getSynthese().trim().isEmpty()) {
			if (chain != null) {
				chain.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MutValidator.DIAGNOSTIC_SOURCE,
						 MutValidator.ENTRETIEN_PROFESSIONNEL__HAS_VALID_SYNTHESE,
						 "Champ 'Synthèse' manquant",
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN:
				return getEvolutionDepuisDernierEntretien();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL:
				return getEvolutionSouhaiteeDansEmploiActuel();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI:
				return getEvolutionSouhaiteeDansNouvelEmploi();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE:
				return getEcheance();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES:
				return getEvolutionSouhaiteeCompetencesAcquises();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES:
				return getEvolutionSouhaiteeCompetencesRequises();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION:
				return getEvolutionSouhaiteeMoyensRealisation();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE:
				return getPerspectivesEvolutionProfessionnelle();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES:
				return getPerspectivesEvolutionProfessionnelleCompetencesAssociees();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE:
				return isAdequationProjetProBesoinsEntreprise();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE:
				return getAdequationProjetProBesoinsEntrepriseCommentaire();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH:
				return isRencontreRh();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE:
				return getRencontreRhCommentaire();
			case MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE:
				return getSynthese();
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
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN:
				setEvolutionDepuisDernierEntretien((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL:
				setEvolutionSouhaiteeDansEmploiActuel((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI:
				setEvolutionSouhaiteeDansNouvelEmploi((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE:
				setEcheance((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES:
				setEvolutionSouhaiteeCompetencesAcquises((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES:
				setEvolutionSouhaiteeCompetencesRequises((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION:
				setEvolutionSouhaiteeMoyensRealisation((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE:
				setPerspectivesEvolutionProfessionnelle((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES:
				setPerspectivesEvolutionProfessionnelleCompetencesAssociees((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE:
				setAdequationProjetProBesoinsEntreprise((Boolean)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE:
				setAdequationProjetProBesoinsEntrepriseCommentaire((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH:
				setRencontreRh((Boolean)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE:
				setRencontreRhCommentaire((String)newValue);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE:
				setSynthese((String)newValue);
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
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN:
				setEvolutionDepuisDernierEntretien(EVOLUTION_DEPUIS_DERNIER_ENTRETIEN_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL:
				setEvolutionSouhaiteeDansEmploiActuel(EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI:
				setEvolutionSouhaiteeDansNouvelEmploi(EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE:
				setEcheance(ECHEANCE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES:
				setEvolutionSouhaiteeCompetencesAcquises(EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES:
				setEvolutionSouhaiteeCompetencesRequises(EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION:
				setEvolutionSouhaiteeMoyensRealisation(EVOLUTION_SOUHAITEE_MOYENS_REALISATION_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE:
				setPerspectivesEvolutionProfessionnelle(PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES:
				setPerspectivesEvolutionProfessionnelleCompetencesAssociees(PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE:
				setAdequationProjetProBesoinsEntreprise(ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE:
				setAdequationProjetProBesoinsEntrepriseCommentaire(ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH:
				setRencontreRh(RENCONTRE_RH_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE:
				setRencontreRhCommentaire(RENCONTRE_RH_COMMENTAIRE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE:
				setSynthese(SYNTHESE_EDEFAULT);
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
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN:
				return EVOLUTION_DEPUIS_DERNIER_ENTRETIEN_EDEFAULT == null ? getEvolutionDepuisDernierEntretien() != null : !EVOLUTION_DEPUIS_DERNIER_ENTRETIEN_EDEFAULT.equals(getEvolutionDepuisDernierEntretien());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL:
				return EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL_EDEFAULT == null ? getEvolutionSouhaiteeDansEmploiActuel() != null : !EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL_EDEFAULT.equals(getEvolutionSouhaiteeDansEmploiActuel());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI:
				return EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI_EDEFAULT == null ? getEvolutionSouhaiteeDansNouvelEmploi() != null : !EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI_EDEFAULT.equals(getEvolutionSouhaiteeDansNouvelEmploi());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE:
				return ECHEANCE_EDEFAULT == null ? getEcheance() != null : !ECHEANCE_EDEFAULT.equals(getEcheance());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES:
				return EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES_EDEFAULT == null ? getEvolutionSouhaiteeCompetencesAcquises() != null : !EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES_EDEFAULT.equals(getEvolutionSouhaiteeCompetencesAcquises());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES:
				return EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES_EDEFAULT == null ? getEvolutionSouhaiteeCompetencesRequises() != null : !EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES_EDEFAULT.equals(getEvolutionSouhaiteeCompetencesRequises());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION:
				return EVOLUTION_SOUHAITEE_MOYENS_REALISATION_EDEFAULT == null ? getEvolutionSouhaiteeMoyensRealisation() != null : !EVOLUTION_SOUHAITEE_MOYENS_REALISATION_EDEFAULT.equals(getEvolutionSouhaiteeMoyensRealisation());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE:
				return PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_EDEFAULT == null ? getPerspectivesEvolutionProfessionnelle() != null : !PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_EDEFAULT.equals(getPerspectivesEvolutionProfessionnelle());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES:
				return PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES_EDEFAULT == null ? getPerspectivesEvolutionProfessionnelleCompetencesAssociees() != null : !PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES_EDEFAULT.equals(getPerspectivesEvolutionProfessionnelleCompetencesAssociees());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE:
				return isAdequationProjetProBesoinsEntreprise() != ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_EDEFAULT;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE:
				return ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE_EDEFAULT == null ? getAdequationProjetProBesoinsEntrepriseCommentaire() != null : !ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE_EDEFAULT.equals(getAdequationProjetProBesoinsEntrepriseCommentaire());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH:
				return isRencontreRh() != RENCONTRE_RH_EDEFAULT;
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE:
				return RENCONTRE_RH_COMMENTAIRE_EDEFAULT == null ? getRencontreRhCommentaire() != null : !RENCONTRE_RH_COMMENTAIRE_EDEFAULT.equals(getRencontreRhCommentaire());
			case MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE:
				return SYNTHESE_EDEFAULT == null ? getSynthese() != null : !SYNTHESE_EDEFAULT.equals(getSynthese());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MutPackage.ENTRETIEN_PROFESSIONNEL___HAS_VALID_SYNTHESE__DIAGNOSTICCHAIN_MAP:
				return hasValidSynthese((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntretienProfessionnelImpl
