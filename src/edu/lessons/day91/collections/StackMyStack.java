package edu.lessons.day91.collections;
import java.util.ArrayList;
import java.util.EmptyStackException;

interface IStack
{
	void push(Object obj);
	Object pop() throws EmptyStackException;
	//Object peek()throws EmptyStackException;
}

public class StackMyStack implements IStack {
	private ArrayList<Object> list=new ArrayList<Object>();
	public void push(Object obj)
	{
		list.add(obj);
	}
	public Object pop()throws EmptyStackException
	{
		int count=list.size();
		if(count==0)throw new EmptyStackException();
		Object obj=list.remove(count-1);
		return obj;
	}
	public String toString()
	{
		StringBuffer str=new StringBuffer(list.size());
		for(int i=0;i<list.size();i++)
			str.append(list.get(i).toString()+",");
		return str.toString();
	}
	public static void main(String args[])
	  {
	    StackMyStack st = new StackMyStack();
	    System.out.println("stack: " + st);
	    
	    try {
	    	st.push(42);
		    st.push( 66);
		    st.push(99);
		    System.out.println("============>stack: " + st);
		    System.out.println("Pop "+st.pop());
		    System.out.println("Pop "+st.pop());
		    System.out.println("Pop "+st.pop());
	    	st.pop();//ERROR
	    } catch (EmptyStackException e)
	    {
	      System.out.println("ERROR!!! empty stack "+e.getMessage());
	    }
	  }
}
