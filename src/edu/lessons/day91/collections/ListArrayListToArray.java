package edu.lessons.day91.collections;
import java.util.*;
class ListArrayListToArray {
  public static void main(String args[]) {
    ArrayList al = new ArrayList();
    al.add(new Integer(1));
    al.add(new Integer(2));
    al.add(new Integer(3));
    al.add(new Integer(4));
    System.out.println("Contents of al: " + al);
    Object data[] = al.toArray();
    int sum = 0;
    for(int i=0; i<data.length; i++)
      sum += ((Integer) data[i]).intValue();

    System.out.println("Sum is: " + sum);
  }
}
