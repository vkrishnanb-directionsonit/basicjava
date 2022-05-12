package edu.lessons.day98.reflection;

public class ForNameDemo {
	public static void main(String[] args) {
		String className="edu.lessons.day98.reflection.Actor";
		try {
//			Actor hero;
			Class firstClass=Class.forName(className);
//			hero= new Actor();
			Object firstObject = firstClass.newInstance();
			Actor hero =(Actor)firstObject;
			hero.Name = "VJS";
//			hero.City = "Chennai";
			hero.printName();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch ( InstantiationException e) {
			e.printStackTrace();
		}catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
