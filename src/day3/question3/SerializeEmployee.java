package day3.question3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address = new Address("Sector-62", "Noida", "201301");
			Employee employee = new Employee("Ayush", "1038", address);
			System.out.println("----------------------> Data before Serialization <-------------------------------");
			employee.display();
			ObjectOutputStream oos;
			try {
				oos = new ObjectOutputStream(new FileOutputStream("employee_detail.ser"));
				oos.writeObject(employee);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
