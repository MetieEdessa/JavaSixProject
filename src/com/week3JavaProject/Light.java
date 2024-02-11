package com.week3JavaProject;

public class Light extends Product2 {
 int wats;
 int lumens;
 int noOfAmps;
 int checkPowerUTil;
 
 public Light(int wats, int lumens, int noOfAmps, int CheckPowerUTil ) {
	 this.wats=wats;
	 this.lumens=lumens;
	 this.noOfAmps=noOfAmps;
	 this.checkPowerUTil=checkPowerUTil;
 }
public int getWats() {
	return wats;
}
public void setWats(int wats) {
	this.wats = wats;
}
public int getLumens() {
	return lumens;
}
public void setLumens(int lumens) {
	this.lumens = lumens;
}
public int getNoOfAmps() {
	return noOfAmps;
}
public void setNoOfAmps(int noOfAmps) {
	this.noOfAmps = noOfAmps;
}
public int getCheckPowerUTil() {
	return checkPowerUTil;
}
public void setCheckPowerUTil(int checkPowerUTil) {
	this.checkPowerUTil = checkPowerUTil;
}
 
}
