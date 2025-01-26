package com.example.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldLogger {

    // Create a logger instance for this class
    private static  Logger logger = LoggerFactory.getLogger(HelloWorldLogger.class);

    public static void main(String[] args) {
        logger.info("Hello, World! This is an info message.");
        logger.debug("Debugging the HelloWorldLogger class.");
        logger.warn("Warning: Check your configuration.");
        logger.error("Error: Something went wrong.");
    }
}
