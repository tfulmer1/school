
/*
A broken GPS simulator, basically a drunkard's walk problem
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/

import java.util.Scanner;
import java.util.Random;
import java.lang.Math.*;

public class U1_Problem4
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("\nThis program simulates a broken gps\nAssuming the vehicle moves 60mph in a grid like city with intersections every 5 minutes (5 miles)\nHow much distance is covered?\n\n");

	Random rand = new Random(); //Setting up a random number
	int north = 0; //negative north = south
	int east = 0; //negative east = west
	for (int i = 1; i<=20; i++) {
		int direction = rand.nextInt(4);
		if (direction == 0)
			north += 5;
		if (direction == 1)
			north -= 5;
		if (direction == 2)
			east += 5;
		if (direction == 3)
			east -= 5;
	}
	double distance = Math.sqrt((north * north) + (east * east));
	System.out.println("After 20 random turns the vehicle has travelled to : (" + north + "," + east + ") from (0,0)\nThat's a distance of: " + distance);

	}
}
