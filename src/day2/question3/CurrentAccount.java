package day2.question3;

public class CurrentAccount extends Account {
	String tradeLicenseNumber;

	public CurrentAccount(String memberName, String tradeLicenseNumber, double initialBalance) {
		super(memberName, initialBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withdraw(double amount) {
		if (amount <= this.getAccountBalance()) {
			this.setAccountBalance(this.getAccountBalance() - amount);
			System.out.println("Successfully Withdrawn");
		} else {
			System.out.println("Cannot Withdraw");
		}
	}
}
