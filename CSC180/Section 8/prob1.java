
/*
Answers Unit 8, section 4, problem 1 -- multiple operations on an array of random ints
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 November 2015
*/

import java.util.*;

public class prob1
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	int[] numbers = new int[10];

	Random rand = new Random();

	for (int i = 0; i < numbers.length; i++){
		int x = rand.nextInt(100)+1;
		numbers[i] = x;
	}

	int min, max, evenSum, oddSum, allSum;

	min = numbers[0];
	max = numbers[0];
	evenSum = 0;
	oddSum = 0;
	allSum = 0;

	//calculate min/max/allSum in one go
	for (int number : numbers){
		if (number > max)
			max = number;
		if (number < min)
			min = number;
		allSum += number;
	}

	//Output every element at an even index and calculate odd/even sums
	System.out.println("The following values are at an even index (including 0)");
	for (int i = 0; i < numbers.length; i++){
		if ((i+2)%2 == 0){
			System.out.print(numbers[i] + "\t");
			evenSum += numbers[i];
			}
		else
			oddSum += numbers[i];
		}

	//output every element that is even
	System.out.println("\n\nThe following are the elements that are even numbered:");
	for (int number : numbers) {
		if (number % 2 == 0)
			System.out.print(number + "\t");
	}
	
	//Output each element in reverse
	System.out.println("\n\nThis is the entire random array in reverse order:");
	for (int i = numbers.length - 1; i >= 0; i--){
		System.out.print(numbers[i] + "\t");
	}

	//Output min/max/allSum/alternating sums
	System.out.println("\n\nThe Lowest value is: " + min + "\n\nThe highest value is: " + max + "\n\nThe sum of all values is: " + allSum + "\n\nThe sum of the values at even index is: " + evenSum + "\n\nThe sum of the values at odd index is: " + oddSum);


	}
}
