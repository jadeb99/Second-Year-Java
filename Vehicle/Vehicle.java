package com.lab1.test;

/****************************************
*   Vehicle: Test constructor methods 
*   Author: Jade Brennan-Keane
*   Student Number: C18512336
*   Date:30.01.2020
*****************************************/


public class Vehicle {
	
	// Attributes
	String ownerName;
	int regNumber;
	int maxSpeed;
	String color;
	String auto;
	int numberWheels;
	
	public Vehicle (String ownerName, int regNumber, int maxSpeed, String color, String auto, int numberWheels) {
		this.ownerName = ownerName;
		this.regNumber = regNumber;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.auto = auto;
		this.numberWheels = numberWheels;
	}
	
	public Vehicle (String ownerName, int regNumber) {
		this.ownerName = ownerName;
		this.regNumber = regNumber;
	}
	
	public String toString() {
		String details = "Owner Name: " + ownerName + "Reg Number: " + regNumber + "Speed: " + maxSpeed + "Color: " + color + "Auto: " + auto + "Number of Wheels: " + numberWheels;
		return details;
	}
}