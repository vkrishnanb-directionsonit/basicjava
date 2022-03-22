package edu.lessons.day7.accessmodifiersB;

import edu.lessons.day7.accessmodifiersA.Film;

// Child in different package
public class TestFilm extends Film 
{
	public static void main(String[] args) 
	{
		Film f1=new Film();
		f1.getFilmName();// public
	}
	public void testA()
	{
		this.getDirectorName(); //   protected
		this.getFilmName(); // public
	}
}
