package day2.question3;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your user name: ");
		String memberName = sc.nextLine();
		System.out.print("Enter account type (savings/current): ");
		String accountType = sc.nextLine();
		double initialBalance;
		if (accountType.equals("savings")) {
			System.out.print("Enter initial balance (>500): ");
			initialBalance = sc.nextDouble();
			if (initialBalance < 500.0)
				initialBalance = 500.0;
			System.out.print("Enter maximum withdraw limit: ");
			double maxWithdrawLimit = sc.nextDouble();
			SavingAccount savingAccount = new SavingAccount(memberName, maxWithdrawLimit, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("0: Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+savingAccount.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					savingAccount.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+savingAccount.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+savingAccount.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					savingAccount.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+savingAccount.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+savingAccount.getAccountBalance());
				}
				else if(choice==0) {
					break;
				}
			}

		} else if (accountType.equals("current")) {
			System.out.print("Enter initial balance: ");
			initialBalance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter trade license number: ");
			String tradeLicenseNumber = sc.nextLine();
			CurrentAccount currentAccount = new CurrentAccount(memberName, tradeLicenseNumber, initialBalance);
			while(true) {
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Display");
				System.out.println("Any other key to Exit");
				System.out.print("Enter your choice: ");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before deposit = "+currentAccount.getAccountBalance());
					System.out.print("Enter amount of money to deposit: ");
					double money=sc.nextDouble();
					currentAccount.deposit(money);
					if(showBalance)
						System.out.println("Balance after deposit = "+currentAccount.getAccountBalance());
				}
				else if(choice==2) {
					System.out.print("Show balance (true/false): ");
					boolean showBalance=sc.nextBoolean();
					if(showBalance)
						System.out.println("Balance before withdraw = "+currentAccount.getAccountBalance());
					System.out.print("Enter amount of money to withdraw: ");
					double money=sc.nextDouble();
					currentAccount.withdraw(money);
					if(showBalance)
						System.out.println("Balance after withdraw= "+currentAccount.getAccountBalance());
				}
				else if(choice==3) {
					System.out.println("Balance = "+currentAccount.getAccountBalance());
				}
				else {
					break;
				}
			} 
		} else {
			System.out.println("Illegal Account type...");
		}
		sc.close();
	}

}
