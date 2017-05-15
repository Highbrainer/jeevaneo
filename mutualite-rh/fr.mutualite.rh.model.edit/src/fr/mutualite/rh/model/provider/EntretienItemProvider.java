/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.Entretien;
import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.MutPackage;

import java.util.Collection;
import java.util.Date;
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
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.Entretien} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntretienItemProvider 
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
	public EntretienItemProvider(AdapterFactory adapterFactory) {
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

			addDatePropertyDescriptor(object);
			addMeneurPropertyDescriptor(object);
			addEnCoursPropertyDescriptor(object);
			addFakePropertyDescriptor(object);
			addScanPropertyDescriptor(object);
			addAutresActionsDeveloppementCompetencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Entretien_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_date_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meneur feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeneurPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entretien_meneur_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_meneur_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__MENEUR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the En Cours feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnCoursPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entretien_enCours_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_enCours_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__EN_COURS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fake feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFakePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entretien_fake_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_fake_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__FAKE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entretien_scan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_scan_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__SCAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autres Actions Developpement Competences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutresActionsDeveloppementCompetencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entretien_autresActionsDeveloppementCompetences_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entretien_autresActionsDeveloppementCompetences_feature", "_UI_Entretien_type"),
				 MutPackage.Literals.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES,
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
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_SALARIE);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR);
			childrenFeatures.add(MutPackage.Literals.ENTRETIEN__PHOTO_EMPLOYE);
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
	 * This returns Entretien.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entretien"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((Entretien)object).getDate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Entretien_type") :
			getString("_UI_Entretien_type") + " " + label;
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

		switch (notification.getFeatureID(Entretien.class)) {
			case MutPackage.ENTRETIEN__DATE:
			case MutPackage.ENTRETIEN__EN_COURS:
			case MutPackage.ENTRETIEN__FAKE:
			case MutPackage.ENTRETIEN__SCAN:
			case MutPackage.ENTRETIEN__AUTRES_ACTIONS_DEVELOPPEMENT_COMPETENCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MutPackage.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION:
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_SALARIE:
			case MutPackage.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR:
			case MutPackage.ENTRETIEN__PHOTO_EMPLOYE:
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
				(MutPackage.Literals.ENTRETIEN__APPRECIATIONS_SESSION_FORMATION,
				 MutFactory.eINSTANCE.createAppreciationSessionFormation()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_SALARIE,
				 MutFactory.eINSTANCE.createSouhaitFormationSalarie()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN__SOUHAITS_FORMATION_EVALUATEUR,
				 MutFactory.eINSTANCE.createSouhaitFormationEvaluateur()));

		newChildDescriptors.add
			(createChildParameter
				(MutPackage.Literals.ENTRETIEN__PHOTO_EMPLOYE,
				 MutFactory.eINSTANCE.createPhotoEmploye()));
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
