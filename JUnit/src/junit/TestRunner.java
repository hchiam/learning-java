package junit;

import org.junit.runner.JUnitCore; // has .runClasses()
import org.junit.runner.Result; // let's you get results of .runClasses()
import org.junit.runner.notification.Failure; // to get Failure messages for printing

public class TestRunner {
	
	public static void main(String[] args) {
		
		// run the test classes:
		Result result = JUnitCore.runClasses(TestJunit.class, OtherUnitTests.class);
		
		// the rest is just for printing back any failures and whether all tests passed successfully
		
		// print out each Failure message:
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		// print out whether all unit tests were passed (true or false):
		System.out.println(result.wasSuccessful());
		
	}
}