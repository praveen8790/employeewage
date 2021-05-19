package com.bridgelabz.employeewage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String args[]) {
		// VARIABLES
		int empHrs = 0;
		int empWage = 0;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_FULL_TIME :
				empHrs = 8;
				break;
			case IS_PART_TIME :
				empHrs = 4;
				break;
			default:
				empHrs = 0;

		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}
