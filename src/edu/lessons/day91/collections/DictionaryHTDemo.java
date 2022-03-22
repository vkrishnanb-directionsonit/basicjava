package edu.lessons.day91.collections;
import java.util.Hashtable;

public class DictionaryHTDemo
{
  public static void main(String args[])
  {
	  Hashtable ht=new Hashtable();
	  ht.put("Key1",100); // Autoboxing
	  ht.put("Key2","Hello");
	  Emp e1=new Emp(1);
	  ht.put("e1",e1);
	  //adding a null Object to the hashtable.
	 // Object obj=null;
	 // ht.put("Key3",obj);
	 System.out.println(ht);
	 if(ht.containsKey("e1"))
	  {
		  Emp e2=(Emp)ht.get("e1");
		  System.out.println("EmpID="+e2.getID());
	  }
	  //2 objects with the same key.
	  Emp e3=new Emp(3);
	  ht.put("e1",e3);
	  System.out.println(ht);
   // 2 keys for the same Object.
    ht.put("e2",e3);
    System.out.println(ht);
  }
}