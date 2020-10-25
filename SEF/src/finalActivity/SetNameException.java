package finalActivity;

public class SetNameException extends Exception{

	public String getMessage() {
		return "Name can't contain numeric characters";
	}
}