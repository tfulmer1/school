
/*
Creates a student database with student IDs and GPAs and allows retrieval
Unit 8 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 9 October 2016
*/

import java.util.*;
import java.io.*;

public class ReadWrite implements java.io.Serializable
{
    public static Scanner kb = new Scanner(System.in);
    private int studentID;
    private double gpa;
    private static String file = "Stu.dat";
    private static int size = 0;

    public ReadWrite(int studentID, double gpa){
        this.studentID = studentID;
        this.gpa = gpa;
    }
    
    private static void writeData(ReadWrite[] saveData)
        throws ClassNotFoundException, IOException
    {
        try (
            ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("Stu.dat", false));
        ) {
            save.writeObject(saveData);
        }
    }

    private static ReadWrite[] readData()
        throws ClassNotFoundException, IOException
    {
        ReadWrite[] readData = new ReadWrite[size];

        try (
            ObjectInputStream read = new ObjectInputStream(new FileInputStream("Stu.dat"));
        ){
            readData = (ReadWrite[])(read.readObject());
        }

        return readData;
    }

    private static ReadWrite[] addStudent(ReadWrite[] students, ReadWrite student){
        ReadWrite[] outArray = new ReadWrite[students.length + 1];
        for (int i = 0; i < students.length; i++){
            outArray[i] = students[i];
        }
        outArray[students.length] = student;
        size++;
        return outArray;
    }

	public static void main(String[] args)
        throws ClassNotFoundException, IOException
	{
        ReadWrite[] students = new ReadWrite[0];
        int inputID = 0;
        double gpa = 0.0;
        do {
            System.out.println("Input Student ID, input 0 to quit");
            inputID = kb.nextInt();
            if (inputID == 0)
                break;
            System.out.println("Input GPA for student ID: " + inputID);
            gpa = kb.nextDouble();
            ReadWrite inputStudent = new ReadWrite(inputID, gpa);
            students = addStudent(students, inputStudent);
        }  while (inputID != 0);

        writeData(students);
        
        ReadWrite[] fromFile = readData();
        
        int findID = 0;
        boolean found = false;
        do {
            System.out.println("To find a GPA, input Student ID. Use 0 to exit");
            findID = kb.nextInt();
            found = false;
            for (ReadWrite student : fromFile){
                if (student.studentID == findID){
                    System.out.println("GPA: " + student.gpa);
                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Invalid Student ID");
            }
        } while (findID != 0);
	}
}