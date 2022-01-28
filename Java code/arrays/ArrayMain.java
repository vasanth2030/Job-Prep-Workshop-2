package com.vasanth.arrays;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element: ");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The array is: ");
		printArray(arr);
		
	}
	
	public static void printArray(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
