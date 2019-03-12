package com.step.assignments;

public class Vehicle {
	private String name;
	private int speed;

	public Vehicle(String name) {
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void increaseSpeed(int speed){
		this.speed += speed;
	}

	public void decreaseSpeed(int speed){
		this.speed -= speed;
	}

	public int getSpeed(){
		return this.speed;
	}
}

