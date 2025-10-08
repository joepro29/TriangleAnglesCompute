/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.computetriangleangles;

import java.util.Scanner;

public class ComputeTriangleAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter three points
        System.out.print("Enter the coordinates of three points separated by spaces: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        // Compute the three sides
        double a = distance(x2, y2, x3, y3);  // side a opposite point A (x1,y1)
        double b = distance(x1, y1, x3, y3);  // side b opposite point B (x2,y2)
        double c = distance(x1, y1, x2, y2);  // side c opposite point C (x3,y3)
        
        // Compute the three angles using Law of Cosines
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
        
        // Display results
        System.out.println("The three angles are:");
        System.out.println("A = " + Math.round(A * 100) / 100.0 + " degrees");
        System.out.println("B = " + Math.round(B * 100) / 100.0 + " degrees");
        System.out.println("C = " + Math.round(C * 100) / 100.0 + " degrees");
        
        // Verify the sum is 180 degrees
        double sum = A + B + C;
        System.out.println("Sum of angles = " + Math.round(sum * 100) / 100.0 + " degrees");
        
        input.close();
    }
    
    /** Compute the distance between two points */
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
