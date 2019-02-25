import java.util.*;
public class StudentTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String name = "";
		int age = 0;
		Student[] classroom = new Student[5];
		for(int i = 0; i<classroom.length;i++){
			System.out.println("Please enter the students name to be entered.");
			name = scan.nextLine();
			System.out.println("Enter the student name to be entered.");
			classroom[i] = new Student(name,age);
		}

	}

}
