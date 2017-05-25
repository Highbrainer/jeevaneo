/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.PhotoEmploye;

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
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.PhotoEmploye} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoEmployeItemProvider 
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
	public PhotoEmployeItemProvider(AdapterFactory adapterFactory) {
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
			addAgePropertyDescriptor(object);
			addEtablissementPropertyDescriptor(object);
			addEmploiPropertyDescriptor(object);
			addClassificationPropertyDescriptor(object);
			addResponsablePropertyDescriptor(object);
			addNomPropertyDescriptor(object);
			addDateEmbauchePropertyDescriptor(object);
			addDiplomesPropertyDescriptor(object);
			addDatePrecedentEntretienPropertyDescriptor(object);
			addDatePrecedentEntretienProPropertyDescriptor(object);
			addDatePrecedentEntretienAnnuelPropertyDescriptor(object);
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
				 getString("_UI_PhotoEmploye_prenom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_prenom_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__PRENOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Age feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhotoEmploye_age_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_age_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__AGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_PhotoEmploye_etablissement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_etablissement_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__ETABLISSEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Emploi feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmploiPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhotoEmploye_emploi_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_emploi_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__EMPLOI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhotoEmploye_classification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_classification_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__CLASSIFICATION,
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
				 getString("_UI_PhotoEmploye_responsable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_responsable_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__RESPONSABLE,
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
				 getString("_UI_PhotoEmploye_nom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_nom_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__NOM,
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
				 getString("_UI_PhotoEmploye_dateEmbauche_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_dateEmbauche_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__DATE_EMBAUCHE,
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
				 getString("_UI_PhotoEmploye_diplomes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_diplomes_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__DIPLOMES,
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
				 getString("_UI_PhotoEmploye_datePrecedentEntretien_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_datePrecedentEntretien_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Precedent Entretien Pro feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePrecedentEntretienProPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhotoEmploye_datePrecedentEntretienPro_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_datePrecedentEntretienPro_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date Precedent Entretien Annuel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePrecedentEntretienAnnuelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PhotoEmploye_datePrecedentEntretienAnnuel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PhotoEmploye_datePrecedentEntretienAnnuel_feature", "_UI_PhotoEmploye_type"),
				 MutPackage.Literals.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PhotoEmploye.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PhotoEmploye"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PhotoEmploye)object).getPrenom();
		return label == null || label.length() == 0 ?
			getString("_UI_PhotoEmploye_type") :
			getString("_UI_PhotoEmploye_type") + " " + label;
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

		switch (notification.getFeatureID(PhotoEmploye.class)) {
			case MutPackage.PHOTO_EMPLOYE__PRENOM:
			case MutPackage.PHOTO_EMPLOYE__AGE:
			case MutPackage.PHOTO_EMPLOYE__ETABLISSEMENT:
			case MutPackage.PHOTO_EMPLOYE__EMPLOI:
			case MutPackage.PHOTO_EMPLOYE__CLASSIFICATION:
			case MutPackage.PHOTO_EMPLOYE__RESPONSABLE:
			case MutPackage.PHOTO_EMPLOYE__NOM:
			case MutPackage.PHOTO_EMPLOYE__DATE_EMBAUCHE:
			case MutPackage.PHOTO_EMPLOYE__DIPLOMES:
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN:
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_PRO:
			case MutPackage.PHOTO_EMPLOYE__DATE_PRECEDENT_ENTRETIEN_ANNUEL:
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
