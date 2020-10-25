package finalActivity;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstActivityTest {

	employee[] employeeList1 = new employee[5];

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test
	public void testcreateEmployees() {
		FirstActivity.createEmployees(employeeList1);
		for (int i = 0; i < 5; i++) {
			assertNotNull(employeeList1[i]);
		}
	}

	@Test
	public void testsortEmployees() {

		FirstActivity.createEmployees(employeeList1);
		FirstActivity.sortEmployees(employeeList1);
		for (int i = 0; i < 4; i++) {
			if(employeeList1[i].getSalary() < employeeList1[i+1].getSalary()) {
				fail("Employees not ordered by salary at array position " + i);
			};
		}
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
