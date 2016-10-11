
/*
Implements an interface for a basic encryption scheme
Unit 6 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 30 September 2016
*/

package U6_Problem2;

public class Driver 
{
    public static void main(String[] args){
        SubstitutionCipher enigma = new SubstitutionCipher(4);
        String output = enigma.encode("zzThis is a testzz");
        System.out.println(output);

        ShuffleCipher columnar = new ShuffleCipher(2);
        String output2 = columnar.encode("00001111");
        System.out.println(output2);
    }
}