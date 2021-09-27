package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class EmployeeWage{
	int empRatePerHr = 20;
    int is_present = 1;
    int random = ThreadLocalRandom.current().nextInt(0,2);
	public EmployeeWage(int empRatePerHr, int is_present) {
		this.empRatePerHr = empRatePerHr;
		this.is_present = is_present;
	}
	void DailyWage(){
		if (is_present == random) {
        	
        	int empHrs = 8;
        	int salary = empRatePerHr*empHrs;
        	System.out.printf("You have worked for %d Hours and Your Salary is $ %d", empHrs,salary);
        }
        else {
        	int empHrs = 0;
        	int salary = empRatePerHr*empHrs;
        	System.out.printf("You have worked for %d Hours and Your Salary is $ %d", empHrs,salary);
        }
		
		
	}
    
}
public class EmployeeDailyWage {
	public static void main(String[] args) {
		EmployeeWage emp = new EmployeeWage(20, 1);
		emp.DailyWage();
	}

}
