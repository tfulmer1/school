
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

public class Football extends Sports
{
	private int highestRushingYards;
	private int highestPassingYards;
	private int longestFieldGoal;

	public Football(){
		super("Football", "NFL", 11, 63, 21, 34);
		this.highestRushingYards = 0;
		this.highestPassingYards = 0;
		this.longestFieldGoal = 0;
	}

	public Football(int highestRushingYards, int highestPassingYards, int longestFieldGoal){
		super("Football", "NFL", 11, 63, 21, 34);
		this.highestRushingYards = highestRushingYards;
		this.highestPassingYards = highestPassingYards;
		this.longestFieldGoal = longestFieldGoal;
	}

	public Football(String name, String league, int players, int mostPoints, int mostLosses, int mostWins, int highestRushingYards, int highestPassingYards, int longestFieldGoal){
		super(name, league, players, mostPoints, mostLosses, mostWins);
		this.highestRushingYards = highestRushingYards;
		this.highestPassingYards = highestPassingYards;
		this.longestFieldGoal = longestFieldGoal;
	}

	public void setHighestRushingYards(int highestRushingYards){
		this.highestRushingYards = highestRushingYards;
	}

	public int getHighestRushingYards(){
		return highestRushingYards;
	}

	public void setHighestPassingYards(int highestPassingYards){
		this.highestPassingYards = highestPassingYards;
	}

	public int getHighestPassingYards(){
		return highestPassingYards;
	}

	public void setLongestFieldGoal(int longestFieldGoal){
		this.longestFieldGoal = longestFieldGoal;
	}

	public int getLongestFieldGoal(){
		return longestFieldGoal;
	}

}
