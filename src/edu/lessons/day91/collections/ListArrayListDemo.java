package edu.lessons.day91.collections;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

class ListArrayListDemo {
	public static void main(String args[]) {
		lessonArrayList();
	}

	public static void usingRawTypeArrayList() {
		// Not type safe
		ArrayList firstArrayList=new ArrayList();
		firstArrayList.add(100);
		firstArrayList.add("Venkat");
		firstArrayList.add(true);
		firstArrayList.add(new Emp(123));
		firstArrayList.add(new Object());
		firstArrayList.add(new ArrayList());
	}

	public static void lessonArrayList() {
		ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
		System.out.println("InitiempArrayList size of empArrayList: " + empArrayList.size());// 0
		try {
			for (int i = 0; i < 5; i++) {
				Emp e1 = new Emp(i);
				e1.Name = "Emp" + i;
				empArrayList.add(e1);
			}
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());
			Emp e3 = (Emp) empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());
			Emp e4 = new Emp(4);
			e4.Name = "Elon Musk";
			empArrayList.add(e4);
			System.out.println("Freq of [Emp id-4] in ArrayList- " + Collections.frequency(empArrayList, e3));
//			Iterator<Emp> empIterator= empArrayList.iterator();
//			while (empIterator.hasNext()) {
//				Emp e1 = empIterator.next();
//				System.out.println("\t" + e1.getID() + " " + e1.Name);
//			}
//			
			// find frequency with name
			Emp e7 = new Emp(4);
			e7.Name = "Elon Musk";
			empArrayList.add(e7);
			int frequencyByName = 0;
			String name = "Elon Musk";
			Iterator<Emp> empIterator = empArrayList.iterator();
			while (empIterator.hasNext()) {
				Emp e1 = empIterator.next();
				System.out.println("\t" + e1.getID() + " " + e1.Name);
				if (e1.Name.equals(name))
					++frequencyByName;
			}
			System.out.println("Freq of [Emp name-Elon Musk] in ArrayList- " + frequencyByName);
		} catch (Exception err) {
			System.out.println("ERROR!!! " + err.getMessage());
		}
	}

	public static void arrayListOfEmp() {
		// Size is Zero
		ArrayList<Emp> empArrayList = new ArrayList<Emp>();
//		ArrayList<Emp> empArrayList = new ArrayList<Emp>(30);
		System.out.println("Initial size of empArrayList: " + empArrayList.size());// 0
		try {
			for (int i = 0; i < 5; i++) {
				Emp e1 = new Emp(i);
				e1.Name = "Emp" + i;
				empArrayList.add(e1);
			}
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());// 5

			Emp e3 = (Emp) empArrayList.get(2); // get the 3rd Emp
			empArrayList.add(e3); // adds the 3rd again - 6th Emp
			Emp e6 = (Emp) empArrayList.get(5); // get the 6th Emp
			empArrayList.add(e6); // adds the 3rd again - 7th Emp
			System.out.println("Size of empArrayList after additions: " + empArrayList.size());// 7
			// e3 == e6 == e7 emp.id is the same for these three
			Emp e61 = (Emp) empArrayList.get(5); // get the 6th Emp
			Emp e7 = (Emp) empArrayList.get(6); // get the 7th Emp
			Emp e101 = (Emp) empArrayList.get(1); // get the 2nd Emp

			empArrayList.add(new Emp(2)); // adds a new Emp with Emp.id=2
			// e3 == e6 == e7 == e8 emp.id is the same for these four
			System.out.println(e3 == e61); // true
			System.out.println(e6 == e7); // true
			System.out.println(e101 == e3); // false

			System.out.println("Freq of [Emp id=2] in ArrayList- " + Collections.frequency(empArrayList, e3));

			Iterator<Emp> itr = empArrayList.iterator();
			while (itr.hasNext()) {
				Object element = itr.next();// return current object
				Emp e1 = (Emp) element;
				System.out.println("\t" + e1.getID() + " " + e1.Name);
			}
			// empArrayList.set(2,"X");// ERROR
		} catch (Exception err) {
			System.out.println("ERROR!!! " + err.getMessage());
		}
	}

	public static void usingStringArrayList() {
		ArrayList<String> stringArrayList = new ArrayList<String>();
		System.out.println("Initial size of stringArrayList: " + stringArrayList.size());
		try {
			stringArrayList.add("Car");
			stringArrayList.add("Auto");
			stringArrayList.add("Egg");
			stringArrayList.add("Box");
			stringArrayList.add("Doll");
			stringArrayList.add("Fan");
			// will insert a new value ,
			// pushing the current value of index 1 to the next index
			stringArrayList.add(1, "Animal");
			stringArrayList.add("Girl");
			stringArrayList.add("Fan");
			System.out.println("Size of stringArrayList after additions: " + stringArrayList.size());
			System.out.println("Contents of stringArrayList: " + stringArrayList);
			// will replace the value in index 2
			stringArrayList.set(2, "xenas");
			System.out.println("After Set(2): " + stringArrayList);
			System.out.println("Last Index of: 'Fan' " + stringArrayList.lastIndexOf("Fan"));
			// remove the first instance of 'Fan'
			stringArrayList.remove("Fan");
			stringArrayList.remove(2);
			System.out.println("Size after remove(2): " + stringArrayList.size());
			System.out.println("Contents of stringArrayList: " + stringArrayList);
			// will reduce the capacity
			stringArrayList.trimToSize();
		} catch (Exception err) {
			System.out.println(err.getMessage());
		}
	}

//	static final Field field;
//	static {
//		try {
//			field = ArrayList.class.getDeclaredField("elementData");
//			field.setAccessible(true);
//		} catch (Exception e) {
//			throw new ExceptionInInitializerError(e);
//		}
//	}

//	@SuppressWarnings("unchecked")
//	public static <T> int getArrayListCapacity(ArrayList<T> arrayList) {
//		try {
//			Object[] elementData = (Object[]) field.get(arrayList);
//			return elementData.length;
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//	}

	/*
	 * @SuppressWarnings("unchecked") public static <E> int
	 * getArrayListCapacity(ArrayList<E> arrayList) { try { final E[] elementData =
	 * (E[]) field.get(arrayList); return elementData.length; } catch (Exception e)
	 * { throw new RuntimeException(e); }
	 * 
	 * }
	 */
}