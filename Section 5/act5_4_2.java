
/*
Take a user inputted string and print it out one character at a time on individual lines
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 October 2015
*/

import java.util.Scanner;

public class act5_4_2
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Input some text and I'll break it up into characters.");

	String text = kb.nextLine();
	//It seemed easiest just to use i starting at 0 in the charAt method to just pull each character and print at the same time
	for(int i = 0;i < text.length();i++) {
		System.out.println(text.charAt(i));
	}

	}
}
