package day2b.question1;

public class HourlyEmployee implements Employee {

	double hourlyRate;
	int hoursWorked;
	
	public HourlyEmployee(double hourlyRate, int hoursWorked) {
		super();
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double getWeeklySalary() {
		// TODO Auto-generated method stub
		return (hourlyRate*(double)hoursWorked);
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		hourlyRate = rate;
	}

	@Override
	public void increaseSalary(double increaseRate) {
		// TODO Auto-generated method stub
		hourlyRate += increaseRate;
	}

}
