// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab #: 4

import java.util.*;
import java.io.*;

public class GradeReport
{ 
   public static void main(String arg[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your grade: ");
      int grade = sc.nextInt();
      System.out.println("You entered " + grade);
      grade /= 10;
      
      switch (grade) 
      {
         case 10: 
            System.out.println("That grade is a perfect score. Well done.");
            break;
         case 9:
            System.out.println("That grade is well above average. Excellent work.");
            break;
         case 8: 
            System.out.println("That grade is above average. Nice job.");
            break;
         case 7:
            System.out.println("That grade is average work.");
            break;
         case 6:
            System.out.println("That grade is not good, you should seek help!");
            break;
         default:
            if (grade > 10)
               System.out.print("That grade is a perfect score. Well done.");
            else if (grade < 6)
               System.out.print("That grade is not passing.");
            break;
      }
      
   }
}