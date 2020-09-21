package day3.question7;

import java.io.IOException;

class InputException extends RuntimeException{

	public InputException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class ThrowException {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (InputException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void throwException() throws InputException,IOException {
		System.out.println("This method might contain some risky code......");
	}
	
}
