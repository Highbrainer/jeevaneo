/**
 */
package mutualite.rh.chequedej;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Etablissement Virtuel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mutualite.rh.chequedej.EtablissementVirtuel#getMatriculesEmployes <em>Matricules Employes</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.EtablissementVirtuel#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link mutualite.rh.chequedej.EtablissementVirtuel#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementVirtuel()
 * @model
 * @generated
 */
public interface EtablissementVirtuel extends EObject {
	/**
	 * Returns the value of the '<em><b>Matricules Employes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matricules Employes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matricules Employes</em>' attribute list.
	 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementVirtuel_MatriculesEmployes()
	 * @model
	 * @generated
	 */
	EList<Integer> getMatriculesEmployes();

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
	 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementVirtuel_Libelle()
	 * @model required="true"
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.EtablissementVirtuel#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see mutualite.rh.chequedej.ChequedejPackage#getEtablissementVirtuel_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link mutualite.rh.chequedej.EtablissementVirtuel#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EtablissementVirtuel
