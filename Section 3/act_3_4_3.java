
/*
Activity 3.4 problem 3: Takes a 5 digit integer and breaks it into characters
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2015
*/

import java.util.Scanner;

public class act_3_4_3
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	String num;
	char a, b, c, d, e;
	
	//Let's take a 5 digit input, storing each character as a separate variable
	System.out.println("Please into a 5 digit number for splitting");
	num = keyboard.nextLine(); //Stores the 5 digit number as a string
	//These next lines store each character as a separate variable
	a = num.charAt(0);
	b = num.charAt(1);
	c = num.charAt(2);
	d = num.charAt(3);
	e = num.charAt(4);  

	//And try outputting all the variables with spaces
	System.out.println(a + " " + b + " " + c + " " + d + " " + e);

	}
}
