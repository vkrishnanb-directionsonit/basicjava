package edu.lessons.day36.staticConstants;
public class Emp
{
   public static String Country="India";
   public final static String City="Chennai";// const
   public final int no;// readonly
   public static Emp mgr;
   public double MPhone;
   static
   {
	   System.out.println("Static Constructor "+Country+" "+City);
	   mgr=new Emp(111);
   }
//   static Emp(double d1) - illegal
//   {
//	   
//   }
   public Emp()
   {  
 	no=0;
 	System.out.println("Emp Object Created");
   }
   public Emp(int i)
   {  
	no=i;
	System.out.println("Emp Object Created");
   }   
   public int getNo()
   {
	 return no;
   }
   /*public void setNo(int x)
   {
		no=x;
   }*/
   
   private String name; 
   //Data encapsulation 
   public String getName()
   {
		return name;
   }
   public void setName(String s1)
   {
   	  name=s1;
   }
   
   public static String CompanyLoc;   
   public String getLocation()
   {
		return CompanyLoc;
   }
   public void setLocation(String s1)
   {
	   CompanyLoc=s1;
   }
}