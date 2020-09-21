package day2b.question2;

import day2b.question2.CommissionEmployee;
import day2b.question2.HourlyEmployee;
import day2b.question2.SalariedEmployee;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee salariedEmployee = new SalariedEmployee(1250.50);
		double weeklySalary = salariedEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);
		salariedEmployee.setSalary(975.25);
		weeklySalary = salariedEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee(15.50, 50);
		weeklySalary = hourlyEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);
		hourlyEmployee.setSalary(17.25);
		weeklySalary = hourlyEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);

		CommissionEmployee commissionEmployee = new CommissionEmployee(200,150);
		weeklySalary = commissionEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);
		commissionEmployee.setSalary(178.50);
		weeklySalary = commissionEmployee.getPayment();
		System.out.println("Weekly Salary = "+weeklySalary);

		Invoice invoice = new Invoice("100","This is some description",50,10);
		double payment = invoice.getPayment();
		System.out.println("Payment = "+payment);
	}

}
