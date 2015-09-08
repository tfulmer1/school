
/*
This program is for Problem 1 of Activity 3.4, it converts meters to miles/feet/inches
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2015
*/

import java.util.Scanner;

public class act_3_4_1
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	//Lets prepare our variables
	double meters, inches, feet, miles;

	//get user input
	System.out.println("Please input the distance in meters: ");
	meters = keyboard.nextDouble();
	inches = Math.round((meters * 39.3701)*100)/100.0;
	
	//Now lets work our way up to get whole feet/miles	
	feet = (int)inches / 12;
	miles = (int)feet / 5280;

	//And work our way down to figure out remainders
	feet = feet - (miles * 5280);
	inches = inches - (feet * 12) - (miles * 5280 * 12);
	

	System.out.println(meters + " meters is equal to " + (int)miles + " miles, " + (int)feet + " feet and " + Math.round((inches*100)/100.0) + " inches.");

	}
}
