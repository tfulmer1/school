
/*
Uses the cycle class from unit 3 to test exception handling
Unit 7 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 5 Oct 2016
*/

package U7_Problem1;

import java.util.Scanner;

public class Cycle
{
    public static Scanner kb = new Scanner(System.in);
    int numberOfWheels;
	int weight;

	public Cycle(int numberOfWheels, int weight)
    throws MyException {
		if (numberOfWheels <= 0 || weight <= 0)
			throw new MyException("ERROR: Values cannot be less than or equal to zero");
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}

	public Cycle(){
		this.numberOfWheels = 100;
		this.weight = 1000;
	}

	public String toString(){
		String outString = ("Your cycle has " + numberOfWheels + " wheels and weighs: " + weight);
		return outString;
	}


}
