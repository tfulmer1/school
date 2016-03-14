
/*
Decrypts an enemy code per page 259, problem 11
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 September 2015
*/

import java.util.Scanner;

public class act5_3_0
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Welcome to the Bomb code breaking machine\nPlease input the enemy code exactly as intercepted");
		//Tribute to the enigma bomb, which used this same brute force method
	
	//Cipher Text and Plain Text variables
	String ct = keyboard.nextLine();
	String pt = " ";
	int key = 1; //Starting key for breaking will be 1

	while (key <= 100)
		{
		int i = 0;
	
		while (i < ct.length()) 
			{
			char x = ct.charAt(i); //first round takes charAt(0) and subsequent iterations take new letters
			int ascii = (int)x; //convert to ascii value
			//Decrypt
			if ( ((ascii - key - 32 + 127) + key) > 126 )
				ascii = ascii - key - 32 + 127;
			else
				ascii = ascii - key;
			x = (char)ascii; //ASCII back to character
			pt = pt + String.valueOf(x); //character back to string
			i++;
			}

		//Print each possible output to the user
		System.out.println("Key: " + key + " Results in this plain text:" + pt);
		pt = " ";
		key++;
		}


	}
}
