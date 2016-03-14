
/*
Prompts for the month then passes the number of days in the month
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 September 2015
*/

import java.util.Scanner;

public class act_4_4_4
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

	//Should be easy, prompt for month

	int month;

	//We need to catch input errors too

	System.out.println("Enter a valid month (1-12) and you'll be told how many days are in the month");
	try {
		month = keyboard.nextInt();
	} catch (Exception e) {
		System.out.println("Since you can't follow instructions and enter a valid month (1-12), your output will be preselected for you");
		month = 2; }	

	//And output the days of the month

	if (month == 2)
		System.out.println("There are 28 days in February, except on leapyears when there are 29");
	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		System.out.println("This is a month with 31 days");
	if (month == 4 || month == 6 || month == 9 || month == 11)
		System.out.println("This month has only 30 days");
	if (month < 1 || month > 12)
		System.out.println("This is not a valid month number!!");

	}
}
