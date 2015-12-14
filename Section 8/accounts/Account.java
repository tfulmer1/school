/*
Final project: It's a bank acount like program
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 27 November 2015
*/

import java.util.*;

public class Account
{

	private static int numAccounts;
	private int accountNumber;
	private String accountOwner;
	private double accountBalance = 0.0;

	public Account(String newName, double initDeposit){
		Random rn = new Random();
		accountNumber = rn.nextInt(100000)+100000;
		accountOwner = newName;
		accountBalance += initDeposit;
		numAccounts++;
		
		System.out.println("\nYou have successfully created an account with the following information:");
		System.out.println("Account number: " + accountNumber + " Account owner: " + accountOwner + " Account Balance: " + accountBalance);

	}

	public void withdraw(double amount){
		if (accountBalance > amount){
			accountBalance -= amount;
			System.out.println("\nWithdraw was successful");
		}
		else
			System.out.println("\nInsufficient Funds. Withdraw cancelled");
	}

	public void deposit(double amount){
		accountBalance += amount;
	}

	public void balanceCheck(){
		System.out.println("\nThe Current Balance is: $" + accountBalance);
	}
	
	public void accountSummary(){
		System.out.println("\nSummary for Account #: " + accountNumber + "\nAccount Holder: " + accountOwner + "\tAccount Balance: " + accountBalance);
	}

	public static int numberOfAccounts(){
		return numAccounts;
	}
}
