
/*
Demonstrates Inheritence via multiple classes keeping sports statistics
Unit 4 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2016
*/

package U4_problem1.sports.sport;

import java.util.Scanner;
import U4_problem1.sports.*;

public class Basketball extends Sports
{
	private int mostThreePointShots;
	private int mostFreeThrows;
	private int mostBlockedShots;

	public Basketball(){
		super("Basketball", "NBA", 5, 103, 55, 41);
	}

	public Basketball(int mostThreePointShots, int mostFreeThrows, int mostBlockedShots){
		super("Basketball", "NBA", 5, 103, 55, 41);
		this.mostThreePointShots = mostThreePointShots;
		this.mostFreeThrows = mostFreeThrows;
		this.mostBlockedShots = mostBlockedShots;
	}

	public Basketball(String name, String league, int players, int mostPoints, int mostLosses, int mostWins, int mostThreePointShots, int mostFreeThrows, int mostBlockedShots){
		super(name, league, players, mostPoints, mostLosses, mostWins);
		this.mostThreePointShots = mostThreePointShots;
		this.mostFreeThrows = mostFreeThrows;
		this.mostBlockedShots = mostBlockedShots;
	}

	public void setMostThreePointShots(int shots){
		this.mostThreePointShots = shots;
	}

	public int getMostThreePointShots(){
		return mostThreePointShots;
	}

	public void setMostFreeThrows(int freeThrows){
		this.mostFreeThrows = freeThrows;
	}

	public int getMostFreeThrows(){
		return mostFreeThrows;
	}

	public void getMostBlockedShots(int shots){
		this.mostBlockedShots = shots;
	}

	public int getMostBlockedShots(){
		return mostBlockedShots;
	}
}
