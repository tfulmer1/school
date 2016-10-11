
/*
Create a random access file of a text document of the pledge and seek it
Unit 8 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 8 October 2016
*/

import java.util.*;
import java.io.*;

public class Readme
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
        throws IOException
	{
		try ( RandomAccessFile ram = new RandomAccessFile("pledge.txt", "rw");
        ){
            ram.seek(124);
            System.out.println("The 124 character is: " + (char)ram.read());
            ram.seek(135);
            System.out.println("And this is the 135th character: " + (char)ram.read());
        }
        catch (IOException e) {
            System.out.println("IO Exception!");
        } finally {
            System.out.println("Thank you for playing");
        }
	}
}
