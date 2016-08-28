
/*
Simulates combination locks at a high school
Unit 3 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/

import java.util.Scanner;

public class CombinationLock
{
    int[] combo = {
		0, //current position
		0, //first combo
		0, //second combo
		0  // third combo
	};

	int[] ticks = {
		0, //first turn ticks
		0, //second turn ticks
		0 // third turn ticks
	}

	public CombinationLock(){
		//Empty
	}

	public CombinationLock(int first, int second, int third){
		this.combo[1] = first;
		this.combo[2] = second;
		this.combo[3] = third;
		setTicks();
	}

	public void setCombo(int first, int second, int third){
		this.combo[1] = first;
		this.combo[2] = second;
		this.combo[3] = third;
		setTicks();
	}

	public void setTicks(){
		//need to calculate the distances between turns
	}
	
	public int[] getCombo(){
		int[] out_list = {combo[1], combo[2], combo[3]};
		return out_list;
	}

	public void resetDial(){
		combo[0] = 0;
	}



}
