package edu.lessons.day4.innerClass;
public class TestEmp
{
   public static void main(String[] args)
   {
	   Emp e1=new Emp(10); // id=10;
//	   Emp.Address add1=new Emp.Address();
		  Emp.Address add=e1.new Address();		  
		  add.City="Madurai";
		  add.Country="India";
		  add.DoorNo="123456";
		  add.print();
	   e1.startWork();
	   e1=null;//the reference is set to null.
	   //Emp Object is still in mem
	   System.out.println("After e1=null");
	   add.print();	
		  
//		  Runtime rt=Runtime.getRuntime();//factorymethod
//		     rt.gc();
//		     System.out.println("After GC");
//		     add.print();	
		  e1=add.getOuterObject();
		  System.out.println("HashCode="+e1.hashCode());
   }
}
