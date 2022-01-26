package com.vasanth.basicjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of program.");		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int div= division(a, b);
		System.out.println("The devision value is: "+div);
		
		System.out.println("End of program.");
		
	}
	
	public static int division(int a, int b)
	{
		int div=-1;
		try {
			div=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Are you dumb? Can you divide a number by zero?");
		}
		finally {
			return div;
		}
	}

}
