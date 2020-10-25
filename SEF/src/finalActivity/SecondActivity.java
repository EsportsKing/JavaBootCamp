package finalActivity;

public class SecondActivity {

	public static int add(int x, int y) {
		return (x + y);
	}
	
	public static int subtract(int x, int y) {
		return (x - y);
	}
	
	public static int multiply(int x, int y) {
		return (x * y);
	}
	
	public static double divide(int x, int y) {
		if (y != 0) {
			double result = (double) x / (double) y;
			return result;
		}
		else {
			System.out.println("Can't divide by 0");
			return 0;
		}
	}
}
