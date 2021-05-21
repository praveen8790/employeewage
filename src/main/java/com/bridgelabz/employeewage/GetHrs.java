package com.bridgelabz.employeewage;

public class GetHrs {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public int getHrs() {
		int empHrs = 0;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		return empHrs;
		
	}

}
