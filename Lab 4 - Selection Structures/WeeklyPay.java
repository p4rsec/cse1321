// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab #: 4

import java.util.*;
import java.io.*;

public class WeeklyPay{
   public static void main(String arg[]){
   
      double hourly = 10.00;
      double over_t = 15.00;
   
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of hours: ");
      double hours = sc.nextInt();
      System.out.println("You entered " + (int)hours + " hours.");
      double gross = hours * hourly;
   
      if (hours != 0 && hours <= 40)
         System.out.println("Gross earning is $" + gross);
      if (hours != 0 && hours > 40)
      {
         double over = (hours - 40) * 15;
         gross = 400 + over;
         System.out.println("Gross earning is $" + gross);
      }
   }
}
