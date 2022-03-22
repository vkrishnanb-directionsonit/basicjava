package edu.lessons.day4.innerClass;

public class TestWall {
	public static void main(String[] args) {
		Wall w1=new Wall();
		w1.height=10;
		w1.width=30;
		
		Wall.Door d1=w1.new Door() ;
		d1.height=8;
		d1.width=3;
		
		d1.open();
		d1.close();
		d1.print();
	}
}
