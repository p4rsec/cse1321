import java.util.*;
import java.io.*;

public class phonebill 
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the account number: ");
		int acct = sc.nextInt();
		System.out.print("Please input service code: ");
		char svc_code = sc.next().charAt(0);
		
		if (svc_code == 'p' || svc_code == 'P')
		{
			System.out.print("Please input daytime minutes: ");
			int day_min = sc.nextInt();
			System.out.print("Please input nighttime minutes: ");
			int night_min = sc.nextInt();
			System.out.println("Service code is " + svc_code + " and this condition works.");
		}
		else if (svc_code == 'r' || svc_code == 'R')
		{
			System.out.print("Please input used minutes: ");
			int mins = sc.nextInt();
			System.out.println("Service code is " + svc_code + " and this condition works.");
		}
		else 
		{
			System.out.println("Please input a valid security code.");
		}
		System.out.print("That's all for now folks");
	}
}