package edu.lessons.day38.arrays;
class UneventwoD
{
	public static void main(String args[])
	{
		int uneventwod[][]=new int [4][];
		uneventwod[0]=new int[1];
		uneventwod[1]=new int[4];
		uneventwod[2]=new int[3];
		uneventwod[3]=new int[2];		
		int I,j,k=0;
		for(I=0;I<4;I++)
		{
		  for(j=0;j<uneventwod[I].length;j++)
		  {
			 uneventwod[I][j]=k;k++;
		  }
		}
		for(I=0;I<4;I++)
		{
		 for(j=0;j<uneventwod[I].length;j++)
		 {
			System.out.print(uneventwod[I][j]+ " ");
		 }
 		System.out.println();
	   }
	}	
}