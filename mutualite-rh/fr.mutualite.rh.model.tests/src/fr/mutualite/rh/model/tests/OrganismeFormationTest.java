/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.OrganismeFormation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Organisme Formation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrganismeFormationTest extends TestCase {

	/**
	 * The fixture for this Organisme Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganismeFormation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrganismeFormationTest.class);
	}

	/**
	 * Constructs a new Organisme Formation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganismeFormationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Organisme Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrganismeFormation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Organisme Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganismeFormation getFixture() {
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
		setFixture(MutFactory.eINSTANCE.createOrganismeFormation());
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

} //OrganismeFormationTest
