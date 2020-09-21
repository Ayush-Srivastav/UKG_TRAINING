package day2b.question2;

public class CommissionEmployee extends Employee implements Paybale {

	double percentage;
	int weeklySale;
	
	public CommissionEmployee(double percentage, int weeklySale) {
		super();
		this.percentage = percentage;
		this.weeklySale = weeklySale;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return (percentage*(double)weeklySale/100);
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		percentage = rate;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println("This is the Commission Employee with percentage = "+percentage+" and weekly sale = "+weeklySale);
		return (percentage*(double)weeklySale/100);
	}
	
}
