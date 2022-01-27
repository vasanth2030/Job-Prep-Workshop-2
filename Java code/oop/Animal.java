package com.vasanth.oop;

public class Animal {
	private String name;
	private int legs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public Animal(){
		
	}
	
	public Animal(String name,int legs)
	{
		System.out.println("Inside a constructor!");
		this.name=name;
		this.legs=legs;
	}
	
	public void eat()
	{
		System.out.println("Eating food");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping.");
	}

}
