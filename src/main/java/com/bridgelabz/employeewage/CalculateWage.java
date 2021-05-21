package com.bridgelabz.employeewage;

public class CalculateWage {
	int EMP_RATE_PER_HOUR;
	int NUM_OF_WORKING_DAYS;
	int MAX_HOURS_IN_MONTH;
	
	public CalculateWage(int EMP_RATE_PER_HOUR,int NUM_OF_WORKING_DAYS,int MAX_HOURS_IN_MONTH) {
		this.EMP_RATE_PER_HOUR=EMP_RATE_PER_HOUR;
		this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
		this.MAX_HOURS_IN_MONTH=MAX_HOURS_IN_MONTH;
	}
	public int calculate() {
		
		int totalEmpWage = 0,totalEmpHrs=0,totalWorkingDays=0;
		GetHrs gethrs = new GetHrs();
		while(totalEmpHrs<= MAX_HOURS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empHrs = gethrs.getHrs();
			totalEmpHrs += empHrs;
			int empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " + empWage);
		}
		return totalEmpWage;
	}
	

}
