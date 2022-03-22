package edu.lessons.day60.oops.interfaces;

/**
 * A  Queue is a collection of elements
 * that are added to and removed from this Queue
 * by the first-in-first-out principle (FIFO).
 * 
 * @author pape
 */
public interface Queue {

	/**
	 * Adds the given  <code>value</code> 
	 * to this queue.
	 */
	public void add(int value);

	/**
	 * Removes and returns the value of the element that has be
	 * added to this queue at first.
	 * If the queue was empty some arbitrary value is returned.
	 */
	public int remove();

	/**
	 * Returns true if this queue contains one value at least.
	 */
	public boolean isEmpty();
	
}
