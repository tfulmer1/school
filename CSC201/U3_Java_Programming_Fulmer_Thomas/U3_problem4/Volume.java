
/*
Creates book object and a volume object that has an array of books
Unit 3 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Sept 2016
*/

package U3_problem4;

import java.util.Scanner;

public class Volume
{
    public static Scanner kb = new Scanner(System.in);

	String volumeName;
	int numberOfBooks;
	Book[] booksInVolume;

	public Volume(String volumeName, int numberOfBooks, Book[] booksInVolume){
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.booksInVolume = booksInVolume;
	}

	public String toString(){
		String outString = ("This volume is called " + volumeName + " it has " + numberOfBooks + " books");
		return outString;
	}

	public String[] getBookArray(){
		String[] outString = new String[booksInVolume.length];
		int index = 0;
		for(Book book : booksInVolume){
			outString[index] = book.toString();
			index++;
		}
		return outString;
	}

}
