package edu.lessons.day4.classes.activity.problemOne.solution2;

public class Branch 
{
	public final int branchID;
	public String bankName;
	public String location;
	public int managerID;
	public long landLineNumber;
	public Customer[] customerList;
	public Employee[] employeeList;
	private int customerCount=0;
	private int empCount=0;
	private int listIncrementSize=10;
	public Branch()
	{
		branchID=this.hashCode();
		customerList=new Customer[listIncrementSize];
		employeeList=new Employee[listIncrementSize];
	}
	public Branch(int bid)
	{
		branchID=bid;
		customerList=new Customer[listIncrementSize];
		employeeList=new Employee[listIncrementSize];
	}
	public Branch(int bid,int initialCustomerListSize,int initialEmpListSize)
	{
		branchID=bid;
		customerList=new Customer[initialCustomerListSize];
		employeeList=new Employee[initialEmpListSize];
	}
	public int getCustomerCount() {return customerCount;}
	public int getEmployeeCount() {return empCount;}
	public Customer[] getAllCustomer() {return customerList;}
	public Employee[] getAllEmployee() {return employeeList;}
	
	public void addCustomer(Customer c)
	{
		if(c==null) 
		{
			System.out.println("Customer is NULL");
			return;
		}
		else
		{
			int customerListLen=customerList.length;
			if(customerCount==customerListLen)
			{
				customerListLen=customerListLen+listIncrementSize;
				Customer[] tempCustomerList=new Customer[customerListLen];
				//copy data from old array to temp
				for(int i=0;i<customerCount;i++)
				{
					tempCustomerList[i]=customerList[i];
				}
				customerList=tempCustomerList;
			}
			if(customerCount<customerListLen) {
				customerList[customerCount]=c;
				customerCount++;
			}
		}
	}
	public void addEmployee(Employee emp)
	{
		if(emp==null) 
		{
			System.out.println("Employee is NULL!!!");
			return;
		}else
		{
			int empListLen=employeeList.length;
			if(empCount==empListLen)
			{
				empListLen=empListLen+listIncrementSize;
				Employee[] tempEmpList=new Employee[empListLen];
				//copy data from old array to temp
				for(int i=0;i<empCount;i++)
				{
					tempEmpList[i]=employeeList[i];
				}
				employeeList=tempEmpList;
			}
			if(empCount<empListLen) {
				employeeList[empCount]=emp;
				empCount++;
			}
		}
	}
}
