package com.example.bindings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackExample {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(LogbackExample.class);

    public static void main(String[] args) {
        logger.info("Starting Logback example.");

        logger.debug("This is a debug message to showcase Logback's capabilities.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");

        // Simulating a custom log message
        String userName = "Alice";
        logger.info("User {} has logged in successfully.", userName);

        logger.info("Ending Logback example.");
    }
}
