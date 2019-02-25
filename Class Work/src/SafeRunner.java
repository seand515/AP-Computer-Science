
public class SafeRunner {
	
	public  static void main(String[]args) {
		Safe safe1 = new Safe(12345);
		Safe momSafe = new Safe(123);
		Safe dadSafe = new Safe(123); 
		Safe mySafe = new Safe(12345);
		Safe sisSafe = new Safe();
		
		sisSafe = mySafe;
		dadSafe.setCombo(5);
		momSafe.setCombo(4);
		mySafe.setCombo(1);
		
		System.out.println(sisSafe.getCombo());
	
		System.out.println(safe1.getCombo());
		System.out.println(momSafe == dadSafe);
		System.out.println(dadSafe == mySafe);
		System.out.println(mySafe == sisSafe);
		System.out.println(mySafe);
		
		Safe.printName();
		
		System.out.println(mySafe.number);
		System.out.println(dadSafe.number);
		System.out.println(momSafe.number);
		dadSafe.number = 5;
		System.out.println(sisSafe.number);
	}
}
