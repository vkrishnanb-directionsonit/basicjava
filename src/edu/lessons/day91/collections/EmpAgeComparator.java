package edu.lessons.day91.collections;

import java.util.Comparator;

public class EmpAgeComparator implements Comparator<EmpComparable> {
	@Override
	public int compare(EmpComparable o1, EmpComparable o2) {
		int result=0;
		result=Integer.compare(o1.getAge(), o2.getAge());
		return result;
	}
}
