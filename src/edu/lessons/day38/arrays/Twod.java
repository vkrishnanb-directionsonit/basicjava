package edu.lessons.day38.arrays;
class Twod
{
   public static void main(String args[])
   {
	  // creatingTwoDintArray();
	   totalandAverageMarksTwoDintArray();
   }
   public static void creatingTwoDintArray()
   {
	   int twod[][]=new int [4][5];//4 rows 5 col
	   int I,j,k=0;
	   for(I=0;I<4;I++)
	   {
			for(j=0;j<5;j++)
			{
				twod[I][j]=k;
				k++;
			}
		}
		for(I=0;I<4;I++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(twod[I][j]+" ");
			}
			System.out.println();
		}
   }
   
   public static void totalandAverageMarksTwoDintArray()
   {
	   int marks[][]=new int[][]
			   		{
					   {82, 38, 45,77,55,0,0},
					   {95,99,92,90,85,0,0},
					   {85,100,91,92,93,0,0},
					   {75,55,92,74,66,0,0},
					   {85,75,58,62,75,0,0}
					};//5 rows 7 col
		int i,j,sum=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				sum+=marks[i][j];
			}
			marks[i][5]=sum;
			marks[i][6]=sum/5;
			sum=0;
		}
		for(j=0;j<5;j++)
		{
			System.out.print("Sub"+(j+1)+" ");
		}
		System.out.print("Total ");
		System.out.println("Avg");		
		System.out.println("-------------------------------------");
		for(i=0;i<4;i++)
		{
			for(j=0;j<7;j++)
			{
				System.out.print(marks[i][j]+"   ");
			}
			System.out.println();
		}
   }
   public static void fewOtherWaysOfCreatingTwoDintArray()
   {
		int []a[] = new int[4][4];
		int a1[][] = new int[4][4];
		//int a2[][] = new int[][4];
		int []a3[] = new int[4][];
		int[][] a4 = new int[4][4];
		int [ ] [ ] a5 = new int[4][4];
		//----
		int []i[] = {{1,2}, {1}, {}, {1,2,3}};
		//int j[]= new int[2]{1, 2};
		int k[][] = new int[][]{{1,2,3}, {4,5,6}};
		int l[][] = {{1, 2}, new int[2]};	
	}
}