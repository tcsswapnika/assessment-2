package assessment2;

import java.util.Date;

public abstract class Account {
	private String owner_name;
	private Address address;
	private String accountType;
	private long balance_Amount;
	private Date createDate;
	private STATUS status;

	public Account(String ownerName, Address address, String accountType, long balanceAmount, Date createDate,
			STATUS status) {
		this.owner_name = ownerName;
		this.address = address;
		this.accountType = accountType;
		this.balance_Amount = balanceAmount;
		this.createDate = createDate;
		this.status = status;
	}

	public long getBalance_Amount() {
		return balance_Amount;
	}

	public void setBalance_Amount(long balance_Amount) {
		this.balance_Amount = balance_Amount;
	}

	abstract void deposit(double amount);

	abstract void withdraw(double amount);
}
