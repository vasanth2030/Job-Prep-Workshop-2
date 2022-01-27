package com.vasanth.basicjava;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
//		int num2= 2;
//		System.out.println(num1+num2);
//		System.out.println(num1-num2);
//		System.out.println(num1*num2);
//		System.out.println(num1/num2);
//		System.out.println(num1%num2); // remainder
		
//		num2+=10;  // num2=num2+10
//		num2-=5; // num2=num2-5
//		num1++;  //num1+=1 -> 11
//		num1--; //num1-=1 -> 10
//		--num1;
		
//		int var1= num1++;
//		int var2= ++num2;
//		System.out.println("var1: "+var1);
//		System.out.println("num1: "+num1);
//		System.out.println("var2: "+var2);
//		System.out.println("num2: "+num2);
		
		
		
//		int num;
//		System.out.println("Enter a number: ");
//		num=sc.nextInt();
//		if(num%2==0)
//		{
//			System.out.println("You have entered an even number.");
//		}
//		else {
//			System.out.println("It is an odd number.");
//			
//		}
		
//		System.out.println("Enter another number: ");
//		int num2=sc.nextInt();
//		
//		if(num1<100 && num2>100)
//			System.out.println("Yes");
//		else if (num1<100 || num2>100)
//			System.out.println("No");
//		else if(!(num1!=100))
//			System.out.println("Ok");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		oddOrEven(number);
		
		
		System.out.println("End of program.");
		
		
	}
	
	public static void oddOrEven(int num)
	{
		if(num%2==0)
			System.out.println("Even number.");
		else
			System.out.println("Odd number.");
	}
	
	public static int sum(int a,int b) {

		return a+b;
		
	}
	

}

