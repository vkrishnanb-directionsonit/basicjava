package edu.lessons.day91.generics.samplec;

import java.util.ArrayList;
import java.util.List;

public class Customer<T>
{
	public int CID;
	public String CName;
	public String Address;
	public String City;
    private int index = 0;
    private List<T> items;

    public Customer(int size)
    {
        //items = new T[size]; //compiler error - generic array creation
        items = new ArrayList<T>(size);
        //workaround - casting Object[] to generic Type  items=(T)new Object[size];
    }
    public void add(T t1)
    {
        items.add(t1);
        index++;
    }
    public T get(int index)
    {
        return items.get(index);
    }
   public List<T> getAll()
	{
		return items;
    }
}
