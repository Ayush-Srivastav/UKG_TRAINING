package day2.question3;

public class SavingAccount extends Account {
	private double interest = 5;
	private double maxWithdrawLimit;

	public SavingAccount(String memberName, double maxWithdrawLimit, double initialBalance) {
		super(memberName, initialBalance);
		this.maxWithdrawLimit = maxWithdrawLimit;
	}
	
	public double getBalance() {
		return this.getAccountBalance() + interest;
	}

	public void withdraw(double amount) {
		if (amount <= maxWithdrawLimit && this.getAccountBalance() - amount >= 500) {
			this.setAccountBalance(this.getAccountBalance() - amount);
			System.out.println("Successfully Withdrawn");
		} else {
			System.out.println("Cannot Withdraw");
		}
	}
}
