/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Avis</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getAvis()
 * @model
 * @generated
 */
public enum Avis implements Enumerator {
	/**
	 * The '<em><b>Favorable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAVORABLE_VALUE
	 * @generated
	 * @ordered
	 */
	FAVORABLE(0, "Favorable", "Favorable"),

	/**
	 * The '<em><b>Non Favorable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_FAVORABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NON_FAVORABLE(1, "NonFavorable", "Non favorable"),

	/**
	 * The '<em><b>Favorable Non Prioritaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAVORABLE_NON_PRIORITAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	FAVORABLE_NON_PRIORITAIRE(2, "FavorableNonPrioritaire", "Favorable mais non prioritaire");

	/**
	 * The '<em><b>Favorable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Favorable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAVORABLE
	 * @model name="Favorable"
	 * @generated
	 * @ordered
	 */
	public static final int FAVORABLE_VALUE = 0;

	/**
	 * The '<em><b>Non Favorable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Favorable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_FAVORABLE
	 * @model name="NonFavorable" literal="Non favorable"
	 * @generated
	 * @ordered
	 */
	public static final int NON_FAVORABLE_VALUE = 1;

	/**
	 * The '<em><b>Favorable Non Prioritaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Favorable Non Prioritaire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAVORABLE_NON_PRIORITAIRE
	 * @model name="FavorableNonPrioritaire" literal="Favorable mais non prioritaire"
	 * @generated
	 * @ordered
	 */
	public static final int FAVORABLE_NON_PRIORITAIRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Avis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Avis[] VALUES_ARRAY =
		new Avis[] {
			FAVORABLE,
			NON_FAVORABLE,
			FAVORABLE_NON_PRIORITAIRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Avis</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Avis> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Avis</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Avis get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Avis result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Avis</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Avis getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Avis result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Avis</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Avis get(int value) {
		switch (value) {
			case FAVORABLE_VALUE: return FAVORABLE;
			case NON_FAVORABLE_VALUE: return NON_FAVORABLE;
			case FAVORABLE_NON_PRIORITAIRE_VALUE: return FAVORABLE_NON_PRIORITAIRE;
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
	private Avis(int value, String name, String literal) {
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
	
} //Avis
