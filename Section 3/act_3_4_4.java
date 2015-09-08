
/*
Activity 3.4 Problem 4 -- takes miles per gallon, 
gallons and price of gas to compute vehicle range/cost
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2015
*/

import java.util.Scanner;

public class act_3_4_4
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	//Time for inputs
	double mpg, gallons, range, price, cost;
	System.out.println("Please input the following information:\nNumber of Gallons in Gas Tank?");
	gallons = keyboard.nextDouble();
	System.out.println("\nMiles per Gallon?");
	mpg = keyboard.nextDouble();
	System.out.println("\nPrice per gallon?");
	price = keyboard.nextDouble();

	//calculations follow
	range = gallons * mpg; 
	cost = (100.0 / mpg) * price;
	cost = Math.round(cost*100)/100.0;

	//Outputting the calculated values
	System.out.println("This vehicle can travel " + range + " miles on a single tank. It costs $" + cost + " for every hundred miles of travel.");


	}
}
