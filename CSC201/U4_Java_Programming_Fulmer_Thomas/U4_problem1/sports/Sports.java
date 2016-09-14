
/*
Demonstrates Inheritence via multiple classes keeping sports statistics
Unit 4 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 Sept 2016
*/

package U4_problem1.sports;

import java.util.Scanner;

public class Sports
{
	private String sportName;
	private String leagueName;
	private int numPlayers;
	private int mostPointsInGame;
	private int mostConsecutiveGamesLost;
	private int mostConsecutiveGamesWon;

	public Sports(){
		this.sportName = "None";
		this.leagueName = "None";
		this.numPlayers = 0;
		this.mostPointsInGame = 0;
		this.mostConsecutiveGamesLost = 0;
		this.mostConsecutiveGamesWon = 0;
	}

	public Sports(String name, String league, int players, int mostPoints, int mostLosses, int mostWins){
		this.sportName = name;
		this.leagueName = league;
		this.numPlayers = players;
		this.mostPointsInGame = mostPoints;
		this.mostConsecutiveGamesLost = mostLosses;
		this.mostConsecutiveGamesWon = mostWins;
	}

	public String GetSportSummary(){
		String outString = ("The Sport of " + sportName + " is regulated by the " + leagueName + " and is played by " + numPlayers + ". The most points ever scored in a game is " + mostPointsInGame + ". The longest winning streak was " + mostConsecutiveGamesWon + " and the longest losing streak was " + mostConsecutiveGamesLost);
		return outString;
	}

	public void setSportName(String name){
		this.sportName = name;
	}

	public void setLeagueName(String leagueName){
		this.leagueName = leagueName;
	}

	public void setNumPlayers(int number){
		this.numPlayers = number;
	}

	public void setMostPointsInGame(int mostPoints){
		this.mostPointsInGame = mostPoints;
	}

	public void setMostConsecutiveWins(int wins){
		this.mostConsecutiveGamesWon = wins;
	}

	public void setMostConsecutiveLosses(int losses){
		this.mostConsecutiveGamesLost = losses;
	}

	public String getSportName(){
		return sportName;
	}

	public String getLeagueName(){
		return leagueName;
	}

	public int getNumPlayers(){
		return numPlayers;
	}

	public int getMostPointsInGame(){
		return mostPointsInGame;
	}

	public int getMostConsecutiveWins(){
		return mostConsecutiveGamesWon;
	}

	public int getMostConsecutiveLosses(){
		return mostConsecutiveGamesLost;
	}
}
