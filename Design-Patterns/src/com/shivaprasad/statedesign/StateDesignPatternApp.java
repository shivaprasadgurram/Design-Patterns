package com.shivaprasad.statedesign;

public class StateDesignPatternApp {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.powerOn(); // Turning on the computer
		computer.sleep();   // Computer is off. Cannot sleep.
		computer.powerOff(); // Computer is already off.
		computer.setState(new OnState());
		computer.powerOn(); // Computer is already on
		computer.sleep();   // Putting the computer to sleep
		computer.powerOff(); // Turning off the computer
		computer.setState(new SleepState());
		computer.powerOn(); // Waking up from sleep
		computer.sleep();   // Computer is already in sleep.
		computer.powerOff(); // Turning off the computer from sleep
	}

	/** ===Advantages===
	 *
	 * With State pattern, the benefits of implementing polymorphic behavior are evident,
	 * and it is also easier to add states to support additional behavior
	 *
	 * The State pattern promotes cleaner and more organized code by separating each state's behavior
	 * into its own class. This separation makes your code easier to understand and maintain.
	 *
	 * When you need to add or modify states or behaviors, the pattern makes it easier to do so
	 * without affecting the existing code. This modularity improves code maintainability.
	 *
	 * The State pattern allows you to add new states or change the behavior of existing states
	 * independently, making your system more flexible and adaptable to future changes.
	 *
	 *  Code with the State pattern is typically more readable because the behavior for each state is
	 *  contained in a single class, reducing the complexity of conditional logic in the main code.
	 *
	 *  The pattern can help reduce the risk of bugs related to state transitions and behavior
	 *  changes because each state is isolated and tested independently.
	 *
	 *  However, it's essential to consider the trade-offs. If your system has only a few simple
	 *  states and transitions, introducing the State pattern may add unnecessary complexity.
	 *  In such cases, using simple if-else statements may be more pragmatic.
	 *
	 *  The State pattern is most beneficial in scenarios where:
	 *  Your system has many states with complex behaviors.
	 *  States change frequently and dynamically.
	 *  You anticipate future changes in states or behaviors.
	 *  Code readability, maintainability, and flexibility are high priorities.
	 */
}
