/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Classification Statut</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getClassificationStatut()
 * @model
 * @generated
 */
public enum ClassificationStatut implements Enumerator {
	/**
	 * The '<em><b>E1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E1_VALUE
	 * @generated
	 * @ordered
	 */
	E1(1, "E1", "E1"),

	/**
	 * The '<em><b>E2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E2_VALUE
	 * @generated
	 * @ordered
	 */
	E2(2, "E2", "E2"),

	/**
	 * The '<em><b>E3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E3_VALUE
	 * @generated
	 * @ordered
	 */
	E3(3, "E3", "E3"),

	/**
	 * The '<em><b>E4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E4_VALUE
	 * @generated
	 * @ordered
	 */
	E4(4, "E4", "E4"),

	/**
	 * The '<em><b>T1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T1_VALUE
	 * @generated
	 * @ordered
	 */
	T1(11, "T1", "T1"),

	/**
	 * The '<em><b>T2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #T2_VALUE
	 * @generated
	 * @ordered
	 */
	T2(12, "T2", "T2"),

	/**
	 * The '<em><b>C1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C1_VALUE
	 * @generated
	 * @ordered
	 */
	C1(21, "C1", "C1"),

	/**
	 * The '<em><b>C2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C2_VALUE
	 * @generated
	 * @ordered
	 */
	C2(22, "C2", "C2"),

	/**
	 * The '<em><b>C3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C3_VALUE
	 * @generated
	 * @ordered
	 */
	C3(23, "C3", "C3"),

	/**
	 * The '<em><b>C4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C4_VALUE
	 * @generated
	 * @ordered
	 */
	C4(24, "C4", "C4"),

	/**
	 * The '<em><b>D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D_VALUE
	 * @generated
	 * @ordered
	 */
	D(31, "D", "D"),

	/**
	 * The '<em><b>DENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENT_VALUE
	 * @generated
	 * @ordered
	 */
	DENT(29, "DENT", "Chirurgien Dentiste"), /**
	 * The '<em><b>ALTERNANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALTERNANCE(90, "ALTERNANCE", "En alternance"), /**
	 * The '<em><b>ADMINISTRATEUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATEUR_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATEUR(40, "ADMINISTRATEUR", "Administrateur"), /**
	 * The '<em><b>AUTRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTRE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTRE(-1, "AUTRE", "Autre cat\u00e9gorie"), /**
	 * The '<em><b>APPRENTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPRENTI_VALUE
	 * @generated
	 * @ordered
	 */
	APPRENTI(0, "APPRENTI", "APPRENTI");

	/**
	 * The '<em><b>E1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E1_VALUE = 1;

	/**
	 * The '<em><b>E2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E2_VALUE = 2;

	/**
	 * The '<em><b>E3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E3_VALUE = 3;

	/**
	 * The '<em><b>E4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int E4_VALUE = 4;

	/**
	 * The '<em><b>T1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T1_VALUE = 11;

	/**
	 * The '<em><b>T2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>T2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #T2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int T2_VALUE = 12;

	/**
	 * The '<em><b>C1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C1_VALUE = 21;

	/**
	 * The '<em><b>C2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C2_VALUE = 22;

	/**
	 * The '<em><b>C3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C3_VALUE = 23;

	/**
	 * The '<em><b>C4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C4_VALUE = 24;

	/**
	 * The '<em><b>D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D_VALUE = 31;

	/**
	 * The '<em><b>DENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DENT
	 * @model literal="Chirurgien Dentiste"
	 * @generated
	 * @ordered
	 */
	public static final int DENT_VALUE = 29;

	/**
	 * The '<em><b>ALTERNANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALTERNANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNANCE
	 * @model literal="En alternance"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNANCE_VALUE = 90;

	/**
	 * The '<em><b>ADMINISTRATEUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMINISTRATEUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATEUR
	 * @model literal="Administrateur"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATEUR_VALUE = 40;

	/**
	 * The '<em><b>AUTRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTRE
	 * @model literal="Autre cat\351gorie"
	 * @generated
	 * @ordered
	 */
	public static final int AUTRE_VALUE = -1;

	/**
	 * The '<em><b>APPRENTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPRENTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPRENTI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPRENTI_VALUE = 0;

	/**
	 * An array of all the '<em><b>Classification Statut</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassificationStatut[] VALUES_ARRAY =
		new ClassificationStatut[] {
			E1,
			E2,
			E3,
			E4,
			T1,
			T2,
			C1,
			C2,
			C3,
			C4,
			D,
			DENT,
			ALTERNANCE,
			ADMINISTRATEUR,
			AUTRE,
			APPRENTI,
		};

	/**
	 * A public read-only list of all the '<em><b>Classification Statut</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassificationStatut> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Classification Statut</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationStatut get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationStatut result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Statut</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationStatut getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassificationStatut result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Classification Statut</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClassificationStatut get(int value) {
		switch (value) {
			case E1_VALUE: return E1;
			case E2_VALUE: return E2;
			case E3_VALUE: return E3;
			case E4_VALUE: return E4;
			case T1_VALUE: return T1;
			case T2_VALUE: return T2;
			case C1_VALUE: return C1;
			case C2_VALUE: return C2;
			case C3_VALUE: return C3;
			case C4_VALUE: return C4;
			case D_VALUE: return D;
			case DENT_VALUE: return DENT;
			case ALTERNANCE_VALUE: return ALTERNANCE;
			case ADMINISTRATEUR_VALUE: return ADMINISTRATEUR;
			case AUTRE_VALUE: return AUTRE;
			case APPRENTI_VALUE: return APPRENTI;
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
	private ClassificationStatut(int value, String name, String literal) {
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
	
//	public static ClassificationStatut fromId(int id) {
//		switch(id) {
//		case -1 : return AUTRE;
//		case 0 : 
//		case 90 : return ALTERNANCE;
//		case 1 : return E1;
//		case 2 : return E2;
//		case 3 : return E3;
//		case 4 : return E4;
//		case 11 : return T1;
//		case 12 : return T2;
//		case 21 : return C1;
//		case 22 : return C2;
//		case 23 : return C3;
//		case 24 : return C4;
//		case 29 : return ClassificationStatut.CHIRURGIEN_DENTISTE;
//		case 31 : return D;
//		case 40 : return ADMINISTRATEUR;
//		default : throw new IllegalArgumentException("Code non supporté : " + id);
//		}
//	}
	
} //ClassificationStatut
