package edu.lessons.day91.collections;
import java.util.HashSet;
import java.util.Iterator;

class SetHashSetDemo
{
  public static void main(String args[])
  {
    demoA();
  }
  public static void demoA()
  {
	    HashSet<String> hs = new HashSet<String>();
	    hs.add("Bee"); 
	    hs.add("Apple");  
	    hs.add("Doll");	
	    hs.add(null);
	    hs.add("Egg");
	    hs.add("Cinema");
	    hs.add("Fan");	    
	    System.out.println("Size "+hs.size());
	    hs.add("Fan");//ignore
	    hs.add(null);//ignore
	    System.out.println("Size "+hs.size());
	    System.out.println(hs);
	    Iterator<String> itr = hs.iterator();
		 while(itr.hasNext())
		 {
		      Object element = itr.next();
		      System.out.println(element + "-");
		 }
		System.out.println();
  }
  
  public static void demoB()
  {
     HashSet<Employee> hs = new HashSet<Employee>();
	  Employee e1=null;
	  for(int i=0;i<10;i++)
	  {
		  e1=new Employee();
		  e1.Id =i;
		  e1.Name="Emp "+i;
		  hs.add(e1);		 
	  }
	  
	  System.out.println("Count "+hs.size());
	  hs.add(e1);
	  System.out.println("Count "+hs.size());
	  
     Iterator itr = hs.iterator();
     while(itr.hasNext())
     {
      Object element = itr.next();
	  Employee e2=(Employee)element;
      System.out.println(e2.Id + " "+e2.Name+" "+e2.hashCode());
     }
     
     System.out.println("======");
     itr = hs.iterator();
     Object obj = itr.next();
	 Employee e3=(Employee)obj;
	 System.out.println(e3.Id + " "+e3.Name+" "+e3.hashCode());
	 e3.Id=5; e3.Name="Emp 5";
	 
	 e1=e3;
	 
	 System.out.println("*******");
	 itr = hs.iterator();
     while(itr.hasNext())
     {
      Object element = itr.next();
	  Employee e2=(Employee)element;
      System.out.println(e2.Id + " "+e2.Name+" "+e2.hashCode());
     }
  }
  public static void demoC()
  {
     HashSet hs = new HashSet();
	  Emp e1=null;
	  for(int i=0;i<10;i++)
	  {
		  e1=new Emp(i);
		  e1.Name="Emp "+i;
		  hs.add(e1);
		  System.out.println(e1.getID());
	  }
	  System.out.println(hs);
     Iterator itr = hs.iterator();
     while(itr.hasNext())
     {
      Object element = itr.next();
		Emp e2=(Emp)element;
      System.out.println(e2.getID() + " ");
     }
  }
public static void demoD()
{
	Employee e1=new Employee();
	e1.Id=100;
	Employee e2=new Employee();
	e2.Id=100;
//	e1==e2;
//	e1.equals(e2);
}
}
