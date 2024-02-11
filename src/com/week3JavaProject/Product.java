package com.week3JavaProject;

public class Product {
	private String petName;
	private int id;
	private double cost;
	private int quantityOnHand;
	private int noOfSales;
	private int inventory;
	
	public Product () {
		this.petName= petName;
		this.id=id;
		this.cost=cost;
		this.quantityOnHand = 0;
		this.noOfSales = 0;
		this.inventory = 0;
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

	public int getQuantityOnHand() {
		return quantityOnHand;
	}


	public int getnoOfSales() {
		return noOfSales;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
}
