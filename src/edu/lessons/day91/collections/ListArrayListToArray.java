package edu.lessons.day91.collections;
import java.util.ArrayList;
import java.util.Iterator;
class ListArrayListToArray {
  public static void main(String args[]) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1); // boxing - will use wrapper class
    al.add(2);
    al.add(3);
    al.add(4);
    System.out.println("Contents of al: " + al);
//    Object data[] = al.toArray();
    int sum = 0;
//    for(int i=0; i<data.length; i++)
//      sum += ((Integer) data[i]).intValue();
    Iterator<Integer> intIterator=al.iterator();
    while(intIterator.hasNext())
    {
    	sum +=intIterator.next();
    }
    System.out.println("Sum is: " + sum);
  }
}
