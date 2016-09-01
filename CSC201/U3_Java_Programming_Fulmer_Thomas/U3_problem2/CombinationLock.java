
/*
Simulates combination locks at a high school
Unit 3 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/

package U3_problem2;

import java.util.Scanner;
import java.util.Random;

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
	};

	int turn = 0;
	boolean[] turns = {false, false, false};

	public CombinationLock(){
		//Empty
		Random random = new Random();
		combo[1] = random.nextInt(40);
		combo[2] = random.nextInt(40);
		combo[3] = random.nextInt(40);
		setTicks();
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

	private void setTicks(){
		//need to calculate the distances between turns
		//first turn - to right
		ticks[0] = 40 - combo[1];
		//second turn - to left
		if (combo[2] > combo[1])
			ticks[1] = combo[2] - combo[1];
		else
			ticks[1] = ticks[0] + combo[2];
		//third turn, to right
		if (combo[3] < combo[2])
			ticks[2] = combo[2] - combo[3];
		else
			ticks[2] = combo[2] + (40-combo[3]);
		
	}

	private int computeTick(int target, boolean right){
		int newTick;
		if (right){
			if (target < combo[0]){
				newTick = combo[0] - target;
			} else {
				newTick = combo[0] + (40-target);
			}
		} else {
			if (target > combo[0]){
				newTick = target - combo[0];
			} else {
				newTick = (40 - combo[0]) + target;
			}
		}
		return newTick;
			
	}
	
	public int[] getCombo(){
		int[] out_list = {combo[1], combo[2], combo[3]};
		return out_list;
	}

	public void resetDial(){
		combo[0] = 0;
		turn = 0;
		boolean[] turns = {false, false, false};
	}

	public void turnLeft(int targetNumber){
		int tick = computeTick(targetNumber, false);
		combo[0] = targetNumber;
		if (tick == ticks[turn]){
			turns[turn] = true;
		}
		combo[0] = targetNumber;
		turn++;
	}

	public void turnRight(int targetNumber){
		int tick = computeTick(targetNumber, true);
		combo[0] = targetNumber;
		if (tick == ticks[turn]){
			turns[turn] = true;
		}
		combo[0] = targetNumber;
		turn++;
	}

	public boolean openLock(int number1, int number2, int number3){
		turnRight(number1);
		turnLeft(number2);
		turnRight(number3);
		for (boolean turn : turns){
			if (turn == false)
				return false;
		}
		return true;
	}

	public static void main(String[] args)
	{
		//Unittest
		CombinationLock lock = new CombinationLock(1,39,1);
		int[] list = lock.getCombo();
		for (int item : list){
			System.out.println(item);
		}
		System.out.println("Opens with combo 1, 39, 27: " + lock.openLock(1, 39, 27));
		System.out.println("Position before reset " + lock.combo[0]);
		lock.resetDial();
		System.out.println("Position after reset: " + lock.combo[0]);
		lock.setCombo(23, 5, 19);
		System.out.println("Combo reset to 23, 5, 19. Trying 23, 5, 11. Success: " + lock.openLock(23, 5, 11));
		lock.resetDial();
		System.out.println("Attemping to open with 23, 5, 19. Succes: " + lock.openLock(23, 5, 19));
		System.out.println("Position after opening: " + lock.combo[0]);
	}
}
