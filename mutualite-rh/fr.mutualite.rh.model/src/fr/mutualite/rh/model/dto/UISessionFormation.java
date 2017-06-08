/**
 */
package fr.mutualite.rh.model.dto;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Session Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.UISessionFormation#getQuand <em>Quand</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UISessionFormation#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UISessionFormation#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UISessionFormation#getOrganisme <em>Organisme</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UISessionFormation#isDpc <em>Dpc</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UISessionFormation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Quand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quand</em>' attribute.
	 * @see #setQuand(String)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation_Quand()
	 * @model
	 * @generated
	 */
	String getQuand();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UISessionFormation#getQuand <em>Quand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quand</em>' attribute.
	 * @see #getQuand()
	 * @generated
	 */
	void setQuand(String value);

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(String)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation_Duree()
	 * @model
	 * @generated
	 */
	String getDuree();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UISessionFormation#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(String value);

	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation_Libelle()
	 * @model
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UISessionFormation#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Organisme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisme</em>' attribute.
	 * @see #setOrganisme(String)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation_Organisme()
	 * @model
	 * @generated
	 */
	String getOrganisme();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UISessionFormation#getOrganisme <em>Organisme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisme</em>' attribute.
	 * @see #getOrganisme()
	 * @generated
	 */
	void setOrganisme(String value);

	/**
	 * Returns the value of the '<em><b>Dpc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dpc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dpc</em>' attribute.
	 * @see #setDpc(boolean)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUISessionFormation_Dpc()
	 * @model
	 * @generated
	 */
	boolean isDpc();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UISessionFormation#isDpc <em>Dpc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dpc</em>' attribute.
	 * @see #isDpc()
	 * @generated
	 */
	void setDpc(boolean value);

} // UISessionFormation
