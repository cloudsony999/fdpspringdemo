package com.example;

public class CarBMW implements Car {

	private String color;
	private String model;

	public CarBMW(String color, String model) {
		this.color = color;
		this.model = model;
	}

	public void startCar() {
		// TODO Auto-generated method stub
		System.out.println("BMW started. Color is " + color + " and the model is " + model);
	}

	public void runCar() {
		// TODO Auto-generated method stub
		System.out.println("BMW ran.....");
	}

	public void stopCar() {
		// TODO Auto-generated method stub
		System.out.println("BMW stopped.....");
	}

}
