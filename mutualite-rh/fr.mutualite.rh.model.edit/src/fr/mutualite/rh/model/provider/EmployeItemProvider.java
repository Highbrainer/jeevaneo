/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.Employe} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeItemProvider 
	extends CDOItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeItemProvider(AdapterFactory adapterFactory) {
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

			addMatriculePropertyDescriptor(object);
			addPrenomPropertyDescriptor(object);
			addNomPropertyDescriptor(object);
			addNomJeuneFillePropertyDescriptor(object);
			addDateNaissancePropertyDescriptor(object);
			addDateEmbauchePropertyDescriptor(object);
			addDiplomesPropertyDescriptor(object);
			addEtablissementPropertyDescriptor(object);
			addAffectationEmploiCourantePropertyDescriptor(object);
			addAffectationClassificationCourantePropertyDescriptor(object);
			addSessionsFormationPropertyDescriptor(object);
			addEntretiensMenesPropertyDescriptor(object);
			addDateSortieEntreprisePropertyDescriptor(object);
			addResponsablePropertyDescriptor(object);
			addSubalternesPropertyDescriptor(object);
			addEtablissementsEnResponsabilitePropertyDescriptor(object);
			addEntreteneursPropertyDescriptor(object);
			addEmployesEntretenusPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addEtablissementsEntretenusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Matricule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatriculePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_matricule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_matricule_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__MATRICULE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prenom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrenomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_prenom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_prenom_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__PRENOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_nom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_nom_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__NOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nom Jeune Fille feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNomJeuneFillePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_nomJeuneFille_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_nomJeuneFille_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__NOM_JEUNE_FILLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Naissance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateNaissancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_dateNaissance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_dateNaissance_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__DATE_NAISSANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Embauche feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateEmbauchePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_dateEmbauche_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_dateEmbauche_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__DATE_EMBAUCHE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diplomes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiplomesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_diplomes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_diplomes_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__DIPLOMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Etablissement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtablissementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_etablissement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_etablissement_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__ETABLISSEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affectation Emploi Courante feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectationEmploiCourantePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_affectationEmploiCourante_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_affectationEmploiCourante_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__AFFECTATION_EMPLOI_COURANTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Affectation Classification Courante feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffectationClassificationCourantePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_affectationClassificationCourante_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_affectationClassificationCourante_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__AFFECTATION_CLASSIFICATION_COURANTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sessions Formation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionsFormationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_sessionsFormation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_sessionsFormation_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__SESSIONS_FORMATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entretiens Menes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntretiensMenesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_entretiensMenes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_entretiensMenes_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__ENTRETIENS_MENES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Sortie Entreprise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateSortieEntreprisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_dateSortieEntreprise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_dateSortieEntreprise_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__DATE_SORTIE_ENTREPRISE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Responsable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponsablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_responsable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_responsable_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__RESPONSABLE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subalternes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubalternesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_subalternes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_subalternes_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__SUBALTERNES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Etablissements En Responsabilite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtablissementsEnResponsabilitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_etablissementsEnResponsabilite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_etablissementsEnResponsabilite_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__ETABLISSEMENTS_EN_RESPONSABILITE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entreteneurs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntreteneursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_entreteneurs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_entreteneurs_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__ENTRETENEURS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Employes Entretenus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmployesEntretenusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_employesEntretenus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_employesEntretenus_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__EMPLOYES_ENTRETENUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_label_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Etablissements Entretenus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEtablissementsEntretenusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Employe_etablissementsEntretenus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Employe_etablissementsEntretenus_feature", "_UI_Employe_type"),
				 MutPackage.Literals.EMPLOYE__ETABLISSEMENTS_ENTRETENUS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(MutPackage.Literals.EMPLOYE__AFFECTATIONS_EMPLOI);
			childrenFeatures.add(MutPackage.Literals.EMPLOYE__AFFECTATIONS_CLASSIFICATION);
			childrenFeatures.add(MutPackage.Literals.EMPLOYE__ENTRETIENS);
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
	 * This returns Employe.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Employe"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Employe employe = (Employe)object;
		return employe.getLabel();
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

		switch (notification.getFeatureID(Employe.class)) {
			case MutPackage.EMPLOYE__MATRICULE:
			case MutPackage.EMPLOYE__PRENOM:
			case MutPackage.EMPLOYE__NOM:
			case MutPackage.EMPLOYE__NOM_JEUNE_FILLE:
			case MutPackage.EMPLOYE__DATE_NAISSANCE:
			case MutPackage.EMPLOYE__DATE_EMBAUCHE:
			case MutPackage.EMPLOYE__DIPLOMES:
			case MutPackage.EMPLOYE__DATE_SORTIE_ENTREPRISE:
			case MutPackage.EMPLOYE__LABEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MutPackage.EMPLOYE__AFFECTATIONS_EMPLOI:
			case MutPackage.EMPLOYE__AFFECTATIONS_CLASSIFICATION:
			case MutPackage.EMPLOYE__ENTRETIENS:
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
				(MutPackage.Literals.EMPLOYE__AFFECTATIONS_EMPLOI,
				 MutFactory.eINSTANCE.createAffectation()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.EMPLOYE__AFFECTATIONS_CLASSIFICATION,
				 MutFactory.eINSTANCE.createAffectationClassification()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.EMPLOYE__ENTRETIENS,
				 MutFactory.eINSTANCE.createEntretienProfessionnel()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.EMPLOYE__ENTRETIENS,
				 MutFactory.eINSTANCE.createEntretienAnnuel()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MutEditPlugin.INSTANCE;
	}

}
