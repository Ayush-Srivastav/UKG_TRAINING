package day2.question5;

public class Convertible extends Car{

	private boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassengars, int model, String make, int noOfDoors, boolean isHoodOpen) {
		super(noOfWheel, noOfPassengars, model, make, noOfDoors);
		this.isHoodOpen = isHoodOpen;
	}

	public boolean isHoodOpen() {
		return isHoodOpen;
	}	
	
	public void display() {
		super.display();
		String hoodOpen = isHoodOpen?"The hood is open":"The hood is not open";
		System.out.println(hoodOpen);
	}
	
}
