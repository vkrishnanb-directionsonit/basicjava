package edu.lessons.day32.labex;
//Write a program to swap the values of two variable 
//without using Third Variable?
import java.util.*;
 public class Document7 // Swapping 
 {
	public static void main(String[] args)
 	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int num1 = input.nextInt();//65
		System.out.println("Enter Number 2: ");
		int num2 = input.nextInt();//82
		num1 = num1 + num2;//65+82 num1=147
		num2 = num1 - num2;//147-82 num2=65
		num1 = num1 - num2;//147-65 num1-82
		System.out.println("After swapping, num1= " + num1 + " and num2= " + num2);
 	}
}