import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value for A");
		DistToLine.A = scan.nextDouble();
		
		System.out.println("Enter the value for B");
		DistToLine.B = scan.nextDouble();
		
		System.out.println("Enter the value for C");
		DistToLine.C = scan.nextDouble();
		System.out.println("What is the x coordinate");
		 double x = scan.nextDouble();
		System.out.println("What is the y coordinate");
		double y = scan.nextDouble();
		
		System.out.println(DistToLine.getDist(x, y));

	}

}
