package day3.question1;

public class CommissionEmployee implements Employee {

	double percentage;
	int weeklySale;
	
	public CommissionEmployee(double percentage, int weeklySale) {
		super();
		this.percentage = percentage;
		this.weeklySale = weeklySale;
	}

	@Override
	public double getWeeklySalary() {
		// TODO Auto-generated method stub
		double temp = percentage*(double)weeklySale;
		return temp/100;
	}

	@Override
	public void setRate(double rate) {
		// TODO Auto-generated method stub
		percentage = rate;
	}

	@Override
	public void increaseSalary(double increaseRate) {
		// TODO Auto-generated method stub
		percentage += increaseRate;
	}

}
