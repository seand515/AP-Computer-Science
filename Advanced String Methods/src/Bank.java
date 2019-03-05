import java.util.*;

public class Bank {

	Scanner scan = new Scanner(System.in);
	ArrayList<BankAccount> clients = new ArrayList<BankAccount>();
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the most trusted bank in America");
		Bank myBank = new Bank();
		myBank.menu();

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
					System.out.println("Closing...\nclosed");
					break;
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
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i) != null && clients.get(i).getName().equals(username)) {
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
				if (clients.get(acc).getBalance() < 0) {
					System.out.println(
							"Your balance is now ($" + String.format("%.2f", clients.get(acc).getBalance()) + ")");
				} else
					System.out.println("Your balance is now $" + String.format("%.2f", clients.get(acc).getBalance()));
			} else if (choice == 2) {
				accDeposit(acc);
				if (clients.get(acc).getBalance() < 0) {
					System.out.println("Your balance is now ($" + String.format("%.2f", clients.get(acc).getBalance()));
				} else
					System.out.println("Your balance is now $" + String.format("%.2f", clients.get(acc).getBalance()));
			} else if (choice == 3) {
				closeAcc(acc);
				System.out.println("Your account is now closed.");
			
			} else if (choice == 4) {
				
			}

		}

	}

	public void openAccount() {
		System.out.println("Enter the name for your new account.");
		String accName = scan.nextLine();
		boolean found = false;
		for (int i = 0; i < clients.size(); i++) {
			if (accName.equals(clients.get(i).getName())) {
				found = true;
				System.out.println("There is an existing account named " + accName + ".");
				break;
			}
		}
		if(found == false){
			System.out.println("Enter the amount you want to deposit.");
			double amt = scan.nextDouble();
			clients.add(new BankAccount(accName, amt));
		}

	}

	public void accWithdraw(int acc) {
		System.out.println("How much would you like to withdraw?");
		double amount = scan.nextDouble();
		clients.get(acc).withdraw(amount);
	}

	public void accDeposit(int acc) {
		System.out.println("How much would you like to deposit?");
		double amount = scan.nextDouble();
		clients.get(acc).deposit(amount);

	}

	public void closeAcc(int acc) {
		clients.remove(acc);
		System.out.println("Account now closed.");
	}
}