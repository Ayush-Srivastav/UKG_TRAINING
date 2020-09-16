package day2.question2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BookStore bookStore = new BookStore();
		 while(true) {
			 System.out.println("Enter “1”, to display the Books");
			 System.out.println("Enter “2”, to order new books.");
			 System.out.println("Enter “3”, to sell books.");
			 System.out.println("Enter “0”, to exit the system");
			 System.out.println("Enter your choice");
			 int choice = sc.nextInt();
			 if(choice==1) {
				 bookStore.display();
			 } else if(choice==2) {
					 System.out.print("Enter ISBN of book to order : ");
					 sc.nextLine();
					 String ISBN = sc.nextLine();
					 
					 System.out.print("Enter no of copies to order : ");
					 int noOfCopies = sc.nextInt();
					 
					 bookStore.order(ISBN, noOfCopies);
					 
			 } else if(choice==3) {
					 System.out.println("Enter Title of book to sell : ");
					 sc.nextLine();
					 String title = sc.nextLine();
					 
					 System.out.println("Enter no of copies to sell : ");
					 int noOfCopies = sc.nextInt();
					 
					 bookStore.sell(title, noOfCopies);

			 } else if(choice==0) {
				 System.out.println("Exiting....");
				 break;
			 } else {
				 System.out.println("Invalid Input, Plese try again...");
			 }
		 }
		 sc.close();
	}

}
