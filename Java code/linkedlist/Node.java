package com.vasanth.linkedlist;

public class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}

	public static void insertNode(Node head, int data) {
		Node newNode = new Node(data);
		Node curr = head;

		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = newNode;

	}

	public static void printLinkedList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}

	}
	
	public static Node deleteNode(Node head, int val)
	{
		if(head.data==val)
			return head.next;
		
		Node curr=head;
		while(curr.next.data!=val)
		{
			curr=curr.next;
		}
		Node next=curr.next.next;
		curr.next=next;
		return head;
		
	}
	
	public static Node insertAtPosition(Node head, int pos, int val)
	{
		Node newNode = new Node(val);
		
		if(pos==1)
		{
			newNode.next=head;
			return newNode;
		}
		
		Node curr=head;
		for(int i=1;i<pos-1;i++)
		{
			curr=curr.next;
		}
		
		newNode.next=curr.next;
		curr.next=newNode;
		return head;
		
	}
	
	
	
	
	
	
	
	
	
}
