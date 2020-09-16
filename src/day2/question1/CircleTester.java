package day2.question1;

public class CircleTester {
	public static void main(String args[]) {
		Circle circle1 = new Circle();
		System.out.println("Radius = "+circle1.getRadius());
		System.out.println("Area = "+circle1.getArea());
		System.out.println("---------------------------------");
		Circle circle2 = new Circle(5.0);
		System.out.println("Radius = "+circle2.getRadius());
		System.out.println("Area = "+circle2.getArea());
		
	}
}
