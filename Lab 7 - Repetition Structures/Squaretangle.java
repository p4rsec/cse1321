// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 7

import java.util.*;
import java.io.*;

public class Squaretangle
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Symbol: ");
      char thing = sc.next().charAt(0);
      System.out.print("Number: ");
      int num = sc.nextInt();
      
      for(int a = 0; a < num; a++)
      {
         for(int i = 0; i < num; i++)
         {
            System.out.print(thing);  
         }
         System.out.println();
      }         
   }
}