
/*
Solves Activity 3.4 Problem 2, takes Radius of a circle and outputs circumference and area
of the circle and volume/surface area of a sphere
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2015
*/

import java.util.Scanner;

public class act_3_4_2
{
	public static final double PI = 3.14; //Can't do circles without PI	

	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	//and somewhere to hold the radius
	int radius;

	//Get user input
	System.out.println("Please input the radius to determine the properties of a circle or sphere");
	radius = keyboard.nextInt();

	//Compute all the values
	double circ, area, surface, volume;
	circ = PI * (2 * radius);
	area = PI * radius * radius;
	surface = 4 * PI * (radius * radius);
	volume = (4/3) * PI * (radius * radius * radius);

	//output to user
	System.out.println("\nThe values you requested are:\nCircumference = " + circ + "\nArea = " + area + "\nSurface Area = " + surface + "\nVolume = " + volume);

	}
}
