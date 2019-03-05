
public class BankAccount {
	private String name = "";
	private double balance = 0;

	BankAccount() {

	}

	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public double deposit(double x) {
		balance += x;
		return x;

	}

	public double withdraw(double x) {
		balance -= x;
		return x;

	}

	public String toString() {
		return "Name: " + name + "\nBalance: $" + balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

}
