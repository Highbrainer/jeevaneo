/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.Item#getSuccursale <em>Succursale</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getNbCheques <em>Nb Cheques</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisPrecedent <em>Nb Jours Entiers Mois Precedent</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisSuivant <em>Nb Jours Entiers Mois Suivant</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getNom <em>Nom</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.Item#getPrenom <em>Prenom</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Succursale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succursale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succursale</em>' reference.
	 * @see #setSuccursale(Succursale)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_Succursale()
	 * @model required="true"
	 * @generated
	 */
	Succursale getSuccursale();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getSuccursale <em>Succursale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succursale</em>' reference.
	 * @see #getSuccursale()
	 * @generated
	 */
	void setSuccursale(Succursale value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_Matricule()
	 * @model required="true"
	 * @generated
	 */
	int getMatricule();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getMatricule <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matricule</em>' attribute.
	 * @see #getMatricule()
	 * @generated
	 */
	void setMatricule(int value);

	/**
	 * Returns the value of the '<em><b>Nb Cheques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Cheques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Cheques</em>' attribute.
	 * @see #setNbCheques(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_NbCheques()
	 * @model required="true"
	 * @generated
	 */
	int getNbCheques();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getNbCheques <em>Nb Cheques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Cheques</em>' attribute.
	 * @see #getNbCheques()
	 * @generated
	 */
	void setNbCheques(int value);

	/**
	 * Returns the value of the '<em><b>Nb Jours Entiers Mois Precedent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Jours Entiers Mois Precedent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Jours Entiers Mois Precedent</em>' attribute.
	 * @see #setNbJoursEntiersMoisPrecedent(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_NbJoursEntiersMoisPrecedent()
	 * @model required="true"
	 * @generated
	 */
	int getNbJoursEntiersMoisPrecedent();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisPrecedent <em>Nb Jours Entiers Mois Precedent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Jours Entiers Mois Precedent</em>' attribute.
	 * @see #getNbJoursEntiersMoisPrecedent()
	 * @generated
	 */
	void setNbJoursEntiersMoisPrecedent(int value);

	/**
	 * Returns the value of the '<em><b>Nb Jours Entiers Mois Suivant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Jours Entiers Mois Suivant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Jours Entiers Mois Suivant</em>' attribute.
	 * @see #setNbJoursEntiersMoisSuivant(int)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_NbJoursEntiersMoisSuivant()
	 * @model required="true"
	 * @generated
	 */
	int getNbJoursEntiersMoisSuivant();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getNbJoursEntiersMoisSuivant <em>Nb Jours Entiers Mois Suivant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Jours Entiers Mois Suivant</em>' attribute.
	 * @see #getNbJoursEntiersMoisSuivant()
	 * @generated
	 */
	void setNbJoursEntiersMoisSuivant(int value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_Commentaire()
	 * @model
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_Nom()
	 * @model required="true"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getItem_Prenom()
	 * @model required="true"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.Item#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

} // Item
