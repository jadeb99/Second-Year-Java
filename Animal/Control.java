package com.lab2.test;
import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		//first animal
		Animal a1 = new Animal("Ted");
		
		//second animal
		Animal a2 = new Animal("Rosco", "Dog", 2, true, "Red");
		
		//print a1
		System.out.println("Show a1 Details:");
		System.out.println(a1.getName());
		
		System.out.println();
		
		//print a2
		System.out.println("Show a2 details:");
		System.out.println(a2.getName());
		System.out.println(a2.getBreed());
		System.out.println(a2.getAge());
		System.out.println(a2.getDomestic());
		System.out.println(a2.getColor());
		
		
		System.out.println();
		
		//Test setter works
		System.out.println("Test Setter:");
		a1.setName("Steve");
		System.out.println(a1.getName());
		
		//test make noise
		a2.makeNoise();
		a2.makeNoise(false);
		
		System.out.println();
		
		//output the string
		System.out.println(a2.toString());
		
		System.out.println();
		
		//input name of animal
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of an animal: ");
		String nameInput = input.nextLine();
		System.out.println("You entered: " + nameInput);
	}//end main
}//end control class