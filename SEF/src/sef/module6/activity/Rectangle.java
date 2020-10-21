package sef.module6.activity;

public class Rectangle extends Shape {
	
	// Parameter Initialization
	double length;
	double width;

	// Rectangle constructors
	public Rectangle() {
		this.length = 0;
		this.width = 0;
		System.out.println("I'm a default rectangle constructor");
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("I'm a parameterized rectangle constructor");
	}
	
	// Calculate area implementation
	public double calculateArea() {
		return (this.length* this.width);
	}
	
	// Calculate perimeter implementation
	public double calculatePerimeter() {
		return ((length+width)*2);
	}
}
