package finalActivity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class studentsTest {

	students student1 = new students();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void testgetSchoolName() {
		assertEquals(student1.getSchoolName(), "Unknown");
	}
	
	@Test
	public void testsetSchoolName() {
		student1.setSchoolName("Kristin");
		assertEquals(student1.getSchoolName(), "Kristin");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
