package finalActivity;

public class person extends Humanity{

	// Attributes common to any person
	private String firstName;
	private String secondName;
	private int age;
	
	// Default Constructor
	public person() {
		this.firstName = "Anonymous";
		this.secondName = "Anonymous";
		this.age = 0;
	}
	
	// Parameterized Constructor
	public person(String firstName, String secondName, int age) {
		try {
			this.setFirstName(firstName);
		} catch (SetNameException e) {
			e.getMessage();
		}
		try {
			this.setSecondName(secondName);
		} catch (SetNameException e) {
			e.getMessage();
		}
		this.age = age;
	}
	
	// Introduce function prints message and String name, int age
	public void introduce() {
		System.out.println("My name is " + this.firstName + this.secondName +" and I am " + this.age + " years old");
	}
	
	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}
	
	// setter for String firstName
	public void setFirstName(String name)  throws SetNameException{
		boolean flag = false;
		char[] chars = name.toCharArray();
	    for(char c : chars){
		    if(Character.isDigit(c)){
		    	flag = true;
		    }
	    }
	    if (flag == true) {
	    	throw new SetNameException();
	    }
	    else{
	    	this.firstName = name;
	    }
	}
	
	// getter for String secondName
	public String getSecondName() {
		return secondName;
	}
	
	// setter for String secondName
	public void setSecondName(String name)  throws SetNameException{
		boolean flag = false;
		char[] chars = name.toCharArray();
	    for(char c : chars){
		    if(Character.isDigit(c)){
		    	flag = true;
		    }
	    }
	    if (flag == true) {
	    	throw new SetNameException();
	    }
	    else {
	    	this.secondName = name;
	    }	
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