package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class PartTime{
	
	//Variables
	int empRatePerHr;
	int isPartTime;
	int isFullTime;
	int random = ThreadLocalRandom.current().nextInt(0,3);
	int empHrs;
	//Constructor
	public PartTime(int empRatePerHr, int isPartTime, int isFullTime, int empHrs) {
		
		this.empRatePerHr = empRatePerHr;
		this.isPartTime = isPartTime;
		this.isFullTime = isFullTime;
		this.empHrs = empHrs;
	}
	void CheckEmployement(){
		
		if (isPartTime == random) {
        	empHrs = 4;
        }
        else if (isFullTime == random) {
        	empHrs = 8;
        }
        else {
        	empHrs = 0;
        }
		
        int salary = (empRatePerHr*empHrs);
        System.out.printf("You Working Hours are %d \n",empHrs);
        System.out.println("Your Salary is " + salary);
	}
	
	    
}
public class PartTimeEmployee {
	public static void main(String[] args) {
	//  Class   ref   Object       arguments
		PartTime p = new PartTime(20, 0, 1, 0);
		p.CheckEmployement();
	}

}
