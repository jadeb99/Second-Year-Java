package com.lab1.test;

/****************************************
*   Control: the purpose of this class is to print Hello 
*   World to standard output
*   Author: Jade Brennan-Keane
*   Student Number: C18512336
*   Date:30.01.2020
*****************************************/

public class Control {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Vehicle v1 = new Vehicle("John Doe",1234,100,"Blue","Yes",4);
		Vehicle v2 = new Vehicle("Jane Doe",5678);
		
		System.out.println(v1.toString());
		System.out.println(v2);
	}
}