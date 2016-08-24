
/*
Keeps track of high and low temperatures for the year and provides averages and highest high and lowest low
Unit 2 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 23 Aug 2016
*/

import java.util.Scanner;

public class U2_Problem3
{
    public static Scanner kb = new Scanner(System.in);

	private static int[][] temps = {
		{0,0,0,0,0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0,0,0,0,0}
	};

	private static String[] months = {
		"January",
		"February",
		"March",
		"April",
		"May",
		"June",
		"July",
		"August",
		"September",
		"October",
		"November",
		"December"
	};

	private static void inputTempForMonth(int monthIndex){
		//input high and low temperatures for a month
		System.out.println("Enter the high for " + months[monthIndex]);
		temps[0][monthIndex] = kb.nextInt();
		String bad = kb.nextLine();
		System.out.println("Enter the low for " + months[monthIndex]);
		temps[1][monthIndex] = kb.nextInt();
		bad = kb.nextLine();
	}

	private static void inputTempForYear(){
		//collects all the months data using the inputTempForMonth method
		for (int i = 0; i < 12; i++){
			inputTempForMonth(i);
		}
	}

	private static double calculateAverageHigh(){
		//calculates the average high for the year
		double total = 0;
		for (int i = 0; i<12; i++){
			total += (double)temps[0][i];
		}
		double average = total / 12.0;
		average = (int)(average*100);
		average = ((double)average)/100.0;
		return average;
	}

	private static double calculateAverageLow(){
		//calculates the average low for the year
		double total = 0;
		for (int i = 0; i<12; i++){
			total += (double)temps[1][i];
		}
		double average = total / 12.0;
		average = (int)(average*100);
		average = ((double)average)/100.0;
		return average;
	}

	private static int findHighestTemp(){
		//finds the INDEX of the highest temperatures
		int highest = temps[0][0];
		int highIndex = 0;
		for (int i = 0; i < 12; i++){
			if (temps[0][i] > highest){
				highest = temps[0][i];
				highIndex = i;
			}
		}
		return highIndex;
	}

	private static int findLowestTemp(){
		//return the INDEX of the lowest temperatures
		int lowest = temps[1][0];
		int lowIndex = 0;
		for (int i = 0; i < 12; i++){
			if (temps[1][i] < lowest){
				lowest = temps[1][i];
				lowIndex = i;
			}
		}
		return lowIndex;
	
	}

	public static void main(String[] args)
	{
		//finds average high, average low, highest and lowest temperatures
		//print out the averages as well as the month and temp for highest and lowest
		System.out.println("Weather records system");
		inputTempForYear();
		double averageHigh = calculateAverageHigh();
		double averageLow = calculateAverageLow();
		int highest = findHighestTemp();
		int lowest = findLowestTemp();
		System.out.println("For this year, the average high was " + averageHigh + " degrees. The average low was " + averageLow + " degrees");
		System.out.println("The hottest month was " + months[highest] + " with a temperature of " + temps[0][highest]);
		System.out.println("The lowest month was " + months[lowest] + " with a temperature of " + temps[1][lowest]);
	}
}
