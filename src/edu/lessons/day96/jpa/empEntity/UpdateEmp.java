package edu.lessons.day96.jpa.empEntity;

import java.util.Scanner;

public class UpdateEmp {
	public static void main(String[] args) throws Exception
	{
		EmpDAO es=new EmpDAO();
		System.out.println("Enter an Employee ID");
		Scanner sc=new Scanner(System.in);
//		sc.useDelimiter("\\n");
		int id=sc.nextInt();
		sc.nextLine();
		Emp e1=es.find(id);
		if(e1!=null)
		{
			System.out.println("ID "+e1.getNo());
			System.out.println("Name " +e1.getName());
			System.out.println("Salary "+e1.getSalary());
		}
		System.out.println("Enter New Name");
		e1.setName(sc.next());
		sc.nextLine();
		System.out.println("Enter New Salary");
		e1.setSalary(sc.nextLong());
		sc.nextLine();
		es.updateEmp(e1);
		System.out.println("Emp Updated ");
	}
}
