package edu.lessons.day32.labex.sorting;


public class BottomUpMergesortTest {
	 
	private Sorting mergesort = new BottomUpMergesort();
	
	public void testSort() {
		int [] a = {5};
		
		mergesort.sort(a);
		
		System.out.println(5== a[0]);
	}

	public void testSort1() {
		int [] a = {2, 1};
		
		mergesort.sort(a);
		
		System.out.println(1== a[0]);
		System.out.println(2==a[1]);
	}
	
	
	public void testSort2() {
		int [] a = {1, 3, 2, 0};
		
		mergesort.sort(a);
		
		System.out.println(0== a[0]);
		System.out.println(1== a[1]);
		System.out.println(2== a[2]);
		System.out.println(3== a[3]);
	}

	public void testSort3() {
		int [] a = {1, 3, 2, 0};
		
		mergesort.sort(a);
		
		System.out.println(0== a[0]);
		System.out.println(1== a[1]);
		System.out.println(2== a[2]);
		System.out.println(3== a[3]);
	}
	
	public void testSort4() {
		int [] a = {5, 8, 3, 7, 1, 6, 2, 4};
		
		mergesort.sort(a);
		
		System.out.println(1== a[0]);
		System.out.println(2== a[1]);
		System.out.println(3== a[2]);
		System.out.println(4== a[3]);
		System.out.println(5== a[4]);
		System.out.println(6== a[5]);
		System.out.println(7== a[6]);
		System.out.println(8== a[7]);
	}
	
	public void testSort5() {
		int [] a = {5, 4, 3, 7, 1, 6, 2};
		
		mergesort.sort(a);
		
		System.out.println(1== a[0]);
		System.out.println(2== a[1]);
		System.out.println(3== a[2]);
		System.out.println(4== a[3]);
		System.out.println(5== a[4]);
		System.out.println(6== a[5]);
		System.out.println(7== a[6]);
	}
}
