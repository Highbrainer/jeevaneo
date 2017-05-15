/**
 */
package fr.mutualite.rh.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Competence</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.mutualite.rh.model.MutPackage#getCompetence()
 * @model
 * @generated
 */
public enum Competence implements Enumerator {
	/**
	 * The '<em><b>Respect Procedures Normes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPECT_PROCEDURES_NORMES_VALUE
	 * @generated
	 * @ordered
	 */
	RESPECT_PROCEDURES_NORMES(0, "RespectProceduresNormes", "RespectProceduresNormes"),

	/**
	 * The '<em><b>Capacite Deceler Urgences</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPACITE_DECELER_URGENCES_VALUE
	 * @generated
	 * @ordered
	 */
	CAPACITE_DECELER_URGENCES(1, "CapaciteDecelerUrgences", "CapaciteDecelerUrgences"),

	/**
	 * The '<em><b>Autonomie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTONOMIE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTONOMIE(2, "Autonomie", "Autonomie"),

	/**
	 * The '<em><b>Anticipation Organisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATION_ORGANISATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANTICIPATION_ORGANISATION(3, "AnticipationOrganisation", "AnticipationOrganisation"),

	/**
	 * The '<em><b>Volontaire Disponible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOLONTAIRE_DISPONIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	VOLONTAIRE_DISPONIBLE(4, "VolontaireDisponible", "VolontaireDisponible"),

	/**
	 * The '<em><b>Collaboration Collegues</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_COLLEGUES_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION_COLLEGUES(5, "CollaborationCollegues", "CollaborationCollegues"),

	/**
	 * The '<em><b>Collaboration Clients</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_CLIENTS_VALUE
	 * @generated
	 * @ordered
	 */
	COLLABORATION_CLIENTS(6, "CollaborationClients", "CollaborationClients"),

	/**
	 * The '<em><b>Ecoute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECOUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ECOUTE(7, "Ecoute", "Ecoute"),

	/**
	 * The '<em><b>Image Positive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_POSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_POSITIVE(8, "ImagePositive", "ImagePositive"),

	/**
	 * The '<em><b>Deleguer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELEGUER_VALUE
	 * @generated
	 * @ordered
	 */
	DELEGUER(9, "Deleguer", "Deleguer"),

	/**
	 * The '<em><b>Realisation Objectifs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALISATION_OBJECTIFS_VALUE
	 * @generated
	 * @ordered
	 */
	REALISATION_OBJECTIFS(10, "RealisationObjectifs", "RealisationObjectifs"),

	/**
	 * The '<em><b>Controle Objectifs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLE_OBJECTIFS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLE_OBJECTIFS(11, "ControleObjectifs", "ControleObjectifs"),

	/**
	 * The '<em><b>Rendre Compte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENDRE_COMPTE_VALUE
	 * @generated
	 * @ordered
	 */
	RENDRE_COMPTE(12, "RendreCompte", "RendreCompte"),

	/**
	 * The '<em><b>Transmettre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMETTRE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMETTRE(13, "Transmettre", "Transmettre"),

	/**
	 * The '<em><b>Respect Consignes Environnement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPECT_CONSIGNES_ENVIRONNEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RESPECT_CONSIGNES_ENVIRONNEMENT(14, "RespectConsignesEnvironnement", "RespectConsignesEnvironnement"),

	/**
	 * The '<em><b>Contribution Securite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTION_SECURITE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTION_SECURITE(15, "ContributionSecurite", "ContributionSecurite");

	/**
	 * The '<em><b>Respect Procedures Normes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Respect Procedures Normes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPECT_PROCEDURES_NORMES
	 * @model name="RespectProceduresNormes"
	 * @generated
	 * @ordered
	 */
	public static final int RESPECT_PROCEDURES_NORMES_VALUE = 0;

	/**
	 * The '<em><b>Capacite Deceler Urgences</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Capacite Deceler Urgences</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPACITE_DECELER_URGENCES
	 * @model name="CapaciteDecelerUrgences"
	 * @generated
	 * @ordered
	 */
	public static final int CAPACITE_DECELER_URGENCES_VALUE = 1;

	/**
	 * The '<em><b>Autonomie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Autonomie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTONOMIE
	 * @model name="Autonomie"
	 * @generated
	 * @ordered
	 */
	public static final int AUTONOMIE_VALUE = 2;

	/**
	 * The '<em><b>Anticipation Organisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Anticipation Organisation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTICIPATION_ORGANISATION
	 * @model name="AnticipationOrganisation"
	 * @generated
	 * @ordered
	 */
	public static final int ANTICIPATION_ORGANISATION_VALUE = 3;

	/**
	 * The '<em><b>Volontaire Disponible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Volontaire Disponible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOLONTAIRE_DISPONIBLE
	 * @model name="VolontaireDisponible"
	 * @generated
	 * @ordered
	 */
	public static final int VOLONTAIRE_DISPONIBLE_VALUE = 4;

