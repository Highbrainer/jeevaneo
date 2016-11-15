/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage
 * @generated
 */
public interface MutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MutFactory eINSTANCE = fr.mutualite.rh.model.impl.MutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Etablissement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etablissement</em>'.
	 * @generated
	 */
	Etablissement createEtablissement();

	/**
	 * Returns a new object of class '<em>Utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilisateur</em>'.
	 * @generated
	 */
	Utilisateur createUtilisateur();

	/**
	 * Returns a new object of class '<em>Utilisateurs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilisateurs</em>'.
	 * @generated
	 */
	Utilisateurs createUtilisateurs();

	/**
	 * Returns a new object of class '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employe</em>'.
	 * @generated
	 */
	Employe createEmploye();

	/**
	 * Returns a new object of class '<em>Affectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affectation</em>'.
	 * @generated
	 */
	Affectation createAffectation();

	/**
	 * Returns a new object of class '<em>Emploi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emploi</em>'.
	 * @generated
	 */
	Emploi createEmploi();

	/**
	 * Returns a new object of class '<em>Affectation Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affectation Classification</em>'.
	 * @generated
	 */
	AffectationClassification createAffectationClassification();

	/**
	 * Returns a new object of class '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formation</em>'.
	 * @generated
	 */
	Formation createFormation();

	/**
	 * Returns a new object of class '<em>Organisme Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organisme Formation</em>'.
	 * @generated
	 */
	OrganismeFormation createOrganismeFormation();

	/**
	 * Returns a new object of class '<em>Session Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Formation</em>'.
	 * @generated
	 */
	SessionFormation createSessionFormation();

	/**
	 * Returns a new object of class '<em>Entretien Professionnel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entretien Professionnel</em>'.
	 * @generated
	 */
	EntretienProfessionnel createEntretienProfessionnel();

	/**
	 * Returns a new object of class '<em>Appreciation Session Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appreciation Session Formation</em>'.
	 * @generated
	 */
	AppreciationSessionFormation createAppreciationSessionFormation();

	/**
	 * Returns a new object of class '<em>Souhait Formation Evaluateur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Souhait Formation Evaluateur</em>'.
	 * @generated
	 */
	SouhaitFormationEvaluateur createSouhaitFormationEvaluateur();

	/**
	 * Returns a new object of class '<em>Souhait Formation Salarie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Souhait Formation Salarie</em>'.
	 * @generated
	 */
	SouhaitFormationSalarie createSouhaitFormationSalarie();

	/**
	 * Returns a new object of class '<em>Mutualite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutualite</em>'.
	 * @generated
	 */
	Mutualite createMutualite();

	/**
	 * Returns a new object of class '<em>Etablissements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etablissements</em>'.
	 * @generated
	 */
	Etablissements createEtablissements();

	/**
	 * Returns a new object of class '<em>Emplois</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emplois</em>'.
	 * @generated
	 */
	Emplois createEmplois();

	/**
	 * Returns a new object of class '<em>Effectif</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effectif</em>'.
	 * @generated
	 */
	Effectif createEffectif();

	/**
	 * Returns a new object of class '<em>Organismes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organismes</em>'.
	 * @generated
	 */
	Organismes createOrganismes();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MutPackage getMutPackage();

} //MutFactory
