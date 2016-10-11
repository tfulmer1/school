
/*
Implements an interface for a basic decryption scheme
Unit 6 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 October 2016
*/

package U6_Problem3;

import java.util.ArrayList;

public class ShuffleCipher implements MessageDecoder, MessageEncoder
{
    public int n; //how many times to Shuffle

    public ShuffleCipher(int n){
        this.n = n;
    }
    //first encoding step, sends the string to the second step as many times as it should be encoded
    public String encode(String inString){
        for (int i = 1; i <= n; i++){
            inString = encode2(inString);
        }

        return inString;
    }
    //encodes one times
    private String encode2(String inString){
        inString = inString.toUpperCase();
        char[] plainText = inString.toCharArray();
        char[] cipherText = new char[plainText.length];
        int pointer1 = 0;
        int pointer2 = plainText.length /2;
        if (plainText.length % 2 == 1){            
            cipherText[plainText.length-1] = plainText[pointer2];
            pointer2++;
        }
        int index = 0;
        while(pointer1 < plainText.length/2){
            cipherText[index] = plainText[pointer1];
            index++;
            pointer1++;
            cipherText[index] = plainText[pointer2];
            index++;
            pointer2++;
        }
        String outString = String.valueOf(cipherText);
        return outString;
    }

    //sends the string to the decode method n times
    public String decode(String inString){
        for (int i = 1; i <= n; i++){
            inString = decode2(inString);
        }

        return inString;
    }
    //does one round of decode
    private String decode2(String inString){
        inString = inString.toUpperCase();
        char[] cipherText = inString.toCharArray();
        char[] plainText = new char[cipherText.length];
        int pointer = 0;
        int ptPointer = 0;
        while (ptPointer < cipherText.length){
            plainText[ptPointer] = cipherText[pointer];
            ptPointer++;
            pointer += 2;
            if (pointer >= cipherText.length)
                pointer = 1;
        }
        String outString = String.valueOf(plainText);
        return outString;
    }
}