
/*
Create a class that holds a room, then build a main method that makes several room instances with given stats
Unit 3 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/
package U3_problem1;

import java.util.Scanner;

public class Room
{
    String wall_color;
    String floor_type;
    int num_windows;

    public Room(String inputColor, String inputFloor, int inputWindows){
        this.wall_color = inputColor;
        this.floor_type = inputFloor;
        this.num_windows = inputWindows;
    }
    
    public Room(){
        //Empty Constructor
    }
    
    public void set_wall_color(String color){
        wall_color = color;
    }

    public void set_floor_type(String floor){
        floor_type = floor;
    }

    public void set_num_windows(int windows){
        num_windows = windows;
    }

    public String get_wall_color(){
        return wall_color;
    }

    public String get_floor_type(){
        return floor_type;
    }

    public int get_num_windows(){
        return num_windows;
    }

    public String room_to_string(){
        String out_string = ("This room is painted " + wall_color + " with " + floor_type + " floors and " + num_windows + " windows") ;
        return out_string;
    }
}
