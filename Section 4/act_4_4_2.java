
/*
Activity 4.4.2 creates a program to read a floating time input and a floating wage to print out a check
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 September 2015
*/

import java.util.Scanner;

public class act_4_4_2
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	//Get required inputs
	System.out.println("\nPlease input the name of the employee:\n");
	String name = keyboard.nextLine();

	double wage = -1.0;

	while (wage < 0) {
	System.out.println("\nPlease input the hourly wage of the employee:\n");
		try {
			wage = keyboard.nextDouble();
		} catch (Exception e) {
			System.out.println("\nYou must input a valid wage in numbers that is greater than 0. Decimals are ok.");
			String bad = keyboard.next();
		}
	}

	double hours = -1.0;

	while (hours < 0) {
	System.out.println("\nPlease input the hours employee worked:\n");
		try {
			hours = keyboard.nextDouble();
		} catch (Exception e) {
			System.out.println("\nYou must input a valid number of hours worked, decimals are ok.");
			String bad = keyboard.next();
		}
	}

	//So now we have the inputs, lets calculate pay
	double pay = 0;

	if (hours > 40) //overtime calculation
		pay = (40 * wage) + ((hours-40)*(wage * 1.5));
	else //regular pay
		pay = (hours * wage);

	//And round this off because it is money
	pay = Math.round(pay*100)/100.0;

	//Now we have to print out a check for the employee

	System.out.println("\nPay to the order of: " + name);
	System.out.println("The amount of: " + pay);
	System.out.println("Signed:________________\n\n");

	}
}
