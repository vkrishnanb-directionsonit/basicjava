package edu.lessons.day98.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import java.util.Scanner;

public class ClassMembers
{
  public static void main(String args[])
  {
	 String classname="edu.lessons.day98.reflection.Actor";
	 Class<?> actorclass = null;
	 try {
		actorclass=Class.forName(classname); // Actor actorclass=null;
	 } catch (ClassNotFoundException e1) 
	 {
		e1.printStackTrace();
	 } 
	 Object obj = null;
	 try {
		//obj=actorclass.newInstance(); // new Actor();
			obj = actorclass.getDeclaredConstructors()[0].newInstance();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	 printClassInfo(obj);
	 //Class<Actor> actorclass = (Class<Actor>)actor.getClass();
	 //String firstString = "Its August";
	 //printClassInfo(firstString);
  }
  public static void printClassInfo(Object ob)
  {
	  Class<?> classreflected= ob.getClass();
	 System.out.println(classreflected.getName());
	 System.out.println("Constructors:");
     Constructor<?> constructorlist[] = classreflected.getConstructors();
     for(int i = 0; i < constructorlist.length; i++)
     {
       System.out.println("\t" + constructorlist[i]);
     }
     //
     System.out.println("Methods:");
     Method methodlist[] = classreflected.getMethods();
     for(int i = 0; i < methodlist.length; i++)
     {
   	  methodlist[i].setAccessible(true);
       System.out.println("\t Method Name: " + methodlist[i].getName()+
       		" ParameterCount "+ methodlist[i].getParameterCount()+
       		" returnType "+ methodlist[i].getReturnType());
     }
     //
  }
  
  public static void lateBinding()
  {
	  try
	    {
	      java.util.Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Class Name");
	      String className=sc.nextLine();
	      Class c = Class.forName(className);//load the class -- A a1;
	      Object obj=c.newInstance();//create Object a1=new A();
	      System.out.println("Class Name "+obj.getClass().getName());
	      System.out.println("Hash Code "+obj.hashCode());
	    }catch(Exception e)
	    {
	      System.out.println("Exception: " + e);
	    }
  }
  
  public static void queryTypeInfo()
  {
	  try
	    {
	      java.util.Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Class Name");
	      String cname=sc.nextLine();
	      Class c = Class.forName(cname);
	      System.out.println("Constructors:");
	      Constructor clist[] = c.getConstructors();
	      for(int i = 0; i < clist.length; i++)
	      {
	        System.out.println("\t" + clist[i]);
	      }
	      System.out.println("Fields:");
	      Field flist[] = c.getFields();
	      for(int i = 0; i < flist.length; i++)
	      {
	    	  flist[i].setAccessible(true);
//	    	  String modifier=ConstantsUtil.getModifierName(PUBLIC, 
//	    			  Class.forName("java.lang.reflect.Modifier"));
//	        System.out.println("\t"+flist[i].getType()+" "+flist[i].getName()
//	        		+" Modifier " +modifier);
	    	  System.out.println("\t"+flist[i].getType()+
	    			  " "+flist[i].getName());
	      }
	      System.out.println("Methods:");
	      Method mlist[] = c.getMethods();
	      for(int i = 0; i < mlist.length; i++)
	      {
	    	  mlist[i].setAccessible(true);
	        System.out.println("\t Method Name: " + mlist[i].getName()+
	        		" ParameterCount "+
	    	  mlist[i].getParameterCount()+" returnType "+mlist[i].getReturnType());
	        if(mlist[i].getParameterCount()>0)
	        {
	         Parameter[] param=mlist[i].getParameters();
	         for(Parameter p1 : param)
	         {
	        	 System.out.println("\t"+p1.getName()+" "+
	         p1.getParameterizedType().getTypeName());
	         }
	        }
	      }
	    }catch(Exception e)
	    {
	      System.out.println("Exception: " + e);
	    }
  }
}