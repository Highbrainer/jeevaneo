/**
 */
package mutualite.rh.chequedej.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>chequedej</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChequedejTests extends TestSuite {

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
		TestSuite suite = new ChequedejTests("chequedej Tests");
		suite.addTestSuite(ChequeDejTest.class);
		suite.addTestSuite(CommandeTest.class);
		suite.addTestSuite(CarnetTest.class);
		suite.addTestSuite(SoldeTest.class);
		suite.addTestSuite(SoldeIndividuelTest.class);
		suite.addTestSuite(DejeTest.class);
		suite.addTestSuite(DejeIndividuelTest.class);
		suite.addTestSuite(DejeMensuelTest.class);
		suite.addTestSuite(ChoixTest.class);
		suite.addTestSuite(ContratsTest.class);
		suite.addTestSuite(ContratTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChequedejTests(String name) {
		super(name);
	}

} //ChequedejTests
