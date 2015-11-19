
/*
Define a class of our choosing for discussion
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 14 November 2015
*/

import java.util.Scanner;

public class Students
{
	String name;
	int studentID, gradeRaw, gradeMax;
	double percentGrade; //if we were dealing with arrays, this would be an array of doubles storing the students score
		//there there would be a calculation for average grade
		//for now, this only does one grade	

	private void setName(String newName) {
		name = newName;
	}

	private void setID(int id) {
		studentID = id;
	}
	
	private void inputGrade(int raw, int max){
		gradeRaw = raw;
		gradeMax = max;
	}

	private String getName(){
		return name;
	}
	
	private int getID(){
		return studentID;
	}

	private int getRaw(){
		return gradeRaw;
	}
	
	private int getMax(){
		return gradeMax;
	}
	
	private double getGradePercent(){
		percentGrade = ((gradeRaw * 1.0) / (gradeMax * 1.0) * 100);
		return percentGrade;
	}


	//Tester/debug method built into main
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	
	//debug code
	Students student = new Students();

	student.setName("John Smith");
	student.setID(1234567);
	student.inputGrade(56,75);
	System.out.println(student.getName() + " with student ID number: " + student.getID() + " scored " + student.getRaw() + " out of a possible " + student.getMax() + " for a percentage grade of: " + student.getGradePercent() +"%");

	}
}
