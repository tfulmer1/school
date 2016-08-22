
/*
Calculates the chapter and question number for pseudo-randomly asigned book question
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/
import java.util.Scanner;

public class U1_Problem2
{
	
	public static final int studentID = 6822048;

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int chapter = (studentID % 4) + 2;
		int question;
		if (chapter == 2)
			question = (studentID % 23) + 1;
		else if (chapter == 3)
			question = (studentID % 34) + 1;
		else if (chapter ==4) {
			chapter = 6;
			question = (studentID % 38) + 1;
		}
		else if (chapter == 5)
			question = (studentID % 46) + 1;
		else
			throw new RuntimeException("Your calculations have apparently resulted in an impossible result. Check your code");

		System.out.println("You have been assigned Chapter: " + chapter + " Problem: " + question + "\nWhat Page number is associated with this question?");
		String page = kb.nextLine();

		System.out.println("Please solve programming exercise " + question + " from chapeter " + chapter + ", from page " + page);
	}
}
