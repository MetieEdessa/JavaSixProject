package com.exceptionHandling;
import java.util.Scanner;
public class ExSample {

	public static void main(String[] args) {

Scanner Scanner =new Scanner(System.in);
System.out.println("Enter age");
int age = Scanner.nextInt();
if(age>=18) {
	System.out.println("vote");
}else {
	throw new ArithmeticException("Please come back next year");
}
	}

}
