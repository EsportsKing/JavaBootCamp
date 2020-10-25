package finalActivity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class employeeTest {

	private employee employee1 = new employee();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void testgetCompany() {
		assertEquals(employee1.getCompany(),"Unknown");
	}
	
	@Test
	public void testgetTitle() {
		assertEquals(employee1.getTitle(),"Unknown");
	}
	
	@Test
	public void testgetSalary() {
		assertEquals(employee1.getSalary(),0);
	}
	
	@Test
	public void testsetCompany() {
		employee1.setCompany("Blizzard");
		assertEquals(employee1.getCompany(),"Blizzard");
	}
	
	@Test
	public void testsetTitle() {
		employee1.setTitle("Developer");
		assertEquals(employee1.getTitle(),"Developer");
	}
	
	@Test
	public void testsetSalary() {
		employee1.setSalary(12345);
		assertEquals(employee1.getSalary(),12345);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
