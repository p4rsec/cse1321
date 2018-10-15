// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 7

public class Shape
{
   public static void main(String[] args)
   {
      char spc = ' '; 
      char star = '*';
      int lines = 0; // tracks which line has been printed
      int star_count = 1; // makes it easier to keep track of how many stars to print
      
      do // loop to print the shape
      {
         for (int i = 8; i > lines; i--) // prints spaces for (lines - 1), essentially
         {
            System.out.print(spc);
         }
         for (int i = 0; i < star_count; i++) // prints stars, adding two every loop iteration
         {
            System.out.print(star);
         }
         
         star_count = star_count + 2; 
         System.out.println(); // newline to pretty up the lines
         lines++;
      }
      while (lines < 8);
   }
}