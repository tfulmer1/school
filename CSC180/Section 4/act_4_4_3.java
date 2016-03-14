
/*
Calculates taxes owed based on the 1913 tax schedule
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 September 2015
*/

import java.util.Scanner;

public class act_4_4_3
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	double income, onerate, tworate, threerate, fourrate, fiverate, sixrate, taxdue;

	income = -1.0;
	onerate = 0;
	tworate = 0;
	threerate = 0;
	fourrate = 0;
	fiverate = 0;
	sixrate = 0;

	//This loop will prompt for income and hopefully catch errors

	while (income < 0) {
	//Lets start with a prompt for income

	System.out.println("\nThis program will calculate the taxes you'd have owed in 1913 in the initial income tax.\n\nTry inputting your income to see how much you'd have paid: \n");
		try {
			income = keyboard.nextDouble();
		} catch (Exception e) {
			System.out.println("\nYou must have a positive income written in numbers, decimals are ok.");
			String bad = keyboard.next();
		}
	}

	//calculate each level of taxes
	if (income > 500000)
		{sixrate = (income - 500000)*.06;
		income = 500000; }
	
	if (income > 250000)
		{fiverate = (income - 250000)*.05;
		income = 250000; }

	if (income > 100000)
		{fourrate = (income - 100000)*.04;
		income = 100000; }

	if (income > 75000)
		{threerate = (income - 75000)*.03;
		income = 75000; }

	if (income > 50000)
		{tworate = (income - 50000)*.02;
		income = 50000; }
	
	onerate = income * .01;

	//Add up the values to get total tax due
	taxdue = onerate + tworate + threerate + fourrate + fiverate + sixrate;

	//And round that amount to the nearest dollar cent
	taxdue = Math.round(taxdue*100)/100.0;
	
	//Let's give the user the bad news
	System.out.println("\nYour total tax due (if this were 1913) is: $" + taxdue + "\n");

	}
}
