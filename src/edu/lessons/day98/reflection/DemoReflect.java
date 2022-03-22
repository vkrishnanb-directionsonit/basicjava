package edu.lessons.day98.reflection;

import java.lang.reflect.Method;

public class DemoReflect
{
   public static void main(String args[])throws Exception
   {
	   java.util.Scanner sc=new java.util.Scanner(System.in);
	   System.out.println("Enter Full Class Name");
      Class c1=Class.forName(sc.nextLine());
      System.out.println("ClassName "+ c1.getName());
      System.out.println("isPrimitive "+ c1.isPrimitive());
      System.out.println("isInterface "+ c1.isInterface());
      System.out.println("SuperClass " + c1.getSuperclass().getName());
      Method mlist[] = c1.getMethods();
		for(Method m1: mlist)
		{
			System.out.println("\tMethod Name: "+m1.getName()+" "+m1.toString());
		}
		//----------Invoke Method------------
      System.out.println("Enter Method to run");
      String mName=sc.nextLine();
      java.lang.reflect.Method m=c1.getMethod(mName,null);
//      Class c2=int.class;
//	  java.lang.reflect.Method m=c1.getMethod(mName,new Class[]{c2,c2,c2});
		System.out.println("\tMethod Name: "+m.getName()+" Count "+m.getParameterCount());
		
		Object obj=c1.newInstance();
		Object result=null;
		if(null!=m)
		{
			if(m.getParameterCount()==0)result=m.invoke(obj,null);
			if(m.getParameterCount()==3)result=m.invoke(obj,new Object[]{10,20,30});
			if(null!=result)System.out.println("Result "+result);
			else System.out.println("No Result");
		}
   }
}
