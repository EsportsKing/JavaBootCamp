package finalActivity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class personTest {

	private person person1 = new person("Eliza Luse", 27);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setting up person Test");
	}
	
	@Test
	public void testgetName() {
		assertEquals("Eliza Luse", person1.getName());
	}
	
	@Test
	public void testgetAge() {
		assertEquals(27, person1.getAge());
	}
	
	@Test
	public void testsetName() {
		person1.setName("New Name");
		assertEquals("New Name", person1.getName());
	}
	
	@Test
	public void testsetAge() {
		person1.setAge(30);
		assertEquals(30, person1.getAge());
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tearomg down person Test");
	}
}
