
/*
Uses the cycle class from unit 3 to test exception handling
Unit 7 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 5 Oct 2016
*/

package U7_Problem1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver
{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        boolean done = false;
        int wheels, weight;
        while(!(done)){
            try{
                System.out.println("Enter value for number of wheels:");
                wheels = kb.nextInt();
                System.out.println("Enter the weight:");
                weight = kb.nextInt();
            } catch (InputMismatchException e){
                System.out.println("ERROR: You must enter integers!");
                String bad = kb.nextLine();
                continue;
            }
            try{
                Cycle test = new Cycle(wheels,weight);
                System.out.println(test.toString());
                done = true;
            } catch (MyException e){
                System.out.println(e.getMessage());
            }
        };
    }
}