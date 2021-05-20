package com.bridgelabz.employeewage;

public class CalculateWage {
	int IS_FULL_TIME;
	int IS_PART_TIME;
	int EMP_RATE_PER_HOUR;
	int NUM_OF_WORKING_DAYS;
	int MAX_HOURS_IN_MONTH;
	
	public CalculateWage(int IS_FULL_TIME,int IS_PART_TIME,int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HOURS_IN_MONTH) {
		this.IS_FULL_TIME=IS_FULL_TIME;
		this.IS_PART_TIME=IS_PART_TIME;
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		this.MAX_HOURS_IN_MONTH=MAX_HOURS_IN_MONTH;
	}
	public int calculate() {
		
		int empHrs = 0, empWage = 0, totalEmpWage = 0,totalEmpHrs=0,totalWorkingDays=0;
		while(totalEmpHrs<= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			if (empCheck == IS_FULL_TIME)
				empHrs = 8;
			else if (empCheck == IS_PART_TIME)
				empHrs = 4;
			else
				empHrs = 0;
			
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
		}
		return totalEmpWage;
	}

}
