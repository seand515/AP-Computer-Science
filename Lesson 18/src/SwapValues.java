import java.util.*;

public class SwapValues {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("How many values do you want to enter?");
		int num = Scan.nextInt();
		int[] a = new int[num];
		int high = 0;
		int low = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value " + (i + 1));
			a[i] = Scan.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > a[high]) {
				high = i;
			}
			if (a[i] < a[low]) {
				low = i;
			}
		}
		int temp = a[high];
		a[high] = temp;
		a[low] = temp;

		for (int i = 0; i < a.length; i++){
			
		}

	}

}
