package edu.lessons.day4.classes.activity.problemOne.solution2;
import java.util.Scanner;
import edu.lessons.day4.classes.activity.problemOne.solution2.AccountType;
import java.util.Calendar;
import java.util.Date;
public class BankController {
	Branch currentBranch=new Branch();
	public Customer addNewCustomer(Scanner sc)
	{
		System.out.println("Adding New Customer to Branch");
		System.out.println("Enter New Customer ID");
		int id=sc.nextInt();		
		Customer c1=new Customer(id);
		sc.nextLine();
		System.out.println("Enter New CustomerName");
		c1.firstName=sc.nextLine();
		System.out.println("Enter New CustomerCity");
		c1.address=sc.nextLine();
		System.out.println("Enter Email Address");
		c1.emailAddress=sc.nextLine();
		System.out.println("Enter Phone Number");
		c1.phoneNumber=sc.nextLong();
		sc.nextLine();
		currentBranch.addCustomer(c1);
		return c1;
	}

	public Employee addNewEmployee(Scanner sc)
	{
		System.out.println("Adding New Employee to Branch");
		System.out.println("Enter New Employee ID");
		int id=sc.nextInt();		
		Employee emp=new Employee(id);
		sc.nextLine();
		System.out.println("Enter New Employee Name");
		emp.firstName=sc.nextLine();
		System.out.println("Enter New Employee City");
		emp.address=sc.nextLine();
		System.out.println("Enter Email Address");
		emp.emailAddress=sc.nextLine();
		System.out.println("Enter Phone Number");
		emp.phoneNumber=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Designation");
		emp.designation=sc.nextLine();
		currentBranch.addEmployee(emp);
		return emp;
	}
	public void openNewCustomerAccount(Customer c,Scanner sc)
	{
		System.out.println("Opening a New Account for the Customer "+c.personId);
		System.out.println("Enter New Account Number ");
		int accountNo=sc.nextInt();		
		sc.nextLine();
		Account acc=new Account(accountNo,c.personId);
		Calendar cal = Calendar.getInstance();// factory method
		Date date = cal.getTime();
		acc.dateOfOpening=date;
		
		System.out.println("Please Enter Account Type "
				+ "s-for Savings and c-for Current");
		String acctype=sc.next();
		if(acctype.equals("s"))		
			acc.customerAccountType=AccountType.SAVINGS;
		if(acctype.equals("c"))		
			acc.customerAccountType=AccountType.CURRENT;
		c.addNewAccount(acc);
	}
}
