package edu.lessons.day7.accessmodifiersA;

public class Film
{
   public void getFilmName()
   {
	   System.out.println("ABCD");
	   getHeroName();
   }
   private void getHeroName(){ System.out.println("VJ");}
   protected void getDirectorName(){ System.out.println("AM");}
   void getStoryWriterName(){ System.out.println("AM");}
}

 class Book{}
