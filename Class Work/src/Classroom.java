import java.util.*;
public class Classroom {
	private int nStudents = 0;
	private String sName = "";
	private String nList;
	Scanner Scan = new Scanner(System.in);
	public Classroom(){
		
	}
	Classroom (String sName){
	}
	public void addStudent(String sName){
		System.out.println("Please enter a students name to add to classroom list.");
		sName = Scan.nextLine();
		nList = nList + sName;
		nStudents = nStudents + 1;
	}
	public boolean findStudent(String sName){
		System.out.println("Enter to name to find if enlisted.");
		sName = Scan.nextLine();
		if(sName.equals(nList)){
			return true;
		}else{
			return false;
		}
	}
	public void classPopulation(){
		System.out.println("Number of student is Class: " + nStudents);
	}
	public void listNames(){
		int i = 0;
	}
		
	}


