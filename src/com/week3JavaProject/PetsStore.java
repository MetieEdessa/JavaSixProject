package com.week3JavaProject;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class PetsStore {
	
	public static void main(String[] args) {
		
LinkedList<String> pet = new LinkedList<String>();
		 
		    pet.add("Dog");
		    pet.add("Cat");
		    pet.add("Fish");
		    pet.add("Bird");
		    System.out.println(pet);
		
		    pet.addFirst("Hamster");
		    System.out.println(pet);
	    
		    pet.removeLast();
		    System.out.println(pet);
		    
		    pet.addLast("Rabbit");
		    System.out.println(pet);
		    
		    pet.removeFirst();
		    System.out.println(pet);
		    
		    
HashSet<String> pet2 = new HashSet<String>();
		    pet2.add("Dog");
		    pet2.add("Cat");
		    pet2.add("Fish");
		    pet2.add("Bird");
		    
		    pet2.clear();
		    System.out.println(pet2);
		    
 HashSet<String> pet3 = new HashSet<String>();
		    pet3.add("Dog");
		    pet3.add("Cat");
		    pet3.add("Fish");
		    pet3.add("Bird");
		    
		    for (String i : pet3) {
		      System.out.println(i);
		    }
 ArrayList<String> pet4= new ArrayList<String>();
		    pet4.add("Cat");
		    pet4.add("Dog");
		    pet4.add("Bird");
		    pet4.add("Horse");
		  
		    // Get the iterator
		    Iterator<String> it = pet4.iterator();
		    
		    // Loop through a collection
		    while(it.hasNext()) {
		      System.out.println(it.next());
		    }
		    
		    
	  }
}

		
		
		
	


