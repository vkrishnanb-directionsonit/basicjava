package edu.lessons.day91.collections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

class ListArrayListDemo
{
  public static void main(String args[])
  {
	 
  }
  public static void m1()
  {
	   //ArrayList al=new ArrayList();//capacity is Zero
	    ArrayList<Emp> al = new ArrayList<Emp>(30);
	    System.out.println("Initial size of al: " +al.size());//0
	    System.out.println("Capacity "+getArrayListCapacity(al));//0
	    try
	    {
	    	for(int i = 0; i < 5; i++)
	        {
	    		Emp e1=new Emp(i);
	    		e1.Name="Emp"+i;
	        	al.add(e1);
	    	}
	    System.out.println("Size of al after additions: " +al.size());//10
	   System.out.println("Capacity "+getArrayListCapacity(al));//>=10
	    
	    Emp e2=(Emp)al.get(2);
	    al.add(e2);//10th index --- 11th Object
	    Emp e3=(Emp)al.get(5); 
	    al.add(e3);//11th Index -- 12th Object
	    System.out.println("Size of al after additions: " +al.size());//12
	    System.out.println("Capacity "+getArrayListCapacity(al));//>=12
	   
	    Emp e110=(Emp)al.get(10);
	    Emp e111=(Emp)al.get(11);
	    Emp e101=(Emp)al.get(1);
	    
	    al.add(new Emp(2));//12th
	    
	    System.out.println(e2==e110);//true
	    System.out.println(e3==e111);//true
	    System.out.println(e101==e2);//false
	    
	    System.out.println("Freq of [Emp id-2] in ArrayList- "+Collections.frequency(al, e3));
	    
	    Iterator<Emp> itr = al.iterator();
//	    itr.remove();
//	    System.out.println("Size of al after Iterator.remove: " +al.size());//12
	    while(itr.hasNext()) {
	      Object element = itr.next();//return current object
	      Emp e1=(Emp)element;
	      System.out.println("\t"+e1.getID() + " "+e1.Name);
	    }

	    System.out.println("Capacity B4 trimToSize  "+getArrayListCapacity(al));
	    al.trimToSize();// will reduce the capacity
	    System.out.println("Capacity after trimToSize "+getArrayListCapacity(al));
	   }catch(Exception err)
	   {
			System.out.println("ERROR!!! "+err.getMessage());
		}
  }
  public static void arrayListOfEmp()
  {
	// Size is Zero
	// ArrayList<Emp> empArrayList = new ArrayList<Emp>;
    ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
    System.out.println("Initial size of empArrayList: " +empArrayList.size());//0
    try
    {
    	for(int i = 0; i < 5; i++)
        {
    		Emp e1=new Emp(i);
    		e1.Name="Emp"+i;
        	empArrayList.add(e1);
    	}
	    System.out.println("Size of empArrayList after additions: " +empArrayList.size());//5
	    
	    Emp e3=(Emp)empArrayList.get(2);	// get the 3rd Emp  
	    empArrayList.add(e3); // adds the 3rd again - 6th Emp
	    Emp e6=(Emp)empArrayList.get(5); // get the 6th Emp
	    empArrayList.add(e6); // adds the 3rd again - 7th Emp
	    System.out.println("Size of empArrayList after additions: " +empArrayList.size());// 7
	    // e3 == e6 == e7 emp.id is the same for these three
	    Emp e61=(Emp)empArrayList.get(5); // get the 6th Emp
	    Emp e7=(Emp)empArrayList.get(6); // get the 7th Emp
	    Emp e101=(Emp)empArrayList.get(1); // get the 2nd Emp
	    
	    empArrayList.add(new Emp(2)); // adds a new Emp with Emp.id=2
	    // e3 == e6 == e7 == e8 emp.id is the same for these four
	    System.out.println(e3==e61); // true
	    System.out.println(e6==e7); // true
	    System.out.println(e101==e3); // false
	    
	    System.out.println("Freq of [Emp id=2] in ArrayList- "+Collections.frequency(empArrayList, e3));
	   
	    Iterator<Emp> itr = empArrayList.iterator();
	    while(itr.hasNext()) {
	      Object element = itr.next();// return current object
	      Emp e1=(Emp)element;
	      System.out.println("\t"+e1.getID() + " "+e1.Name);
	    }
	    // empArrayList.set(2,"X");// ERROR
    }catch(Exception err)
    {
		System.out.println("ERROR!!! "+err.getMessage());
	}
  }
  public static void usingStringArrayList()
  {
	  ArrayList<String> stringArrayList=new ArrayList<String>();
	  System.out.println("Initial size of stringArrayList: " +stringArrayList.size());
	  try
	  {
	    stringArrayList.add("Car");
	    stringArrayList.add("Auto");
	    stringArrayList.add("Egg");
	    stringArrayList.add("Box");
	    stringArrayList.add("Doll");
	    stringArrayList.add("Fan");
	    // will insert a new value , 
	    // pushing the current value of index 1 to the next index
	    stringArrayList.add(1,"Animal");
	    stringArrayList.add("Girl");
	    stringArrayList.add("Fan");
	    System.out.println("Size of stringArrayList after additions: " +stringArrayList.size());
	    System.out.println("Contents of stringArrayList: " + stringArrayList);
	    // will replace the value in index 2	     
	    stringArrayList.set(2,"xenas");	         
	    System.out.println("After Set(2): " + stringArrayList);
	    System.out.println("Last Index of: 'Fan' " +stringArrayList.lastIndexOf("Fan"));
	    // remove the first instance of 'Fan'
	    stringArrayList.remove("Fan");
	    stringArrayList.remove(2);
	    System.out.println("Size after remove(2): " +stringArrayList.size());
	    System.out.println("Contents of stringArrayList: " + stringArrayList);
	    // will reduce the capacity 
	    stringArrayList.trimToSize();
	   }catch(Exception err)
	   {
			System.out.println(err.getMessage());
	   }
  }
  
  static final Field field;
  static {
      try {
          field = ArrayList.class.getDeclaredField("elementData");
          field.setAccessible(true);
      } catch (Exception e) {
          throw new ExceptionInInitializerError(e);
      }
  }
  @SuppressWarnings("unchecked")
  public static <T> int getArrayListCapacity(ArrayList<T> arrayList) {
      try {
    	  Object[] elementData = (Object[]) field.get(arrayList);
          return elementData.length;
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }
  
 /* @SuppressWarnings("unchecked")
  public static <E> int getArrayListCapacity(ArrayList<E> arrayList) {
      try {
          final E[] elementData = (E[]) field.get(arrayList);
          return elementData.length;
      } catch (Exception e) {
          throw new RuntimeException(e);
      }

  }
*/
  }