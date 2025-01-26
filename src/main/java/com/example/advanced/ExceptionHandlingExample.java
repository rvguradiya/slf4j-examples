package com.example.advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExceptionHandlingExample {

    // Create a logger instance for this class
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlingExample.class);

    public static void main(String[] args) {
        try {
            // Simulate an exception-prone operation
            performRiskyOperation();
        } catch (Exception e) {
            // Log the exception with an error message
            logger.error("An error occurred while performing the operation.", e);
        }
    }

    private static void performRiskyOperation() throws Exception {
        logger.info("Starting a risky operation...");

        // Simulate an exception
        if (Math.random() > 0.5) {
            throw new Exception("Simulated exception: Something went wrong!");
        }

        logger.info("Operation completed successfully.");
    }
}
