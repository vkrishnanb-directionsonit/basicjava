package edu.lessons.day7.accessmodifiersC;
public class TestEmp
{
	public static void main(String args[])throws Exception
	{
		Emp e1=new Emp();
		e1.setEno(100);
		e1.setFname("Venkat");
		String str=e1.toString();
		System.out.println(str);
	}
}