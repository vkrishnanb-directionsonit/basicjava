package edu.lessons.day60.oops.interfaces;

/**
 * Implements a Queue with an array.
 * If the number of elements added to this queue exceeds the
 * capacity of the array, then a new array of double size is
 * created and used for storing all elements.
 * 
 * @author pape
 *
 */
public class ArrayQueue implements Queue {

	/**
	 * index of the first element of this queue
	 */
	private int firstElement = 0;
	
	/**
	 * index where the next added element will be stored
	 */
	private int nextElement = 0;
	
	/**
	 * the element of this Queue arranged in cyclic order
	 */
	private int [] queue;
	
	/**
	 * creates a new queue with the inital capacity
	 */
	public ArrayQueue(int capacity) {
		queue = new int[capacity];
	}
	
	/**
	 * creates a new queue with the initial capacity of 100 elements
	 */
	public ArrayQueue() {
		this(100);
	}
	
	public void add(int element) {
		if ( (nextElement + 1) % queue.length == firstElement ) {
			int [] newQueue = new int[2 * queue.length];
			
			for (int i = firstElement; i < queue.length; i++) {
				newQueue[i - firstElement] = queue[i];
			}
			for (int i = nextElement; i < firstElement; i++) {
				newQueue[i - nextElement + firstElement] = queue[i];
			}
			firstElement = 0;
			nextElement = queue.length - 1;
			queue = newQueue;
			
		}
		queue[nextElement] = element;
		nextElement = (nextElement + 1) % queue.length;
	}

	public boolean isEmpty() {
		return firstElement == nextElement;
	}

	public int remove() {
		int element = 0;
		if (! isEmpty()) {
			element = queue[firstElement];
			firstElement = (firstElement + 1) % queue.length;
		}
		
		return element;
	}

}
