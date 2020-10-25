package finalActivity;

public class students extends person  {

	// student attributes
	private String schoolName;
	
	// Default student constructor
	public students() {
		this.schoolName = "Unknown";
	}
	
	// Parameterized student constructor
	public students(String school) {
		this.schoolName = school;
	}
	
	// Introduce method prints String schoolName
	public void introduce() {
		System.out.println("I am studying at " + this.schoolName);
	}
	
	// getter for String company
	public String getSchoolName() {
		return schoolName;
	}
	
	// setter for String company
	public void setSchoolName(String school) {
		this.schoolName = school;
	}
}
