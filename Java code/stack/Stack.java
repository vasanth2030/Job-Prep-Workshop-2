package com.vasanth.stack;

public class Stack {
	int arr[];
	int top;
	int capacity;
	
	Stack(int capacity)
	{
		arr=new int[capacity];
		this.capacity=capacity;
		top=-1;
	}
	
	public void push(int num)
	{
		if(top==capacity-1)
			System.out.println("Stack overflow");
		else {
			arr[++top]=num;
		}
		
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		
		else {
			int num= arr[top];
			top--;
			return num;
		}
	}
	
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Empty stack");
			return -1;
		}
		else
			return arr[top];
	}
	
	public void printStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" <-- ");
		}
		System.out.println();
	}

}
