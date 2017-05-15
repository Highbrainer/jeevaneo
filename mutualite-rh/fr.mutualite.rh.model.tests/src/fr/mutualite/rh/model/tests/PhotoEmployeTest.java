/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.MutFactory;
import fr.mutualite.rh.model.PhotoEmploye;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Photo Employe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhotoEmployeTest extends TestCase {

	/**
	 * The fixture for this Photo Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoEmploye fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PhotoEmployeTest.class);
	}

	/**
	 * Constructs a new Photo Employe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotoEmployeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Photo Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PhotoEmploye fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Photo Employe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoEmploye getFixture() {
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
		setFixture(MutFactory.eINSTANCE.createPhotoEmploye());
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

} //PhotoEmployeTest
