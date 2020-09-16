package day2.question2;

import java.util.Scanner;

public class BookStore {

	final int bookSize = 10;
	Book[] bookList = new Book[bookSize];
	
	public void sell(String bookTitle , int noOfCopies) {
		int i=0;
		for( ; i<bookSize ; i++) {
			if(bookList[i]==null || bookList[i].getBookTitle().equals(bookTitle))
					break;
		}
		if(i<bookSize) {
			if(bookList[i]==null) {
				System.out.println("Sorry, no book found with the title");				
			} else {
				if(bookList[i].getNumOfCopies()<noOfCopies) {
					System.out.println("No of copies availabe is less than no of copies to sell");
				} else {
					System.out.println("Sold "+ noOfCopies+" Of book with tile "+bookTitle);
					bookList[i].setNumOfCopies(bookList[i].getNumOfCopies()-noOfCopies);
				}				
			}
		} else {
			System.out.println("Sorry, no book found with the title");
		}
	}
	
	public void order(String isbn , int noOfCopies) {
		int i=0;
		for(; i<bookSize ; i++) {
			if(bookList[i]==null || bookList[i].getISBN().equals(isbn))
				break;
		}
		Scanner scanner = new Scanner(System.in);
		if(bookList[i]==null) {
			System.out.println("No such book exists : Enter new book");
			System.out.print("Enter the title : ");
			String title = scanner.nextLine();
			System.out.print("Enter the author : ");
			String author = scanner.nextLine();
			Book newBook = new Book(title , author , isbn , noOfCopies);
			System.out.println("New Book Added");
			bookList[i] = newBook;
		}else {
			if(i<bookSize) {
				System.out.println("Ordered " + noOfCopies + " for book with isbn"+ isbn);
				bookList[i].setNumOfCopies(bookList[i].getNumOfCopies()+noOfCopies);
			} else {
				System.out.println("New book cannot be added");
			}
		}
	}
	
	public void display() {
		for(Book book : bookList) {
			if(book!=null)
				book.display();
		}
	}
}
