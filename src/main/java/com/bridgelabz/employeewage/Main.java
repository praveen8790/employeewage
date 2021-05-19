package com.bridgelabz.employeewage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;

	public static void main(String args[]) {
		// VARIABLES
		int empHrs = 0, empWage = 0, totalEmpWage = 0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
		}
		
		System.out.println("total Emp Wage: " + totalEmpWage);
	}

}
