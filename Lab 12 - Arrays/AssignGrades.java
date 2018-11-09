// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 12

import java.util.*;
import java.io.*;
class AssignGrades{
   public static void printGrades(int[] grades){
      int i = 0;
      while(i < grades.length){      
         int grade = grades[i];
         grade = grade/10;
         switch (grade) 
         {
         case 10: 
            System.out.printf("Student %d score is %d and grade is A\n",i,grades[i]);
            i++;
            break;
         case 9:
            System.out.printf("Student %d score is %d and grade is A\n",i,grades[i]);
            i++;
            break;
         case 8: 
            System.out.printf("Student %d score is %d and grade is B\n",i,grades[i]);
            i++;
            break;
         case 7:
            System.out.printf("Student %d score is %d and grade is C\n",i,grades[i]);
            i++;
            break;
         case 6:
            System.out.printf("Student %d score is %d and grade is D\n",i,grades[i]);
            i++;
            break;
         default:
            if(grade < 6)
               System.out.printf("Student %d score is %d and grade is F\n",i,grades[i]);
            i++;   
            break;
         }
      }
   }
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Class size: ");
      int classSize = sc.nextInt();
      int[] grades = new int[classSize];
      
      System.out.println("Please enter grades:");
      
      int i = 0;
      while(i < classSize){
         int tmp = sc.nextInt();
         grades[i] = tmp;
         i++;
      }
      
      printGrades(grades);
   }
}