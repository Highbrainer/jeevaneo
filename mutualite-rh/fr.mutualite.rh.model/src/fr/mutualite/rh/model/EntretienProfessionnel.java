/**
 */
package fr.mutualite.rh.model;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entretien Professionnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionDepuisDernierEntretien <em>Evolution Depuis Dernier Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getCommentaireBilanFormation <em>Commentaire Bilan Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansEmploiActuel <em>Evolution Souhaitee Dans Emploi Actuel</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansNouvelEmploi <em>Evolution Souhaitee Dans Nouvel Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEcheance <em>Echeance</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesAcquises <em>Evolution Souhaitee Competences Acquises</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesRequises <em>Evolution Souhaitee Competences Requises</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeMoyensRealisation <em>Evolution Souhaitee Moyens Realisation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelle <em>Perspectives Evolution Professionnelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelleCompetencesAssociees <em>Perspectives Evolution Professionnelle Competences Associees</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#isAdequationProjetProBesoinsEntreprise <em>Adequation Projet Pro Besoins Entreprise</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getAdequationProjetProBesoinsEntrepriseCommentaire <em>Adequation Projet Pro Besoins Entreprise Commentaire</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#isRencontreRh <em>Rencontre Rh</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getRencontreRhCommentaire <em>Rencontre Rh Commentaire</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.EntretienProfessionnel#getSynthese <em>Synthese</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel()
 * @model
 * @generated
 */
