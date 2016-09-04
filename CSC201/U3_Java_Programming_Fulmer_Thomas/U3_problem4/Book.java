
/*
Creates book object and a volume object that has an array of books
Unit 3 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Sept 2016
*/

package U3_problem4;

import java.util.Scanner;

public class Book
{
    public static Scanner kb = new Scanner(System.in);

	String title;
	String author;
	int numberOfPages;

	public Book(String title, String author, int numberOfPages){
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}

	public String toString(){
		String outString = (title + " by " + author + " has " + numberOfPages + " pages.");
		return outString;
	}

}
