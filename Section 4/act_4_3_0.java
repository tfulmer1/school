
/*
This program addresses Programming Project 4, pg 195 of textbook
It reads an incoming date to check if it is valid
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 13 Sept 2015
*/

import java.util.Scanner;

public class act_4_3_0
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

	//Prompt the user for a properly formatted date first

	System.out.println("Please input a date in the mm/dd/yyyy format only!");

	String date = keyboard.nextLine();
	String month = date.substring(0,2);
	String day = date.substring(3,5);
	String year = date.substring(6);	

	//we also need integer versions of each
	int intmonth = 0;
	int intday = 0;
	int intyear = 0;

	/* I originally did parseInt() which worked fine for properly formatted dates. Once I tried breaking the program
	I realized this method throws exceptions like a fiend. So I had to catch it in a way that preserved later logic 
	tests instead of just ending the program
	*/
	try {
		intmonth = Integer.parseInt(month);
	} catch (NumberFormatException e) {
		intmonth = 0;
	}
	try {
		intday = Integer.parseInt(day);
	} catch (NumberFormatException e) {
		intday = 0;
	}

	try {
		intyear = Integer.parseInt(year);
	} catch (NumberFormatException e) {
		intyear = 0;
	}

	//If any of those integer values are 0 due to user input error these tests will fail. Now we've got to make sure the days/months/years are valid combos

	boolean monthValid = (intmonth <=12 && intmonth >=1 && month.length() == 2);
	boolean leapyear = ((intyear % 4 == 0 && intyear % 100 != 0) || (intyear % 400 == 0)); //Should accurately flag leapyear
	boolean yearValid = (year.length() == 4); //This won't handle dates BC let's hope those don't happen
	
	int maxdays; //this will hold the max days allowed based on the month/leapyear values
		maxdays = 0;
		if ( intmonth == 2 && leapyear)
			maxdays = 29;
		if ( intmonth == 2 && !leapyear)
			maxdays = 28;
		if (intmonth == 1 || intmonth == 3 || intmonth == 5 || intmonth == 7 || intmonth == 8 || intmonth == 10 || intmonth == 12)
			maxdays = 31;
		if (intmonth == 4 || intmonth == 6 || intmonth == 9 || intmonth == 11)
			maxdays = 30;

	boolean dayValid = ((maxdays > 0) && (intday <= maxdays) && (intday > 0) && (day.length() == 2));
	
	//moment of truth, let's tell the user if they got it right
	if (monthValid && dayValid && yearValid)
		System.out.println("\nYou have successfully entered the date: " + month + "/" + day + "/" + year + "\n");
	else
		System.out.println("\nYou have entered an invalid date. Next time please read the instructions.\n");
	}
}
