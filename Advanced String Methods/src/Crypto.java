import java.util.*;

public class Crypto {
	String sent = "";
	String temp = "";

	public Crypto() {
	}

	public String encrypt(String sent) {
		this.sent = sent;
		sent = sent.toLowerCase();
		for (int i = 0; i < sent.length(); i++) {
			if (sent.charAt(i) == 'v') {
				temp += "ag',r";
			} else if (sent.charAt(i) == 'm') {
				temp += "ssad";
			} else if (sent.charAt(i) == 'g') {
				temp += "jeb..w";
			} else if (sent.charAt(i) == 'b') {
				temp += "dug>";
			} else {
				temp += sent.charAt(i);
			}

		}
		return temp;
	}

	public String decrypt(String temp) {
		this.temp = temp;
		temp = temp.replaceAll("ag',r", "v").replaceAll("ssad", "m").replaceAll("jeb..w", "g").replaceAll("dug>", "b");
		return temp;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

