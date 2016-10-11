
/*
Creates a class of geometric objects and creates a method to get total area from an array of the geometric objects
Unit 6 Problem 13.12 -- Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 2 Oct 2016
*/

package U6_Discussion;

public class Rectangle extends GeometricObject
{
    double width;
    double length;

    public Rectangle(){
        super.type = "Rectangle";
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        super.type = "Rectangle";
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        double area = width * length;
        area = ((int)(area * 100))/ 100.0; // rounding
        return area;
    }

    public double getPerimeter(){
        double perimeter = (2 * width) + (2 * length);
        perimeter = ((int)(perimeter * 100))/ 100.0; //rounding
        return perimeter;
    }
}
