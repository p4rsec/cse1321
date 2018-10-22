// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 9

import java.util.*;
import java.io.*;
public class SumDigits
{
   public static int sumDigits(int num)
   {
      String s_num = Integer.toString(num);
      int sum = 0;
      
      for(int i = 0; i < s_num.length(); i++)
      {
         int a = Character.getNumericValue(s_num.charAt(i));
         sum += a;
      }
      return sum;
   }
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please input a number: ");
      int num = sc.nextInt();
      System.out.printf("The sum of digits is: %d", sumDigits(num));
   }
}