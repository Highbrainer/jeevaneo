/**
 */
package fr.mutualite.rh.conges.tests;

import fr.mutualite.rh.conges.Conge;
import fr.mutualite.rh.conges.CongesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CongeTest extends TestCase {

	/**
	 * The fixture for this Conge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conge fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CongeTest.class);
	}

	/**
	 * Constructs a new Conge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CongeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Conge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Conge fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Conge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conge getFixture() {
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
		setFixture(CongesFactory.eINSTANCE.createConge());
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

} //CongeTest
