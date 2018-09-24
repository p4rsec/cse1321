import java.util.*;
import java.io.*;

public class FiveDigitPalindrome
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int number = 0, digit1, digit2, digit3, digit4, digit5, digits = 0;
        System.out.println( "Enter five digit number: " );
        number = sc.nextInt();
        while (number < 10000 || number > 99999)
        {
            System.out.println("Incorrect input, please try again...");
            System.out.println( "Enter five digit number: " ); // prompt
            number = sc.nextInt(); // read number
        }

        digit1 = number / 10000;
        digit2 = number / 1000 % 10;
        digit3 = number % 1000 / 100 % 10;
        digit4 = number % 10000 % 1000 % 100 / 10;
        digit5 = number % 10000 % 1000 % 100 % 10;

        if (digit1 == digit5 && digit2 == digit4)
            System.out.printf("%d is a palindrome", number);
        else
            System.out.printf("%d is not a palindrome", number);
    }
}