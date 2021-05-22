package com.bridgelabz.employeewage;

/**
 * @author prave
 *
 */
public class GetHrs {
	private static final int IS_FULL_TIME=1;
	private static final int IS_PART_TIME=2;
	public int getHrs() {
		int empHrs = 0;
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs= 0;
		}
		return empHrs;
		
	}

}
