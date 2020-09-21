package day3.question3;

import java.io.Serializable;

public class Employee implements Serializable {
	String name;
	String id;
	Address address;
	public Employee(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Id : "+getId());
		System.out.println("Employee Address : "+getAddress().getAddressLine1()+", "+getAddress()
																.addressLine2+". Pin : "+getAddress().getPinCode());
	}
}


class Address implements Serializable {
	String addressLine1;
	String addressLine2;
	String pinCode;
	public Address(String addressLine1, String addressLine2, String pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
}