public interface EntretienProfessionnel extends Entretien {
	/**
	 * Returns the value of the '<em><b>Evolution Depuis Dernier Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Depuis Dernier Entretien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Depuis Dernier Entretien</em>' attribute.
	 * @see #setEvolutionDepuisDernierEntretien(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionDepuisDernierEntretien()
	 * @model
	 * @generated
	 */
	String getEvolutionDepuisDernierEntretien();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionDepuisDernierEntretien <em>Evolution Depuis Dernier Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Depuis Dernier Entretien</em>' attribute.
	 * @see #getEvolutionDepuisDernierEntretien()
	 * @generated
	 */
	void setEvolutionDepuisDernierEntretien(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire Bilan Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Bilan Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Bilan Formation</em>' attribute.
	 * @see #setCommentaireBilanFormation(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_CommentaireBilanFormation()
	 * @model
	 * @generated
	 */
	String getCommentaireBilanFormation();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getCommentaireBilanFormation <em>Commentaire Bilan Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Bilan Formation</em>' attribute.
	 * @see #getCommentaireBilanFormation()
	 * @generated
	 */
	void setCommentaireBilanFormation(String value);

	/**
	 * Returns the value of the '<em><b>Evolution Souhaitee Dans Emploi Actuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Souhaitee Dans Emploi Actuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Souhaitee Dans Emploi Actuel</em>' attribute.
	 * @see #setEvolutionSouhaiteeDansEmploiActuel(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionSouhaiteeDansEmploiActuel()
	 * @model
	 * @generated
	 */
	String getEvolutionSouhaiteeDansEmploiActuel();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansEmploiActuel <em>Evolution Souhaitee Dans Emploi Actuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Souhaitee Dans Emploi Actuel</em>' attribute.
	 * @see #getEvolutionSouhaiteeDansEmploiActuel()
	 * @generated
	 */
	void setEvolutionSouhaiteeDansEmploiActuel(String value);

	/**
	 * Returns the value of the '<em><b>Evolution Souhaitee Dans Nouvel Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Souhaitee Dans Nouvel Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Souhaitee Dans Nouvel Emploi</em>' attribute.
	 * @see #setEvolutionSouhaiteeDansNouvelEmploi(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionSouhaiteeDansNouvelEmploi()
	 * @model
	 * @generated
	 */
	String getEvolutionSouhaiteeDansNouvelEmploi();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeDansNouvelEmploi <em>Evolution Souhaitee Dans Nouvel Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Souhaitee Dans Nouvel Emploi</em>' attribute.
	 * @see #getEvolutionSouhaiteeDansNouvelEmploi()
	 * @generated
	 */
	void setEvolutionSouhaiteeDansNouvelEmploi(String value);

	/**
	 * Returns the value of the '<em><b>Echeance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echeance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echeance</em>' attribute.
	 * @see #setEcheance(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_Echeance()
	 * @model
	 * @generated
	 */
	String getEcheance();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEcheance <em>Echeance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echeance</em>' attribute.
	 * @see #getEcheance()
	 * @generated
	 */
	void setEcheance(String value);

	/**
	 * Returns the value of the '<em><b>Evolution Souhaitee Competences Acquises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Souhaitee Competences Acquises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Souhaitee Competences Acquises</em>' attribute.
	 * @see #setEvolutionSouhaiteeCompetencesAcquises(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionSouhaiteeCompetencesAcquises()
	 * @model
	 * @generated
	 */
	String getEvolutionSouhaiteeCompetencesAcquises();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesAcquises <em>Evolution Souhaitee Competences Acquises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Souhaitee Competences Acquises</em>' attribute.
	 * @see #getEvolutionSouhaiteeCompetencesAcquises()
	 * @generated
	 */
	void setEvolutionSouhaiteeCompetencesAcquises(String value);

	/**
	 * Returns the value of the '<em><b>Evolution Souhaitee Competences Requises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Souhaitee Competences Requises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Souhaitee Competences Requises</em>' attribute.
	 * @see #setEvolutionSouhaiteeCompetencesRequises(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionSouhaiteeCompetencesRequises()
	 * @model
	 * @generated
	 */
	String getEvolutionSouhaiteeCompetencesRequises();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeCompetencesRequises <em>Evolution Souhaitee Competences Requises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Souhaitee Competences Requises</em>' attribute.
	 * @see #getEvolutionSouhaiteeCompetencesRequises()
	 * @generated
	 */
	void setEvolutionSouhaiteeCompetencesRequises(String value);

	/**
	 * Returns the value of the '<em><b>Evolution Souhaitee Moyens Realisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Souhaitee Moyens Realisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Souhaitee Moyens Realisation</em>' attribute.
	 * @see #setEvolutionSouhaiteeMoyensRealisation(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_EvolutionSouhaiteeMoyensRealisation()
	 * @model
	 * @generated
	 */
	String getEvolutionSouhaiteeMoyensRealisation();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getEvolutionSouhaiteeMoyensRealisation <em>Evolution Souhaitee Moyens Realisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Souhaitee Moyens Realisation</em>' attribute.
	 * @see #getEvolutionSouhaiteeMoyensRealisation()
	 * @generated
	 */
	void setEvolutionSouhaiteeMoyensRealisation(String value);

	/**
	 * Returns the value of the '<em><b>Perspectives Evolution Professionnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspectives Evolution Professionnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives Evolution Professionnelle</em>' attribute.
	 * @see #setPerspectivesEvolutionProfessionnelle(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_PerspectivesEvolutionProfessionnelle()
	 * @model
	 * @generated
	 */
	String getPerspectivesEvolutionProfessionnelle();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelle <em>Perspectives Evolution Professionnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspectives Evolution Professionnelle</em>' attribute.
	 * @see #getPerspectivesEvolutionProfessionnelle()
	 * @generated
	 */
	void setPerspectivesEvolutionProfessionnelle(String value);

	/**
	 * Returns the value of the '<em><b>Perspectives Evolution Professionnelle Competences Associees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspectives Evolution Professionnelle Competences Associees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives Evolution Professionnelle Competences Associees</em>' attribute.
	 * @see #setPerspectivesEvolutionProfessionnelleCompetencesAssociees(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_PerspectivesEvolutionProfessionnelleCompetencesAssociees()
	 * @model
	 * @generated
	 */
	String getPerspectivesEvolutionProfessionnelleCompetencesAssociees();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getPerspectivesEvolutionProfessionnelleCompetencesAssociees <em>Perspectives Evolution Professionnelle Competences Associees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspectives Evolution Professionnelle Competences Associees</em>' attribute.
	 * @see #getPerspectivesEvolutionProfessionnelleCompetencesAssociees()
	 * @generated
	 */
	void setPerspectivesEvolutionProfessionnelleCompetencesAssociees(String value);

	/**
	 * Returns the value of the '<em><b>Adequation Projet Pro Besoins Entreprise</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adequation Projet Pro Besoins Entreprise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adequation Projet Pro Besoins Entreprise</em>' attribute.
	 * @see #setAdequationProjetProBesoinsEntreprise(boolean)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_AdequationProjetProBesoinsEntreprise()
	 * @model default="true"
	 * @generated
	 */
	boolean isAdequationProjetProBesoinsEntreprise();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#isAdequationProjetProBesoinsEntreprise <em>Adequation Projet Pro Besoins Entreprise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adequation Projet Pro Besoins Entreprise</em>' attribute.
	 * @see #isAdequationProjetProBesoinsEntreprise()
	 * @generated
	 */
	void setAdequationProjetProBesoinsEntreprise(boolean value);

	/**
	 * Returns the value of the '<em><b>Adequation Projet Pro Besoins Entreprise Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adequation Projet Pro Besoins Entreprise Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adequation Projet Pro Besoins Entreprise Commentaire</em>' attribute.
	 * @see #setAdequationProjetProBesoinsEntrepriseCommentaire(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_AdequationProjetProBesoinsEntrepriseCommentaire()
	 * @model
	 * @generated
	 */
	String getAdequationProjetProBesoinsEntrepriseCommentaire();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getAdequationProjetProBesoinsEntrepriseCommentaire <em>Adequation Projet Pro Besoins Entreprise Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adequation Projet Pro Besoins Entreprise Commentaire</em>' attribute.
	 * @see #getAdequationProjetProBesoinsEntrepriseCommentaire()
	 * @generated
	 */
	void setAdequationProjetProBesoinsEntrepriseCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Rencontre Rh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rencontre Rh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rencontre Rh</em>' attribute.
	 * @see #setRencontreRh(boolean)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_RencontreRh()
	 * @model
	 * @generated
	 */
	boolean isRencontreRh();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#isRencontreRh <em>Rencontre Rh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rencontre Rh</em>' attribute.
	 * @see #isRencontreRh()
	 * @generated
	 */
	void setRencontreRh(boolean value);

	/**
	 * Returns the value of the '<em><b>Rencontre Rh Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rencontre Rh Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rencontre Rh Commentaire</em>' attribute.
	 * @see #setRencontreRhCommentaire(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_RencontreRhCommentaire()
	 * @model
	 * @generated
	 */
	String getRencontreRhCommentaire();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getRencontreRhCommentaire <em>Rencontre Rh Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rencontre Rh Commentaire</em>' attribute.
	 * @see #getRencontreRhCommentaire()
	 * @generated
	 */
	void setRencontreRhCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Synthese</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synthese</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synthese</em>' attribute.
	 * @see #setSynthese(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretienProfessionnel_Synthese()
	 * @model
	 * @generated
	 */
	String getSynthese();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.EntretienProfessionnel#getSynthese <em>Synthese</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synthese</em>' attribute.
	 * @see #getSynthese()
	 * @generated
	 */
	void setSynthese(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasValidSynthese(DiagnosticChain chain, Map<Object, Object> context);

} // EntretienProfessionnel
