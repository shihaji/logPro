package com.cts;

import org.apache.log4j.Logger;

public class Main {

	static Logger log=Logger.getLogger(Main.class);
	
	public static void main(String[] args) {
		

		log.info("info logged to file");
		log.warn("war logged to file");
		log.error("error logged to file");
		log.fatal("fatal logged to file");
		
		
	}

}
