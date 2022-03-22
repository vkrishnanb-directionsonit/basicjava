package edu.lessons.day4.classNmethods;

public class Rectangle 
{
  public double Length;
  public double Breadth;
  public boolean equals (Object ob) 
  {
    if(ob instanceof Rectangle)
       return equals((Rectangle)ob);
    else
       return false;
  }
  private boolean equals(Rectangle rect) 
  {
    return (this.Length == rect.Length && this.Breadth==rect.Breadth);
  }
}
