package day2.question2;

public class Book {
	
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	Book(String bookTilte , String author , String ISBN , int numOFCopies) {
		this.bookTitle = bookTilte;
		this.author = author;
		this.ISBN = ISBN;
		this.numOfCopies = numOFCopies;
	}
	
	public void display() {
		System.out.println("Tile : "+bookTitle+"\tAuthor : "+author+"\tISBN : "+ISBN+"\tQuantity : "+numOfCopies);
	}

}
