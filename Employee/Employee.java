package com.lab3.employee;

public class Employee {

/************************************A T T R I B U T E S*************************************/
	private String firstName;
	private String surName;
	private int staffNumber;
	private double annualSalary;
/************************************A T T R I B U T E S*************************************/
	
	
/**********************************C O N S T R U C T O R S***********************************/
	public Employee(String firstName, String surName, int staffNumber, double annualSalary) {
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(staffNumber);
		this.setAnnualSalary(annualSalary);
	}
/**********************************C O N S T R U C T O R S***********************************/
	
	
/****************************************G E T P A Y*****************************************/
	public double calculatePay() {
		return this.annualSalary/12;
	}
/****************************************G E T P A Y*****************************************/
	
	
/**************************************T O S T R I N G***************************************/
	public String toString() {
		String details = "Employee " + staffNumber + " is named " + firstName + " " + surName + " and has a salary of €" + annualSalary;
		return details;
	}
/**************************************T O S T R I N G***************************************/
	
	
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
/***************************************G E T T E R S****************************************/
/*******************************************A N D********************************************/
/***************************************S E T T E R S****************************************/
}//END CLASS