
public class Safe {
	private String Brand = "x";
	private String color = "black";
	private boolean isOpen = false;
	private int combination;
	
	public Safe(){
	}
	public Safe(int combination){
		this.combination = combination;
	}
	public Safe (String Brand, String color, boolean isOpen){
		this.Brand = Brand;
		this.color = color;
		this.isOpen = isOpen;		
	}
	//return original combination
	public String setCombo(int combo){
		combination = combo;
		return "Combination has been reset";
	}
	public String getBrand(){
		return Brand;
	}
	public String getColor(){
		return color;
	}
	public void openLock(int pass){
		if(pass == combination){
			System.out.println("open");
			isOpen = true;
		}else{
			System.out.println("Wrong combo!");
		}
	}
	public void closeLock(){
		isOpen = false;
	}
	public int getCombo(){
		return combination;
	}
	public String toString(){
		return "color: " + color + "\nCombo: " + combination;
	}public static void printName(){
		System.out.println("Sean");
		
	}public boolean equals(Safe tSafe){
		return (this.combination == tSafe.getCombo())&&(this.Brand.equals(tSafe.getBrand()));
	}
	}

