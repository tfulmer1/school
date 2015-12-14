
/*
Reads a sequence of input values and displays a bar chart with labels
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 November 2015
*/

import java.util.*;

public class prob2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
	
		//how many inputs does the user want on their chart?
		System.out.println("Welcome to the bar chart creator, how many items are going on your bar chart today?");
		int size = kb.nextInt();
		String bad = kb.nextLine();

		//Create an array for labels and an array for values

		String[] labels = new String[size];
		int[] values = new int[size];
	
		//Create a loop to populate the strings

		int position = 0;
		int max = 0;
		while (position < labels.length) {
			System.out.println("Enter a label");
			labels[position] = kb.nextLine();
			System.out.println("Enter the value for this label");
			values[position] = kb.nextInt();
			bad = kb.nextLine();
			if (values[position] > max)
				max = values[position];
			position += 1;
		}
		
		//Now we need to display the bar chart

		position = 0;
		int bar = 0;		

		while (position < labels.length){
			bar = Math.round((values[position]*40) / max);
			System.out.print(labels[position] + "\t");
			for (int i = 1; i <= bar;i++){
				System.out.print("*");
				}
			System.out.print("\n");
			position += 1;
		}
	}
}
