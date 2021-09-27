package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class Employee{
	int is_present = 1;
    int random = ThreadLocalRandom.current().nextInt(0,2);
    
    void EmpAttendance(){
    	if (is_present == random) {
        	System.out.println("The Employee is present");
        }
        else {
        	System.out.println("The Employee is absent");
        }
    }
}

public class AttendanceOfEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.EmpAttendance();
	}
	
	
	

}
