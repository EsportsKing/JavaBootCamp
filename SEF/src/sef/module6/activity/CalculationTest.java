package sef.module6.activity;

public class CalculationTest {

	public static void main(String[] args) {
		
		// Constructing Ricky the rectangle
		Rectangle ricky = new Rectangle(5,6);
		
		// Calculating Ricky's parameters
		double Area = ricky.calculateArea();
		double Perimeter = ricky.calculatePerimeter();
			
		System.out.println("Perimeter: " + Perimeter);
		System.out.println("Area: " + Area);

	}
}
