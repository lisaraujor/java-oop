package entities;

public class BankAccount {
	
	int number;
	String holder;
	double balance;
	
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
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

	public double getBalance() {
		return balance;
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		balance -= (withdrawValue + 5.0);
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + balance;
	}
}
