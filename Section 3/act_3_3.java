
/*
This program converts fahrenheit to celsius answering Programming project 1 on pg 131
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2015
*/

import java.util.Scanner;

public class act_3_3
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a temperature in degrees Fahrenheit:");
	
	//The assignment calls for an integer input and float output, so declaring variables
	int DegreesF;
	double DegreesC;
	
	DegreesF = keyboard.nextInt();
	
	DegreesC = 5.0*(DegreesF - 32.0)/9.0;
	DegreesC = Math.round(DegreesC*100.0)/100.0; //This was necessary to limit decimal length of float

	System.out.println(DegreesF + " degrees Fahrenheit is " + DegreesC + " degrees Celsius.");


	}
}
