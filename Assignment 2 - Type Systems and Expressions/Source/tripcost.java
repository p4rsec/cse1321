import java.util.Scanner;
public class tripcost
{   
   public static void main (String[] args)
   {
      int miles;
      double mpg, total, price;
      Scanner scan = new Scanner (System.in);
      System.out.print ("Enter the number of miles: ");
      miles = scan.nextInt();
      
      System.out.print ("Enter the miles per gallon: ");
      mpg = scan.nextDouble();

      System.out.print ("Enter the price per gallon: ");
      price = scan.nextDouble();
      
      total = ((miles / mpg) * price);
      System.out.println ("Total trip cost: " + total);
      
   }
}