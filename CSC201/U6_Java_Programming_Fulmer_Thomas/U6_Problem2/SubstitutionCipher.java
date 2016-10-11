
/*
Implements an interface for a basic encryption scheme
Unit 6 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 30 September 2016
*/

package U6_Problem2;

import java.util.ArrayList;

public class SubstitutionCipher implements MessageEncoder
{
    public ArrayList<Character> dictionary = new ArrayList<Character>();

    private final int shift;

    public SubstitutionCipher(int shift){
        this.shift = shift;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 26; i++){
            dictionary.add(alphabet.charAt(i));
        }
    }
 
    public String encode(String plainText){
        plainText = plainText.toUpperCase();
        char[] inLetters = plainText.toCharArray();
        char[] outLetters = new char[inLetters.length];
        int index = 0;
        for (char letter : inLetters){
            char out_letter = encrypt(letter);
            outLetters[index] = out_letter;
            index++;
        }
        String outString = String.valueOf(outLetters);
        return outString;
    }

    private char encrypt(char inChar){
        if(inChar == " ".charAt(0))
            return " ".charAt(0);
        int index = dictionary.indexOf(inChar);
        index = index + shift;
        index = index % 26;
        return dictionary.get(index);
    }
}