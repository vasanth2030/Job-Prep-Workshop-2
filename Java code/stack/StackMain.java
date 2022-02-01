package com.vasanth.stack;

public class StackMain {

	public static void main(String[] args) {
		Stack stack=new Stack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printStack();
		
		int i=stack.pop();
		System.out.println("Popped element: "+i);
		
		int j=stack.pop();
		System.out.println("Popped element: "+j);
		
		stack.printStack();
		

	}

}
