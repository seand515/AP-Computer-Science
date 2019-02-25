
public class SavingsAccount extends BankAccount {
	private double interestRate;
	private double balance = 0;

	public SavingsAccount(double amount, double rate) {// Constructor

		super(amount); // Calls the constructor in
		interestRate = rate; // BankAccount and sets balance
	}

	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}

	public void deposit(double amount) {
		this.balance += amount;
		
	}
	public double getbalance(){
		return balance;
	}
	public double superGetBalance(){
		return super.getBalance();
		
	}

}
