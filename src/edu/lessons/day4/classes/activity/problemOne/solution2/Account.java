package edu.lessons.day4.classes.activity.problemOne.solution2;
import java.util.Date;
public class Account {
	public final int accountNumber;
	public final int customerId;
	public AccountType customerAccountType;
	public float minBalance=2000;
	public float currentBalance=0;
	public Date dateOfOpening;
	public Account(int accno,int custid) 
	{
		accountNumber=accno;
		customerId=custid;
	}
}
