/**
 */
package fr.mutualite.rh.model.impl;

import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.EvaluationCompetence;
import fr.mutualite.rh.model.EvaluationSavoirEtre;
import fr.mutualite.rh.model.EvaluationTenuePoste;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Objectif;
import fr.mutualite.rh.model.ObjectifPrecedent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entretien Annuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getBilanFaitsMarquants <em>Bilan Faits Marquants</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getBilanActivitesSatisfactions <em>Bilan Activites Satisfactions</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getBilanActivitesDifficultes <em>Bilan Activites Difficultes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getEvaluationsTenuePosteMissionsPrincipales <em>Evaluations Tenue Poste Missions Principales</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getEvaluationsTenuePosteMissionsSpecifiques <em>Evaluations Tenue Poste Missions Specifiques</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#isRevoirFicheFonction <em>Revoir Fiche Fonction</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getRevoirFicheFonctionPrecisions <em>Revoir Fiche Fonction Precisions</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getEvaluationsCompetences <em>Evaluations Competences</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getEvaluationsSavoirEtre <em>Evaluations Savoir Etre</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getPointsForts <em>Points Forts</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getPointsAmeliorer <em>Points Ameliorer</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getObjectifsCommentaires <em>Objectifs Commentaires</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getSyntheseEvaluateur <em>Synthese Evaluateur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getSyntheseSalarie <em>Synthese Salarie</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getObjectifs <em>Objectifs</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.impl.EntretienAnnuelImpl#getObjectifsPrecedents <em>Objectifs Precedents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntretienAnnuelImpl extends EntretienImpl implements EntretienAnnuel {
	/**
	 * The default value of the '{@link #getBilanFaitsMarquants() <em>Bilan Faits Marquants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilanFaitsMarquants()
	 * @generated
	 * @ordered
	 */
	protected static final String BILAN_FAITS_MARQUANTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBilanActivitesSatisfactions() <em>Bilan Activites Satisfactions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilanActivitesSatisfactions()
	 * @generated
	 * @ordered
	 */
	protected static final String BILAN_ACTIVITES_SATISFACTIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBilanActivitesDifficultes() <em>Bilan Activites Difficultes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBilanActivitesDifficultes()
	 * @generated
	 * @ordered
	 */
	protected static final String BILAN_ACTIVITES_DIFFICULTES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isRevoirFicheFonction() <em>Revoir Fiche Fonction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRevoirFicheFonction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVOIR_FICHE_FONCTION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getRevoirFicheFonctionPrecisions() <em>Revoir Fiche Fonction Precisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevoirFicheFonctionPrecisions()
	 * @generated
	 * @ordered
	 */
	protected static final String REVOIR_FICHE_FONCTION_PRECISIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPointsForts() <em>Points Forts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsForts()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_FORTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPointsAmeliorer() <em>Points Ameliorer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsAmeliorer()
	 * @generated
	 * @ordered
	 */
	protected static final String POINTS_AMELIORER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getObjectifsCommentaires() <em>Objectifs Commentaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectifsCommentaires()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIFS_COMMENTAIRES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSyntheseEvaluateur() <em>Synthese Evaluateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheseEvaluateur()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESE_EVALUATEUR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSyntheseSalarie() <em>Synthese Salarie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyntheseSalarie()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNTHESE_SALARIE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntretienAnnuelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MutPackage.Literals.ENTRETIEN_ANNUEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilanFaitsMarquants() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilanFaitsMarquants(String newBilanFaitsMarquants) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS, newBilanFaitsMarquants);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilanActivitesSatisfactions() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilanActivitesSatisfactions(String newBilanActivitesSatisfactions) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS, newBilanActivitesSatisfactions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBilanActivitesDifficultes() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBilanActivitesDifficultes(String newBilanActivitesDifficultes) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES, MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES, newBilanActivitesDifficultes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EvaluationTenuePoste> getEvaluationsTenuePosteMissionsPrincipales() {
		return (EList<EvaluationTenuePoste>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES, MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EvaluationTenuePoste> getEvaluationsTenuePosteMissionsSpecifiques() {
		return (EList<EvaluationTenuePoste>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES, MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRevoirFicheFonction() {
		return (Boolean)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION, MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevoirFicheFonction(boolean newRevoirFicheFonction) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION, MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION, newRevoirFicheFonction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevoirFicheFonctionPrecisions() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS, MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevoirFicheFonctionPrecisions(String newRevoirFicheFonctionPrecisions) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS, MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS, newRevoirFicheFonctionPrecisions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EvaluationCompetence> getEvaluationsCompetences() {
		return (EList<EvaluationCompetence>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES, MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EvaluationSavoirEtre> getEvaluationsSavoirEtre() {
		return (EList<EvaluationSavoirEtre>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE, MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointsForts() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS, MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_FORTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsForts(String newPointsForts) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS, MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_FORTS, newPointsForts);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPointsAmeliorer() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER, MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_AMELIORER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsAmeliorer(String newPointsAmeliorer) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER, MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_AMELIORER, newPointsAmeliorer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectifsCommentaires() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES, MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectifsCommentaires(String newObjectifsCommentaires) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES, MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES, newObjectifsCommentaires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntheseEvaluateur() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR, MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheseEvaluateur(String newSyntheseEvaluateur) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR, MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR, newSyntheseEvaluateur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSyntheseSalarie() {
		return (String)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE, MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyntheseSalarie(String newSyntheseSalarie) {
		eDynamicSet(MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE, MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE, newSyntheseSalarie);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Objectif> getObjectifs() {
		return (EList<Objectif>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS, MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ObjectifPrecedent> getObjectifsPrecedents() {
		return (EList<ObjectifPrecedent>)eDynamicGet(MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS, MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
				return ((InternalEList<?>)getEvaluationsTenuePosteMissionsPrincipales()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
				return ((InternalEList<?>)getEvaluationsTenuePosteMissionsSpecifiques()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
				return ((InternalEList<?>)getEvaluationsCompetences()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
				return ((InternalEList<?>)getEvaluationsSavoirEtre()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
				return ((InternalEList<?>)getObjectifs()).basicRemove(otherEnd, msgs);
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				return ((InternalEList<?>)getObjectifsPrecedents()).basicRemove(otherEnd, msgs);
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
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS:
				return getBilanFaitsMarquants();
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS:
				return getBilanActivitesSatisfactions();
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES:
				return getBilanActivitesDifficultes();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
				return getEvaluationsTenuePosteMissionsPrincipales();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
				return getEvaluationsTenuePosteMissionsSpecifiques();
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION:
				return isRevoirFicheFonction();
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS:
				return getRevoirFicheFonctionPrecisions();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
				return getEvaluationsCompetences();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
				return getEvaluationsSavoirEtre();
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS:
				return getPointsForts();
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER:
				return getPointsAmeliorer();
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES:
				return getObjectifsCommentaires();
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR:
				return getSyntheseEvaluateur();
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE:
				return getSyntheseSalarie();
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
				return getObjectifs();
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				return getObjectifsPrecedents();
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
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS:
				setBilanFaitsMarquants((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS:
				setBilanActivitesSatisfactions((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES:
				setBilanActivitesDifficultes((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
				getEvaluationsTenuePosteMissionsPrincipales().clear();
				getEvaluationsTenuePosteMissionsPrincipales().addAll((Collection<? extends EvaluationTenuePoste>)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
				getEvaluationsTenuePosteMissionsSpecifiques().clear();
				getEvaluationsTenuePosteMissionsSpecifiques().addAll((Collection<? extends EvaluationTenuePoste>)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION:
				setRevoirFicheFonction((Boolean)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS:
				setRevoirFicheFonctionPrecisions((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
				getEvaluationsCompetences().clear();
				getEvaluationsCompetences().addAll((Collection<? extends EvaluationCompetence>)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
				getEvaluationsSavoirEtre().clear();
				getEvaluationsSavoirEtre().addAll((Collection<? extends EvaluationSavoirEtre>)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS:
				setPointsForts((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER:
				setPointsAmeliorer((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES:
				setObjectifsCommentaires((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR:
				setSyntheseEvaluateur((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE:
				setSyntheseSalarie((String)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
				getObjectifs().clear();
				getObjectifs().addAll((Collection<? extends Objectif>)newValue);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				getObjectifsPrecedents().clear();
				getObjectifsPrecedents().addAll((Collection<? extends ObjectifPrecedent>)newValue);
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
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS:
				setBilanFaitsMarquants(BILAN_FAITS_MARQUANTS_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS:
				setBilanActivitesSatisfactions(BILAN_ACTIVITES_SATISFACTIONS_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES:
				setBilanActivitesDifficultes(BILAN_ACTIVITES_DIFFICULTES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
				getEvaluationsTenuePosteMissionsPrincipales().clear();
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
				getEvaluationsTenuePosteMissionsSpecifiques().clear();
				return;
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION:
				setRevoirFicheFonction(REVOIR_FICHE_FONCTION_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS:
				setRevoirFicheFonctionPrecisions(REVOIR_FICHE_FONCTION_PRECISIONS_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
				getEvaluationsCompetences().clear();
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
				getEvaluationsSavoirEtre().clear();
				return;
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS:
				setPointsForts(POINTS_FORTS_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER:
				setPointsAmeliorer(POINTS_AMELIORER_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES:
				setObjectifsCommentaires(OBJECTIFS_COMMENTAIRES_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR:
				setSyntheseEvaluateur(SYNTHESE_EVALUATEUR_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE:
				setSyntheseSalarie(SYNTHESE_SALARIE_EDEFAULT);
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
				getObjectifs().clear();
				return;
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				getObjectifsPrecedents().clear();
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
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS:
				return BILAN_FAITS_MARQUANTS_EDEFAULT == null ? getBilanFaitsMarquants() != null : !BILAN_FAITS_MARQUANTS_EDEFAULT.equals(getBilanFaitsMarquants());
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS:
				return BILAN_ACTIVITES_SATISFACTIONS_EDEFAULT == null ? getBilanActivitesSatisfactions() != null : !BILAN_ACTIVITES_SATISFACTIONS_EDEFAULT.equals(getBilanActivitesSatisfactions());
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES:
				return BILAN_ACTIVITES_DIFFICULTES_EDEFAULT == null ? getBilanActivitesDifficultes() != null : !BILAN_ACTIVITES_DIFFICULTES_EDEFAULT.equals(getBilanActivitesDifficultes());
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
				return !getEvaluationsTenuePosteMissionsPrincipales().isEmpty();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
				return !getEvaluationsTenuePosteMissionsSpecifiques().isEmpty();
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION:
				return isRevoirFicheFonction() != REVOIR_FICHE_FONCTION_EDEFAULT;
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS:
				return REVOIR_FICHE_FONCTION_PRECISIONS_EDEFAULT == null ? getRevoirFicheFonctionPrecisions() != null : !REVOIR_FICHE_FONCTION_PRECISIONS_EDEFAULT.equals(getRevoirFicheFonctionPrecisions());
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
				return !getEvaluationsCompetences().isEmpty();
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
				return !getEvaluationsSavoirEtre().isEmpty();
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS:
				return POINTS_FORTS_EDEFAULT == null ? getPointsForts() != null : !POINTS_FORTS_EDEFAULT.equals(getPointsForts());
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER:
				return POINTS_AMELIORER_EDEFAULT == null ? getPointsAmeliorer() != null : !POINTS_AMELIORER_EDEFAULT.equals(getPointsAmeliorer());
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES:
				return OBJECTIFS_COMMENTAIRES_EDEFAULT == null ? getObjectifsCommentaires() != null : !OBJECTIFS_COMMENTAIRES_EDEFAULT.equals(getObjectifsCommentaires());
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR:
				return SYNTHESE_EVALUATEUR_EDEFAULT == null ? getSyntheseEvaluateur() != null : !SYNTHESE_EVALUATEUR_EDEFAULT.equals(getSyntheseEvaluateur());
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE:
				return SYNTHESE_SALARIE_EDEFAULT == null ? getSyntheseSalarie() != null : !SYNTHESE_SALARIE_EDEFAULT.equals(getSyntheseSalarie());
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
				return !getObjectifs().isEmpty();
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				return !getObjectifsPrecedents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntretienAnnuelImpl
