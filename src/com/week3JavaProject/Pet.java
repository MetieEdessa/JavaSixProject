package com.week3JavaProject;

public class Pet {
	private String petName;
	private int id;
	private double cost;
	
	public Pet( String petName, int id){
		this.petName=petName;
		this.id=id;
	
	}

	public String getPetName() {
		return petName;
	}


	public int getId() {
		return id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
