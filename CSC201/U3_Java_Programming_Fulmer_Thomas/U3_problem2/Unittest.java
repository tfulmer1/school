
/*
Tests Locker and combo lock classes
Unit 3 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/

package U3_problem2;

import java.util.Scanner;

public class Unittest
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
        Locker locker = new Locker(2);
        locker.openLocker();
        System.out.println("Book Count: " + locker.bookCount());
        locker.putBookInLocker();
        System.out.println("Putting book in locker");
        System.out.println("Book Count: " + locker.bookCount());
        System.out.println("Attempting to remove book. Success: " + locker.removeBookFromLocker());
        System.out.println("Book Count: " + locker.bookCount());
        System.out.println("Attempting to remove book. Success: " + locker.removeBookFromLocker());
        System.out.println("Book Count: " + locker.bookCount());
        System.out.println("Attempting to remove book. Success: " + locker.removeBookFromLocker());
        System.out.println("Book Count: " + locker.bookCount());
        System.out.println("Attempting to remove book. Success: " + locker.removeBookFromLocker());
        System.out.println("Book Count: " + locker.bookCount());
        locker.lock.resetDial();
		System.out.println("Dial reset, currently set on: " + locker.lock.combo[0]);
		int[] combo = locker.lock.getCombo();
		System.out.println("The combo is: ");
		for (int digit : combo){
			System.out.print(digit + " ");
		}
		System.out.println();
		System.out.println("Changing combo to 1, 2, 3");
		locker.lock.setCombo(1,2,3);
		combo = locker.lock.getCombo();
		System.out.println("The combo is: ");
		for (int digit : combo){
			System.out.print(digit + " ");
		}
		System.out.println();
	}
}
