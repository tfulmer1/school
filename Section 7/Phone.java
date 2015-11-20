
/*
Defines a class and provides constructors to illustrate creation of a new object of the class
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 19 November 2015
*/

import java.util.Scanner;

public class Phone 
{
	
	String os, model, phoneNumber;
	//constructor
	public Phone(String phoneNumber, String os, String model) {
		setPhoneInfo(phoneNumber, os, model);
	}
	//method for setting phone info, used in constructor also
	private void setPhoneInfo(String number, String opsys, String type){
		phoneNumber = number;
		os = opsys;
		model = type;	
	}

	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	//the following is debug code
	System.out.println("Please input your phone number");
	String number = kb.nextLine();
	System.out.println("Please input your phone's OS");
	String os = kb.nextLine();
	System.out.println("Please input your phone's model name");
	String model = kb.nextLine();
	
	Phone test = new Phone(number, os, model);

	System.out.println("You entered a new " + test.model + " running " + test.os + " and your phone number is: " + test.phoneNumber);


	}
}
