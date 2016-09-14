
/*
Creates and tests a set of classes describing college courses
Unit 4 Problem 3
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem3;

import java.util.Scanner;

public class Course
{
    private String title;
    private int number;
    private String description;
    private String department;
    private String prefix;

    public Course(){
        this.title = "None";
        this.number = 0;
        this.description = "None";
        this.department = "None";
        this.prefix = "None";
    }

    public Course(String title, int number, String description, String department, String prefix){
        this.title = title;
        this.number = number;
        this.description = description;
        this.department = department;
        this.prefix = prefix;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public String getPrefix(){
        return prefix;
    }

    public String toString(){
        String outString = (
            prefix + " " + number + " " + title + 
            "\nDepartment of " + department + 
            "\n" + description + "\n"
        );
        return outString;
    }

}
