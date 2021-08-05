package com.createiq.cal;

import org.apache.log4j.Logger;

public class LoggerDemo {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(LoggerDemo.class);
		logger.info("this is info");
		logger.debug("Debug");
		logger.warn("Warn");
		logger.error("Error");
		logger.fatal("Fatal");
	}

}
