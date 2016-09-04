
/*
Tests the cycle class
Unit 3 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Sept 2016
*/

package U3_problem3;

import java.util.Scanner;

public class Unittest
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Cycle cycle1 = new Cycle(2,300);
        Cycle cycle2 = new Cycle();

        System.out.println(cycle1.toString());
        System.out.println(cycle2.toString());


	}
}
