package com.step.assignments;

public class Car extends Vehicle {
	private int gears;
	private String model;

	public Car(int gears, String model) {
		super("Car");
		this.gears = gears;
		this.model = model;
	}

	public void handSteering (){
		System.out.println("Handling steering");
	}

	public void increaseGear(){
		this.gears += 1;
	}

	public void decreaseGear(){
		this.gears -= 1;
	}
}
