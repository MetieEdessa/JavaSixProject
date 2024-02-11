package com.week3JavaProject;
//2/6/24  
public class Laptop extends Product2  {

	private int screenSize;
	private int ram;
	private int ssd;
	
	@Override
	public String toString() {
			return"["+id+" "+name+" "+price+" "+rating+"+screenSize+"+ram+" "+ssd+"]";
	}		
	public Laptop(int screenSize, int ram, int ssd ) {
		this.screenSize = screenSize;
		this.ram = ram;
		this.ssd=ssd;
    }
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize() {
		this.screenSize = screenSize;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public void checkCharging(){
		System.out.println("Its Charging");
	}
	public void checkLogin(){
		System.out.println("Loged in");
	}
}
