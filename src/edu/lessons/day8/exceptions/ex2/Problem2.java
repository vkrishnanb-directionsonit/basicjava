package edu.lessons.day8.exceptions.ex2;


public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void utils() throws FileNotFoundException, ApplicationException
	{
		try {
			System.out.println("Try1");
			try {
				System.out.println("Try2");
				try {
					System.out.println("Try3");		
					try 
					{
						System.out.println("Try4");
						throw new Exception();
					}
					catch(Exception ex0)
					{
					     throw new ApplicationException("ex0");
					}// end of try4
				}//try 3
				catch(ApplicationException ex1)
				{
				   throw new IndexOutOfBoundsException("ex1");
				}
				catch(Exception ex2)
				{
				   throw new Exception("ex2");
				}// end of try3
			}// try 2
			catch(ApplicationException ex3)
			{
			   throw new FileNotFoundException("ex 1");
			}
			catch(IndexOutOfBoundsException ex4)
			{
			   throw new NullPointerException("ex4");
			}
			catch(NullPointerException ex41)
			{
			   throw new NullPointerException("ex41");
			}
			catch(Exception ex5)
			{
			   throw new Exception("ex 5");
			}//end of try 2
		}//try 1
		catch(ApplicationException ex6)
		{
		   throw new ApplicationException("ex6");
		}
		catch(FileNotFoundException ex7)
		{
			throw new FileNotFoundException("ex 7");
		}
		catch(NullPointerException ex8)
		{
			throw new NullPointerException("ex8");
		}
		catch(Exception ex9)
		{
			throw new NullPointerException("ex9");
		}
	}
 }
