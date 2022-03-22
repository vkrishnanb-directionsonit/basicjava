package edu.lessons.day81.error;

public class OOMDemo {
	public static void main(String[] args)  {
		OOMDemo memoryTest = new OOMDemo();
		try
		{
			memoryTest.generateOOM();
		}catch(OutOfMemoryError err)
		{
			System.out.println();
			System.out.println("ERROR!!! "+err.getMessage());
			err.printStackTrace();
		}
		try
		{
		//	generateSOError();
		}catch(StackOverflowError err)
		{
			System.out.println();
			System.out.println("ERROR!!! "+err.getMessage());
			err.printStackTrace();
		}
	}
 
	public void generateOOM()  {
		int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
			System.out.println("Iteration " + outerIterator + " Free Mem: " 
																+ Runtime.getRuntime().freeMemory());
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			// feel memoryFillIntVar array in loop..
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: " + iteratorValue);
			//Thread.sleep(1000);
		}
	}
	
	public static void generateSOError()
	{
	  int i=0; i++;
	  System.out.println("i="+i);
	  generateSOError();
	}
}
