import java.util.*;

public class Tester {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		Crypto myCryptObj = new Crypto();
		System.out.println("Welcome to Encryption Central");
		String sntnc;
		while (true) {
			System.out.println(
					"Please select from the following\n\t1:Encrypt a message\n\t2:Decrypt a message\n\t3:Exit");
			sntnc = kbReader.nextLine();
			boolean isValidOption = sntnc.equals("1") || sntnc.equals("2") || sntnc.equals("3");
			while (!isValidOption) {
				System.out.println(
						"Welcome to Encryption Central, please select from the folling\n\t1:Encrypt a message\n\t2:Decrypt a message\n\t3:Exit");
				sntnc = kbReader.nextLine();
				if (sntnc.equals("1") || sntnc.equals("2") || sntnc.equals("3")) {
					isValidOption = true;
				}
			}
			if (sntnc.equals("1")) {
				System.out.println("Enter a sentence to be encrypted.");
				String input = kbReader.nextLine();
				input = myCryptObj.encrypt(input);
				System.out.println("Encrypted sentence = " + input);
			} else if (sntnc.equals("2")) {
				System.out.println("Enter a sentence to be decrypted.");
				String input = kbReader.nextLine();
				input = myCryptObj.decrypt(input);
				System.out.println("Decrypted sentence = " + input);
			} else if (sntnc.equals("3")) {
				System.exit(0);
			}

		}
	}
}