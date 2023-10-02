package com.shivaprasad.statedesign;

public class Computer {
	private State state;

	public Computer() {
		// Initialize the computer in the Off state
		state = new OffState();
	}

	public void setState(State newState) {
		state = newState;
	}

	public void powerOn() {
		state.powerOn();
	}

	public void powerOff() {
		state.powerOff();
	}

	public void sleep() {
		state.sleep();
	}
}
