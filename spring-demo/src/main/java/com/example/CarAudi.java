package com.example;

public class CarAudi implements Car {

	private String color;
	private String model;

	public CarAudi(String color, String model) {
		this.color = color;
		this.model = model;
	}

	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println("Audi started. Color is " + color + " and the model is " + model);
	}

	public void runCar() {
		// TODO Auto-generated method stub
		System.out.println("Audi ran....");
	}

	public void stopCar() {
		// TODO Auto-generated method stub
		System.out.println("Audi stopped.....");
	}

}
