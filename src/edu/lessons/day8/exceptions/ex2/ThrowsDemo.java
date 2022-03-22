package edu.lessons.day8.exceptions.ex2;
import java.util.Scanner;
public class ThrowsDemo {
	public static void main(String[] args) {
		java.util.Scanner sc=new Scanner(System.in);
		int a=0;
		//isZero(a);
		try
		{
			System.out.println("Enter a No");
			a=sc.nextInt();
			isZero(a);
		} catch (Exception err)
		{
			System.out.println(err.getMessage());
		}
		finally
		{
			sc.close();
		}
	}
	public static void isZero(int y) throws Exception
	{
		if(y==0){
			Exception err=new Exception("Y is Zero!!!. It Must be > 0");
			throw err;// raising an Exception
		}
		else
			System.out.println("Y is not Zero");
	}
}
