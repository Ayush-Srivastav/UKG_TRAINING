package day2.question4;

public class Student {

	private String name;
	private String id;
	private double grade;
	
	Student(String id) {
		this.id = id;
		this.grade=-1.0;
	}
	
	Student(String id , String name) {
		this(id);
		this.name = name;
	}
	
	Student(String id , String name , double grade) {
		this(id , name);
		this.grade = grade;
	}
	
	public void display() {
		System.out.println("The details of the student are : ");
		System.out.println("id : "+this.id);
		if(name!=null) {
			System.out.println("Name : "+this.name);
		} 
		if(grade!=-1.0) {
			System.out.println("Grade : "+this.grade);
		}
	}
	
	public void display(int year) {
		display();
		System.out.println("Year : " + year);
	}
	
}
