package com.exceptionHandling;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		HashSet<String> set =new HashSet<String>();
				set.add("hello");
				set.add("world");
//				if i try to add it again it wornt add it bc/ its alrady
				set.add("hello");
				System.out.println(set);
				
				

	}

}
