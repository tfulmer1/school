
/*
Creates a fraction class that saves state to a .dat file and must be serializable
Unit 8 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 8 October 2016
*/

import java.util.*;
import java.io.*;

public class Fraction implements java.io.Serializable
{
    public static Scanner kb = new Scanner(System.in);
    private int numerator;
    private int denominator;
    private static char slash = '/';
    
    public Fraction(){
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        String output = numerator + " " + slash + " " + denominator;
        return output;
    }

	public static void main(String[] args)
        throws ClassNotFoundException, IOException
	{
        Random gen = new Random();

        Fraction[] fractions = new Fraction[3];
        for (int i = 0; i < 3; i++){
            int a = gen.nextInt(10);
            int b = gen.nextInt(20);
            Fraction temp = new Fraction(a,b);
            fractions[i] = temp;
        }
		
        System.out.println("Randomly generated Fractions");
        //Displaying the original values
        for (Fraction fraction : fractions){
            System.out.println(fraction.toString());
        }

        //Saving the files to the output file
        try (
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("SerialF.dat", false));
        ) {
            output.writeObject(fractions);
        }

        //Reading the files back in
        Fraction[] newFractions = new Fraction[3];

        try (
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("SerialF.dat"));
        ){
            newFractions = (Fraction[])(input.readObject());
        }

        //Test out the .dat file contents
        System.out.println("Outputting the values read back from file:");
        for (Fraction fraction : newFractions){
            System.out.println(fraction.toString());
        }
	}
}
