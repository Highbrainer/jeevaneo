/**
 */
package fr.mutualite.rh.model.dto.provider;


import fr.mutualite.rh.model.dto.DtoPackage;
import fr.mutualite.rh.model.dto.Formulaire;

import fr.mutualite.rh.model.provider.MutEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.dto.Formulaire} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulaireItemProvider 
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
	public FormulaireItemProvider(AdapterFactory adapterFactory) {
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

			addPrenomPropertyDescriptor(object);
			addMatriculePropertyDescriptor(object);
			addNomPropertyDescriptor(object);
			addDiplomesPropertyDescriptor(object);
			addServicePropertyDescriptor(object);
			addPostePropertyDescriptor(object);
			addResponsablePropertyDescriptor(object);
			addMeneParPropertyDescriptor(object);
			addEntretienPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addDatePrecedentEntretienPropertyDescriptor(object);
			addAnciennetePropertyDescriptor(object);
			addDateEntreeEntreprisePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Formulaire_prenom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_prenom_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__PRENOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_Formulaire_matricule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_matricule_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__MATRICULE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_Formulaire_nom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_nom_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__NOM,
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
				 getString("_UI_Formulaire_diplomes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_diplomes_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__DIPLOMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_service_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_service_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__SERVICE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Poste feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPostePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_poste_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_poste_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__POSTE,
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
				 getString("_UI_Formulaire_responsable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_responsable_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__RESPONSABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mene Par feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeneParPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_menePar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_menePar_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__MENE_PAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entretien feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntretienPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_entretien_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_entretien_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__ENTRETIEN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_date_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Precedent Entretien feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePrecedentEntretienPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_datePrecedentEntretien_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_datePrecedentEntretien_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__DATE_PRECEDENT_ENTRETIEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Anciennete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnciennetePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_anciennete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_anciennete_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__ANCIENNETE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Entree Entreprise feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDateEntreeEntreprisePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Formulaire_dateEntreeEntreprise_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Formulaire_dateEntreeEntreprise_feature", "_UI_Formulaire_type"),
				 DtoPackage.Literals.FORMULAIRE__DATE_ENTREE_ENTREPRISE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Formulaire.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Formulaire"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Formulaire)object).getPrenom();
		return label == null || label.length() == 0 ?
			getString("_UI_Formulaire_type") :
			getString("_UI_Formulaire_type") + " " + label;
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

		switch (notification.getFeatureID(Formulaire.class)) {
			case DtoPackage.FORMULAIRE__PRENOM:
			case DtoPackage.FORMULAIRE__MATRICULE:
			case DtoPackage.FORMULAIRE__NOM:
			case DtoPackage.FORMULAIRE__DIPLOMES:
			case DtoPackage.FORMULAIRE__SERVICE:
			case DtoPackage.FORMULAIRE__POSTE:
			case DtoPackage.FORMULAIRE__RESPONSABLE:
			case DtoPackage.FORMULAIRE__MENE_PAR:
			case DtoPackage.FORMULAIRE__DATE:
			case DtoPackage.FORMULAIRE__DATE_PRECEDENT_ENTRETIEN:
			case DtoPackage.FORMULAIRE__ANCIENNETE:
			case DtoPackage.FORMULAIRE__DATE_ENTREE_ENTREPRISE:
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
