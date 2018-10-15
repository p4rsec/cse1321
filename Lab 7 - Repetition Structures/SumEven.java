// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 7

import java.util.*;
import java.io.*;

public class SumEven
{
   public static void main(String[] args)
   {
      int min = 20; 
      int max = 60;
      Scanner sc = new Scanner(System.in);
      System.out.print("Please input a number between 20 and 60: ");
      int num = sc.nextInt();
      int out = 0;
      int count = 2;
      
      // input validation for out of range/non-int input.
      while(num < min || num > max || (int)num != num) 
      {
         System.out.print("That's not correct. Please enter a number between 20 and 60: ");
         num = sc.nextInt();
      }
      
      // iterates while input is greater than 2, including num if even
      int sum = 0;
      while(count <= num)
      {
         sum = sum + count;
         count += 2;
      }
      System.out.printf("Sum of even numbers between 2 and %d is %d", num, sum);      
   }
}