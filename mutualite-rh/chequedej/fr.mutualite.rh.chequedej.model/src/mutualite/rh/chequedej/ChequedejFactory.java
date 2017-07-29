/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mutualite.rh.chequedej.ChequedejPackage
 * @generated
 */
public interface ChequedejFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChequedejFactory eINSTANCE = mutualite.rh.chequedej.impl.ChequedejFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Succursale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Succursale</em>'.
	 * @generated
	 */
	Succursale createSuccursale();

	/**
	 * Returns a new object of class '<em>Code Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Client</em>'.
	 * @generated
	 */
	CodeClient createCodeClient();

	/**
	 * Returns a new object of class '<em>Cheque Dej</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cheque Dej</em>'.
	 * @generated
	 */
	ChequeDej createChequeDej();

	/**
	 * Returns a new object of class '<em>Commande</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commande</em>'.
	 * @generated
	 */
	Commande createCommande();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Etablissement Virtuel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etablissement Virtuel</em>'.
	 * @generated
	 */
	EtablissementVirtuel createEtablissementVirtuel();

	/**
	 * Returns a new object of class '<em>Carnet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Carnet</em>'.
	 * @generated
	 */
	Carnet createCarnet();

	/**
	 * Returns a new object of class '<em>Etablissements Virtuels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etablissements Virtuels</em>'.
	 * @generated
	 */
	EtablissementsVirtuels createEtablissementsVirtuels();

	/**
	 * Returns a new object of class '<em>Parametrage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parametrage</em>'.
	 * @generated
	 */
	Parametrage createParametrage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChequedejPackage getChequedejPackage();

} //ChequedejFactory
