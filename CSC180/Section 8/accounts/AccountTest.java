/*
Final project: This is the test class for the main account class
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 27 November 2015
*/

import java.util.*;


public class AccountTest
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	/*
	The following DEBUG lines are based on the 
	requirements provided in the instructions for the project
	They illustrate the various methods in the Account class
	*/
	Account mike = new Account("Mike",500.00);
	
	mike.accountSummary();
	mike.deposit(500.00);
	mike.balanceCheck();
	
	Account susan = new Account("Susan",100.00);
	susan.withdraw(50.00);
	susan.balanceCheck();
	susan.withdraw(70.00);
	susan.balanceCheck();

	int numberOfAccounts = Account.numberOfAccounts();
	System.out.println("The total number of accounts is: " + numberOfAccounts);

	}
}
