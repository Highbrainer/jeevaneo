/**
 */
package fr.mutualite.rh.conges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Conge</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.conges.CongesPackage#getTypeConge()
 * @model
 * @generated
 */
public enum TypeConge implements Enumerator {
	/**
	 * The '<em><b>CP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CP_VALUE
	 * @generated
	 * @ordered
	 */
	CP(950, "CP", "Cong\u00e9s Pay\u00e9s"),

	/**
	 * The '<em><b>ANCIENNETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANCIENNETE_VALUE
	 * @generated
	 * @ordered
	 */
	ANCIENNETE(951, "ANCIENNETE", "Cong\u00e9s d\'Anciennet\u00e9"),

	/**
	 * The '<em><b>FRACTIONNEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRACTIONNEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	FRACTIONNEMENT(952, "FRACTIONNEMENT", "Cong\u00e9s de Fractionnement"),

	/**
	 * The '<em><b>PONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PONT_VALUE
	 * @generated
	 * @ordered
	 */
	PONT(955, "PONT", "Pont"),

	/**
	 * The '<em><b>SOLIDARITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLIDARITE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLIDARITE(953, "SOLIDARITE", "Cong\u00e9 Solidarit\u00e9");

	/**
	 * The '<em><b>CP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CP
	 * @model literal="Cong\351s Pay\351s"
	 * @generated
	 * @ordered
	 */
	public static final int CP_VALUE = 950;

	/**
	 * The '<em><b>ANCIENNETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANCIENNETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANCIENNETE
	 * @model literal="Cong\351s d\'Anciennet\351"
	 * @generated
	 * @ordered
	 */
	public static final int ANCIENNETE_VALUE = 951;

	/**
	 * The '<em><b>FRACTIONNEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FRACTIONNEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRACTIONNEMENT
	 * @model literal="Cong\351s de Fractionnement"
	 * @generated
	 * @ordered
	 */
	public static final int FRACTIONNEMENT_VALUE = 952;

	/**
	 * The '<em><b>PONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PONT
	 * @model literal="Pont"
	 * @generated
	 * @ordered
	 */
	public static final int PONT_VALUE = 955;

	/**
	 * The '<em><b>SOLIDARITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLIDARITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLIDARITE
	 * @model literal="Cong\351 Solidarit\351"
	 * @generated
	 * @ordered
	 */
	public static final int SOLIDARITE_VALUE = 953;

	/**
	 * An array of all the '<em><b>Type Conge</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeConge[] VALUES_ARRAY =
		new TypeConge[] {
			CP,
			ANCIENNETE,
			FRACTIONNEMENT,
			PONT,
			SOLIDARITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Conge</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeConge> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Conge</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConge get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeConge result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Conge</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConge getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeConge result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Conge</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeConge get(int value) {
		switch (value) {
			case CP_VALUE: return CP;
			case ANCIENNETE_VALUE: return ANCIENNETE;
			case FRACTIONNEMENT_VALUE: return FRACTIONNEMENT;
			case PONT_VALUE: return PONT;
			case SOLIDARITE_VALUE: return SOLIDARITE;
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
	private TypeConge(int value, String name, String literal) {
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
	
} //TypeConge
