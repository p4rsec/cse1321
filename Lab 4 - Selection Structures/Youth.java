// Class: CSE 1321
// Section: 09
// Term: Fall
// Instructor: Khandal
// Name: Seth Beckman
// Lab #: 4

import java.util.*;
import java.io.*;
public class Youth
{
   public static void main(String arg[]){
   
      Scanner sc = new Scanner(System.in);
     
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      System.out.println("You entered: " + age);
     
      if (age <= 21)
         System.out.println("Youth is a wonderful thing. Enjoy.");
      System.out.println("Age is a state of mind."); 
   
   }
}
