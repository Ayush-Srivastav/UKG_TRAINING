package day2.question5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassengars;
	private int model;
	private String make;

	public Vehicle(int noOfWheel, int noOfPassengars, int model, String make) {
		super();
		this.noOfWheel = noOfWheel;
		this.noOfPassengars = noOfPassengars;
		this.model = model;
		this.make = make;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}
	public int getNoOfPassengars() {
		return noOfPassengars;
	}
	public int getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	
	public void display() {
		System.out.println("No Of Wheels : " + getNoOfWheel());
		System.out.println("No of passengers : "+getNoOfPassengars());
		System.out.println("Model : "+getModel());
		System.out.println("Make : "+getMake());
	}
}
