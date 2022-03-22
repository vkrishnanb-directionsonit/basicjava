package edu.lessons.day8.exceptions.ex2;

class A
{
     public static void m1()
     {
	     System.out.println("A- Before Try");
	     try
	     {
		    System.out.println("B - Inside Try");
		    System.exit(0); // finally will not run now
		    //return; // finally will run
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("C - Inside Catch");
	     }
	     finally
	     {
	    	 System.out.println("D - Inside Finally");
	     }
     }
     public static void m2()
     {
    	 System.out.println("A- Before Try");
	     //return; //below code becomes unreachable 
	     try
	     {
		     System.out.println("B  - Inside Try");
		    return;
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("C - Inside Catch");
	     }
	     finally
	     {
	    	 System.out.println("D - Inside Finally");
	     }
     }
     public static void m3()
     {
    	 //m4();
	     try
	     {
		     m4();
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("Inside Catch "+e.getMessage());
	    	 Throwable t1=e.getCause();
	    	 System.out.println("Cause "+t1.getMessage());
	     }
     }
     public static void m4() throws Exception
     {
    	 Exception e1=new Exception("Error 1");
    	 Exception e2 = new Exception("Error 2",e1);
    	 throw e2;
     }
} 