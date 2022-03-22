package edu.lessons.day91.collections;
import java.util.EmptyStackException;
import  java.util.Stack;

class StackDemo 
{
  static void doPush(Stack st, int a)
  {
    st.push(new Integer(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }
  static void doPop(Stack st)
  {
		 System.out.print("pop -> ");
		 Integer a = (Integer) st.pop();
		 System.out.println(a);
		 System.out.println("stack: " + st);
  }
  public static void main(String args[])
  {
    Stack st = new Stack();
    System.out.println("stack: " + st);
    doPush(st, 42);
    doPush(st, 66);
    doPush(st, 99);
    doPop(st);
    doPop(st);
    doPop(st);
    try {
      doPop(st);
    } catch (EmptyStackException e)
    {
      System.out.println("empty stack "+e.getMessage());
    }
  }
}