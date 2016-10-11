
/*
Modifies the cycle class with error handling to output to file
Unit 7 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 6 Oct 2016
*/

package U7_Problem2;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.*;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

    private static int[] getData(){
        int wheels = 0;
        int weight = 0;
        boolean done = false;
        while(!(done)){
            try{
                System.out.println("Enter value for number of wheels:");
                wheels = kb.nextInt();
                System.out.println("Enter the weight:");
                weight = kb.nextInt();
                done = true;
            } catch (InputMismatchException e){
                System.out.println("ERROR: You must enter integers!");
                String bad = kb.nextLine();
                continue;
            }
        };
        int[] output = {wheels, weight};
        return output;
    }

    private static String createCycle(int wheels, int weight){
        boolean done = false;
        String output = "";
        while(!(done)){
            try{
                Cycle test = new Cycle(wheels, weight);
                output = test.toString();
                done = true;
            } catch (MyException e){
                System.out.println(e.getMessage());
                int[] data = getData();
                wheels = data[0];
                weight = data[1];
            }
        };
        return output;
    }

    public static void main(String[] args){
        int[] data = getData();
        List<String> toFile = Arrays.asList(Integer.toString(data[0]), Integer.toString(data[1]));
        try{
            Files.write(Paths.get("./U7_Problem2", "cycle.txt"), toFile, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}