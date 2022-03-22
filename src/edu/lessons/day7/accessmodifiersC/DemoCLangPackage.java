package edu.lessons.day7.accessmodifiersC;
//package java.lang; Prohibited package name
public class DemoCLangPackage
{
   public static void main(String[] args)
   {
		m1();
   }
   public static void m1()
   {
	        int x=0;
	        int y=0;
	        int z=0;

			   x=100;
			   z=x/y;
			   System.out.println("Result "+z);

   }
}