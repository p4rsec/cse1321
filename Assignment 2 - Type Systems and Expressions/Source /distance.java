import java.util.*;
import java.io.*;
import java.lang.Math;

public class distance 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double x1;
		double y1;
		double x2;
		double y2;
		
		System.out.println("Please enter x1: ");
		x1 = sc.nextDouble();
		System.out.println("Please enter y1: ");
		y1 = sc.nextDouble();
		System.out.println("Please enter x2: ");
		x2 = sc.nextDouble();
		System.out.println("Please enter y2: ");
		y2 = sc.nextDouble();
		
		double blah1 = x2 - x1;
		blah1 = Math.pow(blah1, 2);
		double blah2 = y2 - y1;
		blah2 = Math.pow(blah2, 2);
		double dist = Math.sqrt(blah1 + blah2);
		
		System.out.println("x1 = " + x1);
		System.out.println("y1 = " + y1);
		System.out.println("x2 = " + x2);
		System.out.println("y2 = " + y2);
		System.out.println("Distance: " + dist);
	}
}