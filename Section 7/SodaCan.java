
/*
Takes attributes of a soda can and has methods to return the surface area and volume
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 19 November 2015
*/

import java.util.Scanner;

public class SodaCan
{
	double radius, height, surfaceArea, volume;

	//Constructor
	public SodaCan(double radius, double height){
		this.radius = radius;
		this.height = height;
	}	

	//Get surface area
	private double getSurfaceArea() {
		surfaceArea = (2*Math.PI*radius*height)+(2*Math.PI*(radius*radius));
		return surfaceArea;
	}	

	//Get volume
	private double getVolume(){
		volume = ((Math.PI*(radius*radius))*height);
		return volume;
	}


	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	//all for debug purposes	
	SodaCan can = new SodaCan(5.0,10.0);
	System.out.println("The surface area is: " + can.getSurfaceArea() + "\nThe Volume is: " + can.getVolume());









	}
}
