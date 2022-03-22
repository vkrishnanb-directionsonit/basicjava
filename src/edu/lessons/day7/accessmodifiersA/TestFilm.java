package edu.lessons.day7.accessmodifiersA;
// Child In the same Package
public class TestFilm /*extends Film */  {
	public static void main(String[] args) {
		Film f1=new Film();
		f1.getFilmName();// public
		f1.getDirectorName();//   protected
		f1.getStoryWriterName();// Default
	}
//	public void testA()
//	{
//		this.getDirectorName(); //   protected
//		this.getFilmName(); // public
//		this.getStoryWriterName();// Default
//	}
}
