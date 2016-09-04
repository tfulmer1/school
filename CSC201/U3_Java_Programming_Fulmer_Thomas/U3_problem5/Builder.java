
/*
Experimenting with String Builder Library to append and insert into strings
Unit 3 Problem 5
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 3 Sept 2016
*/

import java.util.Scanner;

public class Builder
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Input initial string");
		String inputString = kb.nextLine();
		StringBuilder testString = new StringBuilder(inputString);
		System.out.println("String Capacity is: " + testString.capacity());
		testString.append(" I love it!");
		System.out.println(testString);
		System.out.println("Type 'Yes,' to insert it into the string");
		inputString = kb.nextLine();
		testString.insert(12," ");
		testString.insert(13, inputString);
		System.out.println(testString);
	}
}
