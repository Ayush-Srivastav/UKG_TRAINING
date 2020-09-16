package day2.question3;

import java.util.Random;

public class Account {

	private String memberName;
	private String accountNumber;
	private double accountBalance;

	public Account(String memberName, double accountBalance) {
		this.accountNumber = 10000 + (int)(Math. random ()*89999) + "";
		this.memberName = memberName;
		this.accountBalance = accountBalance;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		this.accountBalance += amount;
	}
}
