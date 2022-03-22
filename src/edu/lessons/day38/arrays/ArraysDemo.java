package edu.lessons.day38.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class ArraysDemo
{
  static int incrementValue=10;
  public static void main(String args[]) 
  {
	  char c='A';
	  int firstvalue =100;
	  
	  Character secondchar='B';
	  Integer secondNumber = 200;
	  
	  //List<int> listofNumber=new List<int>();
	  List<Integer> listofNumber=new ArrayList<Integer>();
	  listofNumber.add(10000); // Auto Boxing 
	  
	  int result=(int)listofNumber.get(0); // AUto UnBoxing
  }
  public static void creatingMonthArray()
  {
	  int month[] = new int[12];
	  int lengthofmontharray = month.length; // 12
	  System.out.println("Array Length is "+lengthofmontharray);
	  for(int i=0;i<lengthofmontharray;i++)
	  {
		  System.out.print(i+"-"+month[i]+",");
	  }
	  System.out.println();
	  month[1]=31;
	  for(int i=0;i<lengthofmontharray;i++)
	  {
		  System.out.print(i+"-"+month[i]+",");
	  }
	  System.out.println();
	  try
	  {
		  month[12]=31;
	  }catch(ArrayIndexOutOfBoundsException e)
	  {
		  System.out.println("ERROR!!! "+e.getMessage());
	  }
  }
  
  public static void creatingMonthArrayAgain()
  {
	  int month[]= {31,28,31,30,31,30,31,31};
	  int lengthofmontharray = month.length; // 8
	  System.out.println("Array Length is "+lengthofmontharray);
	  for(int i=0;i<lengthofmontharray;i++)
	  {
		  System.out.print(i+"-"+month[i]+",");
	  }
	  System.out.println();	  
  }
  
  public static void workingwithTheArraysClass()
  {
	  int numberArray[] = new int[10];
      for(int i = 0; i < 10; i++)  numberArray[i] = -3* i;
	    
	    System.out.println("Original contents: ");
	    display(numberArray);    
	    
	    Arrays.sort(numberArray);
	    System.out.println("Sorted: ");  
	    display(numberArray);
	   
	    Arrays.fill(numberArray, 2, 6, -1);//from index 2 to index 5
	    System.out.println("After fill(): "); 
	    display(numberArray);
	   
	    System.out.println("B4Sort -- The value -9 is at location ");
	    int index = Arrays.binarySearch(numberArray, -9);
	    System.out.println(index);//wrong value
	   
	    Arrays.sort(numberArray);
	    System.out.println("After sorting:"); 
	    display(numberArray);
	    System.out.println("After Sort -- The value -9 is at location ");
	    index = Arrays.binarySearch(numberArray, -9);
	    System.out.println(index);
	   
  }
  public static void workingWithCharArray() 
  {
	String s1="Today is a very hot day";
	char[] data=s1.toCharArray();
	int count=data.length;
	System.out.println("Array length "+count);
	for(int i=0;i<count;i++)
	{
		System.out.println(data[i]+" "+(int)data[i]);
	}
  }
  static void display(int data[])
  {
	Class<?> c=data.getClass().getComponentType();
	System.out.println("Array of Type "+c.getName());
	int lengthofthearray = data.length; 
	System.out.println("Array Length is "+lengthofthearray);
	
    for(int i = 0; i < lengthofthearray; i++)
    {  
    	System.out.print(data[i] + " ");  
    }
    System.out.println();
  }
  
  static void display(Object data[])
  {
	Class<?> c=data.getClass().getComponentType();
	System.out.println("Array of "+c.getName());
	int lengthofthearray = data.length; 
	System.out.println("Array Length is "+lengthofthearray);
	
    for(int i = 0; i < lengthofthearray; i++)
    {  
    	System.out.print(data[i] + " ");  
    }
    System.out.println();
  }
  public static void increasingTheArraySizeUsingCopyOf()
  {
	  int currentSize=15;
	  int currentIndex=0;
	  
	  int[] dataA= new int[currentSize];
	  
	  for(int i=0;i<currentSize;i++)
	  {
		  dataA[i]=(int)(Math.random()*100);
		  currentIndex++;
	  }
	  // currentIndex will be 15 now
	  System.out.println("Length "+dataA.length);
	  System.out.print("[");
	  for(int i=0;i<currentSize;i++)
	  {
		  System.out.print(dataA[i]+",");
	  }
	  System.out.println("]");
	  
	  int n=currentIndex;//15
	  int newSize=n+incrementValue;
	  for(int i=n;i<newSize;i++)
	  {
		  if(currentIndex==(currentSize)) 
		  {
			  dataA=Arrays.copyOf(dataA, newSize);
			  //dataA=increaseArraySize(dataA);
			  currentSize=dataA.length;
		  }
		  dataA[i]=(int)(Math.random()*100);
		  currentIndex++;
	  }
	  
	  System.out.println("Length "+dataA.length);
	  System.out.print("[");
	  for(int i=0;i<currentSize;i++)
	  {
		  System.out.print(dataA[i]+",");
	  }
	  System.out.println("]");
  }
  public static int[] increaseArraySize(int[] data)
	{
		int len=data.length;
		int newlen =len+incrementValue;
		int[] tempArray=new int[newlen];
		for(int i=0;i<len;i++)
		{
		  tempArray[i]=data[i];
		}
		return tempArray;
	}
  
}
