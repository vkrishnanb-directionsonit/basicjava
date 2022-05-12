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
	  HashSet<String> string_hs = new HashSet<String>();
	    string_hs.add("Bee"); 
	    string_hs.add("Apple");  
	    string_hs.add("Doll");	
	    string_hs.add(null);
	    string_hs.add("Egg");
	    string_hs.add("Cinema");
	    string_hs.add("Fan");	    
	    System.out.println("Size "+string_hs.size());
	    string_hs.add("Fan");//ignore
	    string_hs.add(null);//ignore
	    System.out.println("Size "+string_hs.size());    
	    Iterator<String> set_itr = string_hs.iterator();
		 while(set_itr.hasNext())
		 {		    
		      System.out.print(set_itr.next() + "-");
		 }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void demoB()
  {
     HashSet<Emp> hs = new HashSet<Emp>();
	  Emp e1=null;
	  for(int i=0;i<10;i++)
	  {
		  e1=new Emp(i);
		  e1.Name="Emp "+i;
		  hs.add(e1);		 
	  }	  
	  System.out.println("Count "+hs.size());
	  e1 = new Emp(9);
	  hs.add(e1); // does not add duplicate object. ignore
	  System.out.println("Count "+hs.size());	  
     Iterator<Emp> itr = hs.iterator();
     while(itr.hasNext())
     {
	  Emp e2=itr.next();
      System.out.println(e2.getID() + " "+e2.Name);
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
