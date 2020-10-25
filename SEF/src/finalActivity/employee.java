package finalActivity;

public class employee extends person {

	//  Attributes
	private String title;
	private String company;
	private int salary;
	
	// Default employee constructor
	public employee() {
		this.company = "Unknown";
		this.title = "Unknown";
		this.salary = 0;
	}
	
	// Parameterized employee constructor
	public employee(String firstName, String secondName, int age, String company, String title, int salary) {
		try {
			this.setFirstName(firstName);
		} catch (SetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.setSecondName(secondName);
		} catch (SetNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setAge(age);
		this.company = company;
		this.title = title;
		this.salary = salary;
	}
	
	// Introduce function prints message and String name, int age, String title, String company
	public void introduce() {
		System.out.println("My name is " + this.getFirstName() + this.getSecondName() +" and I am " + this.getAge() + " years old");
		System.out.println("I am working as a " + this.title + " at " + this.company + " company");
	}
	
	// getter for String company
	public String getCompany() {
		return company;
	}
	
	// setter for String company
	public void setCompany(String company) {
		this.company = company;
	}
	
	// getter for String title
	public String getTitle() {
		return title;
	}
	
	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
	// getter for int salary
	public int getSalary() {
		return salary;
	}
	
	// setter for int salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
