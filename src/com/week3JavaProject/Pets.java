package com.week3JavaProject;
//2/5/24
// creat a mini project
public class Pets {

	private String name = "name"+":";
	private String type= "--"+"type"+":";
	private String color="--"+"color" + ":";
	private String age = "--"+"age";
	
	@Override
	public String toString() {
			return"["+name+""+type+""+color+""+age+"]";
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}	
	
	public static void main(String[] args) {
	Pets pets = new Pets();
	System.out.println(pets);
	}
}
