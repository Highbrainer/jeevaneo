/**
 */
package fr.mutualite.rh.conges.tests;

import fr.mutualite.rh.conges.CongesFactory;
import fr.mutualite.rh.conges.Employe;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EmployeTest extends TestCase {

	/**
	 * The fixture for this Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Employe fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EmployeTest.class);
	}

	/**
	 * Constructs a new Employe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Employe fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Employe getFixture() {
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
		setFixture(CongesFactory.eINSTANCE.createEmploye());
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

} //EmployeTest
