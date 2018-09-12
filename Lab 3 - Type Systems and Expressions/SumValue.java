// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab: 3

import java.util.Scanner;
public class SumValue
{
   public static void main (String arg[])
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println ("Please input 3 numbers: ");
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      double z = sc.nextDouble();
      
      System.out.println ("X = " + x);
      System.out.println ("Y = " + y);
      System.out.println ("Z = " + z);
      
      double sum = (x + y + z);
      double avg = sum / 3;
      
      System.out.println ("Average: " + avg);
   }
}