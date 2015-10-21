
/*
Write a program that simulates the drunkard's walk of random directions
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 October 2015
*/

import java.util.Scanner;
import java.util.Random;

public class act5_4_5
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("\nThis program simulates the drunkards walk\nAssuming the drunkard walks randomly in one of four directions at each intersection\nHow far from the origin does he end up?\n");

	Random rand = new Random(); //Setting up a random number
	int north = 0; //negative north = south
	int east = 0; //negative east = west
	for (int i = 1; i<=100; i++) {
		int direction = rand.nextInt(4);
		if (direction == 0)
			north += 1;
		if (direction == 1)
			north -= 1;
		if (direction == 2)
			east += 1;
		if (direction == 3)
			east -= 1;
	}
	
	System.out.println("After 100 decisions this time he ended up at: (" + north + "," + east + ")");

	}
}
