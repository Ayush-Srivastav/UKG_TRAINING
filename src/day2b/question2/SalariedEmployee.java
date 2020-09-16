package day3.question2;

public class SalariedEmployee extends Employee implements Paybale{

	double salary;
	
	public SalariedEmployee(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		salary = rate;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println("This is the Salaried Employee");
		return salary;
	}

}
