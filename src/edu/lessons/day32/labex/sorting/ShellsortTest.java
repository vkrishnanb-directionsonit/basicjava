package edu.lessons.day32.labex.sorting;

public class ShellsortTest  {

	private Sorting shellsort = new ShellSort();
	
	public void testSort() {
		int [] a = {5};
		
		shellsort.sort(a);
		
		System.out.println(5==a[0]);
	}

	public void testSort1() {
		int [] a = {1, 3, 2};
		
		shellsort.sort(a);
		
		System.out.println(1==a[0]);
		System.out.println(2==a[1]);
		System.out.println(3==a[2]);
	}
	
	
	public void testSort2() {
		int [] a = {1, 3, 2, 0};
		
		shellsort.sort(a);
		
		System.out.println(0==a[0]);
		System.out.println(1==a[1]);
		System.out.println(2==a[2]);
		System.out.println(3==a[3]);
	}

	public void testSort3() {
		int [] a = {1, 3, 2, 0};
		
		shellsort.sort(a);
		
		System.out.println(0==a[0]);
		System.out.println(1==a[1]);
		System.out.println(2==a[2]);
		System.out.println(3==a[3]);
	}
	
	public void testSort4() {
		int [] a = {5, 8, 3, 7, 1, 6, 2, 4};
		
		shellsort.sort(a);
		
		System.out.println(1==a[0]);
		System.out.println(2==a[1]);
		System.out.println(3==a[2]);
		System.out.println(4==a[3]);
		System.out.println(5==a[4]);
		System.out.println(6==a[5]);
		System.out.println(7==a[6]);
		System.out.println(8==a[7]);
	}
	
	/**
	 * Überprüft, ob vor dem letzten Schritt, die
	 * Reihenfolge identisch ist zur 3-Sortierung des Feldes.
	 * <pre>
	 * 5 4 3 7 1 6 2
	 * 2     5     7
	 *   1     4    
	 *     3     6
	 * 2 1 3 5 4 6 7
	 * </pre>
	 */
	public void testSort5() {
		ShellSort shellsort = new ShellSort();
		
		int [] a = {5, 4, 3, 7, 1, 6, 2};
		
		shellsort.sort(a, 2);
	
		System.out.println(2==a[0]);
		System.out.println(1==a[1]);
		System.out.println(3==a[2]);
		System.out.println(5==a[3]);
		System.out.println(4==a[4]);
		System.out.println(6==a[5]);
		System.out.println(7== a[6]);
	}
}
