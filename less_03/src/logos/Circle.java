package logos;

public class Circle {
	private double diameter;
	private double radius;
	private double pi = 3.14;
	
	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}

	
	public double getDiameter() {
		return diameter;
	} 
	
	public double getRadius() {
		return radius;
	}
	
	public double circleArea(double diameter, double radius) {
		double area = pi * radius*radius;
		System.out.print("Площа кола = " + area + "        ");
		return 0;
	}
	
	
	public double circlePerimeter(double diameter, double radius) {
		double per = pi * radius*radius;
		System.out.println("Площа кола = " + per);
		return 0;
	}
	
	
}
