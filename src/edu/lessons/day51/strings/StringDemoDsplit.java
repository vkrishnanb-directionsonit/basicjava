package edu.lessons.day51.strings;

//a=100;b=50;c=a+b;print c;

public class StringDemoDsplit
{
	public static void main(String args[])
	{
		tokenizeWeekdays();
	}
	public static void tokenizeWeekdays()
	{
		String days="sun;mon;tue;wed;thu;fri;sat";
		String[] data=days.split(";");
		int count=data.length;
		for(int i=0;i<count;i++)
			System.out.println(data[i]);
	}
	public static void solveTheequation()
	{
		 String s1="a=100;b=50;c=a%b;print c;";
		   
		   String[] data=s1.split(";");
		   int a=0;  int b=0;    int c=0;
		   String[] value=data[0].split("=");//a=100
		   a=Integer.parseInt(value[1]);//parsing 100
		   System.out.println("a= "+a);
		   value=data[1].split("=");//b=50
			b=Integer.parseInt(value[1]);//parsing 50
			System.out.println("b= "+b);
	      value=data[2].split("=");//c=a+b
	      String op=value[1].substring(1,2);//get operator from a+b
	      System.out.println("Operator "+op);
	      if(op.equals("+"))
		   	c=a+b;
	      else if(op.equals("-"))
		   	c=a-b;
	      else if(op.equals("*"))
		   	c=a*b;
	      else if(op.equals("/"))
		   	c=a/b;
	      else if(op.equals("%"))
	  	   	c=a%b;
	      else if(op.equals("^"))
	  	   	c=a^b;
	      System.out.println("c= "+c);
//
	      switch ( op.charAt(0))
	      {
	      case '+':
	      System.out.println(a+b);
	      break;
	      case '-':
	      System.out.println(a-b);
	      break;
	      case '/':
	      System.out.println(a/b);
	      break;
	      case '*':
	      System.out.println(a*b);
	      default :
	      break;
	        
	      }
		   

	}
}