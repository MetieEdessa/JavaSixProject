package com.week3JavaProject;

public abstract class Product2 {
	public   int id;
	public  String name;
	public  double price;
	public  String rating;
	


	
	public void checkTotalSales(){
		System.out.println("Check Total Sales");
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		rating = rating;
	}
}

