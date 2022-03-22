package edu.lessons.day36.staticConstants;
public class TestEmp
{
   public static void test()
   {
	   testingStaticBlock();
   }
   public static void m1()
   {
	   Emp e1=new Emp(10);
	   Emp e2=new Emp(11);
	   Emp e3=new Emp(100);
		/*System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());*/
		
		System.out.println(e1.getNo());
		System.out.println(e2.getNo());
		System.out.println(e3.getNo());
   }
   
   public static void m2()
   {
	String s1=Emp.City;	 //final static 
	System.out.println(s1);
	
	/*Emp.City="BGL";
	s1=Emp.City;
	System.out.println(s1);*/
	
	Emp.CompanyLoc="Madurai";
	String s2=Emp.CompanyLoc;	 //static 
	System.out.println(s2);
	
	Emp e1=new Emp(10);
	Emp e2=new Emp(11);
	Emp e3=new Emp(100);
	System.out.println(e1.City);
	System.out.println(e2.City);
	System.out.println(e3.City);
	
	System.out.println(e1.getLocation());
	System.out.println(e2.getLocation());
	System.out.println(e3.getLocation());
   }
   public static void m3()
   {
	Emp e1=new Emp(10);
	e1.setName("Ram");
	Emp e2=new Emp(11);
	e2.setName("John");
	Emp e3=new Emp(100);
	e3.setName("Sam");
	System.out.println(e1.getName());
	System.out.println(e2.getName());
	System.out.println(e3.getName());
	
	System.out.println(e1.City);
	System.out.println(e2.City);
	System.out.println(e3.City);
	Emp.CompanyLoc="Madurai";
	System.out.println(e1.getLocation());
	System.out.println(e2.getLocation());
	System.out.println(e3.getLocation());
	//System.out.println(e1.mgr.getNo());
	
   }
   public static void testingStaticBlock()
   {
	   //System.out.println(Emp.City); // constant
	   //System.out.println(Emp.Country);// Static field
//	   Emp e1=new Emp();
//	   Emp e2=new Emp();
	   System.out.println(Emp.mgr.getNo());
   }
}