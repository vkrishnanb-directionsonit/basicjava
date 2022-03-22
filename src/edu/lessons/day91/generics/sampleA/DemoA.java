package edu.lessons.day91.generics.sampleA;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoA
{
  public static void main(String[] args)
  {
	  //List<T>
      List<Number> nums = new ArrayList<Number>();
	  nums.add(2);
	  nums.add(3.14);
	  //nums.add(new Object());
	  //nums.add("Hello");
	  System.out.println("Size "+nums.size());
	   Iterator itr = nums.iterator();
	  while(itr.hasNext())
	  {
		Object element = itr.next();
		System.out.println(element + " ");
     }
  }
  public static void testingListNumbers()
  {
	//List<T>
      List<Number> nums = new ArrayList<Number>();
	  nums.add(2);
	  nums.add(3.14);
	  //nums.add(new Object());
	  //nums.add("Hello");
	  System.out.println("Size "+nums.size());
	   Iterator<Number> itr = nums.iterator();
	  while(itr.hasNext())
	  {
		Object element = itr.next();
		System.out.println(element + " ");
     }
  }
  public static void testingListInteger()
  {
	//List<T>
      List<Integer> nums = new ArrayList<Integer>();
	  nums.add(2);
	  nums.add(30);
	
	  System.out.println("Size "+nums.size());
	   Iterator itr = nums.iterator();
	  while(itr.hasNext())
	  {
		Object element = itr.next();
		System.out.println(element + " ");
     }
  }
}