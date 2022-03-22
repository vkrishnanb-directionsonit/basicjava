package edu.lessons.day4.innerClass;

public class Wall {
	public int height;
	public int width;
	//inner class
	public class Door
	{
		public int height;
		public int width;
		public void open()
		{
			System.out.println("Door is Open");
		}
		public void close() 
		{
			System.out.println("Door is Closed");
		}
		public void print() {
			System.out.println("Wall height="+Wall.this.height+
					" width="+Wall.this.width);
			System.out.println("Door height="+height+
					" width="+width);
		}
	}
}
