
public class Tester {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(500);
		SavingsAccount s = new SavingsAccount(1000, 5);
//		System.out.println(b.getBalance());
//		System.out.println(s.getBalance());
//		b.deposit(500);
//		s.deposit(500);
//		System.out.println(b.getBalance());
//		System.out.println(s.getBalance());
//		s.addInterest();
//		System.out.println();
//		BankAccount hybrid = new SavingsAccount(500, 4);
//		System.out.println(hybrid.getBalance());
		s.deposit(500);
		System.out.println(s.getbalance());
		System.out.println(s.superGetBalance());

	}

}
