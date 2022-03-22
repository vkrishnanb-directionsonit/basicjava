package edu.lessons.day4.classes.activity.problemOne.solution2;

public class Customer extends Person{
	public Account[] customerAccounts;
	
	private int accountCount=0;
	private int listIncrementSize=3;
	public Customer(int id) 
	{
		super(id);
		customerAccounts=new Account[listIncrementSize];
	}
	public int getCustomerAccountCount() {return accountCount;}
	
	public void addNewAccount(Account acc)
	{
		if(acc==null) 
		{
			System.out.println("Account is NULL!!!");
			return;
		}else
		{
			int accountListLen=customerAccounts.length;
			if(accountCount==accountListLen)
			{
				accountListLen=accountListLen+listIncrementSize;
				Account[] tempAccountList=new Account[accountListLen];
				//copy data from old array to temp
				for(int i=0;i<accountCount;i++)
				{
					tempAccountList[i]=customerAccounts[i];
				}
				customerAccounts=tempAccountList;
			}
			if(accountCount<accountListLen) {
				customerAccounts[accountCount]=acc;
				accountCount++;
				System.out.println("New Account Opened "+acc.accountNumber);
			}
		}
	}
}
