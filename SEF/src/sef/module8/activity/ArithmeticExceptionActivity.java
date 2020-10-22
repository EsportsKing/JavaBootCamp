package sef.module8.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args) {
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
		try {			
			obj.catchMe(10, 0);
		} catch (Exception a) {
			System.out.println("Execution with 10 and 0 failed");
		}
		try {			
			obj.catchMe(10, 2);
		} catch (Exception a) {
			System.out.println("Execution with 10 and 0 failed");
		}
	}

void catchMe(int num1, int num2)
{
	//The following code results in an Exception.
	//2 - Identify the exception and write code to handle this exception.

	//3 - After handling the exception, write a finally block which
	//prints a message "Thank you for using this program."
	
	//4- try to call catchMe with 10 and 2 now and see which messages get printed. 
	try {
	int result=num1/num2;
		System.out.println("The result is :" + result);
	} catch (NullPointerException e) {
		System.out.println("Null pointer");
	} catch(ArithmeticException e) {
		System.out.println("I can not perform division operation if divident is zero");
	} catch (Exception e) {
		System.out.println("Unknown exception");
	} finally {
	System.out.println("Thank you for using this program");
	}
}
}
