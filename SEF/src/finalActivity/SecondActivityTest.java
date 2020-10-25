package finalActivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecondActivityTest {

	@Test
	public void testadd() {
		assertEquals(99, SecondActivity.add(44 , 55));
	}
	
	@Test
	public void testsubtract() {
		assertEquals(-11, SecondActivity.subtract(44 , 55));
	}
	
	@Test
	public void testmultiply() {
		assertEquals(143, SecondActivity.multiply(11 , 13));
	}
	
	@Test
	public void testdivide() {
		assertEquals(0.25, SecondActivity.divide(25 , 101), 0.01);
	}

}
