import java.util.*;
import java.io.*;
class TestBankAccount {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(123456, 10000, 2.50, new java.util.Date(System.currentTimeMillis()));
		
		System.out.println(acc1);
		acc1.withdraw(3500);
		System.out.printf("Balance: $%g\n", acc1.getBalance());
		acc1.deposit(500);
		System.out.printf("Balance: $%g\n", acc1.getBalance());
		System.out.printf("Monthly Interest: %g\n", acc1.getMonthlyInterest());
		System.out.println("Account Created: "+acc1.getCreation());
	}
}