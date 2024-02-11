package com.week3JavaProject;

public class Checking extends Accounts {
	@Override
	public void info() {
		System.out.println(this.accHolderName + this.accountNumber);
	}

}
