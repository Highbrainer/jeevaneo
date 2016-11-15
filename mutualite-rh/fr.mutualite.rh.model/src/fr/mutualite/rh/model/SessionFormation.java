/**
 */
package fr.mutualite.rh.model;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.SessionFormation#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SessionFormation#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SessionFormation#getDuree <em>Duree</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SessionFormation#getEmployes <em>Employes</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.SessionFormation#getAppreciations <em>Appreciations</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SessionFormation extends CDOObject {
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
	 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation_DateFin()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.SessionFormation#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

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
	 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation_DateDebut()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.SessionFormation#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durée en heure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(Float)
	 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation_Duree()
	 * @model required="true"
	 * @generated
	 */
	Float getDuree();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.SessionFormation#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(Float value);

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.Employe}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getSessionsFormation <em>Sessions Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation_Employes()
	 * @see fr.mutualite.rh.model.Employe#getSessionsFormation
	 * @model opposite="sessionsFormation"
	 * @generated
	 */
	EList<Employe> getEmployes();

	/**
	 * Returns the value of the '<em><b>Appreciations</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.AppreciationSessionFormation}.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation <em>Session Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appreciations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appreciations</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getSessionFormation_Appreciations()
	 * @see fr.mutualite.rh.model.AppreciationSessionFormation#getSessionFormation
	 * @model opposite="sessionFormation"
	 * @generated
	 */
	EList<AppreciationSessionFormation> getAppreciations();

} // SessionFormation
