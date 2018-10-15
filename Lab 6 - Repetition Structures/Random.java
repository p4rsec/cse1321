// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 6
public class Random
{
   public static void main(String[] arg)
   {
      int rand = 0;
      
      for (int i = 0; i < 10; i++)
      {
         rand = (int)(Math.random() * 50) + 1;
         System.out.println(rand);
      }
   }
}