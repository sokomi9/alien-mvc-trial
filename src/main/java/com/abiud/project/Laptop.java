package com.abiud.project;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	private int Lid;
	private String lnameString;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLnameString() {
		return lnameString;
	}
	public void setLnameString(String lnameString) {
		this.lnameString = lnameString;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", lnameString=" + lnameString + "]";
	}
	
	public void compile() {
		System.out.println("compiling");
	}

}
