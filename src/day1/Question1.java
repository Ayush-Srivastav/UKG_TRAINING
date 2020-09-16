package day1;

public class Question1 {

	public static void main(String[] args) {
		int size = 20;
		int first = 1 , second=1;
		int sum=first+second;
		int current;
		System.out.println("The first " + size + " Fibonacci numbers are :");
		System.out.print(first+" "+second);
		
		for(int i=2 ; i<size ; i++) {
			current = first+second;
			first = second;
			second = current;
			System.out.print(" "+current);
			sum+=current;
		}
		
		double average = (double)sum/(double)size;
		System.out.println("\nThe average is : "+average);
		
	}
	
}
