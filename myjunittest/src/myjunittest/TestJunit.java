package myjunittest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
	@Test // "@Test" makes this method into a test method:
	public void testAdd() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine",str); // check that str == "Junit is working fine"
	}
	
}