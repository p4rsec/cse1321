// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 12

import java.util.*;
import java.io.*;
class CompareArrays{
   private static boolean compare(int[] arr1, int[] arr2, int len){
      int i = 0;
      while(i<len){
         if(!(arr1[i] == arr2[i])){
            return false;
         }
         i++;
      }
      return true;
   }
   
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Array size: ");
      int len = sc.nextInt();
      int[] arr1 = new int[len];
      int[] arr2 = new int[len];
      
      System.out.println("First array values:");
      
      int i = 0;
      while(i < len){
         int tmp = sc.nextInt();
         arr1[i] = tmp;
         i++;
      }
      
      System.out.println("Second array values:");
      
      i = 0;
      while(i < len){
         int tmp = sc.nextInt();
         arr2[i] = tmp;
         i++;
      }
      
      System.out.print("First array: ");
      for(i = 0;i<len;i++){
         if(i == (len-1))
            System.out.printf("%d\n",arr1[i]);
         else   
            System.out.printf("%d, ",arr1[i]);
      }
      
      System.out.print("Second array: ");
      for(i = 0;i<len;i++){
         if(i == (len-1))
            System.out.printf("%d\n",arr2[i]);
         else   
            System.out.printf("%d, ",arr2[i]);
      }
      
      if(compare(arr1,arr2,len) == false){
         System.out.print("Judgement:\t");
         System.out.println("The arrays are not identical."); 
      }
      
      else{
         System.out.print("Judgement:\t");
         System.out.println("The arrays are identical.");
      }   
   }
}