/**
 */
package fr.mutualite.rh.model.dto.tests;

import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.UISessionFormation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Session Formation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UISessionFormationTest extends TestCase {

	/**
	 * The fixture for this UI Session Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISessionFormation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UISessionFormationTest.class);
	}

	/**
	 * Constructs a new UI Session Formation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISessionFormationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Session Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UISessionFormation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Session Formation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISessionFormation getFixture() {
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
		setFixture(DtoFactory.eINSTANCE.createUISessionFormation());
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

} //UISessionFormationTest
