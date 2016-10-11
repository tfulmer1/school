
/*
Implements an interface for a basic encryption scheme
Unit 6 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 30 September 2016
*/

package U6_Problem2;

import java.util.ArrayList;

public class ShuffleCipher implements MessageEncoder
{
    public int n;

    public ShuffleCipher(int n){
        this.n = n;
    }

    public String encode(String inString){
        for (int i = 1; i <= n; i++){
            inString = encode2(inString);
        }

        return inString;
    }

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

}