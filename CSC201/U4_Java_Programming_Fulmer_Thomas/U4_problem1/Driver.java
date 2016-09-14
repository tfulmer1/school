
/*
Demonstrates Inheritence via multiple classes keeping sports statistics
Unit 4 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2016
*/

package U4_problem1;

import java.util.Scanner;
import U4_problem1.sports.*;
import U4_problem1.sports.sport.*;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Sports[] test_list = {
			new Baseball(1, 2),
			new Football(3, 4, 5),
			new Basketball(6, 7, 8)
		};
		//Testing method inheritence
		for(Sports sport : test_list){
			System.out.println("Name: " + sport.getSportName());
			System.out.println("League Name: " + sport.getLeagueName());
			System.out.println("Number of players: " + sport.getNumPlayers());
			System.out.println("Most points scored: " + sport.getMostPointsInGame());
			System.out.println("Most Consecutive Wins: " + sport.getMostConsecutiveWins());
			System.out.println("Most Consecutive Losses: " + sport.getMostConsecutiveLosses());
		}

		//Testing super and sub set methods/constructors
		Baseball sport = new Baseball("Blurnsball", "League of Blurns", 5, 25, 10, 100, 3, 9);
		System.out.println("Name: " + sport.getSportName());
		System.out.println("League Name: " + sport.getLeagueName());
		System.out.println("Number of players: " + sport.getNumPlayers());
		System.out.println("Most points scored: " + sport.getMostPointsInGame());
		System.out.println("Most Consecutive Wins: " + sport.getMostConsecutiveWins());
		System.out.println("Most Consecutive Losses: " + sport.getMostConsecutiveLosses());
		System.out.println("Most RBIs: " + sport.getMostRBI());
		System.out.println("Most Homeruns: " + sport.getMostHomeruns());

		sport.setNumPlayers(111111);
		sport.setMostRBI(222222);
		System.out.println("Adjusted most RBI: " + sport.getMostRBI());
		System.out.println("Adjusted number of players: " + sport.getNumPlayers());
	}
}
