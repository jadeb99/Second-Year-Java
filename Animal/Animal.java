package com.lab2.test;

/**********************************************************************************************************************************************
 * Lab 2 assignment to make constructors, getters and setters. 
 * 
 * 
 * JButton: Makes a push button, 5 Constructors
 * Arrays: Contains methods for manipulating arrays
 * 		   binarySearch(), compare(), sort()
 * 
 * 
 *Jade Brennan-Keane
 *C18512336
 *06.02.2020
 ********************************************************************************************************************************************/
public class Animal {
	//attributes
	private String name;
	private String breed;
	private int age;
	private boolean domestic;
	private String color;
	
	//Constructor 1
	public Animal(String name) {
		this.setName(name);
	}//end constructor 1
	
	//constructor 2
	public Animal(String name, String breed, int age, Boolean domestic, String color) {
		this.setName(name);
		this.setBreed(breed);
		this.setAge(age);
		this.setDom(domestic);
		this.setColor(color);
	}//end constructor 2
	
	//toString method
	public String toString() {
		String details = "This animal is called " + name + " it is a " + breed + " that is " + color + " in color. Domestic: " + domestic;
		return details;
	}//end toString
	
	
	
/*G E T T E R S *******************************************************************************************************************************/
	//name getter
	public String getName() {
		return name;
	}//end getName
	
	//breed getter
	public String getBreed() {
		return breed;
	}//end getBreed
		
	//age getter
	public int getAge() {
		return age;
	}//end getAge
	
	//domestic getter
	public boolean getDomestic() {
		return domestic;
	}//end domestic getter
	
	//color getter
	public String getColor() {
		return color;
	}//end color getter
/*E N D ** G E T T E R S **********************************************************************************************************************/

	
/*S E T T E R S *******************************************************************************************************************************/
	//name setter
	public void setName(String newName) {
		name = newName;
	}//end name setter
	
	//breed setter
	public void setBreed(String newBreed) {
		breed = newBreed;
	}//end breed setter
	
	//age setter
	public void setAge(int newAge) {
		age = newAge;
	}//end age setter
	
	//domestic setter
	public void setDom(boolean newDom) {
		domestic = newDom;
	}//end domestic setter
	
	//color setter
	public void setColor(String newColor) {
		color = newColor;
	}//end color setter
/*E N D ** S E T T E R S **********************************************************************************************************************/
	
	//make noise method
	public void makeNoise() {
			switch (breed) {
				case "Dog":
					System.out.println();
					System.out.println("B A R K");
					break;
				
				case "Cat":
					System.out.println();
					System.out.println("M E O W");
					break;
			}//end switch
	}//end make noise
	
	public void makeNoise(boolean old) {
		if (old == false) {
			System.out.println();
			System.out.println("Loud Animal");
		}//end if
		
		else {
			System.out.println();
			System.out.println("Quiet Animal");
		}//end else
	}//end makeNoise
	
}//end class