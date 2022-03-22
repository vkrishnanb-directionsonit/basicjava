package edu.lessons.day2.exercise;

import java.util.Random;
import java.util.Scanner;

public class AssignmentAnswersA {
	//VijaySarathy 11 Dec 2019
	/*
	 * Solution#1: 
	 * Solve the equation 2x2 + x + 5 for all numbers 
	 * between 5 and 10 for x.
	 * 
	 */	
	public static void equation()
	{
        for(int i =5;i<=10;i++)
        {
            int z = (2*2) + i + 5;
            System.out.println("The equation result is "+ z);
        }
	}
	/*
	*	2
	*	Write a program to Generate a Random Number
	*	in a given range of numbers (1 to 100) 
	*/
	public static void randomnum()
	{
		int num1;
		//create objects
		Scanner SC = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Please enter number between 1 to 100: ");
		num1=SC.nextInt();
		if (num1 >1 && num1 <=100) {
			int rand1 = rand.nextInt(num1);
			System.out.println("The Random Number is "+ rand1);
		}else
			System.out.println("The Number should be between 1 to 100");
	}
	/*
	 * 3
	 * How to encrypt a value (a password or a PIN).
	 */
    public static void encrypt(){
    {
        String str,Newstr=" ";
        System.out.print("Enter the String you want to Encrypt: ");
        try {
            Scanner in=new Scanner(System.in);
            str=in.nextLine();
            for (int i=0;i<str.length();i++)
            {
                char ch=Character.toLowerCase(str.charAt(i));
                switch (ch)
                {
                    case 'a':
                        Newstr=Newstr+"{";
                        break;
                    case 'b':
                        Newstr=Newstr+"}";
                        break;
                    case 'c':
                        Newstr=Newstr+"#";
                        break;
                    case 'd':
                        Newstr=Newstr+"~";
                        break;
                    case 'e':
                        Newstr=Newstr+"+";
                        break;
                    case 'f':
                        Newstr=Newstr+"-";
                        break;
                    case 'g':
                        Newstr=Newstr+"*";
                        break;
                    case 'h':
                        Newstr=Newstr+"@";
                        break;
                    case 'i':
                        Newstr=Newstr+"/";
                        break;
                    case 'j':
                        Newstr=Newstr+"\\";
                        break;
                    case 'k':
                        Newstr=Newstr+"?";
                        break;
                    case 'l':
                        Newstr=Newstr+"$";
                        break;
                    case 'm':
                        Newstr=Newstr+"!";
                        break;
                    case 'n':
                        Newstr=Newstr+"^";
                        break;
                    case 'o':
                        Newstr=Newstr+"(";
                        break;
                    case 'p':
                        Newstr=Newstr+")";
                        break;
                    case 'q':
                        Newstr=Newstr+"<";
                        break;
                    case 'r':
                        Newstr=Newstr+">";
                        break;
                    case 's' :
                        Newstr=Newstr+"=";
                        break;
                    case 't':
                        Newstr=Newstr+";";
                        break;
                    case 'u':
                        Newstr=Newstr+",";
                        break;
                    case 'v' :
                        Newstr=Newstr+"_";
                        break;
                    case 'w':
                        Newstr=Newstr+"[";
                        break;
                    case 'x' :
                        Newstr=Newstr+"]";
                        break;
                    case 'y':
                        Newstr=Newstr+":";
                        break;
                    case 'z' :
                        Newstr=Newstr+"\"";
                        break;
                    case ' ' :
                        Newstr=Newstr+" ";
                        break;
                    case '.':
                        Newstr=Newstr+'3';
                        break;
                    case ',':
                        Newstr=Newstr+"1";
                        break;
                    case '(':
                        Newstr=Newstr+'4';
                        break;
                    case '\"':
                        Newstr=Newstr+'5';
                        break;
                    case ')' :
                        Newstr=Newstr+"7";
                        break;
                    case '?' :
                        Newstr= Newstr+"2";
                        break;
                    case '!':
                        Newstr= Newstr+"8";
                        break;
                    case '-' :
                        Newstr= Newstr+"6";
                        break;
                    case '%' :
                        Newstr = Newstr+"9";
                        break;
                    case '1':
                        Newstr=Newstr+"r";
                        break;
                    case '2':
                        Newstr=Newstr+"k";
                        break;
                    case '3':
                        Newstr=Newstr+"b";
                        break;
                    case '4':
                        Newstr = Newstr+"e";
                        break;
                    case '5':
                        Newstr = Newstr+"q";
                        break;
                    case '6':
                        Newstr = Newstr+"h";
                        break;
                    case '7':
                        Newstr = Newstr+"u";
                        break;
                    case '8' :
                        Newstr= Newstr+"y";
                        break;
                    case '9':
                        Newstr = Newstr+"w";
                        break;
                    case '0':
                        Newstr = Newstr+"z";
                        break;
                    default:
                        Newstr=Newstr+"0";
                        break;
                }
                in.close();
            }
        }
        catch(Exception ioe)
        {
            ioe.printStackTrace();
        }
        System.out.println("The encrypted string is: \n" +Newstr);
      }
  }
    /*
 // 4
 // Write a program that will take as input the user’s 
 // bank account balance and the type and level of account they have. 
 // Based on this information and the below rate table, 
 // determine the interest rate they are receiving.  * 
  * 	
  */
}
