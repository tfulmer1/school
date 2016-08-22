
/*
Counts girl scout cookie sales and sorts and displays relevant outputs
Unit 2 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 Aug 2016
*/
package u2_problem1;

import java.util.Scanner;

public class counter
{
	String name = "";
	int count = 0;

	public counter(String name, int count){
		this.name = name;
		this.count = count;
	}

	public void resetCount(){
		count = 0;	
	}

	public void upCount(){
		count += 1;
	}

	public void setCount(int input_count){
		count = input_count;
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

	public String getName(){
		return name;
	}

}
