
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

public class Baseball extends Sports
{
	private int mostRBI;
	private int mostHomeruns;

	public Baseball(){
		super("Baseball", "MLB", 9, 15, 12, 15);
	}

	public Baseball(int mostRBI, int mostHomeruns){
		super("Baseball", "MLB", 9, 15, 12, 15);
		this.mostRBI = mostRBI;
		this.mostHomeruns = mostHomeruns;
	}

	public Baseball(String name, String league, int players, int mostPoints, int mostLosses, int mostWins, int mostRBI, int mostHomeruns){
		super(name, league, players, mostPoints, mostLosses, mostWins);
		this.mostRBI = mostRBI;
		this.mostHomeruns = mostHomeruns;
	}

	public void setMostRBI(int rbi){
		this.mostRBI = rbi;
	}

	public int getMostRBI(){
		return mostRBI;
	}

	public void setMostHomeruns(int homeruns){
		this.mostHomeruns = homeruns;
	}

	public int getMostHomeruns(){
		return mostHomeruns;
	}
}
