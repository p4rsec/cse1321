// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 5

import java.util.*;
import java.io.*;

public class NextMeeting
{
   public static void main(String[] arg)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please input day: ");
      int day = sc.nextInt();
      System.out.println();
      System.out.print("Please input next meeting: ");
      int next_meet = sc.nextInt();
      System.out.print("Days to the meeting is " + next_meet + " days");
      System.out.println();
      
      switch (day) 
      {
         case 0:
            System.out.println("Today is Sunday");
            break;
         case 1:
            System.out.println("Today is Monday");
            break;            
         case 2:
            System.out.println("Today is Tuesday");
            break;            
         case 3:
            System.out.println("Today is Wednesday");
            break;            
         case 4:
            System.out.println("Today is Thursday");
            break;            
         case 5:
            System.out.println("Today is Friday");
            break;            
         case 6:
            System.out.println("Today is Saturday");
            break;            
         default:
            System.out.println("Please input a valid day between 0 and 6");
            break;                  
      }
      
      int meet_day = (day + next_meet) % 7;
      switch (meet_day) 
      {
         case 0:
            System.out.println("Meeting day is Sunday");
            break;
         case 1:
            System.out.println("Meeting day is Monday");
            break;            
         case 2:
            System.out.println("Meeting day is Tuesday");
            break;            
         case 3:
            System.out.println("Meeting day is Wednesday");
            break;            
         case 4:
            System.out.println("Meeting day is Thursday");
            break;            
         case 5:
            System.out.println("Meeting day is Friday");
            break;            
         case 6:
            System.out.println("Meeting day is Saturday");
            break;            
         default:
            System.out.println("Please input a valid day between 0 and 6");
            break;                  
      }  
   }
}