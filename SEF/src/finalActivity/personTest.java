package finalActivity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class personTest {

	private person person1 = new person("Eliza", "Luse", 27);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void testgetFirstName() {
		assertEquals("Eliza", person1.getFirstName());
	}
	
	@Test
	public void testgetSecondName() {
		assertEquals("Luse", person1.getSecondName());
	}
	
	@Test
	public void testgetAge() {
		assertEquals(27, person1.getAge());
	}
	
	@Test
	public void testsetFirstName() {
		person1.setFirstName("New Name");
		assertEquals("New Name", person1.getFirstName());
	}
	
	@Test
	public void testsetSecondName() {
		person1.setSecondName("Other Name");
		assertEquals("Other Name", person1.getSecondName());
	}
	
	@Test
	public void testsetAge() {
		person1.setAge(30);
		assertEquals(30, person1.getAge());
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
