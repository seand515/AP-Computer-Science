
public class Tester {

	public static void main(String[] args) {
		PublicEmployee a = new PublicEmployee("sam", 86000);
		a.changeName("Sean");
		a.printName();
		AbstractEmployee b = new PublicEmployee("mike", 100000);
		

	}

}
