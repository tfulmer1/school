
/*
Implements an interface for a basic decryption scheme
Unit 6 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 October 2016
*/

package U6_Problem3;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Input a string to encode: ");
        String input1 = kb.nextLine();
        System.out.println("How many characters do you want to shift/shuffle?");
        int value1 = kb.nextInt();
        SubstitutionCipher enigma = new SubstitutionCipher(value1);
        System.out.println("Substituting with a key of " + value1 + "\nInputing string: " + input1);
        String output = enigma.encode(input1);
        System.out.println("Substitution Cipher encrypted: " + output);
        String output2 = enigma.decode(output);
        System.out.println("Substition Cipher dcrypted: " + output2);

        ShuffleCipher columnar = new ShuffleCipher(value1);
        String output3 = columnar.encode(input1);
        System.out.println("Shuffled encryption: " + output3);
        String output4 = columnar.decode(output3);
        System.out.println("Shuffled Decryption: " + output4);
    }
}