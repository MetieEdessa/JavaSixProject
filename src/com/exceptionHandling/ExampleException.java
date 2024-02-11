package com.exceptionHandling;

import java.util.Scanner;

public class ExampleException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				System.out.println("Enter a Value");
						
						int a = scanner.nextInt();
						System.out.println("Enter b Value");
						int b = scanner.nextInt();
				
						
						
						
						try {
							int c = a/b;
							System.out.println("a/b " +c);
							
						}catch (Exception e) {
							System.out.println("you can not divide with Zero");
						}
						int d =a+b;
						int e =a-b;
						int f=a*b;
						
						//if you run the comment it will execute the result and the exception
//						System.out.println("a+b " +d);
//						System.out.println("a-b " +e);
//						System.out.println("a*b " +f);
						
						scanner.close();
	}

}
