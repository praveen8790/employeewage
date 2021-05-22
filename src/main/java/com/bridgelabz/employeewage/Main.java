package com.bridgelabz.employeewage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author prave
 *
 */
public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);

	public static void main(String args[]) {
		// VARIABLES
		CalculateWage wage = new CalculateWage();
		wage.setparam(20,20,100);
		LOG.debug("total Emp Wage: " + wage.calculate());
		wage.setparam(200,15,140);
		LOG.debug("total Emp Wage: " + wage.calculate());
		
		
	}

}
