/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.EntretienProfessionnel;
import fr.mutualite.rh.model.MutPackage;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.EntretienProfessionnel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntretienProfessionnelItemProvider extends EntretienItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntretienProfessionnelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEvolutionDepuisDernierEntretienPropertyDescriptor(object);
			addCommentaireBilanFormationPropertyDescriptor(object);
			addEvolutionSouhaiteeDansEmploiActuelPropertyDescriptor(object);
			addEvolutionSouhaiteeDansNouvelEmploiPropertyDescriptor(object);
			addEcheancePropertyDescriptor(object);
			addEvolutionSouhaiteeCompetencesAcquisesPropertyDescriptor(object);
			addEvolutionSouhaiteeCompetencesRequisesPropertyDescriptor(object);
			addEvolutionSouhaiteeMoyensRealisationPropertyDescriptor(object);
			addPerspectivesEvolutionProfessionnellePropertyDescriptor(object);
			addPerspectivesEvolutionProfessionnelleCompetencesAssocieesPropertyDescriptor(object);
			addAdequationProjetProBesoinsEntreprisePropertyDescriptor(object);
			addAdequationProjetProBesoinsEntrepriseCommentairePropertyDescriptor(object);
			addRencontreRhPropertyDescriptor(object);
			addRencontreRhCommentairePropertyDescriptor(object);
			addSynthesePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Evolution Depuis Dernier Entretien feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionDepuisDernierEntretienPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionDepuisDernierEntretien_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionDepuisDernierEntretien_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commentaire Bilan Formation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentaireBilanFormationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_commentaireBilanFormation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_commentaireBilanFormation_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__COMMENTAIRE_BILAN_FORMATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Souhaitee Dans Emploi Actuel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionSouhaiteeDansEmploiActuelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionSouhaiteeDansEmploiActuel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionSouhaiteeDansEmploiActuel_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Souhaitee Dans Nouvel Emploi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionSouhaiteeDansNouvelEmploiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionSouhaiteeDansNouvelEmploi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionSouhaiteeDansNouvelEmploi_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Echeance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEcheancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_echeance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_echeance_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ECHEANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Souhaitee Competences Acquises feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionSouhaiteeCompetencesAcquisesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionSouhaiteeCompetencesAcquises_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionSouhaiteeCompetencesAcquises_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Souhaitee Competences Requises feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionSouhaiteeCompetencesRequisesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionSouhaiteeCompetencesRequises_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionSouhaiteeCompetencesRequises_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolution Souhaitee Moyens Realisation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionSouhaiteeMoyensRealisationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_evolutionSouhaiteeMoyensRealisation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_evolutionSouhaiteeMoyensRealisation_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspectives Evolution Professionnelle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectivesEvolutionProfessionnellePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_perspectivesEvolutionProfessionnelle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_perspectivesEvolutionProfessionnelle_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perspectives Evolution Professionnelle Competences Associees feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerspectivesEvolutionProfessionnelleCompetencesAssocieesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_perspectivesEvolutionProfessionnelleCompetencesAssociees_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_perspectivesEvolutionProfessionnelleCompetencesAssociees_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adequation Projet Pro Besoins Entreprise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdequationProjetProBesoinsEntreprisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_adequationProjetProBesoinsEntreprise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_adequationProjetProBesoinsEntreprise_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adequation Projet Pro Besoins Entreprise Commentaire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdequationProjetProBesoinsEntrepriseCommentairePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_adequationProjetProBesoinsEntrepriseCommentaire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_adequationProjetProBesoinsEntrepriseCommentaire_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rencontre Rh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRencontreRhPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_rencontreRh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_rencontreRh_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rencontre Rh Commentaire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRencontreRhCommentairePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_rencontreRhCommentaire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_rencontreRhCommentaire_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synthese feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynthesePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienProfessionnel_synthese_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienProfessionnel_synthese_feature", "_UI_EntretienProfessionnel_type"),
				 MutPackage.Literals.ENTRETIEN_PROFESSIONNEL__SYNTHESE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns EntretienProfessionnel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntretienProfessionnel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((EntretienProfessionnel)object).getDate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EntretienProfessionnel_type") :
			getString("_UI_EntretienProfessionnel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EntretienProfessionnel.class)) {
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_DEPUIS_DERNIER_ENTRETIEN:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__COMMENTAIRE_BILAN_FORMATION:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_EMPLOI_ACTUEL:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_DANS_NOUVEL_EMPLOI:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ECHEANCE:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_ACQUISES:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_COMPETENCES_REQUISES:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__EVOLUTION_SOUHAITEE_MOYENS_REALISATION:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__PERSPECTIVES_EVOLUTION_PROFESSIONNELLE_COMPETENCES_ASSOCIEES:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__ADEQUATION_PROJET_PRO_BESOINS_ENTREPRISE_COMMENTAIRE:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__RENCONTRE_RH_COMMENTAIRE:
			case MutPackage.ENTRETIEN_PROFESSIONNEL__SYNTHESE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
