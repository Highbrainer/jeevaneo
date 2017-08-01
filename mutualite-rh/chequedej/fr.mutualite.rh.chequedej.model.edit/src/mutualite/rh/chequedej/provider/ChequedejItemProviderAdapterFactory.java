/**
 */
package mutualite.rh.chequedej.provider;

import java.util.ArrayList;
import java.util.Collection;

import mutualite.rh.chequedej.util.ChequedejAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChequedejItemProviderAdapterFactory extends ChequedejAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.Succursale} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuccursaleItemProvider succursaleItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.Succursale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSuccursaleAdapter() {
		if (succursaleItemProvider == null) {
			succursaleItemProvider = new SuccursaleItemProvider(this);
		}

		return succursaleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.CodeClient} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeClientItemProvider codeClientItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.CodeClient}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeClientAdapter() {
		if (codeClientItemProvider == null) {
			codeClientItemProvider = new CodeClientItemProvider(this);
		}

		return codeClientItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.ChequeDej} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequeDejItemProvider chequeDejItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.ChequeDej}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChequeDejAdapter() {
		if (chequeDejItemProvider == null) {
			chequeDejItemProvider = new ChequeDejItemProvider(this);
		}

		return chequeDejItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.Commande} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandeItemProvider commandeItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.Commande}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandeAdapter() {
		if (commandeItemProvider == null) {
			commandeItemProvider = new CommandeItemProvider(this);
		}

		return commandeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.Item} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemItemProvider itemItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createItemAdapter() {
		if (itemItemProvider == null) {
			itemItemProvider = new ItemItemProvider(this);
		}

		return itemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.EtablissementVirtuel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementVirtuelItemProvider etablissementVirtuelItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.EtablissementVirtuel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtablissementVirtuelAdapter() {
		if (etablissementVirtuelItemProvider == null) {
			etablissementVirtuelItemProvider = new EtablissementVirtuelItemProvider(this);
		}

		return etablissementVirtuelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.Carnet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarnetItemProvider carnetItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.Carnet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCarnetAdapter() {
		if (carnetItemProvider == null) {
			carnetItemProvider = new CarnetItemProvider(this);
		}

		return carnetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.EtablissementsVirtuels} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EtablissementsVirtuelsItemProvider etablissementsVirtuelsItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.EtablissementsVirtuels}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEtablissementsVirtuelsAdapter() {
		if (etablissementsVirtuelsItemProvider == null) {
			etablissementsVirtuelsItemProvider = new EtablissementsVirtuelsItemProvider(this);
		}

		return etablissementsVirtuelsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mutualite.rh.chequedej.Parametrage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametrageItemProvider parametrageItemProvider;

	/**
	 * This creates an adapter for a {@link mutualite.rh.chequedej.Parametrage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParametrageAdapter() {
		if (parametrageItemProvider == null) {
			parametrageItemProvider = new ParametrageItemProvider(this);
		}

		return parametrageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (succursaleItemProvider != null) succursaleItemProvider.dispose();
		if (codeClientItemProvider != null) codeClientItemProvider.dispose();
		if (chequeDejItemProvider != null) chequeDejItemProvider.dispose();
		if (commandeItemProvider != null) commandeItemProvider.dispose();
		if (itemItemProvider != null) itemItemProvider.dispose();
		if (etablissementVirtuelItemProvider != null) etablissementVirtuelItemProvider.dispose();
		if (carnetItemProvider != null) carnetItemProvider.dispose();
		if (etablissementsVirtuelsItemProvider != null) etablissementsVirtuelsItemProvider.dispose();
		if (parametrageItemProvider != null) parametrageItemProvider.dispose();
	}

}