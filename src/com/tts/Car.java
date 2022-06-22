package com.tts;

public class Car {

	private static final int MAX_DOORS = 6;
	private static final int MIN_DOORS = 1;

	// public (external) constants
	public static final String TYPE_SPORTY = "Sporty";
	public static final String TYPE_FAMILY = "Family";

	// change case - convention that member variables are camel case.
	private String color;
	private int numberOfDoors;
	private int currentRPM;
	private int speed;
	// a new property and its respective accessors
	private String carType;

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		if (numberOfDoors >= MIN_DOORS && numberOfDoors <= MAX_DOORS)
			this.numberOfDoors = numberOfDoors;
		else
			this.numberOfDoors = -1;
	}

	public int getCurrentRPM() {
		return currentRPM;
	}

	private void setCurrentRPM(int rpm) {
		currentRPM = rpm;
	}

	private int calculateRPM(int speed) {
		int rpm = 0;

		// represents a real rpm calculation
//		rpm = speed * getBestGear(speed) * engineFactor();
		rpm = speed * 100;

		return rpm;

	}

	public void setSpeed(int speed) {
		this.speed = speed;
		setCurrentRPM(calculateRPM(speed));
	}

	// no-arg constructor
	public Car() {
	}

	// constructor with arguments
	public Car(String color, int doors) {
		this.setColor(color);
		this.setNumberOfDoors(doors);
	}

	public void start() {
		System.out.println("Car starting");
	}

	public void stop() {
		System.out.println("Car stopping");
	}

	public void drive() {
		System.out.println("Car driving");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", numberOfDoors=" + numberOfDoors + ", currentRPM=" + currentRPM + ", speed="
				+ speed + ", carType=" + carType + "]";
	}

}

//class definition
//public class Car {
//	// Properties of the Class
//	public String Color;
//	public int NumberOfDoors;
//	public boolean isCarOn = false;
//
//	// Class Constructors
//
//	public Car() {
//		Color = "White";
//		NumberOfDoors = 2;
//	}
//
//	// constructor with a single argument
//	public Car(String color) {
//		this.Color = color;
//		this.NumberOfDoors = 4;
//	}
//
//	// constructor with arguments
//	public Car(String color, int doors) {
//		this.Color = color;
//		this.NumberOfDoors = doors;
//	}
//
//	// Class Methods
//
//	/**
//	 * Prints "Car starting" to the console.
//	 */
//	public void start() {
//		if (isCarOn) {
//			System.out.println("The car is already on.");
//		} else {
//			isCarOn = true;
//			System.out.println("Car starting");
//		}
//
//	}
//
//	public void stop() {
//		System.out.println("Car stopping");
//	}
//
//	public void drive() {
//		System.out.println("Car driving");
//	}
//}

//instantiating and using a car object
//Car car = new Car();
//car.Color = "blue";
//car.NumberOfDoors = 4;
//car.start();
//car.drive();