
/*
Creates a class of geometric objects and creates a method to get total area from an array of the geometric objects
Unit 6 Problem 13.12 -- Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Oct 2016
*/

package U6_Discussion;

public class Circle extends GeometricObject
{
    double radius;

    public Circle(){
        super.type = "Circle";
        this.radius = 1.0;
    }

    public Circle(double radius){
        super.type = "Circle";
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        area = ((int)(area * 100))/ 100.0; // rounding
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        perimeter = ((int)(perimeter * 100))/ 100.0; //rounding
        return perimeter;
    }
}
