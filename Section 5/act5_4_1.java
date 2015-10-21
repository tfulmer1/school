
/*
Assignment 5.4.1: A program that prompts the user once for a list of floating point values and at the end provides the user with teh average, the smallest, the largest and the rangeThomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 October 2015
*/

import java.util.Scanner;

public class act5_4_1
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	//Declaring variables for everything here
	int inputcount = 0;
	String newinput;
	double newinputf = 0, total = 0, smallest = 0, largest = 0, average = 0, range = 0;
	boolean goodinput = true;
	
	//Can only give this instruction once per the program requirements
	System.out.println("Please input a series of numbers (decimals are ok)\nHit enter after each input");
	do {
		newinput = kb.nextLine(); //Taking inputs as a string instead of an integer, thus allowing "done" as an input instead of requiring a negative number. What if they want to average negatives after all?
		try {
			newinputf = Double.parseDouble(newinput);
		} catch (NumberFormatException e) { //This will deflect math involving bad inputs, including done commands or just plain errors
			goodinput = false;
			if (newinput.equalsIgnoreCase("done") == false)
				System.out.println("Inputs must be either a number or the word \"done\" to end");
		}
		if (goodinput == true) {
			total += newinputf;
			if ((smallest >= newinputf) || (inputcount == 0))
				smallest = newinputf;
			if ((largest <= newinputf) || (inputcount == 0))
				largest = newinputf;
			inputcount++;
		} else {
			goodinput = true; //resets to true for the next input
		}
	} while (newinput.equalsIgnoreCase("done") == false); //how to kill the loop, ignores case for ease of use
	
	//outputs here
	average = Math.round((total / inputcount)*100)/100.0;
	range = Math.round((largest - smallest)*100)/100.0;
	System.out.println("\nHere are the results:\nLargest Value: " + largest + "\nSmallest: " + smallest + "\nAverage: " + average + "\nRange: " + range);


	}
}
