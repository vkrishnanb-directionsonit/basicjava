package edu.lessons.day60.oops.interfaces;


public class QueueTest  {

	private Queue queue = new ArrayQueue();
	
	public void testAdd() {
		queue.add(6);
		
//		assertEquals(6, queue.remove());
	}
	
	public void testAdd1() {
		queue.add(6);
		queue.add(5);
		queue.add(4);
		
//		assertEquals(6, queue.remove());
//		assertEquals(5, queue.remove());
//		assertEquals(4, queue.remove());
	}
	
	public void testAdd2() {
		Queue queue = new ArrayQueue(2);
		
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		
//		assertEquals(6, queue.remove());
//		assertEquals(5, queue.remove());
//		assertEquals(4, queue.remove());
//		assertEquals(3, queue.remove());
//		assertEquals(2, queue.remove());
	}
	
	public void testIsEmpty() {		
//		assertTrue(queue.isEmpty());
	}
	
	public void testIsEmpty1() {		
		queue.add(6);
		queue.add(5);
		
		queue.remove();
        queue.remove();
        
//        assertTrue(queue.isEmpty());
	}
	
	public void testRemove() {
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.remove();
		queue.remove();
		
//		assertEquals(4, queue.remove());
//		assertEquals(3, queue.remove());
		queue.remove();
	}
	
	public void testRemove1() {
		Queue queue = new ArrayQueue(2);
		queue.add(6);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.remove();
		queue.remove();
		
//		assertEquals(4, queue.remove());
//		assertEquals(3, queue.remove());		
	}
}
