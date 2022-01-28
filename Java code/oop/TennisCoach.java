package com.vasanth.oop;

public class TennisCoach implements Coach{

	@Override
	public void workout() {
		
		System.out.println("Run 10 kms and take rest.");
	}

	@Override
	public void motivation() {
		
		System.out.println("Never give up.");
		
	}

}
