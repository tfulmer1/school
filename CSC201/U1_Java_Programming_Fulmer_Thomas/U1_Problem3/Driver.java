package U1_Problem3;

/*
Simulates a vending machine, gives change based on inputs and selection
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/

import java.util.Scanner;
import U1_Problem3.Product;

public class Driver
{
	public static Scanner kb = new Scanner(System.in);
	//creates a vending machine
	public static final Product[] machine = new Product[]{
		new Product("Refund!",0),
		new Product("coke",100),
		new Product("Pepsi",100),
		new Product("Whiskey",200),
		new Product("Milk", 150),
		new Product("Ice Cream Sandwich",250)
	};

	//defines currency
	public static final int penny = 1;
	public static final int nickle = 5;
	public static final int dime = 10;
	public static final int quarter = 25;
	public static final int dollar = 100;
	public static final int fiver = 500;

	//bad attempts
	public static int attempts = 0;

	//Calculates change
	public static int[] change(Product purchase, int amount_paid){
		int change_due = amount_paid - purchase.price;
		int quarters;
		int dimes;
		int nickles;
		int pennies;
		quarters = change_due / quarter;
		change_due = change_due % (quarter);
		dimes = change_due / dime;
		change_due = change_due % (dime);
		nickles = change_due / nickle;
		change_due = change_due % (nickle);
		pennies = change_due / penny;
		int[] change_out = {quarters, dimes, nickles, pennies};
		return change_out;
	}

	//Ask for money
	public static int takeMoney(){
		int amount_inserted = 0;
		int input;
		do{
			System.out.println("Please insert payment, or input 0 to make selection:");
			System.out.println("1. Five Dollar Bill");
			System.out.println("2. One Dollar Bill");
			System.out.println("3. Quarter");
			System.out.println("4. Dime");
			System.out.println("5. Nickle");
			System.out.println("6. Penny");
			input = kb.nextInt();
			String bad = kb.nextLine();
			if (input == 1)
				amount_inserted += fiver;
			if (input == 2)
				amount_inserted += dollar;
			if (input == 3)
				amount_inserted += quarter;
			if (input == 4)
				amount_inserted += dime;
			if (input == 5)
				amount_inserted += nickle;
			if (input == 6)
				amount_inserted += penny;
		} while (input != 0);
		return amount_inserted;
	}

	//Displays Product
	public static void showProduct(){
		System.out.println("Welcome to the CSC201 vending machine. Choose your item:");
		System.out.println("0. " + machine[0].name);
		System.out.println("1. " + machine[1].name + " $" + (machine[1].price/100.0));
		System.out.println("2. " + machine[2].name + " $" + (machine[2].price/100.0));
		System.out.println("3. " + machine[3].name + " $" + (machine[3].price/100.0));
		System.out.println("4. " + machine[4].name + " $" + (machine[4].price/100.0));
		System.out.println("5. " + machine[5].name + " $" + (machine[5].price/100.0));
	}

	public static boolean canVend(int selection, int paid){
		if (selection < 0){
			attempts++;
			return false;
		}
		if (selection >= machine.length){
			attempts++;
			return false;
		}
		if (machine[selection].price > paid){
			attempts++;
			return false;
		}
		attempts = 0;
		return true;
	}

	public static void main(String[] args){
		boolean complete = false;
		int paid;
		int selection;	
		do {
			paid = takeMoney();
			showProduct();
			boolean invalid = true;
			do{
				invalid = true;
				selection = kb.nextInt();
				if (selection == 0)
					break;
				String bad = kb.nextLine();
				if (canVend(selection, paid))
					invalid = false;

			} while((invalid) && (attempts < 5));
			if (attempts > 4){
				System.out.println("You have made five failed attempts, your money is returned, try again");
				complete = false;
			}
			if (attempts < 5)
				complete = true;
		}while((complete == false) && (selection != -1));
		if (complete){
			int[] change_out = change(machine[selection], paid);
			System.out.println("You have been vended a " + machine[selection].name);
			System.out.println("Quarters: " + change_out[0] + "\nDimes: " + change_out[1] + "\nNickles: " + change_out[2] + "\nPennies: " + change_out[3]);
		} else {
			int[] change_out = change(machine[0], paid);
			System.out.println("You have been refunded the following coins:");
			System.out.println("Quarters: " + change_out[0] + "\nDimes: " + change_out[1] + "\nNickles: " + change_out[2] + "\nPennies: " + change_out[3]);
		}
	}
}
