
public abstract class AbstractEmployee {
	public String name;
	public double salary;

	public double setSalary(double amount) {
		this.salary = amount;
		return salary;
	}
	public abstract String changeName(String name);

}
