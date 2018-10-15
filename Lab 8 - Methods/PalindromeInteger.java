// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 8

import java.util.*;
import java.io.*;

public class PalindromeInteger
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Please input a number: ");
      int num = sc.nextInt();
      System.out.printf("Your number: %d\n", num);
      System.out.printf("Is Palindrome: %b\n", isPalindrome(num));
   }
   
   public static int reverse(int num)
   {
      StringBuilder s_num1 = new StringBuilder();
      
      String s_num = Integer.toString(num);
      s_num1.append(s_num);
      s_num = s_num1.reverse().toString();
      int rev_num = Integer.parseInt(s_num);

      return rev_num;
   }
   
   public static boolean isPalindrome(int num)
   {
      if(reverse(num) == num)
      {
         return true;
      }
      else
         return false;
      
   }
}