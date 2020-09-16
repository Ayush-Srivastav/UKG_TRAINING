package day1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int number_of_students = sc.nextInt();
		int i=0;
		double sum=0.0;
		while(i<number_of_students) {
			System.out.print("Enter the grade for student " + (i+1)+" : ");
			double grade = sc.nextDouble();
			if(grade<0 || grade>100) {
				System.out.println("Invalid grade, try again ...");
			} else {
				sum+=grade;
				i++;
			}
		}
		System.out.println("The average is : "+(sum/number_of_students));
	}

}
