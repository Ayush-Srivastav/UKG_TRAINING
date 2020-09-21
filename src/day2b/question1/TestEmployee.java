package day2b.question1;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee salariedEmployee = new SalariedEmployee(1250.50);
		System.out.println("Weekly Salary = "+salariedEmployee.getWeeklySalary());
		salariedEmployee.setRate(975.25);
		System.out.println("New Weekly Salary = "+salariedEmployee.getWeeklySalary());
		salariedEmployee.increaseSalary(300.00);
		System.out.println("Increased Weekly Salary = "+salariedEmployee.getWeeklySalary());
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee(15.50, 50);
		System.out.println("Weekly Salary = "+hourlyEmployee.getWeeklySalary());
		hourlyEmployee.setRate(17.25);
		System.out.println("New Weekly Salary = "+hourlyEmployee.getWeeklySalary());
		hourlyEmployee.increaseSalary(1.25);
		System.out.println("Increased Weekly Salary = "+hourlyEmployee.getWeeklySalary());

		CommissionEmployee commissionEmployee = new CommissionEmployee(200,150);
		System.out.println("Weekly Salary = "+commissionEmployee.getWeeklySalary());
		commissionEmployee.setRate(178.50);
		System.out.println("New Weekly Salary = "+commissionEmployee.getWeeklySalary());
		commissionEmployee.increaseSalary(10.75);
		System.out.println("Increased Weekly Salary = "+commissionEmployee.getWeeklySalary());

	}

}
