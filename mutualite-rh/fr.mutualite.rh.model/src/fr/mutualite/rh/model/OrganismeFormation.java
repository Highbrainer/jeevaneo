/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisme Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.OrganismeFormation#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.OrganismeFormation#getFormations <em>Formations</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getOrganismeFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OrganismeFormation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see fr.mutualite.rh.model.MutPackage#getOrganismeFormation_Nom()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.OrganismeFormation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Formations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Formation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formations</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getOrganismeFormation_Formations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formation> getFormations();

} // OrganismeFormation
