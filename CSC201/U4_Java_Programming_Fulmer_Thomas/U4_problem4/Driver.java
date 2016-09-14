
/*
Creates a few clases for electronic devices, manipulates and tests them
Unit 4 Problem 4
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 12 Sept 2016
*/

package U4_problem4;

import java.util.Scanner;
import U4_problem4.Electronics;
import U4_problem4.devices.*;

public class Driver
{
    public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args)
	{
		Computers computer = new Computers("Chromebook", "CB-0100", 350.99, "ASUS", 4, 1, 2.21);
        Phones phone = new Phones("Nexus", "6P", 573.52, "Huwei", "T-Mobile USA", "555-123-4567");
        Tablets tablet = new Tablets("Nexus", "N7", 325.12, "LG", 7);

        System.out.println(computer.toString());
        System.out.println(phone.toString());
        System.out.println(tablet.toString());

        System.out.println("Changing Tablet size to 10...");
        tablet.setSize(10);
        System.out.println(tablet.toString());

        System.out.println("Changing Phone carrier to AT&T");
        phone.setService("AT&T");
        System.out.println(phone.toString());

        System.out.println("Changing Computer price to $200, yeah for sales!");
        computer.setPrice(200.00);
        System.out.println(computer.toString());

	}
}
