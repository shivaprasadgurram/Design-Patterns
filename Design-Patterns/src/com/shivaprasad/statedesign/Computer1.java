package com.shivaprasad.statedesign;

public class Computer1 {
	private boolean isOn;

	public Computer1() {
		isOn = false;
	}

	public void powerOn() {
		if (!isOn) {
			System.out.println("Turning on the computer.");
			isOn = true;
		} else {
			System.out.println("Computer is already on.");
		}
	}

	public void powerOff() {
		if (isOn) {
			System.out.println("Turning off the computer.");
			isOn = false;
		} else {
			System.out.println("Computer is already off.");
		}
	}

	public void sleep() {
		if (isOn) {
			System.out.println("Putting the computer to sleep.");
			isOn = false;
		} else {
			System.out.println("Computer is off. Cannot sleep.");
		}
	}
}
