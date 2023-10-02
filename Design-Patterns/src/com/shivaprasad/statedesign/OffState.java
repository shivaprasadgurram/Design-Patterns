package com.shivaprasad.statedesign;

public class OffState implements State {
	public void powerOn() {
		System.out.println("Turning on the computer.");
	}

	public void powerOff() {
		System.out.println("Computer is already off.");
	}

	public void sleep() {
		System.out.println("Computer is off. Cannot sleep.");
	}
}
