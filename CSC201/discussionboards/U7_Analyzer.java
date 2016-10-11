
/*
Reads a program from Standard In and analyzes the characters, words and lines
Unit 7 Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 7 October 2016
*/

import java.util.*;
import java.io.*;

public class U7_Analyzer
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		if (args.length != 1){
            System.out.println("Provide only one file");
            System.exit(1);
        }

        File targetFile = new File(args[0]);

        if(!targetFile.exists()){
            System.out.println("The file provided does not exist!");
            System.exit(2);
        }

        int lines = 0;
        int words = 1; //Because the first space will be word 2!
        int characters = 0;

        try(
            Scanner reader = new Scanner(targetFile);
        ){
            while (reader.hasNext()){
                lines++;
                char[] letters = reader.nextLine().toCharArray();
                for (char letter : letters){
                    characters++;
                    if(letter == " ".charAt(0))
                        words++;
                }
            }
        }

        System.out.println("File: " + args[0] + " has\n" + characters + " characters\n"
                            + words + " words\n" + lines + " lines."
                            );

	}
}
