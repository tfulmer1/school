
/*
Modifies the cycle class with error handling and read input from file
Unit 7 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 6 Oct 2016
*/

package U7_Problem3;

import java.util.*;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

    private static int[] getData(){
        try{
            Scanner scan = new Scanner(new File("./U7_Problem3/" + "cycleIn.txt"));
            int wheels = Integer.parseInt(scan.nextLine());
            int weight = Integer.parseInt(scan.nextLine());
            int[] output = {wheels, weight};
            return output;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            int[] output = {0,0};
            return output;
        }
    }

    public static void main(String[] args){
        int[] data = getData();
        try{
            Cycle cycle = new Cycle(data[0], data[1]);
            System.out.println(cycle.toString());
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}