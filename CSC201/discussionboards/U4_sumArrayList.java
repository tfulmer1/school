
/*
Addresses Chapter 11, Problem 12, pg. 447. Take an ArrayList and sum it with a method called sum()
Unit 4 DiscussionBoard
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 15 Sept 2016
*/

import java.util.Scanner;
import java.util.ArrayList;

public class U4_sumArrayList
{
    public static Scanner kb = new Scanner(System.in);

    public static double sum(ArrayList<Double> list){
        double total = 0;
        for(double number : list){
            total += number;
        };
        return total;
    }

	public static void main(String[] args)
	{
		System.out.println("This program adds up numbers you give it. Please enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList();
        while(list.size() < 5){
            list.add(kb.nextDouble());
        }

        System.out.println("The total is: " + sum(list));

	}
}
