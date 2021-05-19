package com.bridgelabz.employeewage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);
	public static void main(String args[]) {
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//VARIABLES
		int empHrs = 0;
		int empWage = 0;
		Double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}
