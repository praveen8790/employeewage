package com.bridgelabz.employeewage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOG = LogManager.getLogger(Main.class);
	public static void main(String args[]) {
		int IS_FULL_TIME = 1;
		Double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			LOG.debug("Employee is present");
		else
			LOG.debug("Employee is absent");
	}

}
