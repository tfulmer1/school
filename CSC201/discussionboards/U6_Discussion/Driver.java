
/*
Creates a class of geometric objects and creates a method to get total area from an array of the geometric objects
Unit 6 Problem 13.12 -- Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Oct 2016
*/

package U6_Discussion;

public class Driver 
{
    public static double sumArea(GeometricObject[] a){
        double totalArea = 0;
        for (GeometricObject object : a){
            totalArea += object.getArea();
        }
        totalArea = ((int)(totalArea*100)) / 100.0;
        return totalArea;
    }

    public static void main(String[] args) {
        GeometricObject[] objects = {
            new Rectangle(5,8),
            new Rectangle(2,4),
            new Circle(1),
            new Circle(5)
        };

        double totalArea = sumArea(objects);
        System.out.println("The total area is: " + totalArea);
    }

}