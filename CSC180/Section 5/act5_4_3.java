
/*
Prints out user inputted number of fibonnaci numbers
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 October 2015
*/

import java.util.Scanner;

public class act5_4_3
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println(" How many Fibonacci numbers would you like me to count?");
	int count = kb.nextInt();
	
	if ( count < 2) {
		System.out.println("The " + count + " Fibonacci number is 1"); //there is no need to calculate if they want #1 or #2, since those are both givens
	}
	//Here is the counting for numbers greater than 2
	else {
		int fold1 = 1;
		int fold2 = 1;
		int fNew = 0;

		for(int i = 3;i <= count;i++){
			fNew = fold1 + fold2;
			fold1 = fold2;
			fold2 = fNew;
		}

		System.out.println("The " + count + " Fibonacci number is " + fNew);
	}
	}
}
