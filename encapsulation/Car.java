package com.java.encapsulation;

public class Car {
	private String brand;
	private String name;
	private String color;
	private double price;

	private Engine engine;

	public Car(String b, String n, String c, double p) {
		this.brand = b;
		this.name = n;
		this.color = c;
		this.price = p;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printCarDetails() {
		System.out.println("====car=====");
//		System.out.println(name+" is the Car");
	System.out.println(brand+" is the brand");
	System.out.println(name+" is the color");
	System.out.println(color+" is the color");
	System.out.println(price+"is the price");
		if (engine != null) {
			engine.printEngine();
		} else {
			System.out.println("Engine is not present");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}