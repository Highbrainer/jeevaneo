/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Atteinte Objectif</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getEvaluationAtteinteObjectif()
 * @model
 * @generated
 */
public enum EvaluationAtteinteObjectif implements Enumerator {
	/**
	 * The '<em><b>NON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_VALUE
	 * @generated
	 * @ordered
	 */
	NON(0, "NON", "Non atteint"),

	/**
	 * The '<em><b>PARTIEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIEL(1, "PARTIEL", "Partiellement atteint"),

	/**
	 * The '<em><b>OUI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUI_VALUE
	 * @generated
	 * @ordered
	 */
	OUI(2, "OUI", "Atteint");

	/**
	 * The '<em><b>NON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON
	 * @model literal="Non atteint"
	 * @generated
	 * @ordered
	 */
	public static final int NON_VALUE = 0;

	/**
	 * The '<em><b>PARTIEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIEL
	 * @model literal="Partiellement atteint"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIEL_VALUE = 1;

	/**
	 * The '<em><b>OUI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUI
	 * @model literal="Atteint"
	 * @generated
	 * @ordered
	 */
	public static final int OUI_VALUE = 2;

	/**
	 * An array of all the '<em><b>Evaluation Atteinte Objectif</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluationAtteinteObjectif[] VALUES_ARRAY =
		new EvaluationAtteinteObjectif[] {
			NON,
			PARTIEL,
			OUI,
		};

	/**
	 * A public read-only list of all the '<em><b>Evaluation Atteinte Objectif</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluationAtteinteObjectif> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluation Atteinte Objectif</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationAtteinteObjectif get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationAtteinteObjectif result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Atteinte Objectif</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationAtteinteObjectif getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationAtteinteObjectif result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluation Atteinte Objectif</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvaluationAtteinteObjectif get(int value) {
		switch (value) {
			case NON_VALUE: return NON;
			case PARTIEL_VALUE: return PARTIEL;
			case OUI_VALUE: return OUI;
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
	private EvaluationAtteinteObjectif(int value, String name, String literal) {
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
	
} //EvaluationAtteinteObjectif
