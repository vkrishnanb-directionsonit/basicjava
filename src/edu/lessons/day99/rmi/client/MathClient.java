package edu.lessons.day99.rmi.client;
import edu.lessons.day99.rmi.server.*;
import java.rmi.Naming;
import java.util.Scanner;
public class MathClient
{
	//Factory Method
	public static MathServerInf getService()throws Exception
	{
		String strUrl = "rmi://localhost:1099/Mathrmi";
		MathServerInf proxy =
						(MathServerInf)Naming.lookup(strUrl);
		return proxy;
	}
	public static void main(String args[])
	{
		try
		{
			java.util.Scanner sc=new Scanner(System.in);
			MathServerInf proxy = getService();
			System.out.println("The First No  is : ");
			int intA = Integer.parseInt(sc.nextLine());
			System.out.println("The Second No  is : ");
			int intB = Integer.parseInt(sc.nextLine());
			System.out.println(" Sum : "+proxy.add(intA,intB));
			System.out.println(" Sub : "+proxy.sub(intA,intB));
			System.out.println(" Prod: "+proxy.product(intA,intB));
			System.out.println(" Div : "+proxy.div(intA,intB));
			System.out.println("Name "+proxy.getName());
			System.out.println("Enter a New name ");
			proxy.setName(sc.nextLine());
			System.out.println(" Value Set");
			Thread.sleep(10000);
			System.out.println(" "+proxy.getName());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}