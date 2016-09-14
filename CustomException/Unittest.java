/*
A simple class to throw customized exception methods
Thomas Fulmer (lost)
tfulmer1@gmail.com
Last modified: 4 Sept 2016
*/

package CustomException;

import java.util.Scanner;

public class Unittest
{
    public static void inputTest(int input)
    throws MyException {
        if (input == 1) 
            throw new MyException("Bad Bad Exception Message!");
        else
            System.out.println("You didn't submit 1");
    }

    public static void main(String[] args)
    {
        System.out.println("Testing");
        try{
        inputTest(0);
        inputTest(1);
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}