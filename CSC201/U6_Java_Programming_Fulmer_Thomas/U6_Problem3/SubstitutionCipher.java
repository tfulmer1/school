
/*
Implements an interface for a basic decryption scheme
Unit 6 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 October 2016
*/

package U6_Problem3;

import java.util.ArrayList;

public class SubstitutionCipher implements MessageDecoder, MessageEncoder
{
    //holds the alphabet to be used in the cipher
    public ArrayList<Character> dictionary = new ArrayList<Character>();

    private final int shift; //how many steps to shift

    //builds the alphabet ArrayList
    public SubstitutionCipher(int shift){
        this.shift = shift;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 26; i++){
            dictionary.add(alphabet.charAt(i));
        }
    }

    //handles the decryption inString and sends each character for decryption
    public String decode(String cipherText){
        cipherText = cipherText.toUpperCase();
        char[] inLetters = cipherText.toCharArray();
        char[] outLetters = new char[inLetters.length];
        int index = 0;
        for (char letter : inLetters){
            char out_letter = decrypt(letter);
            outLetters[index] = out_letter;
            index++;
        }
        String outString = String.valueOf(outLetters);
        return outString;
    }
    //handles decryption of each character
    private char decrypt(char inChar){
        if(inChar == " ".charAt(0))
            return " ".charAt(0);
        int index = dictionary.indexOf(inChar);
        index = index - shift;
        if (index < 0)
            index = 26 + index;
        return dictionary.get(index);
    }

    //handles encoding, passes each characte for encryption
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

    //encrypts individual characters and returns them to the encryption controller
    private char encrypt(char inChar){
        if(inChar == " ".charAt(0))
            return " ".charAt(0);
        int index = dictionary.indexOf(inChar);
        index = index + shift;
        index = index % 26;
        return dictionary.get(index);
    }
}