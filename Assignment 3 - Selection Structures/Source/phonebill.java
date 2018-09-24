import java.util.*;
import java.io.*;

public class phonebill 
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input the account number: ");
		int acct = sc.nextInt(); // reads arbitrary account number
		System.out.print("Please input service code: ");
		char svc_code = sc.next().charAt(0); // reads service code character
		
		/* the following blocks check for the appropriate service codes.
		 * valid codes include p or P for 'Premium' service, and 
		 * r or R for regular service. if no valid code is read,
		 * the program exits, informing the user to input a valid code.
		 */
		if (svc_code == 'p' || svc_code == 'P')
		{
			double svc_fee = 25.00;
			System.out.print("Please input daytime minutes: ");
			int day_min = sc.nextInt();
			if (day_min <= 50)
			{
				System.out.println("Account Number: " + acct);
				System.out.println("Service Type: Premium");
				System.out.println("Dayttime Minutes: " + day_min);
			}
			else if (day_min > 50)
			{
				System.out.println("Account Number: " + acct);
				System.out.println("Service Type: Premium");
				System.out.println("Dayttime Minutes: " + day_min);
				day_min = day_min - 50;
				svc_fee = svc_fee + ((double)day_min * .2); 
			}
				
			System.out.print("Please input nighttime minutes: ");
			int night_min = sc.nextInt();
			if (night_min <= 100)
				System.out.println("Nighttime Minutes: " + night_min);
			else if (night_min > 100)
			{
				System.out.println("Nighttime Minutes: " + night_min);
				night_min = night_min - 100;
				svc_fee = svc_fee + ((double)night_min * .1);
			}
			System.out.println("Amount Due: " + svc_fee);		
		}
		else if (svc_code == 'r' || svc_code == 'R')
		{
			System.out.print("Please input used minutes: ");
			int mins = sc.nextInt();
			
			if (mins < 50)
			{
				double svc_fee = 15.00;
				System.out.println();
				System.out.println("Account Number: " + acct);
				System.out.println("Service Type: Regular");
				if (mins < 50)
					System.out.println("Total Minutes: " + mins);
				else if (mins > 50)
				{
					System.out.println("Total Minutes: " + mins);
					mins = mins - 50;
					svc_fee = svc_fee + ((double)mins * .5);
				}	
			}
		}
		else 
		{
			System.out.println("Please input a valid service code.");
		}
		System.out.print("That's all for now folks");
	}
}