package finalActivity;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    try {
    	employee[] employeeListText = new employee[5];
		FirstActivity.createEmployees(employeeListText);
		FirstActivity.sortEmployees(employeeListText);
	    FileWriter employeeWriter = new FileWriter("employee_list.txt");
	    System.out.println("File has been created in project dir");
	    for (int i = 0; i < employeeListText.length ; i++) {
		    employeeWriter.write(employeeListText[i].getFirstName() + " " + employeeListText[i].getSecondName());
		    employeeWriter.write(" " + employeeListText[i].getAge() + " " + employeeListText[i].getTitle() + " ");
		    employeeWriter.write(employeeListText[i].getCompany() + " " +  employeeListText[i].getSalary() + System.lineSeparator());
	    }
	    employeeWriter.close();
	 } catch (IOException e) {
		 System.out.println("An error has occured");
		 e.printStackTrace();
	 }
  }
}