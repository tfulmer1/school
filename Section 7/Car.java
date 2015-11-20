/*
Takes a car and calculates fuel efficiency over given travels, allows refueling
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 19 November 2015
*/

import java.util.*;

public class Car
{
	//declare variables
	double mpg;
	double fuel = 0;
	
	//form constructor
	public Car (double inputmpg) {
		mpg = inputmpg;
	}

	//adds gas to the car and confirms addition
	private void addGas(double gallons){
		fuel += gallons;
		System.out.println("You have successfully added " + gallons + " gallons, the fuel level is " + fuel);
	}
	
	//checks if car is out of gas and returns a boolean
	private boolean noGas(){
		if (fuel <= 0)
			return true;
		else
			return false;
	}

	//makes the car go
	private void drive(double miles){
		double gasUsed = miles / mpg;
		gasUsed = Math.round(gasUsed*100)/100.0; // lots of rounding
		fuel -= gasUsed;
		if (this.noGas() == false) //makes sure car doesn't run out
			System.out.println("You have successfully driven " + miles + " consuming " + gasUsed + " gallons of gas");
		else
			System.out.println("You ran out of gas before reaching your destination! Plan better next time");
	}
	
	//returns current gas, if noGase check fails, returns zero instead of a negative number
	private double getGasLevel(){
		if (this.noGas() == true)
			return 0.0;
		else
			return Math.round(fuel*100)/100.0;
	}

	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	Car test = new Car(30);
	//debug code, first we get starting gas level to make sure construction worked
	System.out.println("Current gas: " + test.getGasLevel());

	test.addGas(10.0); //add gas
	
	test.drive(100.0); 

	test.drive(100.0);

	test.drive(100.0);//should still be driving on fumes

	System.out.println("Final gas level " + test.getGasLevel());

	test.drive(100.0); //make it run out to check noGas logic

	System.out.println("Final gas level " + test.getGasLevel());

	}
}
