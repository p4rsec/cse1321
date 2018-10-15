// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 6
import java.util.*;
import java.io.*;

public class PrintSum 
{
   public static void main(String[] arg)
   {
      Scanner sc = new Scanner(System.in);
      int sum = 0;
      System.out.print("Please enter value: ");
      int in = sc.nextInt();
      
      while (in < 1 || in > 100)
      {   
         System.out.println("Invalid input. Please try again");
         System.out.println();
         System.out.println("Please enter value between 1 and 100: ");
         in = sc.nextInt();
      }
      
      if (in > 1 && in < 100)
      {
         for (int i = 1; i <= in; i++)
            sum = sum + i;    
      }
      
      System.out.println("You entered: " + in);
      System.out.println("Sum of values: " + sum);
   }
}