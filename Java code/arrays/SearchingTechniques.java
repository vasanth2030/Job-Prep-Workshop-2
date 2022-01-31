package com.vasanth.arrays;

import java.util.Scanner;

public class SearchingTechniques {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		int n = sc.nextInt();
		
		linearSearch(arr, n);
		binarySearch(arr, n);
	}
	
	public static void linearSearch(int arr[],int x)
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				System.out.println("Linear Search: Element found at index "+i);
				return;
			}
		}
		System.out.println("Linear Search: The element is not present in the array.");
	}
	
	public static void binarySearch(int arr[],int x)
	{
		int l=0;
		int r= arr.length-1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			
			if(arr[mid]==x)
			{
				System.out.println("Binary Search: Element found at index "+mid);
				return;
			}
			
			else if(arr[mid]<x)
			{
				l=mid+1;
			}
			else
			{
				r=mid-1;
			}
		}
		System.out.println("Binary Search: The element is not present in the array.");
		
	}

}
