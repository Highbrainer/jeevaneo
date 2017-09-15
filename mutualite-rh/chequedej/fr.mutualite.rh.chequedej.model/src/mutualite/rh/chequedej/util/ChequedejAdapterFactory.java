/**
 */
package mutualite.rh.chequedej.util;

import mutualite.rh.chequedej.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mutualite.rh.chequedej.ChequedejPackage
 * @generated
 */
public class ChequedejAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChequedejPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ChequedejPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChequedejSwitch<Adapter> modelSwitch =
		new ChequedejSwitch<Adapter>() {
			@Override
			public Adapter caseSuccursale(Succursale object) {
				return createSuccursaleAdapter();
			}
			@Override
			public Adapter caseCodeClient(CodeClient object) {
				return createCodeClientAdapter();
			}
			@Override
			public Adapter caseChequeDej(ChequeDej object) {
				return createChequeDejAdapter();
			}
			@Override
			public Adapter caseCommande(Commande object) {
				return createCommandeAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseEtablissementVirtuel(EtablissementVirtuel object) {
				return createEtablissementVirtuelAdapter();
			}
			@Override
			public Adapter caseCarnet(Carnet object) {
				return createCarnetAdapter();
			}
			@Override
			public Adapter caseEtablissementsVirtuels(EtablissementsVirtuels object) {
				return createEtablissementsVirtuelsAdapter();
			}
			@Override
			public Adapter caseParametrage(Parametrage object) {
				return createParametrageAdapter();
			}
			@Override
			public Adapter caseStock(Stock object) {
				return createStockAdapter();
			}
			@Override
			public Adapter caseCheque(Cheque object) {
				return createChequeAdapter();
			}
			@Override
			public Adapter caseSolde(Solde object) {
				return createSoldeAdapter();
			}
			@Override
			public Adapter caseSoldeIndividuel(SoldeIndividuel object) {
				return createSoldeIndividuelAdapter();
			}
			@Override
			public Adapter caseHistoriqueSoldeIndividuel(HistoriqueSoldeIndividuel object) {
				return createHistoriqueSoldeIndividuelAdapter();
			}
			@Override
			public Adapter caseDeje(Deje object) {
				return createDejeAdapter();
			}
			@Override
			public Adapter caseDejeIndividuel(DejeIndividuel object) {
				return createDejeIndividuelAdapter();
			}
			@Override
			public Adapter caseDejeMensuel(DejeMensuel object) {
				return createDejeMensuelAdapter();
			}
			@Override
			public Adapter caseChoix(Choix object) {
				return createChoixAdapter();
			}
			@Override
			public Adapter caseChoixIndividuel(ChoixIndividuel object) {
				return createChoixIndividuelAdapter();
			}
			@Override
			public Adapter caseContrats(Contrats object) {
				return createContratsAdapter();
			}
			@Override
			public Adapter caseContrat(Contrat object) {
				return createContratAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Succursale <em>Succursale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Succursale
	 * @generated
	 */
	public Adapter createSuccursaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.CodeClient <em>Code Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.CodeClient
	 * @generated
	 */
	public Adapter createCodeClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.ChequeDej <em>Cheque Dej</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.ChequeDej
	 * @generated
	 */
	public Adapter createChequeDejAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Commande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Commande
	 * @generated
	 */
	public Adapter createCommandeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.EtablissementVirtuel <em>Etablissement Virtuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.EtablissementVirtuel
	 * @generated
	 */
	public Adapter createEtablissementVirtuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Carnet <em>Carnet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Carnet
	 * @generated
	 */
	public Adapter createCarnetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.EtablissementsVirtuels <em>Etablissements Virtuels</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.EtablissementsVirtuels
	 * @generated
	 */
	public Adapter createEtablissementsVirtuelsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Parametrage <em>Parametrage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Parametrage
	 * @generated
	 */
	public Adapter createParametrageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Stock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Stock
	 * @generated
	 */
	public Adapter createStockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Cheque
	 * @generated
	 */
	public Adapter createChequeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Solde <em>Solde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Solde
	 * @generated
	 */
	public Adapter createSoldeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.SoldeIndividuel <em>Solde Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.SoldeIndividuel
	 * @generated
	 */
	public Adapter createSoldeIndividuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.HistoriqueSoldeIndividuel <em>Historique Solde Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.HistoriqueSoldeIndividuel
	 * @generated
	 */
	public Adapter createHistoriqueSoldeIndividuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Deje <em>Deje</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Deje
	 * @generated
	 */
	public Adapter createDejeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.DejeIndividuel <em>Deje Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.DejeIndividuel
	 * @generated
	 */
	public Adapter createDejeIndividuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.DejeMensuel <em>Deje Mensuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.DejeMensuel
	 * @generated
	 */
	public Adapter createDejeMensuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Choix <em>Choix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Choix
	 * @generated
	 */
	public Adapter createChoixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.ChoixIndividuel <em>Choix Individuel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.ChoixIndividuel
	 * @generated
	 */
	public Adapter createChoixIndividuelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Contrats <em>Contrats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Contrats
	 * @generated
	 */
	public Adapter createContratsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mutualite.rh.chequedej.Contrat <em>Contrat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mutualite.rh.chequedej.Contrat
	 * @generated
	 */
	public Adapter createContratAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ChequedejAdapterFactory
