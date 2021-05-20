package com.bridgelabz.employeewage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);

	public static void main(String args[]) {
		// VARIABLES
		CalculateWage wage = new CalculateWage(1,2,20,20,100);
		int totalEmpWage= wage.calculate();
		
		System.out.println("total Emp Wage: " + totalEmpWage);
	}

}
