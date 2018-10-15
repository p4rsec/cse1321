// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 8

import java.util.*;
import java.io.*;

public class MinMaxAvg
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int x, y, z, max, min, avg;
      
      System.out.println("Please input 3 integers.");
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();
      
      min = min(x, y, z);
      max = max(x, y, z);
      avg = avg(x, y, z);
      
      System.out.printf("You entered: %d, %d, %d\n", x, y, z);
      System.out.printf("Max: %d\n", max);
      System.out.printf("Min: %d\n", min);
      System.out.printf("Average: %d\n", avg);
   }
   
   public static int max(int x, int y, int z)
   {
      int max = x;
      if(max < y)
         max = y;
      if (max < z)
         max = z;               
      
      return max;
   }
   
   public static int min(int x, int y, int z)
   {
      int min = x;
      if(min > y)
         min = y;
      if (min > z)
         min = z;
      
      return min;
   }
   
   public static int avg(int x, int y, int z)
   {
      int avg;
      avg = (x+y+z)/3;
      
      return avg;
   }
}
