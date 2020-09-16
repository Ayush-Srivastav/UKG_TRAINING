package day3.question2;

public class HourlyEmployee extends Employee implements Paybale{

	double hourlyRate;
	int hoursWorked;
	
	public HourlyEmployee(double hourlyRate, int hoursWorked) {
		super();
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println("This is the Hourly Employee with hourly rate = "+hourlyRate+" and hours worked = "+hoursWorked);
		return (hourlyRate*(double)hoursWorked);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return (hourlyRate*(double)hoursWorked);
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		hourlyRate = rate;
	}

}
