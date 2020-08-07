package com.lab3.employee;

public class hourlyEmployee extends Employee {
	
	private double hoursWorked;
	private double hourlyPay;
	
	public hourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked, double hourlyPay) {
		super(firstName, surName, staffNumber, 0);
		this.setHoursWorked(hoursWorked);
		this.setHourlyPay(hourlyPay);
	}

	
/****************************************G E T P A Y*****************************************/
	public double calculatePay() {
		return hoursWorked * hourlyPay;
	}
/****************************************G E T P A Y*****************************************/

	
/**************************************T O S T R I N G***************************************/
	public String toString() {
		return super.toString() + " they make " + hourlyPay + " an hour and do " + hoursWorked +" a week.";
	}
/**************************************T O S T R I N G***************************************/

	
	
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
}