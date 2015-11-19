/*
A class to play the game of hangman
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 24 October 2015
*/

import java.util.Scanner;

public class Hangman
{
	String secretWord = "cryptogram";
	String dispWord = "??????????";
	int guess = 0;
	int badguess = 0;	

	private void changeSecretWord(String newWord){ // This method lets the player set a new word
		secretWord = newWord;
		dispWord = "";

		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == " ".charAt(0))
				dispWord = dispWord + " ";
			else
				dispWord = dispWord + "?";		
		}
		
	}
	private void makeGuess (char c){
	
		guess += 1;
	
		if (secretWord.indexOf(c) != -1){
			for (int i = 0; i < secretWord.length(); i++) {
				if (secretWord.charAt(i) == c) { //Can't replace a letter in a string,so have to split the string up and puts it back together with the change, thanks to Stackoverflow for the inspiration
					dispWord = dispWord.substring(0,i) + c + dispWord.substring(i+1);	
				}
			}
			System.out.println("Good guess, " + c + " is in the word: " + dispWord);
		}
	else
		{
		badguess += 1;
		System.out.println("WRONG! " + dispWord);
		}
	}	

	private String getDispWord (){
		return dispWord;
	}

	private String getSecretWord(){
		return secretWord;
	}

	private int getGuessCount(){
		return guess;
	}

	private int getBadGuessCount(){
		return badguess;
	}

	private boolean isFound(){
		if (dispWord.equalsIgnoreCase(secretWord))
			return true;
		else
			return false;
	}

	private final static void clearConsole(){ //This method will clear the console of most computers
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows"))
				{
				for (int i = 0; i < 100; i++)
					{System.out.println();}
				Runtime.getRuntime().exec("cls"); //this may clear the console in windows for some old versions of java

				}
			else
				{ //These escape characters will clear the console reliably in linux/unix, found the escape sequence on Superuser forums
				System.out.print("\033[H\033[2J");
				}
		}
		catch (Exception e)
			{
			System.out.println("I attempted to clear your screen and failed\nGuess the other player will see your word input, sorry, try linux, the clear console works for Linux ^_^");
			}
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
	
		Hangman word = new Hangman();	
		
		//Debug code for methods, unblock below and block out rest of game to test methods
		/*
		System.out.println("Put in a guess, one letter");
		char c = kb.next().charAt(0);
		word.makeGuess(c);
		System.out.println(word.getSecretWord());
		System.out.println(word.getDispWord());
		System.out.println(word.getGuessCount());
		System.out.println(word.getBadGuessCount());
		if (word.isFound())
			System.out.println("The word is found");
		else
			System.out.println("Word is not found");
		*/		
		boolean playmore = true;

		do {

			System.out.println("\n\nWelcome to the game of Hangman.\nThe man has two legs, two arms, a body and a head..that's 6 wrong guesses to work with.\nGood Luck!");
			System.out.println("Your word is: " + word.getDispWord());
			
			//This is the main loop for the game
			while ((word.getBadGuessCount() <= 6) && (word.isFound() == false)) {
				System.out.println("Put in a one letter guess.");
				char c = kb.next().toLowerCase().charAt(0);
				String bad = kb.nextLine();
				word.makeGuess(c);
		
			}

			//Time to get the outcome
			if (word.isFound()) {
				System.out.println("Congratulations! You have won the game!\nThe secret word was: " + word.getSecretWord());}
			else
				System.out.println("You lose! Sorry, the secret word was " + word.getSecretWord());

			//Prompting for a new round
			System.out.println("Would you like to set a new word and let another player play? y/n");
			String yn = kb.nextLine().toLowerCase();

			if (yn.charAt(0) == "n".charAt(0))
				playmore = false;
			else
				{
				System.out.println("\nWhat is the new word?");
				String newWord = kb.nextLine().toLowerCase();
				word.changeSecretWord(newWord);
				playmore = true;
				}
			clearConsole();//method will clear console on most systems in some way or another
		} while (playmore == true);

	}
}
