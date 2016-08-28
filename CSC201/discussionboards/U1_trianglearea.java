
/*
Calculates the area of a triangle from 3 points
Unit 1 Discussion Board
Thomas Fulmer (lost)
tdf2519@email.vccs.edu
Last modified: 27 Aug 2016
*/

import java.util.Scanner;

public class U1_trianglearea
{
    public static Scanner kb = new Scanner(System.in);

    private static double[] get_inputs(){
        System.out.println("Input the three corners of a triangle based on its cartesian coordinates (x, y)");
        System.out.println("Input x1: ");
        double x1 = kb.nextDouble();
        System.out.println("Input y1: ");
        double y1 = kb.nextDouble();
        System.out.println("Input x2: ");
        double x2 = kb.nextDouble();
        System.out.println("Input y2: ");
        double y2 = kb.nextDouble();
        System.out.println("Input x3: ");
        double x3 = kb.nextDouble();
        System.out.println("Input y3: ");
        double y3 = kb.nextDouble();
        String bad = kb.nextLine();

        double[] points = {
            x1,
            y1,
            x2,
            y2,
            x3,
            y3
        };
        return points;
    }

    private static double[] compute_sides(double[] points){
        double side1 = compute_side(points[0], points[1], points[2], points[3]);
        double side2 = compute_side(points[2], points[3], points[4], points[5]);
        double side3 = compute_side(points[4], points[5], points[0], points[1]);
        double[] sides = {
            side1, 
            side2, 
            side3
        };
        return sides;
    }

    private static double compute_side(double x1, double y1, double x2, double y2){
        double diff_x = x1 - x2;
        double diff_y = y1 - y2;
        double side = Math.sqrt((diff_x * diff_x) + (diff_y * diff_y));
        return side;
    }

    private static double compute_s(double[] sides){
        double s = (sides[0] + sides[1] + sides[2]) / 2;
        return s;
    }

    private static double compute_area(double s, double[] sides){
        double area = Math.sqrt(s * (s - sides[0]) * (s-sides[1]) * (s-sides[2]));
        return area;
    }

	public static void main(String[] args)
	{
        boolean more = false;
        do{
            double[] points = get_inputs();
            double[] sides = compute_sides(points);
            double s = compute_s(sides);
            double area = compute_area(s, sides);
            System.out.println("The area of your triangle is: " + area);
            System.out.println("\n Do you wish to enter another triangle? y/n");
            String yn = kb.nextLine();
            more = false;
            if (yn.equalsIgnoreCase("y")){
                more = true;
            }
        } while (more);

	}
}
