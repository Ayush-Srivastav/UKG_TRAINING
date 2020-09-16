package day2.question5;

public class Car extends Vehicle{

	private int noOfDoors;

	public Car(int noOfWheel, int noOfPassengars, int model, String make, int noOfDoors) {
		super(noOfWheel, noOfPassengars, model, make);
		this.noOfDoors = noOfDoors;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}
	
	public void display() {
		super.display();
		System.out.println("No of doors : "+getNoOfDoors());
	}
}
