package sef.module3.activity;

/**
 * @author 
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 8;
		int j = 5;
		int result = 0;
		
		if (i >= 8) {
			// Subtract numbers
			result = i-j;
			
			// Print result
			System.out.println("Difference = " + result);
		}
		else {
			// Add numbers
			result = i+j;
			
			// Print result
			System.out.println("Sum = " + result);
		}		
	}
}
