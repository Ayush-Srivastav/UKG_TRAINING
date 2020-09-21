package day3.question6;

import java.util.NoSuchElementException;
import java.util.Scanner;

class InputException extends RuntimeException{

	public InputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class LessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of 'n' : ");
		int n = sc.nextInt();
		while(true) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				int input = sc.nextInt();
				if(input==-1)
					break;
				else if(input>n)
					throw new InputException("input cannot be greater than "+n);
				else if(input%2==0)
						System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch(NoSuchElementException e) {
				System.out.println("You must enter an integer.");
				sc.nextLine();
			} catch(InputException e) {
				System.out.println(e.getMessage());
				sc.nextLine();				
			}
		}	
		sc.close();
	}

}
