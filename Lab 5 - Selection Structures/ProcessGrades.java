// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 5

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class ProcessGrades
{
   public static void main(String[] arg)
   {
      Scanner sc = new Scanner(System.in);
      int max = 0, min = 100;
      double avg = 0;
      int grades[] = new int[4]; // declares array and allocates int's worth of memory
      
      for (int i = 0; i < grades.length; i++)
      {
         System.out.println("Please input grade " + (i + 1) + ":");
         grades[i] = sc.nextInt();
      }
      
      System.out.print("You entered: ");
      for (int i = 0; i < grades.length; i++)
      {
         if (i < (grades.length - 1))
         {
         System.out.print(+ grades[i] + ", ");
         }
         else
         {
            System.out.print(grades[i]);
         }     
      }
      
      for (int i = 0; i < grades.length; i++)
      {
           if (max < grades[i])
           {
               max = grades[i];
           }
           if (grades[i] < min)
           {
               min = grades[i];
           }
      }
      
      for (int i = 0; i < grades.length; i++)
      {
         avg = avg + grades[i];
      }
      
      avg = avg / grades.length;
      System.out.println("");
      System.out.print("Highest grade: " + max + "\n");
      System.out.print("Lowest grade: " + min + "\n");
      System.out.print("Average grade: " + avg + "\n");
      
   }
}