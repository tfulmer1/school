
/*
Tests concepts in Array Equality
Extra Credit Discussion
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 18 Sept 2016
*/

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEquality
{
    public static Scanner kb = new Scanner(System.in);

    public static boolean compareArray(int[] arr1, int[] arr2){
        if(arr1 == arr2)
            return true;
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0;i<arr1.length;i++){
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static boolean compare2dArray(int[][] arr1, int[][] arr2){
        if(arr1 == arr2)
            return true;
        if(arr1.length != arr2.length)
            return false;
        for(int i = 0;i<arr1.length;i++){
            if (!(compareArray(arr1[i], arr2[i])))
                return false;
        }
        return true;
    }

	public static void main(String[] args)
	{
		int[] a = {
            1,
            2,
            3,
            4
        };

        int[] b = a;

        System.out.println("Testing a == b: " + (a == b));

        int[] c = {
            1,
            2,
            3,
            4
        };

        int[] d = {
            1,
            2,
            3,
            4,
            5
        };

        int[][] aa = {
            a,
            a
        };

        int[][] ab = {
            a,
            b
        };

        int [][] ac = {
            a,
            c
        };

        int[][] ad = {
            a,
            d
        };

        System.out.println("Testing a == c: " + (a == c));
        System.out.println("Testing Array.equals(a, c): " + (Arrays.equals(a,c)));

        System.out.println("Testing home grown compare method for a, b: " + compareArray(a,b));
        System.out.println("Testing home grown compare method for a, c: " + compareArray(a,c));
        System.out.println("Testing home grown compare method for b, c: " + compareArray(b,c));
        System.out.println("Testing home grown compare method for a, d: " + compareArray(a,d));

        System.out.println("Testing aa == ab: " + (aa == ab));
        System.out.println("Testing built in deepequals method for aa, ab: " + (Arrays.deepEquals(aa,ab)));

        System.out.println("Testing home grown compare method for aa, ab: " + compare2dArray(aa,ab));
        System.out.println("Testing home grown compare method for aa, ac: " + compare2dArray(aa,ac));
        System.out.println("Testing home grown compare method for aa, ad: " + compare2dArray(aa,ad));

	}
}
