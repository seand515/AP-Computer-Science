import java.util.*;

public class Bank {

	public static void main(String[] args) {
		System.out.println("Welcome to the most trusted bank in America");
		Bank myBank = new Bank();
		myBank.menu();

	}

	Scanner scan = new Scanner(System.in);
	BankAccount[] clients = new BankAccount[5];
	int numBankAccounts;

	public void openBank() {
		menu();
	}

	public void menu() {
		while (true) {
			System.out.println("1: Login" + "\n2: Open Account" + "\n3: Display all accounts" + "\n4: Exit");
			int choice = scan.nextInt();
			scan.nextLine();
			if (choice == 1) {
				login();
			} else if (choice == 2) {
				openAccount();
			} else if (choice == 3) {
				displayAccs();
			} else if (choice == 4) {
				System.out.println("Are you sure you want to exit?" + "\n1: Yes" + "\n2: No");
				int choice2 = scan.nextInt();
				if (choice2 == 1) {
					System.out.println("Closing");
					break;
				} else {
					menu();
				}

			}
		}

	}

	public void displayAccs() {
		for (BankAccount x : clients) {
			System.out.println(x);
		}
	}

	public void login() {
		System.out.println("Please enter your username to login.");
		String username = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getName().equals(username)) {
				found = true;
				accountMenu(i);
				break;
			}

		}
		if (found == false) {
			System.out.println("Account does not exist.");
		}

	}

	public void accountMenu(int acc) {
		while (true) {
			System.out.println("1: Withdraw" + "\n2: Deposit" + "\n3. Close Account" + "\n4. Logout");
			int choice = scan.nextInt();
			if (choice == 1) {
				accWithdraw(acc);
				if (clients[acc].getBalance() < 0) {
					System.out
							.println("Your balance is now ($" + String.format("%.2f", clients[acc].getBalance()) + ")");
				} else
					System.out.println("Your balance is now $" + String.format("%.2f", clients[acc].getBalance()));
			} else if (choice == 2) {
				accDeposit(acc);
				if (clients[acc].getBalance() < 0) {
					System.out.println("Your balance is now ($" + String.format("%.2f", clients[acc].getBalance()));
				} else
					System.out.println("Your balance is now $" + String.format("%.2f", clients[acc].getBalance()));
			} else if (choice == 3) {
				closeAcc(acc);
				System.out.println("Your account is now closed.");
				menu();
			} else if (choice == 4) {
				menu();
			}

		}

	}

	public void openAccount() {
		System.out.println("Enter the name for your new account.");
		String accName = scan.nextLine();
		boolean found = false;

		System.out.println("Enter the amount you want to deposit in your new account.");
		double accAmount = scan.nextDouble();
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null && found == false) {
				found = true;
				clients[i] = new BankAccount(accName, accAmount);
				break;
			}

		}
		if (found == false) {
			System.out.println("Unable to create your account, not enough room for a new account.");
		}
	}

	public void accWithdraw(int acc) {
		System.out.println("How much would you like to withdraw?");
		double amount = scan.nextDouble();
		clients[acc].withdraw(amount);
	}

	public void accDeposit(int acc) {
		System.out.println("How much would you like to deposit?");
		double amount = scan.nextDouble();
		clients[acc].deposit(amount);

	}

	public void closeAcc(int acc) {
		clients[acc] = null;
	}
}