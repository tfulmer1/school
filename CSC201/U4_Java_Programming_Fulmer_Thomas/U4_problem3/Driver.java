
/*
Creates and tests a set of classes describing college courses
Unit 4 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem3;

import java.util.Scanner;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		//Setting up new instances
        Course[] courses = {
            new Course("Intro Computer Science", 201, "A basic course in programming and computer sciency stuff", "Computer Science", "CSC"),
            new Course("Intermediate Electrical Engineering", 303, "A course in circuit design and manufacturing", "Electrical Engineering", "EEG"),
            new Course("Advanced Probabilities and Statistics", 488, "A course in the most advanced and dangerous statistics", "Math", "MTH")
        };

        for(Course course : courses){
            System.out.println(course.toString());
        };

        for(Course course : courses){
            course.setTitle("Old course removed");
        };

        for(Course course : courses){
            System.out.println(course.getDescription());
        };

        for(Course course : courses){
            course.setDescription("Deleted");
        };

        for(Course course : courses){
            System.out.println(course.toString());
        };
	}
}
