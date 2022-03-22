package edu.lessons.day60.oops.inheritance.ex;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) 
	{
		//testPerson();
		testStudent();
		testEmployee();
	}
    public static void testPerson()
    {
    	Person p1=new Person();
    	p1.id=12345;
    	p1.name="Abcd";
    	p1.date_of_birth="1/1/1990";
    	p1.blood_group="A";
    	p1.height=5;
    }
    public static void testStudent()
    {
    	Student p1=new Student();
    	java.util.Scanner sc =new Scanner(System.in);
    	System.out.println("Enter Student ID and Name");
    	p1.id=sc.nextInt();
    	
    	p1.name=sc.nextLine();
    	p1.date_of_birth="1/1/1990";
    	p1.blood_group="A";
    	p1.height=5;
    	p1.marks_details=895;
    	sc.close();
    	System.out.println("Student Details ");
    	System.out.print(p1.id+"\t");
    	System.out.print(p1.name+"\t");
    	System.out.print(p1.date_of_birth+"\t");
    	System.out.print(p1.blood_group+"\t");
    	System.out.print(p1.height+"\t");
    	System.out.print(p1.marks_details+"\t");
    	System.out.println();
    }
    public static void testEmployee()
    {
    	Employee p1=new Employee();
    	p1.id=5000123;
    	p1.name="John";
    	p1.date_of_birth="8/6/1997";
    	p1.blood_group="B";
    	p1.height=6;
    	System.out.println("Employee Details ");
    	System.out.print(p1.id+"\t");
    	System.out.print(p1.name+"\t");
    	System.out.print(p1.date_of_birth+"\t");
    	System.out.print(p1.blood_group+"\t");
    	System.out.print(p1.height+"\t");
    	System.out.println();
    }
}
