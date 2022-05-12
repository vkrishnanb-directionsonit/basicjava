package edu.lessons.day91.collections;
public class EmpComparable implements Comparable<EmpComparable>{
	private final int id;
	public String Name;
	private int age; 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EmpComparable(int v1) {
		id = v1;
	}

	public int getID() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Class c1 = obj.getClass();
		boolean flag = false;
		if (c1 == this.getClass()) {
			EmpComparable other = (EmpComparable) obj;
			if (this.hashCode() == other.hashCode())
				flag = true;
		}
		return flag;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	 public int compareTo(EmpComparable other)
	 {
		int result=0;
		result=Integer.compare(this.getID(), other.getID());
		return result;
	 }
}
