package edu.lessons.day60.oops.introduction;
public class DemoEBLB
{
   public static void main(String args[])throws Exception
   {
	  // m1();
	  m2();
	}
   public static void m1()
	{
	 //early binding
	   Emp e1=new Emp();
	   Car c1=new Car();
	}
	public static void m2()throws Exception
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
	 	 System.out.println("Enter a class name");
	 	 String s1=sc.next();
	 	 sc.close();	 	 
		//late binding
		Class c1=Class.forName(s1);// Emp e1;
		Object obj=c1.newInstance();// e1=new Emp();
		System.out.println("ClassName="+c1.getName());
		System.out.println("hashCode="+obj.hashCode());
	}
}