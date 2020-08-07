package com.lab3.employee;

public class Control {

	public static void main(String[] args) {
		Employee E1 = new Employee("Jade", "Brennan", 269, 10000);
		hourlyEmployee E2 = new hourlyEmployee("Yuta", "Gitchamnan", 270, 20, 9.80);
		salesCommEmployee E3 = new salesCommEmployee("Nathan", "Campbell", 271, 5000, 125.36);
		
		System.out.println(E1.toString());
		System.out.println("Monthly Pay is " + E1.calculatePay());
		
		System.out.println();
		
		System.out.println(E2.toString());
		System.out.println("Weekly Pay is " + E2.calculatePay());
		
		System.out.println();
		
		System.out.println(E3.toString());
		System.out.println("Salary with Commission is " + E3.calculatePay());
		
		
		Employee myEmployee[] = new Employee[3];
		
		myEmployee[0] = E1;
		myEmployee[1] = E2;
		myEmployee[2] = E3;
		
		System.out.println();
		
		for(int i = 0; i<myEmployee.length; i++) {
			System.out.println(myEmployee[i].calculatePay());
		}
	}//END MAIN

}