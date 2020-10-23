package finalActivity;

public class person {

	// Attributes common to any person
	private String name;
	private int age;
	
	// Default Constructor
	public person() {
		this.name = "Anonymous";
		this.age = 0;
	}
	
	// Parameterized Constructor
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Introduce function prints message and String name, int age
	public void introduce() {
		System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
	}
	
	// getter for String name
	public String getName() {
		return name;
	}
	
	// setter for String name
	public void setName(String name) {
		this.name = name;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}
}