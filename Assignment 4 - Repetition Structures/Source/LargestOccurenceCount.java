import java.util.*;
import java.io.*;
public class LargestOccurenceCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int count = 0;
        int input = 0;
        System.out.print("Enter positive integers (0 to quit); ");
        do {
            input = sc.nextInt();
            if(input>0) {
                if (input > largest) {
                    largest = input;
                    count = 1;
                } else if (input == largest) {
                    count++;
                    continue;
                }
            }
            else
                continue;
        }
        while (input != 0);
        System.out.printf("Largest value: %d\n", largest);
        System.out.printf("Occurences: %d times\n", count);
    }
}