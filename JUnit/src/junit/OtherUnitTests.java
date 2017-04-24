package junit;

import org.junit.*; // to use JUnit:
import static org.junit.Assert.assertEquals; // to do the specific JUnit test for checking a value:

public class OtherUnitTests {
	
	private int value1 = 1;
	private int value2 = 2;
	
	@Test // "@Test" makes this method into a test method:
	public void testAdd() {
		int result = value1 + value2;
		assertEquals(result, 3); // check that result == 3
	}
	
	@Test // "@Test" makes this method into a test method:
	public void testSubtract() {
		int result = value1 - value2;
		assertEquals(result, -1); // check that result == -1
	}
	
	@Test // "@Test" makes this method into a test method:
	public void testExampleOfFail() {
		assertEquals(1, 2); // check that 1 == 2
	}
	
}