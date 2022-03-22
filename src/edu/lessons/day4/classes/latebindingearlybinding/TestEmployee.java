package edu.lessons.day4.classes.latebindingearlybinding;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) throws Exception
	{
		lateBind();
	}
	public static void earlyBind()
	{
		Object e1;// e1 is null
		e1=new Employee();
		System.out.println(e1.getClass().getName());
	}
	public static void lateBind()throws Exception
	{
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Inter a class name");
		String cname=sc.nextLine();
		Object e1;
		e1=Class.forName(cname).newInstance();
		System.out.println(e1.getClass().getName());
	}
}