	/**
	 * The '<em><b>Collaboration Collegues</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collaboration Collegues</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_COLLEGUES
	 * @model name="CollaborationCollegues"
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_COLLEGUES_VALUE = 5;

	/**
	 * The '<em><b>Collaboration Clients</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collaboration Clients</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLABORATION_CLIENTS
	 * @model name="CollaborationClients"
	 * @generated
	 * @ordered
	 */
	public static final int COLLABORATION_CLIENTS_VALUE = 6;

	/**
	 * The '<em><b>Ecoute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ecoute</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECOUTE
	 * @model name="Ecoute"
	 * @generated
	 * @ordered
	 */
	public static final int ECOUTE_VALUE = 7;

	/**
	 * The '<em><b>Image Positive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Image Positive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_POSITIVE
	 * @model name="ImagePositive"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_POSITIVE_VALUE = 8;

	/**
	 * The '<em><b>Deleguer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleguer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELEGUER
	 * @model name="Deleguer"
	 * @generated
	 * @ordered
	 */
	public static final int DELEGUER_VALUE = 9;

	/**
	 * The '<em><b>Realisation Objectifs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Realisation Objectifs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALISATION_OBJECTIFS
	 * @model name="RealisationObjectifs"
	 * @generated
	 * @ordered
	 */
	public static final int REALISATION_OBJECTIFS_VALUE = 10;

	/**
	 * The '<em><b>Controle Objectifs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Controle Objectifs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROLE_OBJECTIFS
	 * @model name="ControleObjectifs"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLE_OBJECTIFS_VALUE = 11;

	/**
	 * The '<em><b>Rendre Compte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rendre Compte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RENDRE_COMPTE
	 * @model name="RendreCompte"
	 * @generated
	 * @ordered
	 */
	public static final int RENDRE_COMPTE_VALUE = 12;

	/**
	 * The '<em><b>Transmettre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmettre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMETTRE
	 * @model name="Transmettre"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMETTRE_VALUE = 13;

	/**
	 * The '<em><b>Respect Consignes Environnement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Respect Consignes Environnement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPECT_CONSIGNES_ENVIRONNEMENT
	 * @model name="RespectConsignesEnvironnement"
	 * @generated
	 * @ordered
	 */
	public static final int RESPECT_CONSIGNES_ENVIRONNEMENT_VALUE = 14;

	/**
	 * The '<em><b>Contribution Securite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contribution Securite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTION_SECURITE
	 * @model name="ContributionSecurite"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTION_SECURITE_VALUE = 15;

	/**
	 * An array of all the '<em><b>Competence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Competence[] VALUES_ARRAY =
		new Competence[] {
			RESPECT_PROCEDURES_NORMES,
			CAPACITE_DECELER_URGENCES,
			AUTONOMIE,
			ANTICIPATION_ORGANISATION,
			VOLONTAIRE_DISPONIBLE,
			COLLABORATION_COLLEGUES,
			COLLABORATION_CLIENTS,
			ECOUTE,
			IMAGE_POSITIVE,
			DELEGUER,
			REALISATION_OBJECTIFS,
			CONTROLE_OBJECTIFS,
			RENDRE_COMPTE,
			TRANSMETTRE,
			RESPECT_CONSIGNES_ENVIRONNEMENT,
			CONTRIBUTION_SECURITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Competence</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Competence> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Competence</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Competence get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Competence result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Competence</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Competence getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Competence result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Competence</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Competence get(int value) {
		switch (value) {
			case RESPECT_PROCEDURES_NORMES_VALUE: return RESPECT_PROCEDURES_NORMES;
			case CAPACITE_DECELER_URGENCES_VALUE: return CAPACITE_DECELER_URGENCES;
			case AUTONOMIE_VALUE: return AUTONOMIE;
			case ANTICIPATION_ORGANISATION_VALUE: return ANTICIPATION_ORGANISATION;
			case VOLONTAIRE_DISPONIBLE_VALUE: return VOLONTAIRE_DISPONIBLE;
			case COLLABORATION_COLLEGUES_VALUE: return COLLABORATION_COLLEGUES;
			case COLLABORATION_CLIENTS_VALUE: return COLLABORATION_CLIENTS;
			case ECOUTE_VALUE: return ECOUTE;
			case IMAGE_POSITIVE_VALUE: return IMAGE_POSITIVE;
			case DELEGUER_VALUE: return DELEGUER;
			case REALISATION_OBJECTIFS_VALUE: return REALISATION_OBJECTIFS;
			case CONTROLE_OBJECTIFS_VALUE: return CONTROLE_OBJECTIFS;
			case RENDRE_COMPTE_VALUE: return RENDRE_COMPTE;
			case TRANSMETTRE_VALUE: return TRANSMETTRE;
			case RESPECT_CONSIGNES_ENVIRONNEMENT_VALUE: return RESPECT_CONSIGNES_ENVIRONNEMENT;
			case CONTRIBUTION_SECURITE_VALUE: return CONTRIBUTION_SECURITE;
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
	private Competence(int value, String name, String literal) {
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
	
} //Competence
