
public class PublicEmployee extends AbstractEmployee {
	
	public PublicEmployee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}

	public String changeName(String name) {
		this.name = name;
		return this.name;

	}
	public void printName(){
		System.out.println(this.name);
	}
	public void getPaid(){
		System.out.println("You made money.");
	}

}
