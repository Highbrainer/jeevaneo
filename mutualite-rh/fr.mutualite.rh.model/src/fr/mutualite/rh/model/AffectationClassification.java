/**
 */
package fr.mutualite.rh.model;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.AffectationClassification#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AffectationClassification#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.AffectationClassification#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getAffectationClassification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface AffectationClassification extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectationClassification_DateDebut()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.AffectationClassification#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectationClassification_DateFin()
	 * @model annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.AffectationClassification#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.ClassificationStatut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see fr.mutualite.rh.model.ClassificationStatut
	 * @see #setClassification(ClassificationStatut)
	 * @see fr.mutualite.rh.model.MutPackage#getAffectationClassification_Classification()
	 * @model required="true"
	 * @generated
	 */
	ClassificationStatut getClassification();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.AffectationClassification#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see fr.mutualite.rh.model.ClassificationStatut
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(ClassificationStatut value);

} // AffectationClassification
