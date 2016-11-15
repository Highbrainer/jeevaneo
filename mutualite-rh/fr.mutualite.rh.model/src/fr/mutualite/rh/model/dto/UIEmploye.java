/**
 */
package fr.mutualite.rh.model.dto;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.dto.UIEmploye#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UIEmploye#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.dto.UIEmploye#getNom <em>Nom</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.dto.DtoPackage#getUIEmploye()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface UIEmploye extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prenom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUIEmploye_Prenom()
	 * @model required="true"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UIEmploye#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricule</em>' attribute.
	 * @see #setMatricule(int)
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUIEmploye_Matricule()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UIEmploye#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

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
	 * @see fr.mutualite.rh.model.dto.DtoPackage#getUIEmploye_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.dto.UIEmploye#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

} // UIEmploye
