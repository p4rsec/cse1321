import java.util.*;
import java.io.*;

class PalindromicPrime{
	public static int reverse(int num)
	{
		StringBuilder s_num1 = new StringBuilder();
	      
		String s_num = Integer.toString(num);
		s_num1.append(s_num);
		s_num = s_num1.reverse().toString();
		int rev_num = Integer.parseInt(s_num);
		
		return rev_num;
	   	}
	   
	public static boolean isPalindrome(int num)
	{
		if(reverse(num) == num)
		{
			return true;
	    }
		else
			return false;
	}

	
	public static boolean isPrime(int num) {
		int temp;
		for(int i=2;i<=num/2;i++)
		{
	       temp=num%i;
		   if(temp==0)
		   {
		      return false;
		   }
		   else continue;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int palinPrime = 1;
		int count = 0;
		do {
			if(isPalindrome(palinPrime) == true && isPrime(palinPrime) == true) {
				System.out.printf("%d ", palinPrime);
				count++;
				if(count%10 == 0) {
					System.out.println();
				}
			}
			palinPrime = palinPrime + 1;
		}
		while(count<50);
	}
}