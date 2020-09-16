package day3.question1;

public class SalariedEmployee implements Employee{

	double salary;
	
	public SalariedEmployee(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double getWeeklySalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		salary = rate;
	}

	@Override
	public void increaseSalary(double increaseRate) {
		// TODO Auto-generated method stub
		salary += increaseRate;
	}

}
