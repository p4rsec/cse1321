// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 9

import java.util.*;
import java.io.*;
public class PickANumber
{
   public static int randNum()
   {
      int min = 1; 
      int max = 20;
      long epoch = System.currentTimeMillis();
      Random rand = new Random(epoch);
      int secret = rand.nextInt((max - min) + 1) + min;
      return secret;
   }
   
   public static int getGuess()
   {
      Scanner sc = new Scanner(System.in);
      int guess = sc.nextInt();
      if(!(guess >= 1 && guess <= 20))
         guess = -1;
      return guess;   
   }
   
   public static boolean guessCheck(int secret, int guess)
   {
      if(guess == secret)
         return true;
      else
         return false;   
   }
   
   public static void main(String[] args)
   {
      boolean play;
      boolean result;
      Scanner sc = new Scanner(System.in);
      
      do
      {
         System.out.print("Pick a number between 1 and 20: ");
         int secret = randNum();
         int guess = getGuess();
      
         if(guess == -1)
         {
            System.out.println("Somethings not quite right. Try again!");
         }
         else
         {      
            do
            {
               result = guessCheck(secret, guess);
               if(result == false)
               {
                  if(guess < secret)
                     System.out.println("You're too low!");
                  else if(guess > secret)
                     System.out.println("You're too high!");
               }
               else 
               {   
                  System.out.println("You're correct!");
                  break;
               }
               guess = getGuess();
               if(guess == -1)
               {
                  System.out.println("Somethings not quite right. Try again!");
               }         
            }
            while(result == false);
         }
         System.out.println("Would you like to play again (y or n)?");
         char decision = sc.next().charAt(0);
         if(decision == 'y')
            play = true;
         else
            play = false;         
      }
      while(play == true);   
   }
}