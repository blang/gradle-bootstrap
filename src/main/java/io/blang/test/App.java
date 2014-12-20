package io.blang.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger LOG = LogManager.getLogger(App.class);
			
	
	public static void main(String[] args) {
		LOG.trace("Main hit");
		System.out.println("Works");
	}
	
	public static int add(int a, int b) {
		LOG.trace("Add {} to {}", a, b);
		return a+b;
	}

}
