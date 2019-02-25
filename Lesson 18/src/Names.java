import java.io.InputStream;
import java.util.*;

public class Names {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("how many names do you want to enter");
		int numNames = Scan.nextInt();
		Scan.nextLine();
		String[] names = new String[numNames];
		for (int i = 0; i < names.length; i++) {
			System.out.println("please enter name " + (i + 1));
			names[i] = Scan.nextLine();

		}
		for(int i = 0; i < names.length; i++){
			System.out.println((i+1) + names[i]);
		}
		
	}

}
