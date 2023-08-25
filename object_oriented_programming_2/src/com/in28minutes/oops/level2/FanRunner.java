package com.in28minutes.oops.level2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan1 = new Fan("Manufacturer 1", 0.34567, "green");
		fan1.isOn(true);
		fan1.setSpeed((int) 400);
		System.out.println(fan1);
		fan1.switchOff();
		fan1.setSpeed((int) 0);
		System.out.println(fan1);
	}
	
}
