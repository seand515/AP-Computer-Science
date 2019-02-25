import java.util.*;
public class ArrayRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[5];
		for(int i = 0; i < names.length; i++){
			System.out.println("Please enter a name.");
			String name = scan.nextLine();
			names[i]=name;
		}
		for(int i = 0; i<names.length; i++){
			System.out.println(names[i]);
		}
		

	}

}
