/**
 */
package fr.mutualite.rh.model.dto.tests;

import fr.mutualite.rh.model.dto.DtoFactory;
import fr.mutualite.rh.model.dto.UIEmploye;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>UI Employe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UIEmployeTest extends TestCase {

	/**
	 * The fixture for this UI Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIEmploye fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UIEmployeTest.class);
	}

	/**
	 * Constructs a new UI Employe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIEmployeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this UI Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UIEmploye fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this UI Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIEmploye getFixture() {
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
		setFixture(DtoFactory.eINSTANCE.createUIEmploye());
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

} //UIEmployeTest
