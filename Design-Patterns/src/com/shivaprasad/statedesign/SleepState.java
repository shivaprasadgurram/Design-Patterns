package com.shivaprasad.statedesign;

public class SleepState implements State {
	public void powerOn() {
		System.out.println("Waking up from sleep.");
	}

	public void powerOff() {
		System.out.println("Turning off the computer from sleep.");
	}

	public void sleep() {
		System.out.println("Computer is already in sleep.");
	}
}
