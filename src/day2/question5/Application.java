package day2.question5;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to create a Vehicle Object");
			System.out.println("Enter 2 to create a Car Object");
			System.out.println("Enter 3 to create a Convertible Object");
			System.out.println("Enter 4 to create a Sports Car Object");
			System.out.println("Enter any other key to exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			if(choice==1) {
				sc.nextLine();
				System.out.println("Enter make: ");
				String make = sc.nextLine();
				System.out.println("Enter model: ");
				int model =sc.nextInt();
				System.out.println("Enter no. of wheels: ");
				int noOfWheel=sc.nextInt();
				System.out.println("Enter no. of passengers: ");
				int noOfPassenger=sc.nextInt();
				Vehicle vehicle=new Vehicle(noOfWheel,noOfPassenger,model,make);
				System.out.println("Vehicle is created with below specifications : ");
				vehicle.display();
			} else if(choice==2) {
				sc.nextLine();
				System.out.println("Enter make: ");
				String make = sc.nextLine();
				System.out.println("Enter model: ");
				int model =sc.nextInt();
				System.out.println("Enter no. of wheels: ");
				int noOfWheel=sc.nextInt();
				System.out.println("Enter no. of passengers: ");
				int noOfPassenger=sc.nextInt();
				System.out.println("Enter no. of doors: ");
				int noOfDoor=sc.nextInt();
				Car car =new Car(noOfWheel,noOfPassenger,model,make,noOfDoor);
				System.out.println("Car is created with below specifications : ");
				car.display();
			} else if(choice==3) {
				sc.nextLine();
				System.out.println("Enter make: ");
				String make = sc.nextLine();
				System.out.println("Enter model: ");
				int model =sc.nextInt();
				System.out.println("Enter no. of wheels: ");
				int noOfWheel=sc.nextInt();
				System.out.println("Enter no. of passengers: ");
				int noOfPassenger=sc.nextInt();
				System.out.println("Enter no. of doors: ");
				int noOfDoor=sc.nextInt();
				System.out.println("Hood open? (Y/N): ");
				String hoodInput = sc.next();
				boolean isHoodOpen = hoodInput.equalsIgnoreCase("Y")?true:false;
				Convertible convertible=new Convertible(noOfWheel,noOfPassenger,model,make,noOfDoor,isHoodOpen);
				System.out.println("Convertible is created with below specifications : ");
				convertible.display();
			} else if(choice==4) {
				sc.nextLine();
				System.out.println("Enter make: ");
				String make = sc.nextLine();
				System.out.println("Enter model: ");
				int model =sc.nextInt();
				System.out.println("Enter no. of wheels: ");
				int noOfWheel=sc.nextInt();
				System.out.println("Enter no. of passengers: ");
				int noOfPassenger=sc.nextInt();
				SportsCar sportsCar=new SportsCar(noOfWheel,noOfPassenger,model,make);
				System.out.println("Sports Car is created with below specifications : ");
				sportsCar.display();
			} else {
				System.out.println("Exiting.....");
				break;
			}
		}
		sc.close();
	}
}
