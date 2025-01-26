package com.example.bindings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2Example {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        logger.info("Starting Log4j2 example.");

        logger.debug("This is a debug message to demonstrate Log4j2 integration.");
        logger.warn("This is a warning message.");
        logger.error("This is an error message.");

        // Simulating parameterized logging
        String operation = "data processing";
        int itemsProcessed = 100;
        logger.info("The operation '{}' completed successfully. Items processed: {}.", operation, itemsProcessed);

        logger.info("Ending Log4j2 example.");
    }
}
