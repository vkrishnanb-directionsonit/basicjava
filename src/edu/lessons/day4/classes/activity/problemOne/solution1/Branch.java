package edu.lessons.day4.classes.activity.problemOne.solution1;

public class Branch 
{
	public int branchID;
	public String bankName;
	public String location;
	public int managerID;
	public long landLineNumber;
	public Branch()
	{
		branchID=this.hashCode();
	}
	public Branch(int bid)
	{
		branchID=bid;
	}
}
