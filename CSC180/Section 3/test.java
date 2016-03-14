
/*
test
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: test
*/

import java.util.Scanner;

public class test
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	String userInput = "";
	System.out.println("Tell me relationship with programming love/hate?");
	userInput = keyboard.nextLine();

	System.out.println("You answered: \"" + userInput.replaceFirst("(?i)hate","love") + "\"...exactly as expected!");


	}
}
