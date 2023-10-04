package com.java.encapsulation;

public class CarDriver {

	public static void main(String[] args) {
		Car c = new Car("BMw", "xy", "Black", 650000);
		c.setEngine(new Engine("ABC", "25300cc"));
		c.printCarDetails();

	}
		
		
		
		
		

}
