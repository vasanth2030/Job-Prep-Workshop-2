package com.vasanth.queue;

public class Queue {
	int arr[];
	int capacity;
	int front;
	int rear;
	
	Queue(int capacity)
	{
		arr=new int[capacity];
		this.capacity=capacity;
		front=rear=0;
	}
	
	public void enqueue(int num)
	{
		if(rear==capacity)
			System.out.println("Queue is full");
		else
		{
			arr[rear]=num;
			rear++;
		}
	}
	
	public void dequeue()
	{
		if(front==rear)
			System.out.println("Queue is empty");
		else
		{
			for(int i=0;i<rear-1;i++)
			{
				arr[i]=arr[i+1];			
			}
			rear--;
		}
	}
	
	public void printQueue()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
