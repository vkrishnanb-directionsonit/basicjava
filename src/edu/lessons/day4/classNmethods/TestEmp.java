package edu.lessons.day4.classNmethods;
public class TestEmp
{
   public static void testA()
   {
	   Emp e1=new Emp(10);
	   
	   e1.name="abcd@#$%12345";
	   
		  Emp.Address add=e1.new Address();
		  add.City="Madurai";
		  add.Country="India";
		  add.DoorNo="123456";
		  add.print();
		  e1.startWork();
		  e1=null;
		  //the reference is set to null. 
		  //Emp Object is still in memory
		  add.print();
		  
   }

}