/**
 */
package fr.mutualite.rh.model.tests;

import fr.mutualite.rh.model.dto.tests.DtoTests;
import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Mut</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MutAllTests("Mut Tests");
		suite.addTest(MutTests.suite());
		suite.addTest(DtoTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutAllTests(String name) {
		super(name);
	}

} //MutAllTests
