package edu.lessons.day91.collections.ex.harish;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<T> implements IStack<T>{
	ArrayList<T> stackArray = new ArrayList<T>();
	private int top;
	@Override
	public void push(T Obj) {
		stackArray.add(Obj);
	}

	@Override
	public T pop() throws EmptyStackException
	{
		Object temp = stackArray.remove(stackArray.size()-1);
		return (T)temp;
	}

	@Override
	public T peek() throws EmptyStackException
	{
		return stackArray.get(stackArray.size()-1);
	}
	
	public int arraySize()
	{
		return stackArray.size();
	}
}

