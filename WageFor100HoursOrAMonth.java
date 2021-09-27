package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class Empl {
	int FullTime=1;
	int	PartTime=2;
	int	WagePerHr=20;
	int	WorkingDays=20;
	int	salary=0;
	int	Total_hrs=0;
	int emphrs=0;
	
	void Wage() {
		for ( int days =1, empHrs = 1; days <= WorkingDays && empHrs<=100; days++, empHrs++ ) {
			int EmplCheck=ThreadLocalRandom.current().nextInt(0,3);
			if (EmplCheck == FullTime) {
				emphrs=8;	
			}
			else if ( EmplCheck == PartTime) {
				emphrs=4;
			}
			else {
				emphrs=0;
			}
		Total_hrs=( Total_hrs + emphrs );	
		int Emp_Wages=( emphrs * WagePerHr );
		salary=(salary + Emp_Wages);	 
		}
			   
	    System.out.printf("Employees Salary: %d \n", salary);
	    System.out.printf("Total Hrs Of Working:- %d",Total_hrs);
		
	}
}
public class WageFor100HoursOrAMonth {
	public static void main(String[] args) {
		Empl emp = new Empl();
		emp.Wage();
	}
	
	

}
