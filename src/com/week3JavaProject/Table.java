package com.week3JavaProject;

public class Table extends Product2 {
	private  double height;
	private double width;
	private double length;
	
public Table(double height, double width, double length ) {
    	this.height= height;
    	this.width=width;
    	this.length=length;
    }
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	

}
