/**
 */
package fr.mutualite.rh.model.provider;


import fr.mutualite.rh.model.Employe;
import fr.mutualite.rh.model.EntretienAnnuel;
import fr.mutualite.rh.model.EvaluationAtteinteObjectif;
import fr.mutualite.rh.model.MutPackage;
import fr.mutualite.rh.model.Objectif;
import fr.mutualite.rh.model.ObjectifPrecedent;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
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
 * This is the item provider adapter for a {@link fr.mutualite.rh.model.ObjectifPrecedent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectifPrecedentItemProvider 
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
	public ObjectifPrecedentItemProvider(AdapterFactory adapterFactory) {
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

			addObjectifPropertyDescriptor(object);
			addEvaluationPropertyDescriptor(object);
			addCommentairePropertyDescriptor(object);
			addLibellePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Objectif feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectifPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor(
			  ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
			  getResourceLocator(),
			  getString("_UI_ObjectifPrecedent_objectif_feature"),
			  getString("_UI_PropertyDescriptor_description", "_UI_ObjectifPrecedent_objectif_feature", "_UI_ObjectifPrecedent_type"),
			  MutPackage.Literals.OBJECTIF_PRECEDENT__OBJECTIF,
			  true,
			  false,
			  true,
			  null,
			  null,
			  null) {
				@Override
				protected Collection<?> getComboBoxObjects(Object object) {
					if (object instanceof ObjectifPrecedent) {
						ObjectifPrecedent op = (ObjectifPrecedent) object;
						EObject ea = op.eContainer();
						Employe emp = (Employe) ea.eContainer();
						EList<Objectif> objectifsDuDernierEae = emp.getEntretiens().stream().filter(EntretienAnnuel.class::isInstance).filter(ea1 -> !ea1.equals(ea)).map(EntretienAnnuel.class::cast).max((e1,e2)->e1.getDate().compareTo(e2.getDate())).map(EntretienAnnuel::getObjectifs).orElse(new BasicEList<>());
						return objectifsDuDernierEae;
					}
					return super.getComboBoxObjects(object);
				}
			});
	}

	/**
	 * This adds a property descriptor for the Evaluation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvaluationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectifPrecedent_evaluation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectifPrecedent_evaluation_feature", "_UI_ObjectifPrecedent_type"),
				 MutPackage.Literals.OBJECTIF_PRECEDENT__EVALUATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commentaire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentairePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectifPrecedent_commentaire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectifPrecedent_commentaire_feature", "_UI_ObjectifPrecedent_type"),
				 MutPackage.Literals.OBJECTIF_PRECEDENT__COMMENTAIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Libelle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibellePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectifPrecedent_libelle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectifPrecedent_libelle_feature", "_UI_ObjectifPrecedent_type"),
				 MutPackage.Literals.OBJECTIF_PRECEDENT__LIBELLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ObjectifPrecedent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectifPrecedent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		EvaluationAtteinteObjectif labelValue = ((ObjectifPrecedent)object).getEvaluation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectifPrecedent_type") :
			getString("_UI_ObjectifPrecedent_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectifPrecedent.class)) {
			case MutPackage.OBJECTIF_PRECEDENT__EVALUATION:
			case MutPackage.OBJECTIF_PRECEDENT__COMMENTAIRE:
			case MutPackage.OBJECTIF_PRECEDENT__LIBELLE:
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
