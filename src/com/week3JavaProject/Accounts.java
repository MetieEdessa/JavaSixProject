package com.week3JavaProject;

public class Accounts {
	public String accHolderName="Name";
	public int accountNumber;
	
	@Override
	
	public String toString() {
		return"["+accHolderName+""+accountNumber+"]";
		
		
	}
	public void info() {
		System.out.println(this.accHolderName +"is your info");
	
	}
}
