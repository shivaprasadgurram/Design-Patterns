package com.shivaprasad.statedesign;

public class OnState implements State {
	public void powerOn() {
		System.out.println("Computer is already on.");
	}

	public void powerOff() {
		System.out.println("Turning off the computer.");
	}

	public void sleep() {
		System.out.println("Putting the computer to sleep.");
	}
}