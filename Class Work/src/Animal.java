
public class Animal {
	boolean isMale = false;
	int numLegs = 4;
	String furColor = "brown";
	double size = 10.6;
	double food = 2;
	
	public Animal(){
	}
	public Animal(boolean isMale, int numLegs, String furColor, double size){
		this.isMale = isMale;
		this.numLegs = numLegs;
		this.furColor = furColor;
		this.size = size;
	}	
	//method for eating - increase size.
	public double eat(double food){
		size += food;
		return size;
	}
	//method for sexChange - return original gender.
	public boolean sexChange(boolean isMale){
		if(this.isMale == isMale){	
			return false;
		}
		this.isMale = isMale;
		return isMale;
	}
	//method for coloring the dog - return original color.
	public String dyeFur(String furColor){
		String ogColor = furColor;
		return ogColor;
		
	}
}
