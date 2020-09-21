package day3.question4;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int input = sc.nextInt();
				if(input==-1)
					break;
				else if(input%2==0)
						System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch(NoSuchElementException e) {
				System.out.println("You must enter an integer.");
				sc.nextLine();
			}
		}
	}

}
