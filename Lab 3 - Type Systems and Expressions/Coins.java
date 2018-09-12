// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab: 3

import java.util.Scanner;
import java.io.*;

public class Coins
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter number of quarters: ");
      int q = sc.nextInt();
      System.out.print("Enter number of dimes: ");
      int d = sc.nextInt();
      System.out.print("Enter number of nickles: ");
      int n = sc.nextInt();
      System.out.print("Enter number of pennies: ");
      int p = sc.nextInt();
      
      System.out.println("You entered " + q + " quarters");
      System.out.println("You entered " + d + " dimes");
      System.out.println("You entered " + n + " nickles");
      System.out.println("You entered " + p + " pennies");
      
      q *= 25;
      d *= 10;
      n *= 5;
      int total_d = ((q+d+n+p) / 100);
      int total_c = ((q+d+n+p) % 100);
     
      System.out.println("Your total is " + total_d + " dollars and " + total_c + " cents.");
      
   }
}