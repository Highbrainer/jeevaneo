/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.Objectif;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Objectif</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectifTest extends TestCase {

	/**
	 * The fixture for this Objectif test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objectif fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectifTest.class);
	}

	/**
	 * Constructs a new Objectif test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Objectif test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Objectif fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Objectif test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objectif getFixture() {
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
		setFixture(MutFactory.eINSTANCE.createObjectif());
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

} //ObjectifTest
