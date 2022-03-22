package edu.lessons.day1.introduction;

public class TestStaticBlock
{
 public static int x=100;
 static
 {
   System.out.println("From Static Block "+x);
 }
}