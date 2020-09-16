package day2.question4;

import java.util.Scanner;

public class Application {

	static final int MAX_SIZE=100;
	static int currentSize=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[MAX_SIZE];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("‘1’ – to create a Student object."); 
			System.out.println("‘2’ – to display the student info");
			System.out.println("Any other key to exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			if(choice==1) {
				String id="",name="";
				double grade=0.0;
				if(currentSize==MAX_SIZE)
					System.out.println("Maximum size reached");
				else {
					System.out.print("Enter ID of Student : ");
					sc.nextLine();
					id = sc.nextLine();
					
					System.out.print("Do you Want to enter name Y/N ?");
					String giveName = sc.next();
					if(giveName.equalsIgnoreCase("Y")) {
						System.out.print("Enter Name of Student ");
						sc.nextLine();
						name = sc.nextLine();						
					}
					
					System.out.print("Do you Want to enter Grade Y/N ?");
					String giveGrade = sc.next();
					if(giveGrade.equalsIgnoreCase("Y")) {
						System.out.print("Enter Grade of Student ");
						sc.nextLine();
						grade= sc.nextDouble();						
					}
					
					if(giveName.equalsIgnoreCase("Y") && giveGrade.equalsIgnoreCase("Y")) {
						Student newStudent = new Student(id,name,grade);
						students[currentSize] = newStudent;
						currentSize++;
					} else if(giveName.equalsIgnoreCase("Y")) {
						Student newStudent = new Student(id,name);
						students[currentSize] = newStudent;
						currentSize++;
					} else {
						Student newStudent = new Student(id);
						students[currentSize] = newStudent;
						currentSize++;
					}
				}
			} else if(choice==2) {
				if(currentSize==0) {
					System.out.println("No Student currently...");
					continue;
				}
				for(int i=0 ; i<currentSize ; i++) {
					System.out.println("Do you want to provide year of study for student "+(i+1)+" Y/N ?");
					String giveYear=sc.next();
					int year=-1;
					if(giveYear.equalsIgnoreCase("Y")) {
						System.out.print("Enter year of Student ");
						year= sc.nextInt();					
						students[i].display(year);
					} else {
						students[i].display();
					}
					
				}
			} else {
				System.out.println("Exiting....");
				break;
			}
		}
		sc.close();
	}

}
