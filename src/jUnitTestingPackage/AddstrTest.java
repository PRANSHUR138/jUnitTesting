package jUnitTestingPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AddstrTest {

	@Test
	public void test() {
		jUnitFunction junitstr= new jUnitFunction();
		String result= junitstr.addstr("Capstone","Project");
		assertEquals("CapstoneProject", result);
	}

}
