/**
 */
package fr.mutualite.rh.model;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entretien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getDate <em>Date</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getMeneur <em>Meneur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#isEnCours <em>En Cours</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#isFake <em>Fake</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getScan <em>Scan</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getAppreciationsSessionFormation <em>Appreciations Session Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getSouhaitsFormationSalarie <em>Souhaits Formation Salarie</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getSouhaitsFormationEvaluateur <em>Souhaits Formation Evaluateur</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getAutresActionsDeveloppementCompetences <em>Autres Actions Developpement Competences</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getPhotoEmploye <em>Photo Employe</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getCommentaireBilanFormation <em>Commentaire Bilan Formation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.Entretien#getAppreciationsSessionFormationEntretiensPrecedents <em>Appreciations Session Formation Entretiens Precedents</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getEntretien()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Entretien extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_Date()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/CDO/DBStore columnType='DATE'"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Meneur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Employe#getEntretiensMenes <em>Entretiens Menes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meneur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meneur</em>' reference.
	 * @see #setMeneur(Employe)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_Meneur()
	 * @see fr.mutualite.rh.model.Employe#getEntretiensMenes
	 * @model opposite="entretiensMenes"
	 * @generated
	 */
	Employe getMeneur();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getMeneur <em>Meneur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meneur</em>' reference.
	 * @see #getMeneur()
	 * @generated
	 */
	void setMeneur(Employe value);

	/**
	 * Returns the value of the '<em><b>En Cours</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>En Cours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>En Cours</em>' attribute.
	 * @see #setEnCours(boolean)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_EnCours()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isEnCours();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#isEnCours <em>En Cours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>En Cours</em>' attribute.
	 * @see #isEnCours()
	 * @generated
	 */
	void setEnCours(boolean value);

	/**
	 * Returns the value of the '<em><b>Fake</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake</em>' attribute.
	 * @see #setFake(boolean)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_Fake()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isFake();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#isFake <em>Fake</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake</em>' attribute.
	 * @see #isFake()
	 * @generated
	 */
	void setFake(boolean value);

	/**
	 * Returns the value of the '<em><b>Scan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan</em>' attribute.
	 * @see #setScan(byte[])
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_Scan()
	 * @model
	 * @generated
	 */
	byte[] getScan();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getScan <em>Scan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan</em>' attribute.
	 * @see #getScan()
	 * @generated
	 */
	void setScan(byte[] value);

	/**
	 * Returns the value of the '<em><b>Appreciations Session Formation</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.AppreciationSessionFormation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appreciations Session Formation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appreciations Session Formation</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_AppreciationsSessionFormation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AppreciationSessionFormation> getAppreciationsSessionFormation();

	/**
	 * Returns the value of the '<em><b>Souhaits Formation Salarie</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.SouhaitFormationSalarie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souhaits Formation Salarie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souhaits Formation Salarie</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_SouhaitsFormationSalarie()
	 * @model containment="true"
	 * @generated
	 */
	EList<SouhaitFormationSalarie> getSouhaitsFormationSalarie();

	/**
	 * Returns the value of the '<em><b>Souhaits Formation Evaluateur</b></em>' containment reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.SouhaitFormationEvaluateur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souhaits Formation Evaluateur</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souhaits Formation Evaluateur</em>' containment reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_SouhaitsFormationEvaluateur()
	 * @model containment="true"
	 * @generated
	 */
	EList<SouhaitFormationEvaluateur> getSouhaitsFormationEvaluateur();

	/**
	 * Returns the value of the '<em><b>Autres Actions Developpement Competences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres Actions Developpement Competences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres Actions Developpement Competences</em>' attribute.
	 * @see #setAutresActionsDeveloppementCompetences(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_AutresActionsDeveloppementCompetences()
	 * @model
	 * @generated
	 */
	String getAutresActionsDeveloppementCompetences();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getAutresActionsDeveloppementCompetences <em>Autres Actions Developpement Competences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres Actions Developpement Competences</em>' attribute.
	 * @see #getAutresActionsDeveloppementCompetences()
	 * @generated
	 */
	void setAutresActionsDeveloppementCompetences(String value);

	/**
	 * Returns the value of the '<em><b>Photo Employe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photo Employe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photo Employe</em>' containment reference.
	 * @see #setPhotoEmploye(PhotoEmploye)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_PhotoEmploye()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhotoEmploye getPhotoEmploye();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getPhotoEmploye <em>Photo Employe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photo Employe</em>' containment reference.
	 * @see #getPhotoEmploye()
	 * @generated
	 */
	void setPhotoEmploye(PhotoEmploye value);

	/**
	 * Returns the value of the '<em><b>Commentaire Bilan Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Bilan Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Bilan Formation</em>' attribute.
	 * @see #setCommentaireBilanFormation(String)
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_CommentaireBilanFormation()
	 * @model
	 * @generated
	 */
	String getCommentaireBilanFormation();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.Entretien#getCommentaireBilanFormation <em>Commentaire Bilan Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Bilan Formation</em>' attribute.
	 * @see #getCommentaireBilanFormation()
	 * @generated
	 */
	void setCommentaireBilanFormation(String value);

	/**
	 * Returns the value of the '<em><b>Appreciations Session Formation Entretiens Precedents</b></em>' reference list.
	 * The list contents are of type {@link fr.mutualite.rh.model.AppreciationSessionFormation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appreciations Session Formation Entretiens Precedents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appreciations Session Formation Entretiens Precedents</em>' reference list.
	 * @see fr.mutualite.rh.model.MutPackage#getEntretien_AppreciationsSessionFormationEntretiensPrecedents()
	 * @model
	 * @generated
	 */
	EList<AppreciationSessionFormation> getAppreciationsSessionFormationEntretiensPrecedents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Employe employe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model chainRequired="true" contextRequired="true"
	 * @generated
	 */
	boolean hasValidMeneur(DiagnosticChain chain, Map<Object, Object> context);

} // Entretien
