package finalActivity;

public class employee extends person {

	//  Attributes
	private String title;
	private String company;
	
	// Default employee constructor
	public employee() {
		this.company = "Unknown";
		this.title = "Unknown";
	}
	
	// Parameterized employee constructor
	public employee(String name, int age, String company, String title) {
		this.setName(name);
		this.setAge(age);
		this.company = company;
		this.title = title;
	}
	
	// Introduce function prints message and String name, int age, String title, String company
	public void introduce() {
		System.out.println("My name is " + this.getName() + " and i am " + this.getAge() + " years old");
		System.out.println("I am working as " + this.title + " at " + this.company + " company");
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
		return this.title;
	}
	
	// setter for String title
	public void setTitle(String title) {
		this.title = title;
	}
}
