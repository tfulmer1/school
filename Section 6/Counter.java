/*
A class for holding a count that will count up or down or reset but never go negative
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 24 October 2015
*/

import java.util.Scanner;

public class Counter
{
	int count = 0;

	public void resetCount(){
		count = 0;	
	}

	public void upCount(){
		count += 1;
	}

	public void downCount(){
		if (count > 0)
			count -= 1;
		else
			count = 0;
	}

	public int getCount(){
		return count;
	}

	public void displayCount(){
		System.out.println("The current count is " + count);
	}

	public static void main(String[] args)
	{
	
	Counter counter = new Counter();
	
	counter.resetCount(); //0
	counter.upCount(); //1
	counter.upCount(); //2
	counter.displayCount(); //Display 2
	counter.downCount(); //1
	counter.downCount(); //0
	counter.downCount(); //0
	counter.displayCount(); // display 0
	counter.upCount(); // 1
	int test = counter.getCount(); // returns 1
	System.out.println("Test value = " + test); // should print 1
	counter.displayCount(); //Should also display 1

	}
}
