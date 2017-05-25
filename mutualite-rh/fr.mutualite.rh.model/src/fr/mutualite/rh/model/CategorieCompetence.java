/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Categorie Competence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getCategorieCompetence()
 * @model
 * @generated
 */
public enum CategorieCompetence implements Enumerator {
	/**
	 * The '<em><b>TECHNIQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TECHNIQUE_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNIQUE(0, "TECHNIQUE", "Comp\u00e9tences Techniques"),

	/**
	 * The '<em><b>ORGA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGA_VALUE
	 * @generated
	 * @ordered
	 */
	ORGA(1, "ORGA", "Comp\u00e9tences organisationnelles"),

	/**
	 * The '<em><b>RELATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATION_VALUE
	 * @generated
	 * @ordered
	 */
	RELATION(2, "RELATION", "Comp\u00e9tences relationnelles"),

	/**
	 * The '<em><b>MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGER(3, "MANAGER", "Comp\u00e9tences manag\u00e9riales"),

	/**
	 * The '<em><b>ECO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECO_VALUE
	 * @generated
	 * @ordered
	 */
	ECO(4, "ECO", "Comp\u00e9tences \u00e9conomiques / Environnement");

	/**
	 * The '<em><b>TECHNIQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TECHNIQUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TECHNIQUE
	 * @model literal="Comp\351tences Techniques"
	 * @generated
	 * @ordered
	 */
	public static final int TECHNIQUE_VALUE = 0;

	/**
	 * The '<em><b>ORGA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ORGA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGA
	 * @model literal="Comp\351tences organisationnelles"
	 * @generated
	 * @ordered
	 */
	public static final int ORGA_VALUE = 1;

	/**
	 * The '<em><b>RELATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATION
	 * @model literal="Comp\351tences relationnelles"
	 * @generated
	 * @ordered
	 */
	public static final int RELATION_VALUE = 2;

	/**
	 * The '<em><b>MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGER
	 * @model literal="Comp\351tences manag\351riales"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER_VALUE = 3;

	/**
	 * The '<em><b>ECO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECO
	 * @model literal="Comp\351tences \351conomiques / Environnement"
	 * @generated
	 * @ordered
	 */
	public static final int ECO_VALUE = 4;

	/**
	 * An array of all the '<em><b>Categorie Competence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CategorieCompetence[] VALUES_ARRAY =
		new CategorieCompetence[] {
			TECHNIQUE,
			ORGA,
			RELATION,
			MANAGER,
			ECO,
		};

	/**
	 * A public read-only list of all the '<em><b>Categorie Competence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CategorieCompetence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Categorie Competence</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorieCompetence get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategorieCompetence result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie Competence</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorieCompetence getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CategorieCompetence result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Categorie Competence</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CategorieCompetence get(int value) {
		switch (value) {
			case TECHNIQUE_VALUE: return TECHNIQUE;
			case ORGA_VALUE: return ORGA;
			case RELATION_VALUE: return RELATION;
			case MANAGER_VALUE: return MANAGER;
			case ECO_VALUE: return ECO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CategorieCompetence(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
	public List<Competence> competences() {
		return competences(this);
	}
	
	public static List<Competence> competences(CategorieCompetence cat) {
		switch (cat) {
		case TECHNIQUE:
			return Arrays.asList(Competence.RESPECT_PROCEDURES_NORMES, Competence.CAPACITE_DECELER_URGENCES);
		case ORGA:
			return Arrays.asList(Competence.AUTONOMIE, Competence.ANTICIPATION_ORGANISATION, Competence.VOLONTAIRE_DISPONIBLE);
		case RELATION:
			return Arrays.asList(Competence.COLLABORATION_COLLEGUES, Competence.COLLABORATION_CLIENTS, Competence.ECOUTE, Competence.IMAGE_POSITIVE);
		case MANAGER:
			return Arrays.asList(Competence.DELEGUER, Competence.REALISATION_OBJECTIFS, Competence.CONTROLE_OBJECTIFS, Competence.RENDRE_COMPTE, Competence.TRANSMETTRE);
		case ECO:
			return Arrays.asList(Competence.RESPECT_CONSIGNES_ENVIRONNEMENT, Competence.CONTRIBUTION_SECURITE);

		default:
			throw new IllegalStateException("Catégorie de Compétences non paramétrée: " + cat.getName() + " '" + cat.getLiteral() +"'");
		}
	}
	
} //CategorieCompetence
