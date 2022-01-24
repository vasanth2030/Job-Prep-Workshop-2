package com.vasanth.basicjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class InputOutputJava {
	
	public static void main(String[] args) throws Exception {
		
		String name;
		int age;
		
		//BufferedReader
//		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter your name: ");
//		name= br.readLine();
//		System.out.println("Enter your age: ");
//		age= Integer.parseInt(br.readLine());    // Ctrl + Shift + O
		
		//Scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name= sc.nextLine();		
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		
		System.out.println("Hello World! - from "+name);
		System.out.println("Age: "+age);
		
	}
	

}
