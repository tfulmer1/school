
/*
Creates classes of reading materials and tests them out
Unit 4 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem2;

import java.util.Scanner;

public class Novel
{
    private String name;
    private String summary; 
    private int pages;

    public Novel(){
        this.name = "None";
        this.summary = "None";
        this.pages = 0;
    }

    public Novel(String name, String summary, int pages){
        this.name = name;
        this.summary = summary;
        this.pages = pages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String getName(){
        return name;
    }

    public String getSummary(){
        return summary;
    }

    public int getPages(){
        return pages;
    }

    public String toString(){
        String outString = (
            name + " is a novel of " + pages + 
            " pages. Brief summary: " + summary
        );
        return outString;
    }
}
