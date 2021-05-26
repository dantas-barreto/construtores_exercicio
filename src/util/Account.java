package util;

public class Account {

	private String holder;
	private int number;
	private double balance;
	
	public Account(String name, int account) {
		this.holder = name;
		this.number = account;
	}
	
	public Account(String name, int account, double initialDeposit) {
		this.holder = name;
		this.number = account;
		deposit(initialDeposit);
	}
	
	public String toString() {
		return "Account: " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return number;
	}
}
