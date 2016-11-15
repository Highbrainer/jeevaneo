/**
 */
package fr.mutualite.rh.model.dto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.dto.DtoPackage
 * @generated
 */
public interface DtoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtoFactory eINSTANCE = fr.mutualite.rh.model.dto.impl.DtoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Formulaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formulaire</em>'.
	 * @generated
	 */
	Formulaire createFormulaire();

	/**
	 * Returns a new object of class '<em>UI Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Employe</em>'.
	 * @generated
	 */
	UIEmploye createUIEmploye();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DtoPackage getDtoPackage();

} //DtoFactory
