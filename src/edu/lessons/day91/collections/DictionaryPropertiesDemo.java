package edu.lessons.day91.collections;
import java.util.Properties;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class DictionaryPropertiesDemo
{
  public static void main(String args[])
  {
    Properties prop = new Properties();
		prop.put("e1","EmployeeA");
		prop.put("e2","EmployeeB");
		prop.put("e3","EmployeeC");
		prop.put("e4","EmployeeD");
		prop.put("e5","EmployeeE");
		prop.put("e6","EmployeeF");
		prop.put("e7","EmployeeG");
      System.out.println(prop);
      Set set = prop.entrySet();
     Iterator i = set.iterator();
	  while(i.hasNext())
	  {
		  Map.Entry me = (Map.Entry)i.next();
		  System.out.print(me.getKey() + ": ");
		  System.out.println(me.getValue());
	  }
  }
}
