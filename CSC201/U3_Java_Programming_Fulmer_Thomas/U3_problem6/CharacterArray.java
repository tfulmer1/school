
/*
Takes a string, puts it in a character array, messes around with it
Unit 3 Problem 6
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 3 Sept 2016
*/

import java.util.Scanner;

public class CharacterArray
{
    public static Scanner kb = new Scanner(System.in);

    private static Character process_character(char input){
        if(Character.isWhitespace(input))
            return ' ';
        if(Character.isLetter(input))
            return process_letter(input);
        if(Character.isDigit(input))
            return '*';
        return ' ';
    }

    private static char process_letter(char input){
        if(Character.isUpperCase(input))
            return Character.toLowerCase(input);
        else{
            return Character.toUpperCase(input);
        }
    }

	public static void main(String[] args)
	{
        System.out.println("Input a string you want messed with");
		String input = kb.nextLine();
        char[] inputArray = input.toCharArray();
        char[] outArray = new char[inputArray.length];
        int index = 0;
        for(char ch : inputArray){
            System.out.print(ch);
            if (Character.isDigit(ch)){
                char newChar = process_character(ch);
                System.out.println("\tis a digit and is changed to: \t" + newChar);
                outArray[index] = newChar;
                index++;
             }
            else if(Character.isLetter(ch)){
                char newChar = process_character(ch);
                System.out.println("\tis a letter and is changed to:\t" + newChar);
                outArray[index] = newChar;
                index++;
            }
            else{
                System.out.println("\tis not a letter or digit and is not changed");
                outArray[index] = ch;
                index++;
            }
        }
        System.out.print("The final version is: ");
        for(char ch : outArray){
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Thanks for your time and input");
	}
}
