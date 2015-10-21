
/*
Print a multiplication table
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 October 2015
*/

import java.util.Scanner;

public class act5_4_4
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("\nMultiplication table up to 10 * 10\n");	
	
	for(int i = 1;i <= 10;i++) {
		System.out.println(i + "\t" + i*2 + "\t" + i*3 + "\t" + i*4+ "\t" + i*5 + "\t" + i*6 + "\t" + i*7 + "\t" + i*8 + "\t" + i*9 + "\t" + i*10); //Going to just print each number times the top row with a tab for appearances
	}

	System.out.println("");
	}
}
