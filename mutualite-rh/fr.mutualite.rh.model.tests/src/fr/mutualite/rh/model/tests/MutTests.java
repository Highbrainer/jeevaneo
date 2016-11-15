/**
 */
package fr.mutualite.rh.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>model</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MutTests extends TestSuite {

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
		TestSuite suite = new MutTests("model Tests");
		suite.addTestSuite(EmployeTest.class);
		suite.addTestSuite(EntretienProfessionnelTest.class);
		suite.addTestSuite(AppreciationSessionFormationTest.class);
		suite.addTestSuite(SouhaitFormationEvaluateurTest.class);
		suite.addTestSuite(SouhaitFormationSalarieTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutTests(String name) {
		super(name);
	}

} //MutTests
