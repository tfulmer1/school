
/*
Creates a class of geometric objects and creates a method to get total area from an array of the geometric objects
Unit 6 Problem 13.12 -- Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Oct 2016
*/

package U6_Discussion;

public class GeometricObject
{
    String type;

    public GeometricObject(){
        this.type = "Unknown";
     }

     public GeometricObject(String type){
         this.type = type;
     }

     public double getArea(){
         return 1.0;
      }

}