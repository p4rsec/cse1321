import java.util.*;
class BankAccount {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private double monthlyInterestRate = 0;
	public Date dateCreated;
	
	public BankAccount(){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	public BankAccount(int id, double balance, double interestRate, Date dateCreated){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int newID){
		id = newID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double riches){
		balance = riches;
	}
	
	public double getInterestRate(){
		return annualInterestRate;
	}
	
	public void setInterestRate(double interestRate){
		annualInterestRate = interestRate/100;
	}
	
	public Date getCreation(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		monthlyInterestRate = annualInterestRate/12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(){
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	
	public void withdraw(double amount){
		balance -= amount;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public String toString(){
		return "Account ID: " + id + "\nAccount Balance: " + balance + "\nInterest Rate: " + annualInterestRate + "\nDate Opened: " + dateCreated;
	}
}