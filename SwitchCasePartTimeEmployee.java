package com.bridgelabz.javaassignment1;

import java.util.concurrent.ThreadLocalRandom;

class Emp{
	//Constants
    final int isPartTime = 0;
    final int isFullTime = 1;
    
  //Variables
    int empRatePerHr = 20;
    int empHr;
    int random = ThreadLocalRandom.current().nextInt(0,3);
    

	void CheckPartTime(){
    	switch (random){
    	case isPartTime :
    		empHr = 4;
    		break;
    	case isFullTime :
    		empHr = 8;
    		break;
    	default:
    		empHr = 0;	
    }
    int salary = empHr*empRatePerHr;
    System.out.printf("You Working Hours are %d .\n",empHr);
    System.out.println("Your Salary is " + salary);
    }
}
public class SwitchCasePartTimeEmployee {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.CheckPartTime();
	}

}
