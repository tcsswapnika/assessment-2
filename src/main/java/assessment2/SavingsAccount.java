package assessment2;

import java.util.Date;

public class SavingsAccount extends Account {
	public SavingsAccount(String ownerName, Address address, String accountType, long balanceAmmount, Date createDate,
			STATUS status) {
		super(ownerName, address, accountType, balanceAmmount, createDate, status);
	}

	@Override
	void deposit(double amount) {
		if (amount > 0) {
			double newBalanceAmount = amount + getBalanceAmount();
			setBalanceAmount(newBalanceAmount);
		}

	}

	@Override
	 void withdraw(double amount) {
		 if (amount< getBalanceAmount()) {
			 double newBalanceAmount = getBalanceAmount()-amount;
			 setBalanceAmount(newBalanceAmount);
		 }
		 else {
			 System.out.println("Insufficient Balance");
		 }
	 }
}

