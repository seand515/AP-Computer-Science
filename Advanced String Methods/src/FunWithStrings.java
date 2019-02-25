
public class FunWithStrings {

	public static void main(String[] args) {
	String word1 = "Apple";
	String word2 = "apple";
	System.out.println(word1.compareTo(word2));
	
	String s = "Lucky hocky puck";
	String m = "uck";
	int j = 6;
	int z = 99;

	int k = s.lastIndexOf(m,j+3);
	System.out.println(k);
	}

}
