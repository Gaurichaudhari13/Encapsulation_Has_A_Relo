package com.java.encapsulation;

public class Engine {
	private String brand;
	private String cubic_capacity;

	public Engine(String b, String c_c) {
		this.brand = b;
		this.cubic_capacity = c_c;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCubic_capacity() {
		return cubic_capacity;
	}

	public void setCubic_capacity(String cubic_capacity) {
		this.cubic_capacity = cubic_capacity;
	}

	public void printEngine() {
		System.out.println("===Engine");
		System.out.println(brand+"is brand");
		System.out.println(cubic_capacity+"is cubic_capacity");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
