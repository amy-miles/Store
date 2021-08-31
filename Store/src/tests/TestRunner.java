package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//import tests.TestProductLogic;

/**
 * @author Amy Miles - almiles
 * CIS 175 - Fall 2021
 * Aug 30, 2021
 * this class runs TestEmployeeLogic class
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Result result = JUnitCore.runClasses(TestSoda.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
