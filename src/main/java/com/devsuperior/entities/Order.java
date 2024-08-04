package com.devsuperior.entities;


public class Order {
	
	private int code;
	private double basic;
	private double discout;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public double getBasic() {
		return basic;
	}
	
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double getDiscout() {
		return discout;
	}
	
	public void setDiscout(double discout) {
		this.discout = discout;
	}
}
