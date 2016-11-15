/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutualite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Mutualite#getEtablissements <em>Etablissements</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Mutualite#getEmplois <em>Emplois</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Mutualite#getEffectif <em>Effectif</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Mutualite#getOrganismes <em>Organismes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Mutualite#getUtilisateurs <em>Utilisateurs</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getMutualite()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Mutualite extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Etablissements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissements</em>' containment reference.
	 * @see #setEtablissements(Etablissements)
	 * @see fr.mutualite.rh.model.MutPackage#getMutualite_Etablissements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Etablissements getEtablissements();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Mutualite#getEtablissements <em>Etablissements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissements</em>' containment reference.
	 * @see #getEtablissements()
	 * @generated
	 */
	void setEtablissements(Etablissements value);

	/**
	 * Returns the value of the '<em><b>Emplois</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplois</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplois</em>' containment reference.
	 * @see #setEmplois(Emplois)
	 * @see fr.mutualite.rh.model.MutPackage#getMutualite_Emplois()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Emplois getEmplois();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Mutualite#getEmplois <em>Emplois</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplois</em>' containment reference.
	 * @see #getEmplois()
	 * @generated
	 */
	void setEmplois(Emplois value);

	/**
	 * Returns the value of the '<em><b>Effectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectif</em>' containment reference.
	 * @see #setEffectif(Effectif)
	 * @see fr.mutualite.rh.model.MutPackage#getMutualite_Effectif()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Effectif getEffectif();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Mutualite#getEffectif <em>Effectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectif</em>' containment reference.
	 * @see #getEffectif()
	 * @generated
	 */
	void setEffectif(Effectif value);

	/**
	 * Returns the value of the '<em><b>Organismes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organismes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organismes</em>' containment reference.
	 * @see #setOrganismes(Organismes)
	 * @see fr.mutualite.rh.model.MutPackage#getMutualite_Organismes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Organismes getOrganismes();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Mutualite#getOrganismes <em>Organismes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organismes</em>' containment reference.
	 * @see #getOrganismes()
	 * @generated
	 */
	void setOrganismes(Organismes value);

	/**
	 * Returns the value of the '<em><b>Utilisateurs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisateurs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateurs</em>' containment reference.
	 * @see #setUtilisateurs(Utilisateurs)
	 * @see fr.mutualite.rh.model.MutPackage#getMutualite_Utilisateurs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Utilisateurs getUtilisateurs();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Mutualite#getUtilisateurs <em>Utilisateurs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisateurs</em>' containment reference.
	 * @see #getUtilisateurs()
	 * @generated
	 */
	void setUtilisateurs(Utilisateurs value);

} // Mutualite
