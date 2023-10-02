package com.shivaprasad.statedesign;

public class UglyCodeWithoutStateDesignPattern {
	public static void main(String[] args) {
		Computer1 computer1 = new Computer1();
		computer1.powerOn(); // Turning on the computer
		computer1.sleep();   // Putting the computer to sleep
		computer1.powerOff(); // Turning off the computer
	}

	/**
	 * Complexity: As the system grows and the number of states and transitions increases,
	 * managing all the conditional statements becomes more complex and error-prone.
	 *
	 * Maintainability: If you want to add new states or modify the behavior based on the state,
	 * you'll need to change multiple places in your code, potentially introducing bugs.
	 *
	 * Readability: The code becomes less readable, as it's cluttered with conditional logic,
	 * making it harder to understand and maintain.
	 */

	/**
	 * The State Design Pattern addresses these issues by encapsulating the behavior of each state
	 * in separate classes, allowing for cleaner, more maintainable, and extensible code.
	 * It centralizes the state-specific behavior and simplifies the management of state transitions,
	 * making the code easier to understand and modify as the system evolves.
	 */
}
