package com.vasanth.queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.printQueue();
		
		queue.dequeue();
		
		queue.printQueue();

	}

}
