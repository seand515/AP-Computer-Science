import java.util.Random;
import java.util.*;

public class Magic8Ball {

	public static void main(String[] args) {
	Random mdm = new Random ();
	Scanner scan = new Scanner(System.in);
	String question = " ";
	while(true){
	System.out.println("Enter a question for the Magic 8 Ball to answer.");
	question = scan.nextLine();

	int choice = 1 + mdm.nextInt(10);
	String response = "";

	if ( choice == 1 )
		response = "Better not tell you now";
	else if ( choice == 2 )
		response = "It is decidedly so";
	else if ( choice == 3 )
		response = "Without a doubt";
	else if ( choice == 4 )
		response = "Cannot predict now";
	else if ( choice == 5 )
		response = "Don't count on it";
	else if ( choice == 6 )
		response = "As I see it, yes";
	else if ( choice == 7 )
		response = "Most likely";
	else if ( choice == 8 )
		response = "Ask again later";
	else if ( choice == 9 )
		response = "Signs point to yes";
	else if ( choice == 10 )
		response = "Very doubtful";
	else 
		response = "8-BALL ERROR!";

	System.out.println( "MAGIC 8-BALL SAYS: " + response );
	
	}

}
}
