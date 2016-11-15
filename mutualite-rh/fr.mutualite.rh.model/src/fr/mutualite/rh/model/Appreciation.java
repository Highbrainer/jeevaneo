/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Appreciation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getAppreciation()
 * @model
 * @generated
 */
public enum Appreciation implements Enumerator {
	/**
	 * The '<em><b>Satisfaisant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SATISFAISANT_VALUE
	 * @generated
	 * @ordered
	 */
	SATISFAISANT(0, "Satisfaisant", "Satisfaisant"),

	/**
	 * The '<em><b>ACompleter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOMPLETER_VALUE
	 * @generated
	 * @ordered
	 */
	ACOMPLETER(1, "ACompleter", "A compl\u00e9ter"),

	/**
	 * The '<em><b>Inutile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INUTILE_VALUE
	 * @generated
	 * @ordered
	 */
	INUTILE(2, "Inutile", "Inutile");

	/**
	 * The '<em><b>Satisfaisant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Satisfaisant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SATISFAISANT
	 * @model name="Satisfaisant"
	 * @generated
	 * @ordered
	 */
	public static final int SATISFAISANT_VALUE = 0;

	/**
	 * The '<em><b>ACompleter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACompleter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACOMPLETER
	 * @model name="ACompleter" literal="A compl\351ter"
	 * @generated
	 * @ordered
	 */
	public static final int ACOMPLETER_VALUE = 1;

	/**
	 * The '<em><b>Inutile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inutile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INUTILE
	 * @model name="Inutile"
	 * @generated
	 * @ordered
	 */
	public static final int INUTILE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Appreciation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Appreciation[] VALUES_ARRAY =
		new Appreciation[] {
			SATISFAISANT,
			ACOMPLETER,
			INUTILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Appreciation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Appreciation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Appreciation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appreciation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Appreciation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appreciation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appreciation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Appreciation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Appreciation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Appreciation get(int value) {
		switch (value) {
			case SATISFAISANT_VALUE: return SATISFAISANT;
			case ACOMPLETER_VALUE: return ACOMPLETER;
			case INUTILE_VALUE: return INUTILE;
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
	private Appreciation(int value, String name, String literal) {
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
	
} //Appreciation
