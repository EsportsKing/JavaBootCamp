package finalActivity;

public class FirstActivity {

	public static void main(String[] args) {
		employee[] employeeList = new employee[5];
		createEmployees(employeeList);
		sortEmployees(employeeList);
		printEmployees(employeeList);
	}

	public static void createEmployees(employee[] employeeList) {
		employeeList[0] = new employee("Jeff Bezos", 56, "Amazon", "CEO", 81840);
		employeeList[1] = new employee("Elon Musk", 49, "Tesla", "CEO", 1000000);
		employeeList[2] = new employee("Old Man", 97, "Amazon", "Delivery boy", 23540);
		employeeList[3] = new employee("Leeroy Jenkins", 10, "Pals for Life", "DPS", 550);
		employeeList[4] = new employee("Cardi B", 28, "Atlantic", "Rapper", 784358);
	}

	public static void sortEmployees(employee[] employeeList) {
		
		int numberOfEmployees = employeeList.length;
		
		for (int i = 0; i < (numberOfEmployees -1); i++) {
			if (employeeList[i].getSalary() < employeeList[i+1].getSalary()) {
				employee smallerSalary = employeeList[i];
				employeeList[i] = employeeList[i+1];
				employeeList[i+1] = smallerSalary;
				i = 0;
			}
		}	 
	}
	
	public static void printEmployees(employee[] employeeList) {
		for (int i = 0; i <5; i++) { 
			System.out.println("My name is " + employeeList[i].getName() + " and I am " + employeeList[i].getAge() + " years old");
			System.out.print("I am working as a " + employeeList[i].getTitle() + " at " + employeeList[i].getCompany() +" company");
			System.out.println(" and my salary is $" + employeeList[i].getSalary());
		}
	}
}