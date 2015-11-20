
/*
Builds an address class with two constructors depending on whether or not the house has an apartment number or not. Then provides a boolean method to test if one address comes before another by numerical value of the zipcodes
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 19 November 2015
*/

import java.util.*;

public class Address
{
	boolean apt;
	String houseNumber, street, aptNumber, city, state, zipcode;

	//constructor 
	public Address(boolean apt, String houseNum, String streetName, String aptNum, String cityName, String stateName, String zip ) {
		houseNumber = houseNum;
		street = streetName;
		city = cityName;
		state = stateName;
		zipcode = zip;
		//constructing based on whether or not this is an apartment
		if (apt == true) {
			aptNumber = aptNum;
			apt = true;
		}		
		else{
			aptNumber= "";
			apt = false;			
		}
	}
	//tests to see which zip code comes first
	public boolean comesBefore(Address other) {
		try {
		int primary = Integer.parseInt(this.zipcode);
		int secondary = Integer.parseInt(other.zipcode);
		if (primary < secondary)
			return true;
		else
			return false;

		} catch (NumberFormatException e) { //parseint throws errors a lot, catching here
			System.out.println("One or more zip codes were improperly entered");
			return false;
		}
	}

	//printing different formats based on whether or not an apartment number is present
	private void printAddress(){
		if (apt == true)
			{
			System.out.println(houseNumber + " " + street + " Apt: " + aptNumber + "\n" + city + ", " + state + " " + zipcode);	
		}
		else {
			System.out.println(houseNumber + " " + street + "\n" + city + ", " + state + " " + zipcode);
		}
	}


	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	/*
	The following is all debug code to test the various methods and is not intended for real use
	*/

	System.out.println("Please provide two addresses\nIs the first address an apartment? (y/n)");
	String aptinput = kb.nextLine();
	boolean apt, apt2;
	if (aptinput.equalsIgnoreCase("y") || aptinput.equalsIgnoreCase("yes"))
		apt = true;
	else
		apt = false;
	System.out.println("Please enter the house number:");
	String num = kb.nextLine();
	System.out.println("Please enter the street name");
	String street = kb.nextLine();
	String aptnum;
	if (apt == true)
		{
		System.out.println("Please input the Apartment Number");
		aptnum = kb.nextLine();
	}
	else {
		aptnum = "";
	}
	System.out.println("Please enter the city");
	String city = kb.nextLine();
	System.out.println("Please enter the State");
	String state = kb.nextLine();
	System.out.println("Please enter the zip code");
	String zipcode = kb.nextLine();

	Address firstAddress = new Address(apt, num, street, aptnum, city, state, zipcode);

	System.out.println("Is the second address an apartment?");
	
	String aptinput2 = kb.nextLine();
	if (aptinput2.equalsIgnoreCase("y") || aptinput2.equalsIgnoreCase("yes"))
		apt2 = true;
	else
		apt2 = false;
	System.out.println("Please enter the house number:");
	String num2 = kb.nextLine();
	System.out.println("Please enter the street name");
	String street2 = kb.nextLine();
	String aptnum2;
	if (apt2 == true)
		{
		System.out.println("Please input the Apartment Number");
		aptnum2 = kb.nextLine();
	}
	else {
		aptnum2 = "";
	}
	System.out.println("Please enter the city");
	String city2 = kb.nextLine();
	System.out.println("Please enter the State");
	String state2 = kb.nextLine();
	System.out.println("Please enter the zip code");
	String zipcode2 = kb.nextLine();

	Address secondAddress = new Address(apt2, num2, street2, aptnum2, city2, state2, zipcode2);

	System.out.println("Based on the zipcodes, here are the addresses in order:");

	if (firstAddress.comesBefore(secondAddress))
	{
		firstAddress.printAddress();
		secondAddress.printAddress();
	}
	else
	{	
		secondAddress.printAddress();
		firstAddress.printAddress();
	}



	}
}
