import java.util.*;

public class CustomArray {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("How many grades would you like to enter?");
		int numGrades = Scan.nextInt();
		Scan.nextLine();
		double sum = 0;
		double[] avgGrade = new double[numGrades];
		for (int i = 0; i < avgGrade.length; i++) {
			System.out.println("please enter grade" + (i + 1));
			avgGrade[i] = Scan.nextDouble();
			sum += avgGrade[i];
		}
		double average = sum/avgGrade.length;
		System.out.println("average: " + average);

	}

}
