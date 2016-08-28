
/*
Create a class that holds a room, then build a main method that makes several room instances with given stats
Unit 3 Problem 1
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 26 Aug 2016
*/

package U3_problem1;

import java.util.Scanner;

public class Unittest
{
	public static void main(String[] args)
	{
    	Scanner kb = new Scanner(System.in);
		
		Room[] rooms = new Room[] {
			new Room("Purple", "Tile", 0),
			new Room("Yellow", "Hard Wood", 1), 
			new Room()
		};
		
		rooms[2].set_wall_color("White");
		rooms[2].set_floor_type("Carpet");
		rooms[2].set_num_windows(3);
		
		System.out.println(rooms[0].get_wall_color());
		System.out.println(rooms[1].get_floor_type());
		System.out.println(rooms[2].get_num_windows());

		for (Room room : rooms){
			System.out.println(room.room_to_string());
		}

	}
}
