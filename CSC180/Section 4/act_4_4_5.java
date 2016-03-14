
/*
A program to calculate if a year is a leapyear
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 19 Sept 2015
*/

import java.util.Scanner;

public class act_4_4_5
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Input a year and I'll tell you if it is a leapyear");

	int year = keyboard.nextInt();
	
	boolean leapyear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));  
		// Conveniently, I wrote this for exercise 4.3.0 already
	
	if (leapyear == true)
		System.out.println("\nYep, leapyear\n");
	
	if (leapyear == false)
		System.out.println("\nNope, not a leapyear\n");

	}
}
