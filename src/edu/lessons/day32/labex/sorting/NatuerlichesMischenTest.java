package edu.lessons.day32.labex.sorting;

public class NatuerlichesMischenTest  {

	private Sorting naturalMergeSort = new NaturalMergeSort();
	
	public void testSort() {
		int [] a = {5};
		
		naturalMergeSort.sort(a);
		
		System.out.println(5==a[0]);
	}

	public void testSort1() {
		int [] a = {2, 1};
		
		naturalMergeSort.sort(a);
		
		System.out.println(1==a[0]);
		System.out.println(2==a[1]);
	}
	
	
	public void testSort2() {
		int [] a = {1, 3, 2, 0};
		
		naturalMergeSort.sort(a);
		
		System.out.println(0==a[0]);
		System.out.println(1==a[1]);
		System.out.println(2==a[2]);
		System.out.println(3==a[3]);
	}

	public void testSort3() {
		int [] a = {1, 3, 2, 0};
		
		naturalMergeSort.sort(a);
		
		System.out.println(0==a[0]);
		System.out.println(1==a[1]);
		System.out.println(2==a[2]);
		System.out.println(3==a[3]);
	}
	
	public void testSort4() {
		int [] a = {5, 8, 3, 7, 1, 6, 2, 4};
		
		naturalMergeSort.sort(a);
		
		System.out.println(1==a[0]);
		System.out.println(2==a[1]);
		System.out.println(3==a[2]);
		System.out.println(4==a[3]);
		System.out.println(5==a[4]);
		System.out.println(6==a[5]);
		System.out.println(7==a[6]);
		System.out.println(8== a[7]);
	}
	
	/**
	 * Test mit einem Feld, dessen Länge keine 2er-Potenz ist.
	 */
	public void testSort5() {
		int [] a = {5, 4, 3, 7, 1, 6, 2};
		
		naturalMergeSort.sort(a);
		
		System.out.println(1== a[0]);
		System.out.println(2==a[1]);
		System.out.println(3==a[2]);
		System.out.println(4==a[3]);
		System.out.println(5==a[4]);
		System.out.println(6==a[5]);
		System.out.println(7== a[6]);
	}
	
	public void testSort6() {
		int [] a = new int[1000000];
		a[6] = 2;
		a[700] = 1;
		a[89763] = 3;
		
		naturalMergeSort.sort(a);
		
		for (int i = 0; i < a.length - 3; i++) {
			System.out.println(0== a[i]);
		}
		System.out.println(1== a[a.length - 3]);
		System.out.println(2== a[a.length - 2]);
		System.out.println(3== a[a.length - 1]);
	}
}
