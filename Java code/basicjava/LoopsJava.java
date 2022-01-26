package com.vasanth.basicjava;

import java.util.Scanner;

public class LoopsJava {
	
	public static void main(String[] args) {
		System.out.println("Start of program.");
		
		
//		int i=1;
//		while(i<=10)
//		{
//			System.out.println(i);
//			i++;
//		}
		
		
		
//		do {
//			System.out.println("Inside do while loop.");
//		}while(i>100);
		
		
//		for(int i=1;i<=10;i++)
//		{
//			if(i==5)
//				continue;
//			
//			System.out.println(i);
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int result = sumOfFirstNNumbers(n);
		
		System.out.println("Sum of first "+n+" numbers is "+result);
		
		
		
		System.out.println("End of program.");
		
	}
	
	public static int sumOfFirstNNumbers(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;  // sum= sum+i
		}
		
		return sum;
	}

}
