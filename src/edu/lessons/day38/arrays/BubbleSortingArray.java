package edu.lessons.day38.arrays;
public class BubbleSortingArray {
	public static void testingBubbleSort() {
		int[] nos= {11,23,4,56,32,43,323,76,8,54,56};
		System.out.println("Original Values Before ");
		ArraysDemo.display(nos);
		int count=nos.length;
		int temp=0;
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<(count-1);j++)
			{
				if(nos[j+1]<nos[j])
				{
					temp=nos[j];
					nos[j]=nos[j+1];
					nos[j+1]=temp;
					temp=0;
				}
			}
		}
		System.out.println("Values after SORT");
		ArraysDemo.display(nos);
		
	}
	
}
