
/*
Creates classes of reading materials and tests them out
Unit 4 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem2;

import java.util.Scanner;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Magazine magazine = new Magazine("Hard Times", "Depression Era History", 2);
        Novel novel = new Novel("The Oranges of Wrath", "A novel of a rich family exploiting migrant workers", 432);
        Textbook textbook = new Textbook("A Condensed History of the American Depression", "American History", 9981);

        System.out.println(magazine.toString());
        System.out.println(novel.toString());
        System.out.println(textbook.toString());

        System.out.println("Changing " + magazine.getName() + "\'s name to: Depressed History");
        magazine.setName("Depressed History");
        System.out.println("Changing novel pages: " + novel.getPages() + " to 345");
        novel.setPages(345);
        System.out.println("Changing textbook subject from " + textbook.getsubject() +  " to: Generic History");
        textbook.setsubject("Generic History");

        System.out.println(magazine.toString());
        System.out.println(novel.toString());
        System.out.println(textbook.toString());
	}
}
