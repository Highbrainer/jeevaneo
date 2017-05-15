/**
 */
package fr.mutualite.rh.model;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectif Precedent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.mutualite.rh.model.ObjectifPrecedent#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.ObjectifPrecedent#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link fr.mutualite.rh.model.ObjectifPrecedent#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 *
 * @see fr.mutualite.rh.model.MutPackage#getObjectifPrecedent()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface ObjectifPrecedent extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Objectif</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.mutualite.rh.model.Objectif#getEvaluationAtteinte <em>Evaluation Atteinte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectif</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif</em>' reference.
	 * @see #setObjectif(Objectif)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectifPrecedent_Objectif()
	 * @see fr.mutualite.rh.model.Objectif#getEvaluationAtteinte
	 * @model opposite="evaluationAtteinte"
	 * @generated
	 */
	Objectif getObjectif();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.ObjectifPrecedent#getObjectif <em>Objectif</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectif</em>' reference.
	 * @see #getObjectif()
	 * @generated
	 */
	void setObjectif(Objectif value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.mutualite.rh.model.EvaluationAtteinteObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' attribute.
	 * @see fr.mutualite.rh.model.EvaluationAtteinteObjectif
	 * @see #setEvaluation(EvaluationAtteinteObjectif)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectifPrecedent_Evaluation()
	 * @model required="true"
	 * @generated
	 */
	EvaluationAtteinteObjectif getEvaluation();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.ObjectifPrecedent#getEvaluation <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation</em>' attribute.
	 * @see fr.mutualite.rh.model.EvaluationAtteinteObjectif
	 * @see #getEvaluation()
	 * @generated
	 */
	void setEvaluation(EvaluationAtteinteObjectif value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see fr.mutualite.rh.model.MutPackage#getObjectifPrecedent_Commentaire()
	 * @model
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link fr.mutualite.rh.model.ObjectifPrecedent#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

} // ObjectifPrecedent
