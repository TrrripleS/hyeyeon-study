package com.in28minutes.oops.level2;

public class Fan {
	// state
	private String make;
	private double radius = 10.5;
	private String color = "red";

	private boolean isOn = true;
	private int speed = 100;

	// creation
	// 생성자를 결정할 때 고려해야 하는 것:
	// 이 객체에 없으면 안되는 게 무엇인지? => make, radius, color
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn
	public void isOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void siwtchOn() {
		this.isOn = true;
		setSpeed((int) 200);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((int) 0);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// print the state
	public String toString() {
		return String.format("make = %s, radius = %f, color = %s, isOn = %b, speed = %d", make, radius, color, isOn,
				speed);

	}
}
