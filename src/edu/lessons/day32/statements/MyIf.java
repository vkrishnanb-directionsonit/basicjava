package edu.lessons.day32.statements;

public class MyIf {
	boolean b;
	public static void test(){
	 MyIf mi = new MyIf();
	}
	MyIf()
	{
		/* Compilation and run with no output */
	    boolean c = false;
	    if(c=false){
	       System.out.println("The value of c is"+c);
	      }
	    

        if(b){
            System.out.println("The value of b was true");
        }
        else{
            System.out.println("The value of b was false");
        }
    }
}