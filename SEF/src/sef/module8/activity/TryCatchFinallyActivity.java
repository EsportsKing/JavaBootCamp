package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	
public static void main(String[] args) {
	try {
		TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
		obj.catchMeIfYouCan();
	} catch (Exception a) {
		System.out.println("Unable to construct or object");
	}
}

void catchMeIfYouCan()
{
	int [] arr={0,1,2,3,4,5,6,7,8,9};
	
	try {
		for(int i=0;i<=10;i++)
		{
			System.out.println(arr[i]);
		}
	} catch (NullPointerException e) {
	System.out.println("A variable is not initialized");
	} catch(ArithmeticException e) {
		System.out.println("I can not perform division operation if divident is zero");
	} catch (Exception e) {
		System.out.println("Unable to print an array element, element does not exist");
	} finally {
	System.out.println("This should get printed even if there is an exception");
	}
}
}
