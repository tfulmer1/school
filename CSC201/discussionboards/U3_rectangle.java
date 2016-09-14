
/*
Creates a Rectangle class that  computes area and perimeter
Unit 3 Problem 9.1 -- Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 3 Sept 2016
*/

import java.util.Scanner;

public class U3_rectangle
{
    public static Scanner kb = new Scanner(System.in);

    double width;
    double length;

    public U3_rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public U3_rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    private double getArea(){
        double area = width * length;
        area = ((int)(area * 100))/ 100.0; // rounding
        return area;
    }

    private double getPerimeter(){
        double perimeter = (2 * width) + (2 * length);
        perimeter = ((int)(perimeter * 100))/ 100.0; //rounding
        return perimeter;
    }

    public static void main(String[] args)
	{
        U3_rectangle[] rectangles = {
            new U3_rectangle(4, 40),
            new U3_rectangle(3.5, 35.9)
        };
        System.out.println("Unit Test: " + rectangles.length + " rectangles have been created.\nHere is their information:");
        for(U3_rectangle rectangle : rectangles){
            System.out.println("A rectangle with length: " + rectangle.length + " and width: " + rectangle.width);
            System.out.println("\tIts perimeter is: " + rectangle.getPerimeter() + " And area is: " + rectangle.getArea());
        }

	}
}
