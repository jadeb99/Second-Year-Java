package com.lab3.employee;

public class salesCommEmployee extends Employee {
	
	private double commissionEarned;
	
	public salesCommEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned) {
		super(firstName, surName, staffNumber, annualSalary);
		this.setCommissionEarned(commissionEarned);
	}

	
/****************************************G E T P A Y*****************************************/
	public double calculatePay() {
		return ((getAnnualSalary()/12) + commissionEarned);
	}
/****************************************G E T P A Y*****************************************/
	
	
/**************************************T O S T R I N G***************************************/
	public String toString() {
		return super.toString() + " they make " + commissionEarned + " on commission.";
	}
/**************************************T O S T R I N G***************************************/
	
	
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
	public double getCommissionEarned() {
		return commissionEarned;
	}
	public void setCommissionEarned(double commissionEarned) {
		this.commissionEarned = commissionEarned;
	}
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
}

/*Populating arrays
 * Person[] people = new Person[30];
 * Person p1 = new Person("Paige", "Byrne");
 * people[0] = p1;
 */