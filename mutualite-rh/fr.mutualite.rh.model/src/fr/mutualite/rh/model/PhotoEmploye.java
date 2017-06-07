/**
 */
package fr.mutualite.rh.model;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getAge <em>Age</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getEtablissement <em>Etablissement</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getEmploi <em>Emploi</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getClassification <em>Classification</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getNom <em>Nom</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getDateEmbauche <em>Date Embauche</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getDiplomes <em>Diplomes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretienPro <em>Date Precedent Entretien Pro</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretienAnnuel <em>Date Precedent Entretien Annuel</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PhotoEmploye extends CDOObject {
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
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Prenom()
	 * @model
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Etablissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etablissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etablissement</em>' attribute.
	 * @see #setEtablissement(String)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Etablissement()
	 * @model
	 * @generated
	 */
	String getEtablissement();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getEtablissement <em>Etablissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etablissement</em>' attribute.
	 * @see #getEtablissement()
	 * @generated
	 */
	void setEtablissement(String value);

	/**
	 * Returns the value of the '<em><b>Emploi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emploi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emploi</em>' attribute.
	 * @see #setEmploi(String)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Emploi()
	 * @model
	 * @generated
	 */
	String getEmploi();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getEmploi <em>Emploi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emploi</em>' attribute.
	 * @see #getEmploi()
	 * @generated
	 */
	void setEmploi(String value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see #setClassification(String)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Classification()
	 * @model
	 * @generated
	 */
	String getClassification();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' attribute.
	 * @see #setResponsable(String)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Responsable()
	 * @model
	 * @generated
	 */
	String getResponsable();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getResponsable <em>Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' attribute.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(String value);

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
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Date Embauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Embauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Embauche</em>' attribute.
	 * @see #setDateEmbauche(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_DateEmbauche()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateEmbauche();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getDateEmbauche <em>Date Embauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Embauche</em>' attribute.
	 * @see #getDateEmbauche()
	 * @generated
	 */
	void setDateEmbauche(Date value);

	/**
	 * Returns the value of the '<em><b>Diplomes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diplomes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diplomes</em>' attribute list.
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_Diplomes()
	 * @model
	 * @generated
	 */
	EList<String> getDiplomes();

	/**
	 * Returns the value of the '<em><b>Date Precedent Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Precedent Entretien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Precedent Entretien</em>' attribute.
	 * @see #setDatePrecedentEntretien(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_DatePrecedentEntretien()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDatePrecedentEntretien();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretien <em>Date Precedent Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Precedent Entretien</em>' attribute.
	 * @see #getDatePrecedentEntretien()
	 * @generated
	 */
	void setDatePrecedentEntretien(Date value);

	/**
	 * Returns the value of the '<em><b>Date Precedent Entretien Pro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Precedent Entretien Pro</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Precedent Entretien Pro</em>' attribute.
	 * @see #setDatePrecedentEntretienPro(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_DatePrecedentEntretienPro()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDatePrecedentEntretienPro();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretienPro <em>Date Precedent Entretien Pro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Precedent Entretien Pro</em>' attribute.
	 * @see #getDatePrecedentEntretienPro()
	 * @generated
	 */
	void setDatePrecedentEntretienPro(Date value);

	/**
	 * Returns the value of the '<em><b>Date Precedent Entretien Annuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Precedent Entretien Annuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Precedent Entretien Annuel</em>' attribute.
	 * @see #setDatePrecedentEntretienAnnuel(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getPhotoEmploye_DatePrecedentEntretienAnnuel()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDatePrecedentEntretienAnnuel();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.PhotoEmploye#getDatePrecedentEntretienAnnuel <em>Date Precedent Entretien Annuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Precedent Entretien Annuel</em>' attribute.
	 * @see #getDatePrecedentEntretienAnnuel()
	 * @generated
	 */
	void setDatePrecedentEntretienAnnuel(Date value);

} // PhotoEmploye
