
/*
Simulates lockers at a high school
Unit 3 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/

package U3_problem2;

import java.util.Scanner;

public class Locker
{
    public static Scanner kb = new Scanner(System.in);

    int bookCount = 0;
    CombinationLock lock = new CombinationLock();

    public Locker(){
        //empty constructor
    }

    public Locker(int numBooks){
        this.bookCount = numBooks;
        int[] combo = lock.getCombo();
        System.out.println("You have been issued a locker. The combo for your new locker is: ");
        for(int digit : combo){
            System.out.print(digit + " ");
        }
        System.out.println("\n");
    }

    public void putBookInLocker(){
        //nothing in, nothing out, puts a book in the locker
        bookCount++;
    }

    public boolean removeBookFromLocker(){
        //returns true if book is removed, false if it is not
        if (bookCount > 0){
            bookCount--;
            return true;
        } else {
            return false;
        }
    }

    public void openLocker(){
        //prompts user for three numbers in teh combination
        //will print success or failure
        System.out.println("Turn the dial right to: ");
        int combo1 = kb.nextInt();
        System.out.println("Turn the dial left to : ");
        int combo2 = kb.nextInt();
        System.out.println("Turn the dial right to: ");
        int combo3 = kb.nextInt();
        boolean success = lock.openLock(combo1, combo2, combo3);
        System.out.println("Attempt to open was successful: " + success);
    }

    public int bookCount(){
        return bookCount;
    }

	public static void main(String[] args)
	{
		//unittests
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

	}
}
