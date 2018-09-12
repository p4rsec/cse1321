// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab: 3

import java.util.Scanner;

public class SimpleMath
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter two floating-point values:");
      double r = sc.nextDouble();
      double t = sc.nextDouble();
      
      System.out.println("R = " + r);
      System.out.println("T = " + t);
      System.out.println("R + T = " + (r+t));
      System.out.println("R - T = " + (r-t));
      System.out.println("R * T = " + (r*t));
      
   }
}