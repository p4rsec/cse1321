import java.util.*;
import java.io.*;

public class cylinder
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Length? ");
        double length = sc.nextInt();
        System.out.println("Radius? ");
        double radius = sc.nextInt();

        double area = pi * (radius * radius);
        double volume = area * length;

        System.out.println("Entered length: " + length);
        System.out.println("Entered radius: " + radius);
        System.out.println("The volume is: " + volume);

    }
}