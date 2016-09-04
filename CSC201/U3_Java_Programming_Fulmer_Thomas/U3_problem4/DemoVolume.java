
/*
Creates book object and a volume object that has an array of books
Unit 3 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Sept 2016
*/

package U3_problem4;

import java.util.Scanner;

public class DemoVolume
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Book[] books = {
			new Book("The Best of Dog Culture", "Rover", 123),
			new Book("The Best of Cat Culture", "Felix", 5),
			new Book("Days in the Life of a Rabbit", "Roger", 153),
			new Book("Encyclopedia of Skunks", "Pepe le peu", 99),
			new Book("Operation Human Drop", "Dumbo", 431)
		};

		Volume volume1 = new Volume("Animal Authored Books", books.length, books);

		String[] bookSummaries = volume1.getBookArray();
		System.out.println(volume1.toString());
		for(String summary : bookSummaries){
			System.out.println(summary);
		}

	}
}
