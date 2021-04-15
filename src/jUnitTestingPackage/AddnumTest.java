package jUnitTestingPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AddnumTest {

	@Test
	public void test() {
		jUnitFunction junit= new jUnitFunction();
		int result= junit.addnum(100,200);
		assertEquals(300,result);
	}

}
