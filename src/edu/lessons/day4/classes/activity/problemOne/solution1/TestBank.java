package edu.lessons.day4.classes.activity.problemOne.solution1;

import java.util.Scanner;

import edu.lessons.day4.classes.activity.problemOne.solution1.Branch;
import edu.lessons.day4.classes.activity.problemOne.solution1.Customer;
public class TestBank {
	public static void main(String[] args) {
		Branch br1=new Branch();
		System.out.println("Branch ID "+br1.branchID);
		
		Customer c1=new Customer();
		c1.customerName="Raju";
		c1.accountNumber=1234567000;
		c1.address="Chennai";
		c1.emailAddress="Raju@gmail.com";
		c1.phoneNumber=9444444444l;
		
		System.out.println("Please Enter Account Type "
				+ "s-for Savings and c-for Current");
		java.util.Scanner sc=new Scanner(System.in);
		String acctype=sc.next();
		if(acctype.equals("s"))		
			c1.customerAccountType=AccountType.SAVINGS;
		if(acctype.equals("c"))		
			c1.customerAccountType=AccountType.CURRENT;
		System.out.println(c1.customerName);
		System.out.println(c1.accountNumber);
		System.out.println(c1.address);
		System.out.println(c1.emailAddress);
		System.out.println(c1.phoneNumber);
		System.out.println(c1.customerAccountType);
		System.out.println("-----------");
		
		Customer c2=new Customer();
		c2.customerName="Sita";
		c2.accountNumber=1234567100;
		c2.address="Chennai";
		c2.emailAddress="Sita@gmail.com";
		c2.phoneNumber=9444444445l;
		System.out.println(c2.customerName);
		System.out.println(c2.accountNumber);
		System.out.println(c2.address);
		System.out.println(c2.emailAddress);
		System.out.println(c2.phoneNumber);
		System.out.println(c2.customerAccountType);
		
		Employee e1=new Employee();
		e1.employeeId=1234;
		e1.employeeName="Sam";
		e1.address="Trichy";
		e1.emailAddress="Sam@gmail.com";
		e1.phoneNumber=9333333333l;
		
		System.out.println("-----------");
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		System.out.println(e1.address);
		System.out.println(e1.emailAddress);
		System.out.println(e1.phoneNumber);
	}
}
