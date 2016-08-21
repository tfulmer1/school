
/*
Complex Number calculator
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 20 Aug 2016
*/

import java.util.Scanner;

public class U1_Problem5
{
    public static Scanner kb = new Scanner(System.in);

    private static double[][] values = new double[][]{
        {0.0,0.0},
        {0.0,0.0}
    };

    public static void inputValues(){
        System.out.println("A complex number is a number in the format a+ib where i represents the square root of negative 1\nInput z1, a: ");
        values[0][0] = kb.nextDouble();
        System.out.println("Input z1, b");
        values[0][1] = kb.nextDouble();
        System.out.println("Input z2, a");
        values[1][0] = kb.nextDouble();
        System.out.println("Input z2, b");
        values[1][1] = kb.nextDouble();
    }

    public static void addition(){
        System.out.println("The result is: " + (values[0][0] + values[1][0]) + " + " + (values[0][1] + values[1][1]) + "i" );
    }

    public static void subtraction(){
        System.out.println("The result is: " + (values[0][0] - values[1][0]) + " + " + (values[0][1] - values[1][1]) + "i" );
    }

    public static void multiplication(){
        System.out.println("The result is: " + ((values[0][0] * values[1][0]) + (values[0][1] * values[1][1])) + " + " + ((values[0][0] * values[1][1])+ (values[0][1] * values[1][0])) + "i" );
    }

    public static void division(){
        System.out.println("The result is: " + (((values[0][0] * values[1][0]) + (values[0][1] * values[1][1]))/((values[1][0]*values[1][0]) + (values[1][1] * values[1][1]))) + " + " + (((values[0][1] * values[1][0]) + (values[0][0] * values[1][1]))/((values[1][0]*values[1][0]) + (values[1][1] * values[1][1]))) + "i" );
    }

	public static void main(String[] args)
	{
	    inputValues();
        addition();
        subtraction();
        multiplication();
        division();
        
	}
}
