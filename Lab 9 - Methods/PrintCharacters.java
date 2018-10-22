// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 9

import java.util.*;
import java.io.*;
public class PrintCharacters
{
   public static void printChars(char start, char end)
   {
        char current_char = start;
        while(current_char < end){
            for(int i = 0; i < 5; i++){
                System.out.print(current_char);
                if(current_char == end)
                    break;
                else
                    current_char++;
            }
        }

   }
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter parameters.");
      System.out.print("Start Character: ");
      char start = sc.next().charAt(0);
      System.out.print("End Chararacter:");
      char end = sc.next().charAt(0);

      System.out.println("Output:");
      if(start > end)
         System.out.println("Sorry, those aren't in order!");
      else
         printChars(start, end);
   }
}