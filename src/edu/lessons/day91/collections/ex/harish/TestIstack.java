package edu.lessons.day91.collections.ex.harish;

public class TestIstack {
	public static void main(String[] args) 
	{
		MyStack theStack = new MyStack(); 

		Object a = 10;
		String b = "SJDSHD";
		Object c = 10.000;
		
	    theStack.push(a);
	    theStack.push(b);
	    theStack.push(c);
	   
	 	Object valuePeek = theStack.peek();
	          System.out.println("The peek : "+valuePeek);
	          System.out.println(" ");
	          
	          int size = theStack.arraySize();
	          
	          for (int i=0;i<size; i++)
	          {
	        	  Object popValue = theStack.pop();
	  	    		System.out.println("Pop Value: "+popValue);
	          }
	          
	         
	     
	}
}
