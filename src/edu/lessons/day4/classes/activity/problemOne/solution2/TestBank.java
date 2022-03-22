package edu.lessons.day4.classes.activity.problemOne.solution2;

import java.util.Scanner;

public class TestBank {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Loading a Branch");
		BankController bc=new BankController();
		System.out.println("Branch ID "+bc.currentBranch.branchID);
		System.out.println("Enter Branch Name");
		bc.currentBranch.bankName=sc.nextLine();
		System.out.println("Enter Branch Location");
		bc.currentBranch.location=sc.nextLine();
		//======================
		System.out.println("Adding an Employee to Branch");
		Employee emp1=bc.addNewEmployee(sc);
		//======================
		System.out.println("Adding a new Customer to Branch");
		Customer customer1=bc.addNewCustomer(sc);
		//======================
		System.out.println("Opening an Account for the Customer");
		bc.openNewCustomerAccount(customer1,sc);
		sc.close();
	}
}
