package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {

	private static Logger logger = LogManager.getLogger(Log4jdemo.class);
	public static void main(String[] args) {
		System.out.println("\n   hello world...!   \n");
		logger.trace("this is trace message");
		logger.info("this is information message");
		logger.error("this is an error message");
		logger.warn("this is a warning  message");
		logger.fatal("this is a fatal message");
		System.out.println("\n completed");
		
	}

}
