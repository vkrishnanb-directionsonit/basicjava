package edu.lessons.day91.collections;
import java.util.*;
class SetTreeSetDemo {
  public static void main(String args[]) {
	  demoB();
	  
  }
  public static void demoA()
  {
	    TreeSet<String> ts = new TreeSet<String>();
			ts.add("Cut");  
			ts.add("fun");		
			ts.add("Assam");
			ts.add("Ball");  
			ts.add("dog");		
			ts.add("Aag");		
			ts.add("AAg");		
			ts.add("Event");
			ts.add("Fan");
			//ts.add(null);
			ts.add("Delhi");  
			ts.add("carrot");	
			ts.add("Ball"); 
			ts.add("apple");
			ts.add("boy");	
			ts.add("egg");		
			ts.add("Fool");
	    System.out.println("Size "+ts.size());
	    Iterator<String> itr = ts.iterator();
		 while(itr.hasNext())
		 {
		      System.out.println(itr.next() );
		 }
  }
  
  
  public static void demoB()
  {
	  
     TreeSet<Employee> hs = new TreeSet<Employee>();
	  Employee e1=null;
	  for(int i=0;i<10;i++)
	  {
		  e1=new Employee((int)Math.round(Math.random()*100));
		  e1.Name="Emp "+i;
		  hs.add(e1);
		  System.out.println(e1.Id);
	  }
	  System.out.println(hs);
     Iterator<Employee> itr = hs.iterator();
     while(itr.hasNext())
     {
      Object element = itr.next();
		Employee e2=(Employee)element;
      System.out.println(e2.Id + " ");
     }
  }

}
