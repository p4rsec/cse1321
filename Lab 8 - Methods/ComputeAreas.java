// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 8

import java.util.*;
import java.io.*;

public class ComputeAreas
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Side: ");
      double side = sc.nextDouble();
      System.out.print("Width: ");
      double width = sc.nextDouble();
      System.out.print("Length: ");
      double length = sc.nextDouble();
      System.out.print("Radius: ");
      double radius = sc.nextDouble();
      System.out.print("Base: ");
      double base = sc.nextDouble();
      System.out.print("Height: ");
      double height = sc.nextDouble();
      
      System.out.printf("Square side: %g\n", side);
      System.out.printf("Square area: %g\n", sqArea(side));
      
      System.out.printf("Rectangle width: %g\n", width);
      System.out.printf("Rectangle length: %g\n", length);
      System.out.printf("Rectangle area: %g\n", rectArea(width, length));
      
      System.out.printf("Circle radius: %g\n", radius);
      System.out.printf("Circle area: %g\n", circArea(radius));
      
      System.out.printf("Triangle base: %g\n", base);
      System.out.printf("Triangle height: %g\n", height);
      System.out.printf("Triange area: %g\n", triArea(base, height));
   }
   
   public static double sqArea(double side)
   {
      double sq_area = side*side;
      return sq_area;
   }
   
   public static double rectArea(double width, double length)
   {
      double rect_area = length * width;
      return rect_area;
   }
   
   public static double circArea(double radius)
   {
      double circ_area = Math.pow(radius, 2)*Math.PI;
      return circ_area;
   }
   
   public static double triArea(double base, double height)
   {
      double tri_area = (base*height)/2;
      return tri_area;
   }
}   