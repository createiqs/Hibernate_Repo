package com.createiq.cal;

import org.apache.log4j.Logger;

public class Calculator {

	private static Logger logger = Logger.getLogger(Calculator.class);

	public static int add(int a, int b) {
//		System.out.println("before printing the values a and b" + a + " " + b);
		logger.info("before printing the values a and b " + a + " " + b);
		int result = a + b;
//		System.out.println("After adding the values of a and b" + a + " " + b + " result" + result);
		logger.info("After adding the values of a and b " + a + " " + b + " result" + result);
		return result;
	}

	public static void main(String[] args) {
		add(14, 12);
	}

}
