
/*
Counts girl scout cookie sales and sorts and displays relevant outputs
Unit 2 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 21 Aug 2016
*/
package u2_problem1;

import java.util.Scanner;
import u2_problem1.counter;

public class driver
{ 
    private static counter[][] salesLevels = {
        {},//0 - 10
        {},//11-20
        {},//21-30
        {}, //31-40
        {} //41+
    };
    private static counter[] addGirl(counter[] inArray, counter new_girl){
        counter[] counterNew = new counter[inArray.length+1];
        for (int i = 0; i < inArray.length; i++)
        {
            counterNew[i] = inArray[i]; 
        }
        counterNew[counterNew.length - 1] = new_girl;
        return counterNew;

	}
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Girl Scout Cookie Tracking Reporter\nTo get started, provide the name of the first troop member: ");
        String girl_name = kb.nextLine();
        System.out.println("How many cookies did she sell?");
        int initial_cookies = kb.nextInt();
        String bad = kb.nextLine();
        counter new_girl = new counter(girl_name, initial_cookies);
        counter[] troop = {
            new_girl
        };	
        System.out.println("Continue to enter girls and their cookie counts, type \"end\" to stop adding girls");
        do {
            System.out.println("Input girl name:");
            girl_name = kb.nextLine();
            if (girl_name.equalsIgnoreCase("end"))
                break;
            System.out.println("Cookies sold?");
            initial_cookies = kb.nextInt();
            bad = kb.nextLine();
            troop = addGirl(troop, new counter(girl_name, initial_cookies));
        } while(!(girl_name.equalsIgnoreCase("end")));

        for(counter girl : troop){
            if (girl.count >= 41)
                salesLevels[4] = addGirl(salesLevels[4], girl);
            if ((girl.count >= 31) && (girl.count <=40))
                salesLevels[3] = addGirl(salesLevels[3], girl);
            if ((girl.count >= 21) && (girl.count <=30))
                salesLevels[2] = addGirl(salesLevels[2], girl);
            if ((girl.count >= 11) && (girl.count <=20))
                salesLevels[1] = addGirl(salesLevels[1], girl);
            if ((girl.count >= 0) && (girl.count <=10))
                salesLevels[0] = addGirl(salesLevels[0], girl);                
        }
        System.out.println("---------------------------------");
        System.out.println("| TOTAL BOXES\t| # of Scounts\t|");
        System.out.println("---------------------------------");
        System.out.println("|0 - 10\t\t|\t" + salesLevels[0].length + "\t|");
        System.out.println("|11 - 20\t|\t" + salesLevels[0].length + "\t|");
        System.out.println("|21 - 30\t|\t" + salesLevels[0].length + "\t|");
        System.out.println("|31 - 40\t|\t" + salesLevels[0].length + "\t|");
        System.out.println("|41+\t\t|\t" + salesLevels[0].length + "\t|");
        System.out.println("---------------------------------");
	}
}
