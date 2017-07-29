/**
 */
package mutualite.rh.chequedej.util;

import mutualite.rh.chequedej.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mutualite.rh.chequedej.ChequedejPackage
 * @generated
 */
public class ChequedejSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ChequedejPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejSwitch() {
		if (modelPackage == null) {
			modelPackage = ChequedejPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ChequedejPackage.SUCCURSALE: {
				Succursale succursale = (Succursale)theEObject;
				T result = caseSuccursale(succursale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.CODE_CLIENT: {
				CodeClient codeClient = (CodeClient)theEObject;
				T result = caseCodeClient(codeClient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.CHEQUE_DEJ: {
				ChequeDej chequeDej = (ChequeDej)theEObject;
				T result = caseChequeDej(chequeDej);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.COMMANDE: {
				Commande commande = (Commande)theEObject;
				T result = caseCommande(commande);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.ETABLISSEMENT_VIRTUEL: {
				EtablissementVirtuel etablissementVirtuel = (EtablissementVirtuel)theEObject;
				T result = caseEtablissementVirtuel(etablissementVirtuel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.CARNET: {
				Carnet carnet = (Carnet)theEObject;
				T result = caseCarnet(carnet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.ETABLISSEMENTS_VIRTUELS: {
				EtablissementsVirtuels etablissementsVirtuels = (EtablissementsVirtuels)theEObject;
				T result = caseEtablissementsVirtuels(etablissementsVirtuels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ChequedejPackage.PARAMETRAGE: {
				Parametrage parametrage = (Parametrage)theEObject;
				T result = caseParametrage(parametrage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succursale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succursale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccursale(Succursale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Client</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Client</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeClient(CodeClient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cheque Dej</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cheque Dej</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChequeDej(ChequeDej object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commande</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commande</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommande(Commande object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etablissement Virtuel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etablissement Virtuel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtablissementVirtuel(EtablissementVirtuel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Carnet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Carnet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarnet(Carnet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etablissements Virtuels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etablissements Virtuels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtablissementsVirtuels(EtablissementsVirtuels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametrage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametrage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametrage(Parametrage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ChequedejSwitch
