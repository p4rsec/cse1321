// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 6
import java.io.*;

public class EvenOdd
{
   public static void main(String[] arg)
   {
      int num = 52;
      System.out.print("Even numbers between 50 and 100: ");
      
      while (num > 50 && num < 100)
      { 
         System.out.print(+ num + ", ");
         num = num + 2; 
      }
      
      System.out.println("100");
      num = 51;
      System.out.print("Odd numbers between 50 and 100: ");
      
      while (num > 50 && num < 99)
      {
         System.out.print(+ num + ", ");
         num = num + 2;
      }
      System.out.println("99");
   }
}