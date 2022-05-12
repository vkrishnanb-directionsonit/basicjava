package edu.lessons.day96.jpa.empEntity;

import java.util.Scanner;

public class FindEmp {
	public static void main(String[] args) throws Exception
	{
		EmpDAO es=new EmpDAO();
		System.out.println("Enter an Employee ID");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Emp e1=es.find(id);
		if(e1!=null)
		{
			System.out.println("ID "+e1.getNo());
			System.out.println("Name " +e1.getName());
			System.out.println("Salary "+e1.getSalary());
		}
		else
			System.out.println("Emp not found "+id);
		}
}
