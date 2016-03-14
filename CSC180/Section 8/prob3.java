
/*
This is a theater seating chart/ticket buying program
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 27 November 2015
*/

import java.util.*;

public class prob3
{
	public static Scanner kb = new Scanner(System.in);

	//build the theater per the instructions
	private static int[][] theater = new int[][]{
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
		{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
		{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
		{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
		{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
	};
	private static void displaySeats(){
		System.out.println("\n\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		for (int row = 0; row < 10; row++) {
			System.out.print(row + "\t");
			for (int seat : theater[row]){
				System.out.print(seat + "\t");
				}
			System.out.print("\n");
			}
		System.out.println("\n\t\t^^This table shows rows on left, seats on top^^\n\n");
	}

	//if this method receives a price it will select the seat in the cloeset row that price is available
	//if the price requested is 0, it will allow the user to pick the seat
	private static void buySeat(int price){
		int row, seat;
		String bad;
		if (price == 0){
			System.out.println("Please enter the row for the seat you want");
			row = kb.nextInt();
			bad = kb.nextLine();
			System.out.println("Please enter the seat you'd like in row " + row);
			seat = kb.nextInt();
			bad = kb.nextLine();
			if (theater[row][seat] > 0) {
				System.out.println("Congratulations, you have purchased seat: " + row + " " + seat + " for the price of $" + theater[row][seat]);
				theater[row][seat] = 0;
				}
			else 
				System.out.println("Sorry, that seat is no longer available");
			}
		else {
			boolean done = false;
			row = 9;
			while(row >=0 && done == false){
				seat = 9;
				while (seat >= 0 && done == false){
					if (theater[row][seat] == price){
						System.out.println("You have been assigned seat: " + row  + " " + seat);
						theater[row][seat] = 0;
						done = true;
						}
					seat -=1;
					}
				row -= 1;
				}
			if (done == false)
				System.out.println("Sorry, no seats found at that price");

			}
			
		}

	public static void main(String[] args)
	{

	/*
	//DEBUG lines
		displaySeats();
		buySeat(30);
		displaySeats();
		buySeat(0);
		displaySeats();
		buySeat(100);
	//END Debug lines
	*/	

	System.out.println("Welcome to the Theatre des Etoiles observatory and movie lounge.\n\nHere is our seating chart:");

	boolean more;
	int wantedprice;	
	String bad, input;

	do{
	displaySeats();

	System.out.println("Seats already taken are marked with a price of zero, the others show their purchase price\n\nIf you'd like to purchase a specific seat, input \"0\"\nIf you would like the computer to choose the seat, input the price desired and the computer will select the closest seat to the front available at that price.");
	wantedprice = kb.nextInt();
	bad = kb.nextLine();
	buySeat(wantedprice);

	System.out.println("Would you like the purchase additional seats? [y/n]");
	input = kb.nextLine();

	if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
		more = true;
	else
		more = false;

	}while (more == true);

	System.out.println("Thank you for purchasing tickets today. Her is the updated chart of available seats");
	displaySeats();

	}
}
