import java.util.*;
import java.io.*;

public class sumdigits
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num1 = 0;
        System.out.println("Please insert a number: ");
        int num = sc.nextInt();
        System.out.println("Entered number: " + num);
        
        while (num != 0)
        {
            num1 = num % 10;
            num = num / 10; 
            sum = num1 + sum;
        }
        System.out.println("Sum of digits: " + sum);
    }
}