package com.week3JavaProject;

import java.util.Scanner;

public class workSpace {
	
	public static void main(String[] args) {
		
//		 ExceptionHomework ex = new ExceptionHomework();
//		 
////		 
//		
//		
	Laptop lap = new Laptop();
		
		lap.id= 123;
		lap.name= "MyLaptop";
		lap.price=1050.00;
		lap.rating= "Ex5";
	
		
	
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Give me your Screen Size");

		int screenSize = myscanner.nextInt();
		
		System.out.println("your RAM size");	
		int ram =  myscanner.nextInt();
		
		System.out.println(" What is your ssd");	
		int ssd =  myscanner.nextInt();
		lap = new Laptop((int)screenSize,(int)ram,(int)ssd);
		System.out.println(lap);
	
		
//		myscanner.close();
//		
//		
	}
	
	
}


