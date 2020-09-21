package day3.question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("employee_detail.ser"));
			try {
				Employee employee = (Employee) ois.readObject();
				System.out.println("------------------------> Data After Desrialization <---------------------");
				employee.display();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
