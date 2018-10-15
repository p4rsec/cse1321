// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 5

import java.util.*;
import java.io.*;

public class checkPoint
{
   public static void main(String[] arg)
   {
      Scanner sc = new Scanner(System.in);
      int x, y;
      
      System.out.print("Please input x value: ");
      x = sc.nextInt();
      System.out.println();
      
      System.out.print("Please input y value: ");
      y = sc.nextInt();
      System.out.println();
      
      System.out.print("X-coordinate is " + x + " \n");
      System.out.print("Y-coordinate is " + y + " \n");
      if (x == 0 && y == 0)
         System.out.println("(" + x + ", " + y + ") is the origin point.");
      else if (y == 0)
         System.out.println("(" + x + ", " + y + ") is on the x-axis.");
      else if (x == 0)
         System.out.println("(" + x + ", " + y + ") is on the y-axis.");
      else if (x > 0 && y > 0)
         System.out.println("(" + x + ", " + y + ") is in the first quadrant");      
      else if (x < 0 && y > 0)
         System.out.println("(" + x + ", " + y + ") is in the second quadrant");      
      else if (x < 0 && y < 0)
         System.out.println("(" + x + ", " + y + ") is in the third quadrant");      
      else if (x > 0 && y < 0)
         System.out.println("(" + x + ", " + y + ") is in the fourth quadrant");      
      
   }
}