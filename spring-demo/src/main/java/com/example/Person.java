package com.example;

public class Person {
	private String name;
	private Car car;

	public Person(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void driveCar() {
		System.out.println("Owner is " + this.getName());
		car.startCar();
		car.runCar();
		car.stopCar();
	}
}
