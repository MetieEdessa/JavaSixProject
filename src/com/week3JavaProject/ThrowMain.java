package com.week3JavaProject;

public class ThrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThrowExcep throwex = new ThrowExcep();
	
	try {
		throwex.CheckInput();
		
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println(e);		
		System.out.println("You did not enter double number");
		}
	}

}
