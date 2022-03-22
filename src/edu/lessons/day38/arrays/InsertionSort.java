package edu.lessons.day38.arrays;

//Java program for implementation of Insertion Sort 
public class InsertionSort 
{
	public static void main(String[] args) {
		int[] nos= {11,23,4,56,32,43,323,76,8,54,56};
		sort(nos);
	}
/*Function to sort array using insertion sort*/
   static void sort(int arr[]) 
   { 
     int n = arr.length; 
     for (int i=1; i<n; ++i) 
     { 
        int key = arr[i]; 
        int j = i-1; 

        /* Move elements of arr[0..i-1], that are 
           greater than key, to one position ahead 
           of their current position */
        while (j>=0 && arr[j] > key) 
        { 
            arr[j+1] = arr[j]; 
            j = j-1; 
        } 
        arr[j+1] = key; 
      } 
   } 
}
