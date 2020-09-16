package day2.question1;

public class Circle {
	private double radius;
	private String color;
	private final double PI = 3.14;
	Circle(){
		radius=1.0;
		color="red";
	}
	
	Circle(double r) {
		this();
		radius = r;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return PI*radius*radius;
	}


}
