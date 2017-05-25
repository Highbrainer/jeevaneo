/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Savoir Etre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getSavoirEtre()
 * @model
 * @generated
 */
public enum SavoirEtre implements Enumerator {
	/**
	 * The '<em><b>Assiduite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIDUITE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIDUITE(0, "Assiduite", "Assiduite /ponctualit\u00e9"),

	/**
	 * The '<em><b>Tenue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TENUE_VALUE
	 * @generated
	 * @ordered
	 */
	TENUE(1, "Tenue", "Tenue (comportementale et vestimentaire)"),

	/**
	 * The '<em><b>Motivation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION_VALUE
	 * @generated
	 * @ordered
	 */
	MOTIVATION(2, "Motivation", "Motivation/implication (r\u00e9gularit\u00e9 dans le travail)"),

	/**
	 * The '<em><b>Esprit Equipe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESPRIT_EQUIPE_VALUE
	 * @generated
	 * @ordered
	 */
	ESPRIT_EQUIPE(3, "EspritEquipe", "Esprit d\'\u00e9quipe (bon \u00e9tat d\'esprit)"),

	/**
	 * The '<em><b>Esprit Initiative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESPRIT_INITIATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ESPRIT_INITIATIVE(4, "EspritInitiative", "Esprit d\'initiative"),

	/**
	 * The '<em><b>Rigueur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGUEUR_VALUE
	 * @generated
	 * @ordered
	 */
	RIGUEUR(5, "Rigueur", "Rigueur"),

	/**
	 * The '<em><b>Dynamisme</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMISME_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMISME(6, "Dynamisme", "Dynamisme"),

	/**
	 * The '<em><b>Discretion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCRETION_VALUE
	 * @generated
	 * @ordered
	 */
	DISCRETION(7, "Discretion", "Discr\u00e9tion/confidentialit\u00e9"),

	/**
	 * The '<em><b>Controle Soi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLE_SOI_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLE_SOI(8, "ControleSoi", "Contr\u00f4le de soi"),

	/**
	 * The '<em><b>Perseverance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSEVERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PERSEVERANCE(9, "Perseverance", "Pers\u00e9v\u00e9rance"),

	/**
	 * The '<em><b>Adaptation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTATION(10, "Adaptation", "Facult\u00e9 d\'adaptation");

	/**
	 * The '<em><b>Assiduite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assiduite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIDUITE
	 * @model name="Assiduite" literal="Assiduite /ponctualit\351"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIDUITE_VALUE = 0;

	/**
	 * The '<em><b>Tenue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tenue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TENUE
	 * @model name="Tenue" literal="Tenue (comportementale et vestimentaire)"
	 * @generated
	 * @ordered
	 */
	public static final int TENUE_VALUE = 1;

	/**
	 * The '<em><b>Motivation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Motivation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOTIVATION
	 * @model name="Motivation" literal="Motivation/implication (r\351gularit\351 dans le travail)"
	 * @generated
	 * @ordered
	 */
	public static final int MOTIVATION_VALUE = 2;

	/**
	 * The '<em><b>Esprit Equipe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esprit Equipe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESPRIT_EQUIPE
	 * @model name="EspritEquipe" literal="Esprit d\'\351quipe (bon \351tat d\'esprit)"
	 * @generated
	 * @ordered
	 */
	public static final int ESPRIT_EQUIPE_VALUE = 3;

	/**
	 * The '<em><b>Esprit Initiative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esprit Initiative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESPRIT_INITIATIVE
	 * @model name="EspritInitiative" literal="Esprit d\'initiative"
	 * @generated
	 * @ordered
	 */
	public static final int ESPRIT_INITIATIVE_VALUE = 4;

	/**
	 * The '<em><b>Rigueur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rigueur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGUEUR
	 * @model name="Rigueur"
	 * @generated
	 * @ordered
	 */
	public static final int RIGUEUR_VALUE = 5;

	/**
	 * The '<em><b>Dynamisme</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamisme</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMISME
	 * @model name="Dynamisme"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMISME_VALUE = 6;

	/**
	 * The '<em><b>Discretion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discretion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCRETION
	 * @model name="Discretion" literal="Discr\351tion/confidentialit\351"
	 * @generated
	 * @ordered
	 */
	public static final int DISCRETION_VALUE = 7;

	/**
	 * The '<em><b>Controle Soi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Controle Soi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLE_SOI
	 * @model name="ControleSoi" literal="Contr\364le de soi"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLE_SOI_VALUE = 8;

	/**
	 * The '<em><b>Perseverance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perseverance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSEVERANCE
	 * @model name="Perseverance" literal="Pers\351v\351rance"
	 * @generated
	 * @ordered
	 */
	public static final int PERSEVERANCE_VALUE = 9;

	/**
	 * The '<em><b>Adaptation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adaptation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADAPTATION
	 * @model name="Adaptation" literal="Facult\351 d\'adaptation"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTATION_VALUE = 10;

	/**
	 * An array of all the '<em><b>Savoir Etre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SavoirEtre[] VALUES_ARRAY =
		new SavoirEtre[] {
			ASSIDUITE,
			TENUE,
			MOTIVATION,
			ESPRIT_EQUIPE,
			ESPRIT_INITIATIVE,
			RIGUEUR,
			DYNAMISME,
			DISCRETION,
			CONTROLE_SOI,
			PERSEVERANCE,
			ADAPTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Savoir Etre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SavoirEtre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Savoir Etre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SavoirEtre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SavoirEtre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Savoir Etre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SavoirEtre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SavoirEtre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Savoir Etre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SavoirEtre get(int value) {
		switch (value) {
			case ASSIDUITE_VALUE: return ASSIDUITE;
			case TENUE_VALUE: return TENUE;
			case MOTIVATION_VALUE: return MOTIVATION;
			case ESPRIT_EQUIPE_VALUE: return ESPRIT_EQUIPE;
			case ESPRIT_INITIATIVE_VALUE: return ESPRIT_INITIATIVE;
			case RIGUEUR_VALUE: return RIGUEUR;
			case DYNAMISME_VALUE: return DYNAMISME;
			case DISCRETION_VALUE: return DISCRETION;
			case CONTROLE_SOI_VALUE: return CONTROLE_SOI;
			case PERSEVERANCE_VALUE: return PERSEVERANCE;
			case ADAPTATION_VALUE: return ADAPTATION;
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
	private SavoirEtre(int value, String name, String literal) {
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
	
} //SavoirEtre
