
/*
This program will create a class for managing movie ratings both MPAA and user
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 October 2015
*/

import java.util.Scanner;

public class Movie
{
	//Declare variables
	String movieName;
	String movieRating;
	int terrible = 0, bad = 0, ok = 0, good = 0, great = 0;
	
	//private methods
	private void setName(String name){
		movieName = name;
	}

	private String getName(){
		return movieName;
	}

	private void setMPAA(String mpaa) {
		movieRating = mpaa;
	}

	private String getMPAA() {
		return movieRating;
	}

	private void inputRating(int rating) {
		if (rating == 1)
			terrible++;
		else if (rating == 2)
			bad++;
		else if (rating == 3)
			ok++;
		else if (rating == 4)
			good++;
		else if (rating == 5)
			great++;
		else
			System.out.println("Please enter a rating between 1 and 5");
	}
	
	private void getAverage() {
		int inputs = terrible + bad + ok + good + great;
		double score = (terrible * 1.0) + (bad * 2.0) + (ok * 3.0) + (good * 4.0) + (great * 5.0); //this line weights the various scores to keep a proper average
		double average = score / inputs;
		average = Math.round(average * 100) / 100.0;

		if (average == 5)
			System.out.println("This movie has 5 stars! It must be awesome");
		else if (average >= 4 && average < 5)
			System.out.println("This movie is good, it has " + average + " stars!");
		else if (average < 4 && average >= 3)
			System.out.println("This movie is decent, it has " + average + " stars.");
		else if (average < 3 && average >=2 )
			System.out.println("This movie is rated bad, it has " + average + " stars.");
		else
			System.out.println("This movie has terrible ratings, it's less than 2 stars");
 
	}


	//main method
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	Movie film1 = new Movie();
	Movie film2 = new Movie();
	
	//input movie 1	
	System.out.println("We're going to initialize movie 1. \nPlease input the name for your first movie.");
	
	String input = kb.nextLine();

	film1.setName(input);

	System.out.println("Input the MPAA rating for this film. G/PG/PG13/R");
	
	input = kb.nextLine();
	
	film1.setMPAA(input);

	System.out.println("Input at least five reviews of this movie on a scale of 1 to 5, five is best");

	for (int i = 1; i <= 5; i++){
		int num = kb.nextInt();
		film1.inputRating(num);
		if (i >= 5) {
			System.out.println("If you would like to enter additional ratings.\nInput the number of additional ratings you'd like to enter. If you are ready to move to movie 2, enter 0");
			int mod = kb.nextInt();
			String bad = kb.nextLine();
			i -= mod;
		}
	}

	//input movie 2
	System.out.println("We're going to initialize movie 2. \nPlease input the name for your second movie.");
	
	input = kb.nextLine();

	film2.setName(input);

	System.out.println("Input the MPAA rating for this film. G/PG/PG13/R");
	
	input = kb.nextLine();
	
	film2.setMPAA(input);

	System.out.println("Input at least five reviews of this movie on a scale of 1 to 5, five is best");

	for (int i = 1; i <= 5; i++){
		int num = kb.nextInt();
		film2.inputRating(num);
		if (i >= 5) {
			System.out.println("If you would like to enter additional ratings.\nInput the number of additional ratings you'd like to enter. If you are ready to move to movie 2, enter 0");
			int mod = kb.nextInt();
			String bad = kb.nextLine();
			i -= mod;
		}
	}

	//output the results
	System.out.println("Movie 1 is " + film1.getName() + " it has an MPAA rating of " + film1.getMPAA());
	film1.getAverage();

	System.out.println("\nMovie 2 is " + film2.getName() + " it has an MPAA rating of " + film2.getMPAA());
	film2.getAverage();


	}
}
