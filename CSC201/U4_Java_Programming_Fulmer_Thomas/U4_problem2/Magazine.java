
/*
Creates classes of reading materials and tests them out
Unit 4 Problem 2
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 11 Sept 2016
*/

package U4_problem2;

import java.util.Scanner;

public class Magazine
{
    private String name;
    private String topic;
    private int issuesPerYear;

    public Magazine(){
        this.name = "None";
        this.topic = "None";
        this.issuesPerYear = 0;
    }

    public Magazine(String name, String topic, int issuesPerYear){
        this.name = name;
        this.topic = topic;
        this.issuesPerYear = issuesPerYear;
    }

    public void setName(String name){
        this.name =  name;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }

    public void setIssuesPerYear(int issuesPerYear){
        this.issuesPerYear = issuesPerYear;
    }

    public String getName(){
        return name;
    }

    public String getTopic(){
        return topic;
    }

    public int getIssuesPerYear(){
        return issuesPerYear;
    }

    public String toString(){
        String outString = (
            name + " magazine is a publication about " + 
            topic + " that is issued " + issuesPerYear + " times per year"
        );
        return outString;
    }
}
