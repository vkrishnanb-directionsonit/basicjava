package edu.lessons.day91.collections;
import java.util.*;

class ListIteratorDemo {
  public static void main(String args[]) {
    // create an array list
    ArrayList al = new ArrayList();
    
    // add elements to the array list
    String s1="B";
    al.add("C");
    al.add(s1);
    al.add("A");
    al.add("E");
    al.add(s1);
    al.add("D");
    al.add("F");
    al.add(s1);
    
    // use iterator to display contents of al
    System.out.print("Original contents of al: ");
    
    Iterator itr = al.iterator();
    while(itr.hasNext()) {
      Object element = itr.next();//return current object
     // Emp e1=(Emp)itr.next();
      System.out.print(element + " ");
    }
    System.out.println();
    System.out.println("Freq of [B] in ArrayList- "+Collections.frequency(al, "B"));
    
    // modify objects being iterated
    ListIterator litr = al.listIterator(); 
    while(litr.hasNext()) 
    {
      Object element = litr.next();
      litr.set(element + "+");
    }

    System.out.print("Modified contents of al: ");
    itr = al.iterator(); 
    while(itr.hasNext()) {
      Object element = itr.next();
      System.out.print(element + " ");
    }
    System.out.println();

    // now, display the list backwards
    System.out.print("Modified list backwards: ");
    while(litr.hasPrevious()) {
      Object element = litr.previous();
      System.out.print(element + " ");
    }
    System.out.println();    
  }
}
