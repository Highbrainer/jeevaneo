/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organismes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Organismes#getOrganismeFormations <em>Organisme Formations</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getOrganismes()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Organismes extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Organisme Formations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.OrganismeFormation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisme Formations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisme Formations</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getOrganismes_OrganismeFormations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganismeFormation> getOrganismeFormations();

} // Organismes
