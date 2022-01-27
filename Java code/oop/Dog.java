package com.vasanth.oop;

public class Dog extends Animal{

	public void eat()
	{
		System.out.println("Eating dog food.");
//		super.eat();
	}
	
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
}
