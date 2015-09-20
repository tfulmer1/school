
/*
Activity 4.4.1 - Read three people's ages and sorts them by age
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 September 2015
*/

import java.util.Scanner;

public class act_4_4_1
{
	public static void main(String[] args)
	{
	Scanner keyboard = new Scanner(System.in);

	/* This is going to be inefficient, but I don't know how to make objects
	yet for Java...so I'm going to be doing a few things manually 
	Note to self, don't reuse this sorting algorithm as it will only work
	for three inputs and only if they are integers
	and only if they are each unique */
	
	//prompt for three names and ages
	//Person 1
	System.out.println("\nThis program will take three people and sort them by age.\nPlease insert the name of person 1:");
	String p1name = keyboard.nextLine();

	System.out.println("\nWhat is " + p1name + "'s age in whole years?");
	int p1age = -1;

	while (p1age < 0) {
		try { 
			p1age = keyboard.nextInt();
		} catch (Exception e) {
			System.out.println("\nPlease input a whole number without decimal\n");
			String bad = keyboard.next();
		}
	}

	//Person 2
	System.out.println("\nPlease insert the name of person 2:");
	keyboard.nextLine();

	String p2name = keyboard.nextLine();

	System.out.println("\nWhat is " + p2name + "'s age in whole years?");
	int p2age = -1;

	while (p2age < 0) {
		try { 
			p2age = keyboard.nextInt();
		} catch (Exception e) {
			System.out.println("\nPlease input a whole number without decimal\n");
			String bad = keyboard.next();
		}
	}

	//Person 3
	System.out.println("\nPlease insert the name of person 3:");
	keyboard.nextLine();

	String p3name = keyboard.nextLine();

	System.out.println("\nWhat is " + p3name + "'s age in whole years?");
	int p3age = -1;

	while (p3age < 0) {
		try { 
			p3age = keyboard.nextInt();
		} catch (Exception e) {
			System.out.println("\nPlease input a whole number without decimal\n");
			String bad = keyboard.next();
		}
	}

	//Ok, now we need to sort
	//since there are only three people, we'll assign them randomly then fix
	//Not efficient but won't matter in this case

	String oldest = p1name;
	String youngest = p3name;
	int oldestage = p1age;
	int youngestage = p3age;


	if (p1age < p3age) {
		oldest = p3name;
		oldestage = p3age;
		youngest = p1name;
		youngestage = p1age;
	}

	//We now know that Person 1 and 3 are sorted with each other, now just have to insert person 2
	if (p2age > oldestage) {
		oldest = p2name;
		oldestage = p2age;
	}
	if (p2age < youngestage) {
		youngest = p2name;
		youngestage = p2age;
	}

	//Everyone should now be sorted

	System.out.println("\nThe oldest person is: " + oldest);
	System.out.println("The youngest person is: " + youngest);


	}
}
