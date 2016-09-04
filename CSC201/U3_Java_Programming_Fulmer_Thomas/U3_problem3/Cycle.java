
/*
Creates an object representing cycles of various numbers of wheels and weights
Unit 3 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Sept 2016
*/

package U3_problem3;

import java.util.Scanner;

public class Cycle
{
    public static Scanner kb = new Scanner(System.in);
    int numberOfWheels;
	int weight;

	public Cycle(int numberOfWheels, int weight){
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}

	public Cycle(){
		this(100, 1000);
	}

	public String toString(){
		String outString = ("Your cycle has " + numberOfWheels + " and weighs: " + weight);
		return outString;
	}


}
