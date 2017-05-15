/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.EntretienAnnuel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntretienAnnuelItemProvider extends EntretienItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntretienAnnuelItemProvider(AdapterFactory adapterFactory) {
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

			addBilanFaitsMarquantsPropertyDescriptor(object);
			addBilanActivitesSatisfactionsPropertyDescriptor(object);
			addBilanActivitesDifficultesPropertyDescriptor(object);
			addRevoirFicheFonctionPropertyDescriptor(object);
			addRevoirFicheFonctionPrecisionsPropertyDescriptor(object);
			addPointsFortsPropertyDescriptor(object);
			addPointsAmeliorerPropertyDescriptor(object);
			addObjectifsCommentairesPropertyDescriptor(object);
			addSyntheseEvaluateurPropertyDescriptor(object);
			addSyntheseSalariePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bilan Faits Marquants feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBilanFaitsMarquantsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_bilanFaitsMarquants_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_bilanFaitsMarquants_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bilan Activites Satisfactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBilanActivitesSatisfactionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_bilanActivitesSatisfactions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_bilanActivitesSatisfactions_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bilan Activites Difficultes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBilanActivitesDifficultesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_bilanActivitesDifficultes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_bilanActivitesDifficultes_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revoir Fiche Fonction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevoirFicheFonctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_revoirFicheFonction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_revoirFicheFonction_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Revoir Fiche Fonction Precisions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevoirFicheFonctionPrecisionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_revoirFicheFonctionPrecisions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_revoirFicheFonctionPrecisions_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Points Forts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsFortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_pointsForts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_pointsForts_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_FORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Points Ameliorer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsAmeliorerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_pointsAmeliorer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_pointsAmeliorer_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__POINTS_AMELIORER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Objectifs Commentaires feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectifsCommentairesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_objectifsCommentaires_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_objectifsCommentaires_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synthese Evaluateur feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyntheseEvaluateurPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_syntheseEvaluateur_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_syntheseEvaluateur_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synthese Salarie feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSyntheseSalariePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntretienAnnuel_syntheseSalarie_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntretienAnnuel_syntheseSalarie_feature", "_UI_EntretienAnnuel_type"),
				 MutPackage.Literals.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EntretienAnnuel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntretienAnnuel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((EntretienAnnuel)object).getDate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_EntretienAnnuel_type") :
			getString("_UI_EntretienAnnuel_type") + " " + label;
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

		switch (notification.getFeatureID(EntretienAnnuel.class)) {
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_FAITS_MARQUANTS:
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_SATISFACTIONS:
			case MutPackage.ENTRETIEN_ANNUEL__BILAN_ACTIVITES_DIFFICULTES:
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION:
			case MutPackage.ENTRETIEN_ANNUEL__REVOIR_FICHE_FONCTION_PRECISIONS:
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_FORTS:
			case MutPackage.ENTRETIEN_ANNUEL__POINTS_AMELIORER:
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_COMMENTAIRES:
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_EVALUATEUR:
			case MutPackage.ENTRETIEN_ANNUEL__SYNTHESE_SALARIE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES:
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES:
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES:
			case MutPackage.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE:
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS:
			case MutPackage.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES,
				 MutFactory.eINSTANCE.createEvaluationTenuePoste()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES,
				 MutFactory.eINSTANCE.createEvaluationTenuePoste()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_COMPETENCES,
				 MutFactory.eINSTANCE.createEvaluationCompetence()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_SAVOIR_ETRE,
				 MutFactory.eINSTANCE.createEvaluationSavoirEtre()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS,
				 MutFactory.eINSTANCE.createObjectif()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN_ANNUEL__OBJECTIFS_PRECEDENTS,
				 MutFactory.eINSTANCE.createObjectifPrecedent()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_PRINCIPALES ||
			childFeature == MutPackage.Literals.ENTRETIEN_ANNUEL__EVALUATIONS_TENUE_POSTE_MISSIONS_SPECIFIQUES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
