
/*
Creates a file that keeps a total of how many times the file has been opened
Unit 8 Discussion Board, Chapter 17, Problem 8
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 9 October 2016
*/

import java.util.*;
import java.io.*;

public class U8_UpdateCount implements java.io.Serializable
{
    private static int count;

    static { try {init();} catch (Exception e){System.out.println(e.getStackTrace());} };

    private static void init()
        throws IOException, ClassNotFoundException
    {
        System.out.println("Trying init");
        try {
            count = getCurrentCountFromFile();
            count++;
            writeCurrentCountToFile();
        } catch (Exception e) {
            count = 0;
            writeCurrentCountToFile();
        } finally {
            System.out.println("Init complete");
        }
    }

    private static void writeCurrentCountToFile()
        throws IOException, ClassNotFoundException
    {
        try (
            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Exercise17_08.dat", false));
        ) {
            save.writeObject(count);
        }
    }

    private static int getCurrentCountFromFile()
        throws IOException, ClassNotFoundException
    {
        int foundCount = 0;
        try (
            ObjectInputStream read = new ObjectInputStream(new FileInputStream("Exercise17_08.dat"));
        ){
            foundCount = (int)(read.readObject());
        }

        return foundCount;
    }

	public static void main(String[] args)
        throws ClassNotFoundException, IOException
	{
        System.out.println("New Count: " + count);

	}
}