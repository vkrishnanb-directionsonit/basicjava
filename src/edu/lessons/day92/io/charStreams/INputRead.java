package edu.lessons.day92.io.charStreams;
import java.io.InputStreamReader;
import java.io.IOException;
public class INputRead
{
  public static void main(String args[])throws IOException
  {
    char c;
    InputStreamReader sr = new InputStreamReader(System.in);
    System.out.println("Enter characters, 'q' to quit.");
    do
    {
      c = (char) sr.read();
      System.out.println(c);
    } while(c != 'q');
  }
}