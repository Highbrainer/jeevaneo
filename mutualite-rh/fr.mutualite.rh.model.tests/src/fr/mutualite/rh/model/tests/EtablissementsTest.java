/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.Etablissements;
import fr.mutualite.rh.model.MutFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Etablissements</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EtablissementsTest extends TestCase {

	/**
	 * The fixture for this Etablissements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Etablissements fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EtablissementsTest.class);
	}

	/**
	 * Constructs a new Etablissements test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtablissementsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Etablissements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Etablissements fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Etablissements test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Etablissements getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MutFactory.eINSTANCE.createEtablissements());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EtablissementsTest
