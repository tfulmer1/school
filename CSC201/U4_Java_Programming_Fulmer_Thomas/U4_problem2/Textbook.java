
/*
Creates classes of reading materials and tests them out
Unit 4 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem2;

import java.util.Scanner;

public class Textbook
{
    private String name;
    private String subject;
    private int pages;
    
    public Textbook(){
        this.name = "None";
        this.subject = "None";
        this.pages = 0;
    }

    public Textbook(String name, String subject, int pages){
        this.name = name;
        this.subject = subject;
        this.pages = pages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setsubject(String subject){
        this.subject = subject;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public String getsubject(){
        return subject;
    }

    public int getPages(){
        return pages;
    }

    public String toString(){
        String outString = (
            "The textbook titled '" + name + 
            "' is a book about " + subject + 
            " and has " + pages + " pages."
        );
        return outString;
    }
}
