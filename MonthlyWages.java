package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class EmpWage{
	int random = ThreadLocalRandom.current().nextInt(0,3);
	int Full_Time;
    int Part_Time;
	int Wage_per_hr;
	int Working_days_per_Month;
	int salary;
	int emphrs;
	public EmpWage(int full_Time, int part_Time, int wage_per_hr, int working_days_per_Month, int salary, int emphrs) {
	
		Full_Time = full_Time;
		Part_Time = part_Time;
		Wage_per_hr = wage_per_hr;
		Working_days_per_Month = working_days_per_Month;
		this.salary = salary;
		this.emphrs = emphrs;
	}
	
	void Wage(){
		for ( int days=1; days<=Working_days_per_Month; days++ ) {
			int EmplCheck=ThreadLocalRandom.current().nextInt(0,3);
			
			if ( EmplCheck == Full_Time ) {
				emphrs=8;
			}
			else if ( EmplCheck == Part_Time ) {
				emphrs=4;
			}
			else {
				emphrs=0;
			}
			int Emp_Wages=( emphrs * Wage_per_hr );
		    salary=(salary + Emp_Wages);		   	
		}
		System.out.printf("Your Salary for the Month: %d", salary);
	}
	
}
public class MonthlyWages {
	public static void main(String[] args) {
		EmpWage emp = new EmpWage(1, 2, 20, 20, 0, 0);
		emp.Wage();
	}

}
