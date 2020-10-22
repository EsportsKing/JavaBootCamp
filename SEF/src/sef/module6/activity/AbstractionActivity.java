package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		
		// Constructing Ricky the rectangle
		Shape ricky = new Rectangle(5,6);
		
		// Calculating Ricky's parameters
		double Area = ricky.calculateArea();
		double Perimeter = ricky.calculatePerimeter();
		ricky.setColor("green");
		
		System.out.println("This is the story of Ricky the rectangle");
		System.out.println("Perimeter: " + Perimeter);
		System.out.println("Area: " + Area);
		System.out.println("Color: " + ricky.getColor());

	}
}
